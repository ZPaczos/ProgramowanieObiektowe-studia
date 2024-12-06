package models;

public abstract class Vehicle {
protected int speed;
private String model;

public void setSpeed(int speed) {
	this.speed = speed;
}

public void setModel(String model) {
	this.model= model;
}

public int getSpeed() {
	return speed;
}

public String getModel() {
	return model;
}

public Vehicle(int speed, String model) {
	this.speed = speed;
	this.model = model;
}

public void showInfo() {
	System.out.println("Model: "+model+" Speed : "+speed);
}

}
