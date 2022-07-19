package a220719;

public class ClassEx {
	public static void main(String[] args) throws Exception {
		Class clazz = Car.class;
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		System.out.println(clazz.getPackageName());
		
		System.out.println(clazz.getResource("photo1.jpg").getPath());
	}
}
