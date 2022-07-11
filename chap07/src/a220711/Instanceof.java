package a220711;

public class Instanceof {
	public static void method1(Dad dad) {
		// Baby 타입으로 변환이 가능한지 확인
		if(dad instanceof Baby) {
			Baby baby = (Baby) dad;
			System.out.println("method 1 - Baby로 변환 성공");
		} else {
			System.out.println("method 1 - Baby로 변환 실패");
		}
	}
	
	public static void method2(Dad dad) {
		Baby baby = (Baby) dad;
		System.out.println("method 2 - Baby로 변환 성공");
	}
	
	public static void main(String[] args) {
		Dad dad = new Baby();
		method1(dad);
		method2(dad);

		Dad dad2 = new Dad();
		method1(dad2);
		method2(dad2); //ClassCastException 예외 발생
	}
}
