package ejerciciosDiapositiva50;

import java.util.Scanner;

public class BucleConFor {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int num = sc.nextInt();
		System.out.println(".....................");
		
		for (int i = 1; i <= num; i++) {
			Thread.sleep(150);
			System.out.println("->"+ i);
		}
	}

}