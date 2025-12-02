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
		System.out.printf("El número tiene %d números pares y su suma es: %d \n", contPares, suma);
		sc2.close();
	}

	public static void Actividad4() {

		Scanner sc3 = new Scanner(System.in);

		System.out.println("Dime una palabra o frase: ");
		String cadena = sc3.next();

		String caracter1;

		do {
			System.out.println("Dime el carácter 1: ");
			caracter1 = sc3.next();
		} while (caracter1.length() != 1);

		String caracter2;

		do {
			System.out.println("Dime el carácter 2: ");
			caracter2 = sc3.next();
		} while (caracter2.length() != 1);

		for (int i = 0; i < cadena.length(); i++) {
			String caracter = cadena.substring(i, i + 1);

			if (caracter.equalsIgnoreCase(caracter1)) {
				System.out.print(caracter2);
			} else {
				System.out.print(caracter);

			}
			sc3.close();
		}

	}

}