package a220711;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
						//������
		System.out.println("Computer ��ü�� areCircle() ����");
		return Math.PI * r * r;
	}
}