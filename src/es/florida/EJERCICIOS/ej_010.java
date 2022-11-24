package es.florida.EJERCICIOS;

import java.util.Scanner;

public class ej_010 {
	
//	 Realiza una modificación del ejercicio anterior para que implemente un control de la entrada 
//	 por teclado (admitir sólo números del 1 al 12).

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num = 1;
		String mes = "";
		
		
		while (num != 0) {
			
			System.out.println("Introduce un número (0 para salir): ");
			num = teclado.nextInt();
			
			if (num > 12) {
				System.out.println("El número no es válido");
			} else {
				switch (num) {
				case 0:  { break; }
				case 1:  { mes = "Enero";      break; }
				case 2:  { mes = "Febrero";    break; }
				case 3:  { mes = "Marzo";      break; }
				case 4:  { mes = "Abril";      break; }
				case 5:  { mes = "Mayo";       break; }
				case 6:  { mes = "Junio";      break; }
				case 7:  { mes = "Julio";      break; }
				case 8:  { mes = "Agosto";     break; }
				case 9:  { mes = "Septiembre"; break; }
				case 10: { mes = "Octubre";    break; }
				case 11: { mes = "Noviembre";  break; }
				case 12: { mes = "Diciembre";  break; }
				}
				
				if (num == 0) {
					System.out.println("Hasta la próxima!");
				} else {
					System.out.println("Mes: " + mes);				
				}	
			}

		}
		
		
		teclado.close();

	}

}
