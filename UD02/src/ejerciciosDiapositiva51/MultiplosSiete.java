package ejerciciosDiapositiva51;

import java.util.Scanner;

public class MultiplosSiete {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Estos son los múltiplos de 7 menores que 100: ");

		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0) {
				Thread.sleep(200);
				System.out.println("-> " + i);
			}
		}
	}
}