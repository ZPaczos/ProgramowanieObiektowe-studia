import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		int[] tab = {99, 4, 1, 5, 32, 33};
		int[] tab_kopia = tab;
		
		IntArrayUtil.Najwieksza(tab);
		IntArrayUtil.Najmniejsza(tab);
		IntArrayUtil.Sortuj(tab);
		System.out.println("Tablica po posortowaniu: ");
		for(int i=0; i<tab.length;i++) {
			System.out.println(tab[i]);
		}
		Arrays.sort(tab_kopia);
		System.out.println("Tablica 2 po posortowaniu: ");
		for(int i=0; i<tab.length;i++) {
			System.out.println(tab[i]);
		}
		System.out.println("Podaj �a�cuch znak�w: ");
		Scanner console = new Scanner(System.in);
		String tekst = console.nextLine();
		
		
		CSVUtil.Najwieksza(tekst);
		CSVUtil.Najmniejsza(tekst);
		System.out.println("Posortowany �a�cuch znak�w: ");
		CSVUtil.Sortuj(tekst); 
		/* zad. 4 po podaniu b��dnej sekwencji:
		   	Podaj �a�cuch znak�w: 
			uuu
			Podana b��dna sekwencja
			Podana b��dna sekwencja
			Posortowany �a�cuch znak�w: 
			Podana b��dna sekwencja
			
			po podaniu poprawnej sekwencji:
			Podaj �a�cuch znak�w: 
			20,4,1,65,100,3,22
			Najwiekszy element: 100
			Najmniejszy element: 1
			Posortowany �a�cuch znak�w: 
			[1, 3, 4, 20, 22, 65, 100]
		 */
	}

}
