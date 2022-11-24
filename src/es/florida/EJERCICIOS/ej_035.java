package es.florida.EJERCICIOS;

public class ej_035 {
	
//	35. Escribe un método que acepte un array o una lista de elementos y devuelva el mayor de 
//	ellos

	public static void main(String[] args) {

		int[] numeros = new int[] { 23, 65, 565, 78, 2, 798, 89, 0 };
		int numMayor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > numMayor) {
				numMayor = numeros[i];
			}
		}

		System.out.println("El numero mayor es: " + numMayor);
	}

}
