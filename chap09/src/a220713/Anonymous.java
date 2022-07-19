package a220713;

public class Anonymous {
	// �ʵ� �ʱⰪ���� ����, �ʵ尪���� �͸� ��ü ����
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�");
		}
		void wake() {		
			System.out.println("5�ÿ� �Ͼ�ϴ�.");
			work();
		}
	}; // �͸� �ڽ� ��ü ������ �ϳ��� ���๮�̹Ƿ� ���� �����ݷ��� �ݵ�� �ٿ����Ѵ�. 
	
	void method1() {
		//���� ���������� ����, ���������� �͸� ��ü ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�");
			}
			
			void wake() {		
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		}; 
		// ���� ���� ���
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
