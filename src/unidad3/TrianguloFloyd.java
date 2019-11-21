package unidad3;
import java.util.Scanner;

public class TrianguloFloyd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int filas;
		int numImprimir=1;
		System.out.println("Introduce un númer de filas para generar el triángulo de Floyd");
		filas = scan.nextInt();
				
		for(int i=1;i<=filas;i++) {
			for(int j=1; j <= i; j++) {
				System.out.print(numImprimir + "\t" );
				numImprimir++;
			}
			System.out.println();
		}
		
		scan.close();
	}

}
