package a220707;

public class SingletonEx {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); 에러코드
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton1 == singleton2) {
			System.out.println("같은 싱글턴객체입니다.");
		} else {
			System.out.println("다른 싱글턴객체입니다.");
		}
	}
}
