package a220720;

public class ReplaceEx {
	public static void main(String[] args) {
		String oldString = "�ڹٴ� ��ü �����Դϴ�, �ڹٴ� ǳ���� API�� �����մϴ�";
		String newString = oldString.replace("�ڹ�", "Java");
		
		System.out.println(oldString);
		System.out.println(newString);
	}
}
