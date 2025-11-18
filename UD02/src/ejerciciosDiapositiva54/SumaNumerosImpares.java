package ejerciciosDiapositiva54;

public class SumaNumerosImpares {

	public static void main(String[] args) {

		System.out.printf("La suma de los 10 primeros números impares es = ");

		int aux = 0;

		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				aux = i + aux;
			}
		}
		System.out.printf("%d \n", aux);
	}
}