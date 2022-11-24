package es.florida.EJERCICIOS.ej_031;

public class App {

	protected String nombre;
	
	public App() {}
	public App(String nombre) {
		this.nombre = nombre;
	}
	
	public void sayHello() {
		System.out.println("Hola " + nombre);
	}
	
}
