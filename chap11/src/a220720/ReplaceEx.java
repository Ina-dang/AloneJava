package a220720;

public class ReplaceEx {
	public static void main(String[] args) {
		String oldString = "자바는 객체 지향입니다, 자바는 풍부한 API를 지원합니다";
		String newString = oldString.replace("자바", "Java");
		
		System.out.println(oldString);
		System.out.println(newString);
	}
}
