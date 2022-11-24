package es.florida.EJERCICIOS.ej_028_029;

import java.util.Scanner;

public class ej_028_029 {
	
//	28. Crea un programa que permita generar 5 objetos de clase “Vehículo”. Cada vehículo tendrá 
//	tres atributos: tipo (coche, motocicleta,…), marca y modelo. Una vez creados, el programa 
//	los mostrará por pantalla.
//	29. Modifica el programa anterior para que el programa admita una lista de longitud 
//	indeterminada de vehículos.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String tipo, marca, modelo, opciones;
		do {

			System.out.println("Introduce un tipo de vehiculo: ");
			tipo = teclado.nextLine();

			System.out.println("Introduce una marca: ");
			marca = teclado.nextLine();

			System.out.println("Introduce un modelo: ");
			modelo = teclado.nextLine();

			Vehiculo moto = new Vehiculo(tipo, marca, modelo);
			System.out.println(moto.getInformacion());

			System.out.println("Introduce si/no para salir: ");
			opciones = teclado.nextLine();

		} while (!opciones.equals("no"));

//		Vehiculo moto = new Vehiculo("moto", "Honda", "CB 300 R");
//		System.out.println(moto.getInformacion());
//		
//		Vehiculo coche = new Vehiculo("coche", "BMW", "Serie 2 Gran Coupé");
//		System.out.println(coche.getInformacion());
//		
//		Vehiculo bici = new Vehiculo("bicicleta", "Scott", "Bicicleta de montaña");
//		System.out.println(bici.getInformacion());
//		
//		Vehiculo avion = new Vehiculo("avión", "Boeing 737", "Avión comercial");
//		System.out.println(avion.getInformacion());
//		
//		Vehiculo patinete = new Vehiculo("patinete eléctrico", "Cecotec", "Bongo Serie A");
//		System.out.println(patinete.getInformacion());

		teclado.close();

	}

}
