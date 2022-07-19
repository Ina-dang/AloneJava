package a220719;

import java.io.IOException;

public class KeyToStringEx {
	public static void main(String[] args) throws IOException {
		byte[] bs = new byte[100];
		
		System.out.println("ют╥б: ");
		int readByNo = System.in.read(bs);
		
		String str = new String(bs, 0, readByNo - 2);
		System.out.println(str);
	}
}
