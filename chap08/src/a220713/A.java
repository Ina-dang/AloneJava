package a220713;

class A {
	A(){System.out.println("A 객체가 생성됨");}
	
	/*인스턴스 멤버 클래스*/
	class B {
		B(){System.out.println("B 객체가 생성됨");}
		int field1;
		// static int field2 에러
		void method1() {}
		// static void method2(){} 에러
		int field2;
		// static int field2 에러
		void method2() {}
		// static void method2(){} 에러
	}
	/*정적 멤버 클래스*/
	static class C {
		C(){System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2(){};
	}
	
	void method() {
		/*로컬 클래스*/
		class D {
			D() {System.out.println("D 객체가 생성됨");}
			int field1;
			// static int field2; 
			void method1() {}
			// static void method2(){} 에러
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
