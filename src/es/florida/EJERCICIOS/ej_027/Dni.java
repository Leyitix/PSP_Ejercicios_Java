package es.florida.EJERCICIOS.ej_027;

public class Dni {
	
	char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; 
	char letraDni;
	
	public void calcularLetraDni(int dni) {
		letraDni = letras[dni % 23];

		System.out.println(dni + "-" + letraDni);
	}

}
