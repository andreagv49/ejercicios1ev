package unidad2;

import java.text.DecimalFormat;

public class Division {

	public static void main(String[] args) {
		
		double num1 = 1234;
		double num2 = 532;
		double result = num1/num2;
		DecimalFormat df = new DecimalFormat("0000000000000.00");
		
		System.out.println("El resultado de dividir 1234 entre 532 es: " + df.format(result));
		
	}

}
