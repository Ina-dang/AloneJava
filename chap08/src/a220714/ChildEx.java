package a220714;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		System.out.println(child.nation + "사람");
		child.nation = "미국";
		System.out.println(child.nation + "사람");
	}
}
