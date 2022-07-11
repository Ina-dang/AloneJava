package a220711;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //자동 타입 변환
		parent.method1();
		parent.method2();
		//parent.method3(); 호출 불가능
		child.method3();
	}
}
