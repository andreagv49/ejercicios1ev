package unidad3;
import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero,resultado;
		int respuesta = 0;
		int fallo = 0;
		
		do {
			System.out.println("¿Que tabla de multiplicar quieres repasar? Escribe un numero: ");
			numero = scan.nextInt();
			
			if(numero>0 & numero<9) {
				for(int i=1; i<=9;i++) {
									
					System.out.print(i);
					System.out.print(" * ");
					System.out.print(numero);
					System.out.print(" = ");
					resultado = scan.nextInt();
					if(resultado != i*numero) {
							
						System.out.println("Has fallado!");
						fallo++;
						System.out.println("La respuesta correcta es: "+ i*numero);
					}
				}
				
				if(fallo < 2) {
					System.out.println("Muy bien!! Has aprobado!!");
				}else {
					System.out.println("Lo siento, has tenido 2 o más fallos, has suspendido.");
				}
				System.out.println("¿Quieres repetir otra tabla? Escribe '0' para el 'si' o '1' para el 'no'");
				
				respuesta = scan.nextInt();
				
				if(respuesta == 1) {
					System.out.println("De acuerdo, fin del programa");
				}
			}else {
				System.out.println("Debe introducir un numero entre 1 y 9");
			}	
		}while(respuesta == 0);
		
		scan.close();
	}

}
