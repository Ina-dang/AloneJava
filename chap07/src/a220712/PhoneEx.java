package a220712;

public class PhoneEx {
	public static void main(String[] args) {
		//추상 클래스는 객체를 직접 생성해서 사용 불가
		//Phone phone = new Phone();
		SmartPhone phone = new SmartPhone("홍길동");
		
		phone.turnOn();
		phone.internetSearch();
		phone.turnOff();
	}
}
