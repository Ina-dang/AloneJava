package a220706;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setGas(5);
		
		boolean gasState = car.isLeftgas();
		if(gasState) {
			System.out.println("����մϴ�");
			car.run();
		}
		
		if(car.isLeftgas()) {
			System.out.println("gas���� �ʿ� ����");
		} else {
			System.out.println("gas���� �ʿ�");
		}
	}
}
