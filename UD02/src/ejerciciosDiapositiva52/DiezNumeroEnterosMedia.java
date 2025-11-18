package ejerciciosDiapositiva52;

import java.util.Scanner;

public class DiezNumeroEnterosMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		int aux = 0;
		double media;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			aux = aux + numero;

		}

		media = aux / 10;

		System.out.printf("La media de estos 10 números es: %.2f \n", media);

	}
}