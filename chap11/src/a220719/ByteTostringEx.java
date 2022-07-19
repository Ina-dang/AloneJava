package a220719;

public class ByteTostringEx {
	public static void main(String[] args) {
		byte[] bs = {72, 101, 108, 108, 101, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bs);
		System.out.println(str1);
		
		String str2 = new String(bs, 6, 4);
		System.out.println(str2);
	}
}
