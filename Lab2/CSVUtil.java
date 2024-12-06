import java.util.Arrays;

public class CSVUtil {

	public static void Najwieksza(String lancuch){
		try {
			String[] tabS = lancuch.split(",");
			int[] tabI = new int [tabS.length];
			for(int i=0; i<tabS.length;i++) {
				tabI[i] = Integer.parseInt(tabS[i]);
			}
			IntArrayUtil.Najwieksza(tabI);	
		}catch(IllegalArgumentException e) {
			System.out.println("Podana b³êdna sekwencja");
		}

	}
	
	public static void Najmniejsza(String lancuch){
		try {
			String[] tabS = lancuch.split(",");
			int[] tabI = new int [tabS.length];
			for(int i=0; i<tabS.length;i++) {
				tabI[i] = Integer.parseInt(tabS[i]);
			}
			IntArrayUtil.Najmniejsza(tabI);	
		}catch(IllegalArgumentException e) {
			System.out.println("Podana b³êdna sekwencja");
		}
		

	}
	
	public static void Sortuj(String lancuch){
		
		try {
			String[] tabS = lancuch.split(",");
			int[] tabI = new int [tabS.length];
			for(int i=0; i<tabS.length;i++) {
				tabI[i] = Integer.parseInt(tabS[i]);
			}
			IntArrayUtil.Sortuj(tabI);
			System.out.println(Arrays.toString(tabI));
			
		}catch(IllegalArgumentException e) {
			System.out.println("Podana b³êdna sekwencja");
		}
		
	}
	
}
