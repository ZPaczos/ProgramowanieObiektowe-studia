import java.awt.Color;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("�wiczenie 1: ");
		Car car = new Car("Audi","PO92829", enumColor.Color.Blue);

		System.out.println("Make: "+ car.getMake() + ", Plate: "+car.getPlate()+", Color: "+ car.getColor());
		System.out.println("Licznik: "+Car.counter);
		
		System.out.println("�wiczenie 2: ");
		car.info();
		
	System.out.println("�wiczenie 3: ");
	Car car3 = new Car("Kia","CB989898",enumColor.Color.Unknown);
	car3.info();
	System.out.println("Licznik: "+Car.counter);
	
	System.out.println("�wiczenie 4: ");
	Car car4 = new Car("Toyota", "PO902DD",enumColor.Color.Pink);
	car4.setMake("BMW");
	car4.info();
	System.out.println("Licznik: "+Car.counter);
	
	System.out.println("�wiczenie 5: ");
	Car car5 = new Car();
	car5.info();
	System.out.println("Licznik: "+Car.counter);
	
	System.out.println("�wiczenie 6: ");
	System.out.println("Podsumowuj�c licznik: "+Car.counter);
	}

}
