package a220713;

public class OuterNested {
	String field = "Outer-field";
	void method() {
		System.out.println("Outer-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(OuterNested.this.field);
			OuterNested.this.method();
		}
	}
}
