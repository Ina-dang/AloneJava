package a220707;

class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
}

public class EarthEx{
	public static void main(String[] args) {
		System.out.println("������ ������: " + Earth.EARTH_RADIUS + " km");
		System.out.println("������ ǥ����: " + Earth.EARTH_AREA + " km^2");
	}
}
