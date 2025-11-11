package ejerciciosDiapositiva45;

import java.util.Random;
import java.util.Scanner;

public class JuegoSuma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random r = new Random();

		int suma;
		int result;
		int cont = 0;

		do {

			int r1 = r.nextInt(0, 101);
			int r2 = r.nextInt(0, 101);
			suma = r1 + r2;
			System.out.println("Introduce el resultado de la siguiente operación: " + r1 + " + " + r2);
			result = sc.nextInt();

			if (result == suma) {

				System.out.println("------------");
				System.out.println("!Bien hecho¡");
				System.out.println("------------");
				++cont;
				
			}

		} while (result == suma && cont<10);
		System.out.println("-----------------------------------------");
		System.out.println("Has conseguido " + cont + " aciertos.");

	}

}