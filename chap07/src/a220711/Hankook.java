package a220711;

public class Hankook extends Tire{
	public Hankook(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "Hankook Tire ����: " + (maxRotation-accumulateRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HanKook Tire ��ũ ***");
			return false;
		}
	}
}
