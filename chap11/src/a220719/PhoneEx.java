package a220719;

public class PhoneEx {
	public static void main(String[] args) {
		Phone phone = new Phone("구글", "안드로이드");
		
		String strObj = phone.toString();
		System.out.println(strObj);
		System.out.println(phone);
	}
}
