package es.florida.EJERCICIOS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ej_017_018 {
	
//	Realiza un programa que controle los requisitos de una contraseña introducida por teclado 
//	(mínimo 5 caracteres, 1 número y 1 letra mayúscula).
//	
//	Amplía el programa anterior haciendo que el usuario repita la contraseña y comprobando 
//	que lo ha hecho correctamente.

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Introduce una contraseña: ");
		String contrasenya = br.readLine();
		while (contrasenya.length() < 5) {
			System.out.println("Minimo 5 caracteres, introduce contraseña: ");
			contrasenya = br.readLine();
		}
		
		
		boolean checkmayus = false;
		boolean checknumero = false;
		char ch;
		
		for (int i = 0; i < contrasenya.length(); i++) {
			ch = contrasenya.charAt(i);
			if (Character.isDigit(ch)) {
				checknumero = true;
			}
			if(Character.isUpperCase(ch)) {
				checkmayus = true;
			}
		}
		if (checknumero == true && checkmayus == true) {
			System.out.println("Contraseña correcta");
		} else {
			System.out.println("Contraseña correcta (minimo 5 caracteres, 1 mayúscula y 1 número)");
		}

	}

}
