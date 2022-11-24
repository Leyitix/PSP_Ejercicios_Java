package es.florida.EJERCICIOS.ej_026;

import java.util.ArrayList;

public class Notas {	
	
	int contadorSuspensos = 0;
	int contadorAprobados = 0;
	int contadorNotables = 0;
	int contadorSobresalientes = 0;
	int contadorMatriculas = 0;
	
	private int totalSuspensos;
	private int totalAprobados;
	private int totalNotables;
	private int totalSobresalientes;
	private int totalMatriculas;

	public Notas() {}
	
	public void determinarCalificacion( ArrayList<Integer> notas ) {

		for (Integer nota : notas) {
			if (nota == 0 || nota == 1 || nota == 2 || nota == 3 || nota == 4) {
				contadorSuspensos++;
				this.setTotalSuspensos(contadorSuspensos);
			} else if (nota == 5) {
				contadorAprobados++;
				this.setTotalAprobados(contadorAprobados);
			} else if (nota == 6 || nota == 7) {
				contadorNotables++;
				this.setTotalNotables(contadorNotables);
			} else if (nota == 8 || nota == 9) {
				contadorSobresalientes++;
				this.setTotalSobresalientes(contadorSobresalientes);
			} else if (nota == 10) {
				contadorMatriculas++;
				this.setTotalMatriculas(contadorMatriculas);
			}

		}

	}
	
	

	public int getTotalSuspensos() {
		return totalSuspensos;
	}

	public int setTotalSuspensos(int totalSuspensos) {
		return this.totalSuspensos = totalSuspensos;
	}

	public int getTotalAprobados() {
		return totalAprobados;
	}

	public int setTotalAprobados(int totalAprobados) {
		return this.totalAprobados = totalAprobados;
	}

	public int getTotalNotables() {
		return totalNotables;
	}

	public int setTotalNotables(int totalNotables) {
		return this.totalNotables = totalNotables;
	}

	public int getTotalSobresalientes() {
		return totalSobresalientes;
	}

	public int setTotalSobresalientes(int totalSobresalientes) {
		return this.totalSobresalientes = totalSobresalientes;
	}

	public int getTotalMatriculas() {
		return totalMatriculas;
	}

	public int setTotalMatriculas(int totalMatriculas) {
		return this.totalMatriculas = totalMatriculas;
	}
	

	
}




