package models;

public class Plane extends Vehicle{
	private int numberOfSeats;
	
	public void setNnumberOfSeats(int numberOfDoors) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	
	
	public Plane(int speed, String model, int numberOfSeats) {
		super(speed, model);
		this.numberOfSeats = numberOfSeats;
	}

	public void showInfo() {
		System.out.println("Model: "+getModel()+" Speed : "+getSpeed()+" Number Of Seats: "+getNumberOfSeats());
	}
}
