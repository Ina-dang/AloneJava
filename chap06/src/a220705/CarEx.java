package a220705;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car("����", 3000);
		//�⺻�����ڸ� ȣ�� �� �� x
	
	
		Car car1 = new Car();
		System.out.println(car1.company);
		
		Car car2 = new Car("�ڰ���");
		System.out.println(car2.model);
		
		Car car3 = new Car("�ý�", "����");
		System.out.println(car3.model + " " + car3.color);
		
	}
	
}
