package unidad3;
import java.util.Scanner;

public class AdivinaNumero2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int limiteSup,respuesta;
		int limiteInf = 1;
		String contestacion;
		
		System.out.println("Introduce el l�mite superior: ");
		limiteSup = scan.nextInt();
		
		do {
			
			respuesta = (int) Math.floor(Math.random()*(limiteSup-limiteInf+1)+limiteInf);
			
			System.out.println("�Es " + respuesta + " el n�mero en el que pensabas? Dime, �acierto, mayor o menor?");
			contestacion = scan.next();
			
			if (contestacion.equals("menor")) {
				
				limiteSup = respuesta;				
			}else if (contestacion.equals("mayor")) {
				
				limiteInf = respuesta;
			}else if (contestacion.equals("acierto")) {
				
				System.out.println("Genial!! Lo he pasado muy bien jugando a adivinar tu n�mero!!");
			}
			
		} while(contestacion.equals("mayor") || contestacion.equals("menor"));
		
		scan.close();

	}

}
