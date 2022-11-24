package es.florida.EJERCICIOS.ej_031;

public class ej_031 {
	
//	31. Crea una aplicación de consola en la se utilice una clase que tenga un método “sayHello” 
//	que saque por consola “Hola Mundo”. La clase puede tener el nombre que consideres. Como 
//	sugerencia, la clase se puede llamar “App”.

	public static void main(String[] args) {

		App saludo = new App("Mundo");
		saludo.sayHello();

	}

}