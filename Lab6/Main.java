import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Æwiczenie 1 b)");
		Pair<String> pc = new Pair<String>(new String("Tom"),
				 						   new String("Jinx"));
				System.out.println(pc.toString());
				pc.swap();
				System.out.println(pc.toString());
			
	

	Pair<Integer> pc1 = new Pair<Integer>(new Integer(233),
			 						      new Integer(22));
			System.out.println(pc1.toString());
			pc1.swap();
			System.out.println(pc1.toString());
			System.out.println("Æwiczenie 1 d)");
			pc1.max();
			
		    System.out.println("Æwiczenie 2 d)");
		    Bird bird1 = new Bird("Slowik");
		    Bird bird2 = new Bird("Wrobel");
		    Mammal mammal1 = new Mammal("Delfin");
		    Mammal mammal2 = new Mammal("Kot");
		    ArrayList<Animal> animals = new ArrayList<Animal>();
		    animals.add(bird1);
		    animals.add(bird2);
		    animals.add(mammal1);
		    animals.add(mammal2);
		    Animal.printList(animals);
		   
			

			
			
	}

}
