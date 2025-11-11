package ejerciciosDiapositiva44;

import java.util.Scanner;

public class SumaPromedio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cont = 0;

		int suma = 0;

		do {
			System.out.println("Introduzca un número: ");
			int numero = sc.nextInt();

			suma += numero;

			++cont;

		} while (cont < 10);

		double promedio = suma / (cont * 1.0);

		System.out.printf("La suma de los números es %d y el promedio es %.2f \n", suma, promedio);

		sc.close();

	}

}