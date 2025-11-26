package boletin3;

import java.util.Scanner;

public class Boletin3 {

	public static void Ejercicio1() {
		Scanner sc = new Scanner(System.in);

		int numero;
		int aux;

		do {
			System.out.print("Introduzca un número entero positivo: ");
			numero = sc.nextInt();
		} while (numero < 0);

		aux = numero;
		int vuelta = 0;

		while (numero > 0) {
			vuelta = (vuelta * 10) + (numero % 10);
			numero = numero / 10;
		}

		System.out.printf("El número %d en palotes es: ", aux);

		while (vuelta > 0) {
			int digito = vuelta % 10;

			for (int i = 0; i < digito; i++) {
				System.out.print("|");
			}

			vuelta = vuelta / 10;
			if (vuelta > 0) {
				System.out.print("-");
			}
		}

		System.out.println();

		sc.close();
	}

	public static void Ejercicio2() {

	}

}