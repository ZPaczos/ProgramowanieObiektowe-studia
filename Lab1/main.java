import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class main {
	public static boolean czyPierwsza(int n){
		if (n<2) return false;
		for (int i=2; i*i <=n;i++) {
			if (n%i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// Æwiczenie 1
		Scanner console = new Scanner(System.in);
		String imie;
		System.out.println("Jak masz na imiê?");
		imie = console.nextLine();
		System.out.println("1. Hello "+imie);
		System.out.println("2. Hello "+imie.toUpperCase());
		System.out.println("3. Hello "+imie.substring(0,1).toUpperCase()+imie.substring(1));
		
		//Æwiczenie 2
		System.out.println("Kwadraty liczb od 1 do 10: ");
		for (int i=1;i<=10;i++) {
			System.out.println(i*i);
		}
		
		//Æwiczenie 3
		int numb;
		try {
			System.out.println("Podaj liczbê: ");
			numb=console.nextInt();
			
			System.out.println(numb+" "+(czyPierwsza(numb) ? "jest" : "nie jest") + " liczb¹ pierwsz¹");
		}catch(InputMismatchException e) {
			System.out.println("To nie liczba");
		}
	}

}
