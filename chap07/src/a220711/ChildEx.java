package a220711;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //�ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2();
		//parent.method3(); ȣ�� �Ұ���
		child.method3();
	}
}
