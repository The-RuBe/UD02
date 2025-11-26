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

		Scanner sc2 = new Scanner(System.in);

		int altura;

		do {
			System.out.println("Introduce la altura de la U: ");
			altura = sc2.nextInt();
		} while (altura < 3);

		for (int i = altura; i > 1; i--) {
			System.out.printf("*");
			for (int j = altura - 2; j > 0; j--) {
				System.out.printf(" ");
			}
			System.out.printf("*\n");
		}
		System.out.printf(" ");
		for (int h = altura - 2; h > 0; h--) {
			System.out.printf("*");
		}

		sc2.close();

	}

	public static void Ejercicio3() {

		Scanner sc3 = new Scanner(System.in);

		int dígito;

	}

}