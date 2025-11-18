package ejerciciosDiapositiva53;

import java.util.Scanner;

public class NumeroComprendido1a10 {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int resultado = 0;
		System.out
				.println("Introduce un número comprendido entre el 1 y el 10 para realizar su tabla de multiplicar: ");
		numero = sc.nextInt();

		if (numero >= 1 && numero <= 10) {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(400);
				resultado = numero * i;
				System.out.println(numero + " X " + i + " = " + resultado);
			}
		} else
			System.out.println("El número introducido no está comprendido entre el 1 y el 10.");
	}
}