package a220727;

public class PrintThread3 extends Thread{

	@Override
	public void run() {
		while (true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
