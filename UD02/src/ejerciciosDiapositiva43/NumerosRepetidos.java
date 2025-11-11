package ejerciciosDiapositiva43;

import java.util.Scanner;

public class NumerosRepetidos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;

		System.out.println("Debes introducir dos números iguales.");
		System.out.println("-------------------------------------");

		do {

			System.out.println("Introduce el número 1: ");
			numero1 = sc.nextInt();

			System.out.println("Introduce el número 2: ");
			numero2 = sc.nextInt();

			if (numero1 != numero2) {
				System.out.println("-----------------------------------------");
				System.out.println("Error 404: Introduce dos números iguales.");
				System.out.println("-----------------------------------------");
			}
		} while (numero1 != numero2);

		System.out.println("-----------");
		System.out.println("Bien hecho.");
		System.out.println("-----------");
	}

}