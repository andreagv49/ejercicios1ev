package unidad2;
import java.util.Scanner;

public class Conversor {
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		double euros, dolares; 
		
		System.out.println("Introduzca cantidad en euros: ");
		euros = scan.nextDouble();
		
		dolares = euros * 1.12;
		
		System.out.println(((double)Math.round(euros * 100d) / 100d)+ " euros equivalen a "+ ((double)Math.round(dolares * 100d) / 100d) + " dolares.");
		
		scan.close();
	}
	
}
