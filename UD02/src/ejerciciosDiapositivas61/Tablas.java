package ejerciciosDiapositivas61;

public class Tablas {

	public static void main(String[] args) throws InterruptedException {
		int resultado;
		for (int i = 0; i < 11; i++) {
			Thread.sleep(1500);
			System.out.println("La tabla del " + i + ":");
			for (int j = 0; j < 11; j++) {
				Thread.sleep(1500);
				resultado = i * j;
				System.out.println(i + "x" + j + " = " + resultado);
			}
			System.out.println();
		}

	}

}
