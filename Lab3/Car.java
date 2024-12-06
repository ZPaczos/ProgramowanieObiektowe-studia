import java.awt.Color;

public class Car {
	public static int counter = 0;
	private String make; 
	private String plate; 
	private enumColor.Color color;
	
	
	Car(String make, String plate, enumColor.Color color){
		this.setMake(make);
		this.setPlate(plate);
		this.setColor(color);
		counter++;
	}
	
	public Car() {
		make = "Honda";
		plate = "DW839A2";
		color = enumColor.Color.Purple;
		counter++;
	}
	public Car(String make, String plate, String color){
		this();
		make = make;
		plate = plate;
		color = color;
	}
	
	public Car(String make){
		this(make, "CB92837",enumColor.Color.Purple);
	}
	
	public void info() {
		System.out.println("Make: "+ getMake() + " Plate: "+ getPlate() + " Color: "+getColor());
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public enumColor.Color getColor() {
		return color;
	}

	public void setColor(enumColor.Color color) {
		this.color = color;
	}
}
