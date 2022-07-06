package a220707;

public class Error {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	static void method3() {
		Error error = new Error();
		error.field1 = 10;
		error.method1();
		field2 = 10;
		method2();
	}
	public static void main(String[] args) {
		Error error = new Error();
		error.field1 = 10;
		error.method1();
		System.out.println(error.field1);
	}
}
