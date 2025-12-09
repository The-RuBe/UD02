package boletinRepaso;

import java.util.Scanner;

public class ActsRepaso {

	public static void digitos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();

		int digitos = 0;

		if (numero < 0) {
			numero = -numero;
		}

		do {
			numero = numero / 10;
			digitos++;
		} while (numero > 0);

		System.out.printf("Ese número tiene %d dígitos. \n", digitos);

		sc.close();
	}

	public static void voltea() {
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Introduce un número para voltearlo: ");
		int numero = sc1.nextInt();

		int aux = numero;
		int auxiliar = numero;
		int reverso = 0;

		if (numero < 0) {

			numero = -numero;

			do {
				numero = aux % 10;
				aux = aux / 10;
				reverso = numero * 10 + reverso;

			} while (aux > 0);

			numero = -numero;
		} else {
			do {
				numero = numero % 10;
				numero = numero / 10;
				reverso = numero * 10 + reverso;
			} while (aux > 0);
		}
		System.out.printf("El número %d al revés es: %d", auxiliar, reverso);
	}
}