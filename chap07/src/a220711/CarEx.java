package a220711;

public class CarEx {
	public static void main(String[] args) {
		TireCar car = new TireCar();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HanKookTire로 교체");
				car.frontLeftTire = new Hankook("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new Kumho("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HanKookTire로 교체");
				car.backLeftTire = new Hankook("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new Kumho("뒤오른쪽", 17);
				break;
			}
			System.out.println("=============================");
		}
	}
}
