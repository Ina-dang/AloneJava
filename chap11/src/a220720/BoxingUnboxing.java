package a220720;

public class BoxingUnboxing {
	public static void main(String[] args) {
		//�ڽ�
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf(300);
		
		//��ڽ�
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//�ڵ��ڽ�
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//���� �� �ڵ� ��ڽ� : ����Ŭ���� Ÿ�Կ� �⺻���� ���Ե� ���
		int value = obj;
		System.out.println("value: " + value);
		
		//���� �� �ڵ� ��ڽ�
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
