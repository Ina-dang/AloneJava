package a220711;

public class Kumho extends Tire{
	public Kumho(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "Kumho Tire ����: " + (maxRotation-accumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Kumho Tire ��ũ ***");
			return false;
		}
	}
}
