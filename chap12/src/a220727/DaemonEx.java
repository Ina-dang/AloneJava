package a220727;

public class DaemonEx {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); //AutoSaveThread�� ���󽺷���� ����
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("���� ������ ����");
	}
}