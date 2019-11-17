package unidad2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salarioBase, venta1, venta2, venta3, salarioTotal;
		
		System.out.println("Introduzca su sueldo base: ");
		salarioBase = scan.nextDouble();
		System.out.println("Introduzca venta 1: ");
		venta1 = scan.nextDouble();
		System.out.println("Introduzca venta 2: ");
		venta2 = scan.nextDouble();
		System.out.println("Introduzca venta 3: ");
		venta3 = scan.nextDouble();
		
		scan.close();
		
		salarioTotal = salarioBase + (venta1+venta2+venta3)*0.1;
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Su sueldo este mes es de: " + df.format(salarioTotal) + " €.");
	}

}
