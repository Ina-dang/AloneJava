package a220720;

public class LengthEx {
	public static void main(String[] args) {
		String ssn = "73062412301123";
		int length = ssn.length();
		if (length == 13) {
			System.out.println("주민번호 확인");
		} else {
			System.out.println("주민번호 자릿수 오류");
		}
	}
}
