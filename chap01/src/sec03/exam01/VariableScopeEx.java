package sec03.exam01;

public class VariableScopeEx {
	public static void main(String[] args) {
		int v1 = 15;
		if (v1>10) {
			int v2;
			v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5; //v2 스코프가 맞지않아 cannot be resolved to a variable 에러 발생
		System.out.println(v1);
	}
	
}
