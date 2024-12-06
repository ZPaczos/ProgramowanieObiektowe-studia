import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;


public abstract class Animal {

	private String species;
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species=species;
	}
	
	public Animal(String s) {
		species = s;
	}
	
	public static void printList( ArrayList <? extends Animal> list) {
	 for (Animal m : list) {
		 System.out.println(m.getSpecies());
	 	}
	 
	}
	

}

