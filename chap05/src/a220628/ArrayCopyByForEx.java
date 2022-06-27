package a220628;

public class ArrayCopyByForEx {
	public static void main(String[] args) {
		int[] oldInArray = { 1, 2, 3 };
		int[] newInArray = new int[5];
		
		System.arraycopy(oldInArray, 0, newInArray, 0, oldInArray.length);
		for (int i = 0; i < newInArray.length; i++) {
			System.out.print(newInArray[i] + ",");
		}
	}
}
