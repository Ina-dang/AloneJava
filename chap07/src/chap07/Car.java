package chap07;

public class Car {
	public int speed;
	
	public void speedUP() {speed += 1;}
	
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}
