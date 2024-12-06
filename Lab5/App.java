package models;

public class App {

	public static void main(String[] args) {
	Vehicle[] vehicle = new Vehicle[4];
	
	vehicle[0] = new Car(280,"Alfa Romeo",3);
	vehicle[1] = new Car(180,"Audi",3);
	vehicle[2] = new Plane(800,"Boeing",210 );
	vehicle[3] = new Plane(870,"Airbus",100);
	
	Tuningable tuningable = (Tuningable) vehicle[0];
	tuningable.increaseSpeed(400);
	
	for(int i=0; i<4; i++) {
		vehicle[i].showInfo();
	}
	
	System.out.println("-----------------------------");
	for(Vehicle x: vehicle) {
		x.showInfo();
	}
	
	

}
}
