package a220706;

public class SquareEx {
	public static void main(String[] args) {
		Square square = new Square();
		
		double result = square.areaRectangle(10);
		double result2 = square.areaRectangle(10, 20);
				
		System.out.println("���簢�� ���� = " + result);
		System.out.println("���簢�� ���� = " + result2);
	}
}
