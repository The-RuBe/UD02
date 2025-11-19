package ejerciciosDiapositiva66;

public class Abecedario {

	public static void main(String[] args) {

		for (char i = 'Z'; i >= 'A'; i--) {
			for (char j = i; j >= 'A'; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}