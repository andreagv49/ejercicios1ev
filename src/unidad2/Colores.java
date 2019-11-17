package unidad2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Colores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		int r,g,b;
		double y,i,q;
		
		System.out.println("Introduzca el componente rojo 'RGB': ");
		r = scan.nextInt();
		System.out.println("Introduzca el componente verde 'RGB': ");
		g = scan.nextInt();
		System.out.println("Introduzca el componente azul 'RGB': ");
		b = scan.nextInt();
		
		y = 0.299 *r + 0.587 * g + 0.114 * b;
		i = 0.596 *r - 0.275 * g - 0.321 * b;
		q = 0.212 *r - 0.528 * g + 0.311 * b;
		
		System.out.println("La equivalencia 'YIQ' de tus componentes introducidos es: ");
		System.out.println("Y: " + df.format(y) + " -> R");
		System.out.println("I: " + df.format(i) + " -> G");
		System.out.println("Q: " + df.format(q) + " -> B");
		
		scan.close();
	}

}
