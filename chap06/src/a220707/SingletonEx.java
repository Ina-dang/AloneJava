package a220707;

public class SingletonEx {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); �����ڵ�
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton1 == singleton2) {
			System.out.println("���� �̱��ϰ�ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� �̱��ϰ�ü�Դϴ�.");
		}
	}
}
