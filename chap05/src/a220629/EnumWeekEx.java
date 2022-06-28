package a220629;

public class EnumWeekEx {
	public static void main(String[] args) {
		Week today = null;
		
		Week[] wArr = Week.values();
		for(Week w : wArr) {
			System.out.printf("%s = %d %n", w.name(), w.ordinal());
		}
		
		Week wArr2 = Week.valueOf("SUNDAY");
		System.out.println(wArr2);
		System.out.println(Week.SUNDAY == wArr2);
	}
}
