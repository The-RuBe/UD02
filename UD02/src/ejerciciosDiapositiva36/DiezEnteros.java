package ejerciciosDiapositiva36;

import java.util.Scanner;

public class DiezEnteros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		
		int suma=0;
		
		while(i<10) {
			
			System.out.println("Introduzca un número: ");
			int numero=sc.nextInt();
			
			suma = suma + numero;
			
			++i;
			
		}
		
		double promedio= suma/i;
		
		System.out.printf("La suma de los números es %.2f y el promedio es %.2f)", suma, promedio);
		
	}

}