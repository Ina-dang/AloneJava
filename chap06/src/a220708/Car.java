package a220708;

public class Car {
	private double speed;
	private boolean stop;

	public double getSpeed() {
		double km = speed * 1.6;
		return km;
	}
	
	public void setSpeed(double speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
