package a220726;


public class User1 extends Thread{
	private Calculator calculator; 

	public void setCalculator(Calculator Calculator) {
		this.setName("User1");
		this.calculator = Calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
