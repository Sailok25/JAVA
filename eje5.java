public class eje5 {
    public static void main(String[] args) {
        /* Exercici 5:
        Imprimeix per pantalla 5 cops el teu nom i el número d'iteració. (utilitzant el bucle "while")
        El teu nom ha d'estar, també, en una variable.
        I hem d'imprimir: "El meu nom és: XXXX, iteració: YYY") */

		int contador = 0;
		String nom = "Sailok";

		while (contador < 5) {
			System.out.println("El meu nom es: " + nom + " i aquesta es la iteració num " + contador);
			contador = contador + 1;
		}
	}
}