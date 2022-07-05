package a220706;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		int result = cal.plus(5, 6);
		System.out.println("Result: " + result);
		
		byte x = 10;
		byte y = 35;
		int resultB = cal.plus(x, y);
		System.out.println("ResultB: " + resultB);
		
		cal.powerOff();
	}
}
