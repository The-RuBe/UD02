package boletin3;

import java.util.Scanner;

public class Boletin3 {

	// Se crea el método estático del ejercicio 1
	public static void Ejercicio1() {
		// Se crea el Scanner
		Scanner sc = new Scanner(System.in);

		int numero;
		int aux;

		do {
			// Se introduce el número
			System.out.print("Introduzca un número entero positivo: ");
			numero = sc.nextInt();
		} while (numero < 0); // El número debe ser mayor que 0 para salir del bucle

		// Se integran las variables
		aux = numero;
		int vuelta = 0;

		while (numero > 0) { // Mientras el número sea mayor que 0 el bucle se sigue ejecutando
			// Se le da la vuelta al número para luego
			vuelta = (vuelta * 10) + (numero % 10);
			numero = numero / 10;
		}

		// Se muestra por pantalla el mensaje anterior al número para luego mostrarlo
		System.out.printf("El número %d en palotes es: ", aux);

		while (vuelta > 0) { // Se hace el bucle para sacar los palos con el número invertido para que lo
								// proporcione bien

			int digito = vuelta % 10;

			for (int i = 0; i < digito; i++) {
				System.out.print("|");
			}

			vuelta = vuelta / 10;
			if (vuelta > 0) { // Esta condición se realiza para no poner un guión al final
				System.out.print("-");
			}
		}

		sc.close(); // Se cierra el Scanner
	}

	// Se crea el método estático del ejercicio 2
	public static void Ejercicio2() {
		// Se crea el Scanner
		Scanner sc2 = new Scanner(System.in);

		// Se integra la variable
		int altura;

		// Se ejecuta el bucle hasta que no se introduzca la altura necesaria
		do {
			System.out.println("Introduce la altura de la U: ");
			altura = sc2.nextInt();
		} while (altura < 3);

		// Aquí empieza el código necesario para realizar la U con espacios necesarios
		// de por medio -2 a la altura igual que la base
		for (int i = altura; i > 1; i--) {
			System.out.printf("*");
			for (int j = altura - 2; j > 0; j--) {
				System.out.printf(" ");
			}
			System.out.printf("*\n");
		}
		System.out.printf(" ");
		for (int h = altura - 2; h > 0; h--) {
			System.out.printf("*");
		}

		sc2.close(); // Se cierra el Scanner

	}

	// Se crea el método estático del ejercicio 3
	public static void Ejercicio3() {
		// Se crea el Scanner
		Scanner sc3 = new Scanner(System.in);

		// Se integran las variables
		int numero;
		int posicion;
		int digito;

		System.out.print("Introduzca un número entero positivo: ");
		numero = sc3.nextInt();

		System.out.print("Introduzca la posición donde quieres insertarlo: ");
		posicion = sc3.nextInt();

		System.out.print("Introduzca el dígito que quieres insertar: ");
		digito = sc3.nextInt();

		int aux = numero;
		int contador = 0;

		// Cuenta cuántos dígitos tiene el número
		while (aux > 0) {
			aux = aux / 10;
			contador++;
		}

		// Se hace el nuevo número
		int izquierda = numero / (int) Math.pow(10, contador - posicion + 1);
		int derecha = numero % (int) Math.pow(10, contador - posicion + 1);

		// Se inserta el dígito
		int resultado = izquierda * (int) Math.pow(10, contador - posicion + 2)
				+ digito * (int) Math.pow(10, contador - posicion + 1) + derecha;

		System.out.printf("El resultado es: %d", resultado);

		sc3.close(); // Se cierra el Scanner
	}
}