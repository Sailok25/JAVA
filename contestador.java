package ejercicios;

import java.util.Scanner;

public class contestador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dep = 0;
		int sub1 = 0;
		int sub2 = 0;

		Scanner escaner = new Scanner(System.in);

		System.out.println("Hola, benvingut al Sistema d'Atencio al Client.");
		System.out.println("Sel·lecióna el departament amb el que vols comunicarte:");
		System.out.println("Opció 1: VENTES");
		System.out.println("Opció 2: COMANDES");
		System.out.println("Ingresa el numero del departament:");

		dep = escaner.nextInt();

		if (dep == 1) {
			System.out.println("Has selecciónat l'opció VENTES.");
			System.out.println("Sel·lecióna el subdepartament amb el que vols comunicarte:");
			System.out.println("1. Llibres");
			System.out.println("2. Videos");
			System.out.println("3. Bolis");
			System.out.println("Seleccióna un número del 1 al 3:");
			sub1 = escaner.nextInt();

			if (sub1 == 0) {
			} else if (sub1 == 1) {
				System.out.println("Has sel·lecionat l'opció: 1, Llibres");
			} else if (sub1 == 2) {
				System.out.println("Has sel·lecionat l'opció: 2, Videos");
			} else if (sub1 == 3) {
				System.out.println("Has sel·lecionat l'opció: 3, Bolis");
			}
		} else if (dep == 2) {
			System.out.println("Has selecciónat l'opció COMANDES.");
			System.out.println("Sel·lecióna el subdepartament amb el que vols comunicarte:");
			System.out.println("1. Premium");
			System.out.println("2. Basic");
			System.out.println("3.Cutre");
			System.out.println("Seleccióna un número del 1 al 3:");
			sub2 = escaner.nextInt();

			if (sub2 == 0) {
			} else if (sub2 == 1) {
				System.out.println("Has sel·lecionat l'opció: 1, Premium");
			} else if (sub2 == 2) {
				System.out.println("Has sel·lecionat l'opció: 2, Basic");
			} else if (sub2 == 3) {
				System.out.println("Has sel·lecionat l'opció: 3, Cutre");
			}
		}
	}
}