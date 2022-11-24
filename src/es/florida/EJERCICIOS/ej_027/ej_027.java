package es.florida.EJERCICIOS.ej_027;

import java.util.Scanner;

public class ej_027 {

//	27. De la misma forma que en el ejercicio anterior, implementar en un método adicional el 
//	cálculo de la letra del DNI (ejercicio 11) para que sea llamado desde “main”.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Dni dni001 = new Dni();

		System.out.println("Introduce tu DNI sin letra: ");
		int dni = teclado.nextInt();

		dni001.calcularLetraDni(dni);

		teclado.close();

	}

}
