package a220713;

public class Outer {
	public void method1(final int arg) {
		final int localVariable = 1;
//		arg = 100;
//		localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//�ڹ� 8 ����
	public void method2(int arg) {
		int localVariable = 1;
//		arg = 100;
//		localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
