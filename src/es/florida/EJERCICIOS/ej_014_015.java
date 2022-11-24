package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_014_015 {
	
//	Desarrolla un programa que lea el valor del radio de una circunferencia y devuelva por 
//	pantalla el diámetro y el área con una precisión de 3 decimales.
	
//	amplia el programa anterior para que devuelve el volumen de una esfera definida por el 
//	mismo radio.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el radio de la circurferencia: ");
		
		double num = teclado.nextDouble();
		double diametro = num * 2;
		double area = (Math.PI * (Math.pow(num, 2)));
		double volumen = (1.333333 * Math.PI * (Math.pow(num,3)));
		
		System.out.println("Diametro: " + String.format("%.1f", diametro));
		System.out.println("Area: " + String.format("%.1f", area));
		System.out.println("Volumen: " + String.format("%.1f", volumen));
		
		
		
		teclado.close();

	}

}
