package boletin2;

import java.util.Random;
import java.util.Scanner;

public class Boletin2 {

	public static void palabraPalindroma() {

		Scanner sc = new Scanner(System.in);

		String palabra;

		System.out.println("Introduce tu palabra en minúsculas para ver si es palíndroma: ");
		palabra = sc.next();

		String invertida = new StringBuilder(palabra).reverse().toString();

		System.out.println("-------------------------------");
		System.out.println("Palabra invertida: " + invertida);
		System.out.println("-------------------------------");

		if (palabra.equals(invertida)) {
			System.out.println("La palabra " + palabra + " es palíndroma.");
		} else {
			System.out.println("La palabra " + palabra + " no es palíndroma.");
		}
		sc.close();
	}

	public static void copaDelRey() {

		Random r = new Random();

		int torrent = 0;
		int realBetis = 0;
		int r1 = r.nextInt(100000000, 1000000000);
		int numero = r1;
		int golesIsco = 0;

		System.out.println("Número generado: " + r1);

		while (r1 > 0) {
			numero = r1 % 10;
			if (numero % 2 != 0) {
				torrent++;
			} else {
				realBetis++;
				if (numero % 4 == 0 && numero != 0) {
					golesIsco++;
				}
			}
			r1 = r1 / 10;
		}

		System.out.printf("TORRENT %d - %d BETIS \n", torrent, realBetis);
		System.out.printf("Goles de Isco: %d \n", golesIsco);

		;
	}

	public static void numeroEnteroPositivo() {
		Scanner sc2 = new Scanner(System.in);

		long numero = 0;
		long contPares = 0;
		long suma = 0;

		System.out.println("Introduce un número entero positivo: ");
		numero = sc2.nextLong();
		while (numero > 0) {
			if (numero % 2 == 0) {
				contPares++;
				System.out.println("El número " + (numero % 10) + " es par.");
				suma = suma + (numero % 10);
			} else {
			}
			numero = numero / 10;
		}
		System.out.printf("El número tiene %d números pares y su suma es: %d", contPares, suma);
		sc2.close();
	}
}