package es.florida.EJERCICIOS.ej_033;

public class Suma {

	int[] listaNumeros = new int[10];
	int par = 0;
	int suma = 0;

	public int sumar(int numero) {

		for (int i = 0; i < listaNumeros.length; i++) {

			listaNumeros[i] = (int)(Math.random()*numero);
			System.out.println("- " + listaNumeros[i]);
			
			suma = (listaNumeros[i] % 2 == 0) ? 
					suma + listaNumeros[i] :
						suma;
		}
		
		return suma;
	
	}
}
