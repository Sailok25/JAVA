package ejercicios;

public class ejercicio1 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub
		 * 
		 * // Primera proba: imprimir un text System.out.println("Hola Mundo!");
		 * System.out.println("Adiós Mundo!");
		 * 
		 * //Segona proba: preguntar una edat i dir si es positiu o negatiu double
		 * numero= -5; if (numero>=0) { System.out.println("Es positiu!"); } else
		 * if(numero<0) System.out.println("Es negatiu!"); }
		 */

		double edat = 2;

		if (edat < 3) {
			System.out.println("Bebe!");
		} else if (edat < 14) {
			System.out.println("Nen!");
		} else if (edat < 25) {
			System.out.println("Jove!");
		} else {
			System.out.println("Adult!");
		}
	}

}