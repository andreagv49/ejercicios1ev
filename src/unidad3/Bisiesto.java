package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int año;
		System.out.println("Introduzca un año");
		año = scan.nextInt();
		scan.close();
		if(año%4 == 0) {
			System.out.println("Es bisiesto");
		}else {
			System.out.println("No es bisiesto");
		}
		
	}

}
