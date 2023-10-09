package proba;

public class nomambfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nom = "Alba";

		int llongitut = nom.length();
		System.out.println("La llongitud del meu nom es: " + llongitut);

		System.out.println("Cada lLetra en una línea:");
		for (int i = 0; i < llongitut; i++) {
			char lletra = nom.charAt(i);
			System.out.println(lletra);
		}
	}
}
