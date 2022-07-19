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
		
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산에 " + (time3 - time1) + "nano초가 소요되었습니다");
		System.out.println("계산에 " + (time4 - time2) + "ms초가 소요되었습니다");
	}
}
