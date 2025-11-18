package ejerciciosDiapositiva55;

import java.util.Scanner;

public class NumeroPositivo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero=0;

		System.out.println("Introduce un número positivo: ");
		numero=sc.nextInt();
		System.out.println("-----------------------------");
		System.out.println("Los números unidad a unidad son: ");
		
		while (numero > 0) {
            int unidad = numero % 10;
            System.out.println(unidad);
            numero /= 10;

		}
		
		sc.close();
	}

}