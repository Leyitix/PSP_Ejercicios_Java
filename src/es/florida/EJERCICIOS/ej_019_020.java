package es.florida.EJERCICIOS;

// import java.util.Scanner;

public class ej_019_020 {
	
//	19. Realizar un programa que muestre por pantalla los caracteres ASCII (código y carácter).
//	20. Ampliar el programa anterior incluyendo también los caracteres de ASCII extendido.

	public static void main(String[] args) {
		
		System.out.println("EJERCICIO 019");
		for (int i = 0; i < 128; i++) {
			System.out.println((i+1) + " - " + (char)i );
		}
		
		System.out.println("EJERCICIO 020");
		for (int i = 0; i < 256; i++) {
			System.out.println((i+1) + " - " + (char)i);
		}
		
		

//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Introduce el caracter que quieras convertir: ");
//		
//		char caracter = teclado.next().charAt(0);
//		int ascii = (int) caracter;
//		
//		System.out.println(caracter + " - " + ascii);
//		
//		teclado.close();

	}

}
