package boletin1;

import java.util.Random;
import java.util.Scanner;

public class Complejidad {

	public static void adivinaNumero() throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		Random r = new Random();

		int r1 = r.nextInt(1, 101);
		int intento;
		int cont = 10;
		System.out.println("Se ha generado un número aleatorio del 1 al 100, intenta adivinarlo.");

		do {
			System.out.println("Introduce el número: ");
			intento = sc.nextInt();
			cont--;

			if (intento == r1) {

				int intentos = 10 - cont;
				System.out.println("Has acertado en " + intentos + " intentos.");

			}

			else if (intento < r1) {

				Thread.sleep(250);
				System.out.println("Has fallado (el número es mayor)");
				System.out.println("--------------------------------");
				System.out.println("Te quedan " + cont + " intentos.");

			}

			else if (intento > r1) {

				Thread.sleep(250);
				System.out.println("Has fallado (el número es menor)");
				System.out.println("--------------------------------");
				System.out.println("Te quedan " + cont + " intentos.");

			}

		} while (r1 != intento && cont > 0);

		if (cont == 0) {

			System.out.println("Has terminado, el número era: " + r1);

		}

		sc.close();

	}

	public static void numerosAfortunados() throws InterruptedException {

		Scanner sc2 = new Scanner(System.in);

		int numero;
		int contSuerte = 0;
		int contMalaSuerte = 0;

		System.out.println("Introduce un número: ");
		numero = sc2.nextInt();

		while (numero > 0) {
			int digito = numero % 10;

			if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
				contSuerte++;
			} else {
				contMalaSuerte++;
			}

			numero = numero / 10;

		}

		if (contSuerte > contMalaSuerte) {

			System.out.println("El número es afortunado.");

		} else {

			System.out.println("El número es desafortunado.");

		}
		
		sc2.close();
		
	}
	
	public static void validaPassword() {
		
		Scanner sc3 = new Scanner (System.in);
		int mayus=0;
		int minus=0;
		int numeros=0;
		int especiales=0;
		
		System.out.println("Ingrese una contraseña: ");
		String password = sc3.next();
		
		for(int i=0; i < password.length(); i++) {
			
			String caracter = password.substring(i, i+1);
			
			
		}
	}
}
