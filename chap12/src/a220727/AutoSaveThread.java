package a220727;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("�۾� ������ �����Ѵ�");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
