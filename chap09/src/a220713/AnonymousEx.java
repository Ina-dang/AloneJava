package a220713;

public class AnonymousEx {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		
		anonymous.field.wake();
		
		anonymous.method1();
		
		anonymous.method2(new Person() {
			void study() {
				System.out.println("�����մϴ�");
			}
			void wake() {		
				System.out.println("5�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
	}
}
