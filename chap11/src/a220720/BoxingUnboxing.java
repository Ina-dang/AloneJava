package a220720;

public class BoxingUnboxing {
	public static void main(String[] args) {
		//박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf(300);
		
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//자동박싱
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//대입 시 자동 언박싱 : 포장클래스 타입에 기본값이 대입될 경우
		int value = obj;
		System.out.println("value: " + value);
		
		//연산 시 자동 언박싱
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
