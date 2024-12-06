package models;

public class Car extends Vehicle implements Tuningable {
private int numberOfDoors;

public void setNumberOfDoors(int numberOfDoors) {
	this.numberOfDoors = numberOfDoors;
}

public int getNumberOfDoors() {
	return numberOfDoors;
}

public Car(int speed, String model, int numberofDoors) {
	super(speed,model);
	this.numberOfDoors = numberofDoors;
}

public void showInfo() {
	System.out.println("Model: "+getModel()+" Speed : "+getSpeed()+" Number Of Doors: "+getNumberOfDoors());
}

@Override
public void increaseSpeed(int speed) {
	this.speed = speed;
}

}
