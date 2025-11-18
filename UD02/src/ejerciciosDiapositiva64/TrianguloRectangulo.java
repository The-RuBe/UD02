package ejerciciosDiapositiva64;

import java.util.Scanner;

public class TrianguloRectangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca la longitud de los lados iguales del triángulo rectángulo: ");
		numero=sc.nextInt();
		
		for(int i=numero; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
