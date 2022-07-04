package a220705;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		//기본생성자를 호출 할 수 x
	
	
		Car car1 = new Car();
		System.out.println(car1.company);
		
		Car car2 = new Car("자가용");
		System.out.println(car2.model);
		
		Car car3 = new Car("택시", "검정");
		System.out.println(car3.model + " " + car3.color);
		
	}
	
}
