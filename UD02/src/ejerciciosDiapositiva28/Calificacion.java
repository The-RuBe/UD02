package ejerciciosDiapositiva28;

public class Calificacion {

	private int nota;

	public Calificacion(int nota) {
		this.nota = nota;
	}

	public int getNota() {
		return this.nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public void mostrarResultadoSwitch() {
		switch (this.nota) {
		case 0, 1, 2, 3, 4:
			System.out.println("Insuficiente");
			break;

		case 5:
			System.out.println("Suficiente");
			break;

		case 6:
			System.out.println("Bien");
			break;
		case 7, 8:
			System.out.println("Notable");
			break;
		case 9, 10:
			System.out.println("Sobresaliente");
			break;
		}
	}

	public void mostrarResultadoIfElse() {
		if(this.nota>=5) {
			System.out.println("Aprobado");
		}else
			System.out.println("Suspenso");
	}
}