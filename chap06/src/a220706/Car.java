package a220706;

public class Car {
	int gas;
	
	void setGas(int gas) {
		// 리턴값이 없는 메소드로 매개값을 받아 gas필드값 변경
		this.gas = gas;
	}
	
	boolean isLeftgas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true; //boolean에 대한 값 반환
	}
	
	void run() {
		while (true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return; //메소드  실행 종료
			}
		}
	}
}
