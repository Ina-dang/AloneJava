package sec03.exam01;

public class VariableInitializationExample {
	public static void main(String[] args) {
//		int value; 선언만하고 초기화 된 값이 없다
		int value = 3;
		
		//Line5로 출력시 The local variable value may not have been initialized 에러 발생
		int result = value + 10; 
		
		System.out.println(result);
	}
}
