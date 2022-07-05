package a220706;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.setGas(5);
		
		boolean gasState = car.isLeftgas();
		if(gasState) {
			System.out.println("출발합니다");
			car.run();
		}
		
		if(car.isLeftgas()) {
			System.out.println("gas주입 필요 없음");
		} else {
			System.out.println("gas주입 필요");
		}
	}
}
