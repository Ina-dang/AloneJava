package sec04.exam02;

import java.io.IOException;

public class ContinueKeyCodeReadEx {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
	}
}
