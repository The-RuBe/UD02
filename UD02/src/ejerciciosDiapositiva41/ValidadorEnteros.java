package ejerciciosDiapositiva41;

import java.util.Scanner;

public class ValidadorEnteros {

	public static void main(String[] args) {

		int entero = 1;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce un número del 1 al 10: ");
			entero=sc.nextInt();
			
			if(entero<1 || entero>10) {
				
				System.out.println("Solo puedes introducir un número del 1 al 10.");
				
			}
			
		} while (entero > 10 || entero < 1);
		
		System.out.println("-----------");
		System.out.println("Bien hecho.");

		sc.close();
	}

}