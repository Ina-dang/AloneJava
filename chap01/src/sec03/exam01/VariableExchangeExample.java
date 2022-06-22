package sec03.exam01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 3;
		
		int tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x = " + x + " y = " + y) ;
	}
}
