package a220719;

public class SystemTimeEx {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		long time2 = System.currentTimeMillis();
		
		int sum = 0;
		for (int i = 0; i <= 1000000; i++) {
			sum += i;
		}
		
		long time3 = System.nanoTime();
		long time4 = System.currentTimeMillis();
		
		System.out.println("1~1000000������ ��: " + sum);
		System.out.println("��꿡 " + (time3 - time1) + "nano�ʰ� �ҿ�Ǿ����ϴ�");
		System.out.println("��꿡 " + (time4 - time2) + "ms�ʰ� �ҿ�Ǿ����ϴ�");
	}
}
