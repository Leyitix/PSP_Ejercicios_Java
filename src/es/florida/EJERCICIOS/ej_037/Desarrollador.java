package es.florida.EJERCICIOS.ej_037;

public class Desarrollador {
	
	protected String nombre;
	protected float anyos;
	
	public Desarrollador() {}
	public Desarrollador(String nombre, float anyos) {
		this.nombre = nombre;
		this.anyos = anyos;
	}

	public void nivel(String nombre, float anyos) {
		
		if (anyos < 1) {
			System.out.println("Nivel y salario de: " + nombre);
			System.out.println("“Desarrollador Junior L1 – 15000-18000");
		} else if (anyos >= 1 && anyos < 2) {
			System.out.println("Nivel y salario de: " + nombre);
			System.out.println("Desarrollador Junior L2 – 18000-22000");
		} else if (anyos >= 2 && anyos < 5) {
			System.out.println("Nivel y salario de: " + nombre);
			System.out.println("Desarrollador Senior L1 – 22000-28000");
		} else if (anyos >= 5 && anyos < 8) {
			System.out.println("Nivel y salario de: " + nombre);
			System.out.println("Desarrollador Senior L2 – 28000-36000");
		} else if (anyos >= 8) {
			System.out.println("Nivel y salario de: " + nombre);
			System.out.println("Analista / Arquitecto. Salario a convenir en base a rol");
		}
		
	}
	
}
