package a220706;

public class Car {
	int gas;
	
	void setGas(int gas) {
		// ���ϰ��� ���� �޼ҵ�� �Ű����� �޾� gas�ʵ尪 ����
		this.gas = gas;
	}
	
	boolean isLeftgas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�");
		return true; //boolean�� ���� �� ��ȯ
	}
	
	void run() {
		while (true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas�ܷ�: " + gas + ")");
				return; //�޼ҵ�  ���� ����
			}
		}
	}
}
