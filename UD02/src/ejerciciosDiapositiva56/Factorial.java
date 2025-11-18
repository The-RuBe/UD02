package ejerciciosDiapositiva56;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		int aux = 1;

		System.out.println("Introduce un número para calcular su factorial: ");
		numero = sc.nextInt();

		for (int i = numero; i > 1; i--) {
			aux = aux * i;
			if(i>2) {
				System.out.printf("%d x ", i);
			}else {
				System.out.printf("%d = ", i);
			}
		}

		System.out.printf(aux + "\n");

		sc.close();

	}
}