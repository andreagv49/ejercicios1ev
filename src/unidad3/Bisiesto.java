package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a�o;
		System.out.println("Introduzca un a�o");
		a�o = scan.nextInt();
		scan.close();
		if(a�o%4 == 0) {
			System.out.println("Es bisiesto");
		}else {
			System.out.println("No es bisiesto");
		}
		
	}

}
