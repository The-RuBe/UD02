package ejerciciosDiapositiva42;

import java.util.Scanner;

public class ConString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String vocal = null;

		do {
			System.out.println("Introduce una vocal: ");
			vocal = sc.next().toLowerCase();

			if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")) {

			}

		} while (!vocal.equals("a") && !vocal.equals("e") & !vocal.equals("i") && !vocal.equals("o")
				&& !vocal.equals("u"));

		System.out.println("-----------");
		System.out.println("Bien hecho.");

	}

}