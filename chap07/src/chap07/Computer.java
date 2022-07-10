package chap07;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
						//재정의
		System.out.println("Computer 객체의 areCircle() 실행");
		return Math.PI * r * r;
	}
}