package a220711;

public class Instanceof {
	public static void method1(Dad dad) {
		// Baby Ÿ������ ��ȯ�� �������� Ȯ��
		if(dad instanceof Baby) {
			Baby baby = (Baby) dad;
			System.out.println("method 1 - Baby�� ��ȯ ����");
		} else {
			System.out.println("method 1 - Baby�� ��ȯ ����");
		}
	}
	
	public static void method2(Dad dad) {
		Baby baby = (Baby) dad;
		System.out.println("method 2 - Baby�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		Dad dad = new Baby();
		method1(dad);
		method2(dad);

		Dad dad2 = new Dad();
		method1(dad2);
		method2(dad2); //ClassCastException ���� �߻�
	}
}
