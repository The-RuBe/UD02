package ejerciciosDiapositiva57;

import java.util.Scanner;

public class Calificaciones {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero=5;
		double nota;
		int contSuspenso=0;
		int contAprobado=0;
		
		do {
			
			System.out.println("Introduce la nota: ");
			nota=sc.nextDouble();
			if(nota<5) {
				contSuspenso++;
				numero--;
			}else {
				contAprobado++;
				numero--;
			}
		}while(numero>0);
		
		System.out.printf("Hay %d aprobados y %d suspensos.", contAprobado, contSuspenso);
		
		sc.close();
		
	}
}
