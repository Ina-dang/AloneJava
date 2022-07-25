package a220726;


public class User2 extends Thread{
	private Calculator calculator; 

	public void setCalculator(Calculator Calculator) {
		this.setName("User2");
		this.calculator = Calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
