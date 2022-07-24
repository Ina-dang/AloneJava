package a220725;

public class BeelPrintEx1 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); //BeepTask °´Ã¼ÀÇ run()¸Þ¼Òµå ½ÇÇà
		
		for (int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try { Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
