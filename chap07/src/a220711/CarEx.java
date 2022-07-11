package a220711;

public class CarEx {
	public static void main(String[] args) {
		TireCar car = new TireCar();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� HanKookTire�� ��ü");
				car.frontLeftTire = new Hankook("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire = new Kumho("�տ�����", 13);
				break;
			case 3:
				System.out.println("�ڿ��� HanKookTire�� ��ü");
				car.backLeftTire = new Hankook("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.backRightTire = new Kumho("�ڿ�����", 17);
				break;
			}
			System.out.println("=============================");
		}
	}
}
