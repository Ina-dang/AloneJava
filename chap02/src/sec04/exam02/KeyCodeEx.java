package sec04.exam02;

import java.io.IOException;

public class KeyCodeEx {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	}
}
