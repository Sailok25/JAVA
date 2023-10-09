package practica;

import java.util.Scanner;

public class exercici11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Et pregunto un numero, que ha de ser mes petit o igual a 100.
		 * 
		 * Si el numero es negatiu, digues:negatiu
		 * 
		 * Si el numero esta entre 0 i 20: digues numero petit
		 * 
		 * Si el numero esta entre 21 i 70: digues numero mitja
		 * 
		 * SI el numero esta entre 71 i 100 digues numero gran
		 * 
		 * SI ES MES GRAN DE 100, digues no valid!
		 */

		while (true) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Digam un numero del 0 al 100");
			int numero = scanner.nextInt();

			if (numero < 0) {
				System.out.println("negatiu");
			} else if (numero >= 0 && numero <= 20) {
				System.out.println("numero petit");
			} else if (numero >= 21 && numero <= 70) {
				System.out.println("numero mitja");
			} else if (numero >= 71 && numero <= 100) {
				System.out.println("numero gran");
			} else {
				System.out.println("no valid!");
			}

		}
	}
}
