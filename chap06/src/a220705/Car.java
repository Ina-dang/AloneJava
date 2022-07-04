package a220705;

public class Car {
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	int cc;
	
	Car(){}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	Car(String color, int cc){	}
}
