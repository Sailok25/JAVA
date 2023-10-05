package ejercicios;

import java.util.Scanner;

public class calsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;

		System.out.println("Escriu un primer nuúmero: ");
		Scanner numero1 = new Scanner(System.in);
		num1 = numero1.nextInt();
		System.out.println("Escriu un segón nuúmero: ");
		Scanner numero2 = new Scanner(System.in);
		num2 = numero2.nextInt();
		int suma = num1 + num2;
		System.out.println("El resultat es: " + suma);

	}
}