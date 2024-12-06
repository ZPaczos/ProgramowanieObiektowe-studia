
public class IntArrayUtil {
	public static void Najwieksza(int[] tab) {
		try {
			if(tab.length == 0) {
				 throw new  IllegalArgumentException("Tablica nie ma elementow");
			}else {
				int max = tab[0];
				
				for (int i=1; i<tab.length; i++) {
					if(tab[i]>max) {
						max=tab[i];
					}
				}
				System.out.println("Najwiekszy element: "+max);
			} 
			
		}catch(NullPointerException e) {
			System.out.println("Pusta referencja");
		}

		
	}
	public static void Najmniejsza(int[] tab) {
		try {
			if(tab.length == 0) {
				 throw new  IllegalArgumentException("Tablica nie ma elementow");
			}else {
				int min = tab[0];
				
				for (int i=1; i<tab.length; i++) {
					if(tab[i]<min) {
						min=tab[i];
					}
				}
				System.out.println("Najmniejszy element: "+min);
			}
			}catch(NullPointerException e) {
			System.out.println("Pusta referencja");
		}
		
	}
	public static void Sortuj(int[] tab) {
		try {
			for (int i=tab.length-1; i>0; i--) {

			      int indMax = 0;   // indeks maksymalnego elementu
			                        // w nieposortowanej cz�ci tablicy

			      // szukamy tego indeksu, przegl�daj�c nieposortowan� cz�� tablicy
			      for (int k=1; k <= i; k++)
			 	if (tab[indMax] < tab[k]) indMax = k;

			      // Przestawiamy elementy:
			      // maksymalny element idzie na ostatni� pozycj� w nieposortowanej
			      // cz�ci tablicy; a liczba spod tego indeksu jest zapisywana
			      // w miejscu okupowanym poprzednio przez max element

			      int temp = tab[i];
			      tab[i] = tab[indMax];
			      tab[indMax] = temp;
			    }
		} catch(NullPointerException e) {
			System.out.println("Pusta referencja");
		}

	}
}
