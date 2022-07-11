package a220711;

public class Kumho extends Tire{
	public Kumho(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "Kumho Tire ¼ö¸í: " + (maxRotation-accumulateRotation) + "È¸");
			return true;
		} else {
			System.out.println("*** " + location + " Kumho Tire ÆãÅ© ***");
			return false;
		}
	}
}
