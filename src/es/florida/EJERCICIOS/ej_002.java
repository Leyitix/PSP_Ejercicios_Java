package es.florida.EJERCICIOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ej_002 {
	
//	 Programa Java que lea un nombre desde teclado y muestre por pantalla un mensaje tipo 
//	 “Hola xxxxx”

	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("Hola " +  nombre);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Dime tu edad:");
		
		String edad = br.readLine();
		System.out.println("Tienes " + edad);
		isr.close();
		br.close();

		teclado.close();
	}

}
