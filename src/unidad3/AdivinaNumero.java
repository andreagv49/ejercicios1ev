package unidad3;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		int N = (int) Math.floor(Math.random()*(100000-1000+1)+1000);
		int numeroAdivinar = (int) (Math.random()* N + 1);
		int respuesta;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("He pensado un número entre 1 y " + N + ", adivina cual es:");
			respuesta = scan.nextInt();
			
			if(respuesta != numeroAdivinar) {
				if(respuesta > numeroAdivinar) {
					System.out.println("Lo siento no has acertado, el número es menor que el que has introducido. Sigue jugando");
				}else {
					System.out.println("Lo siento no has acertado, el número es mayor que el que has introducido. Sigue jugando");
				}
				
			}else {
				System.out.println("Enhorabuena!!!Has acertado!!!!");
			}
		} while (respuesta != numeroAdivinar);
		
		scan.close();
	}

}
