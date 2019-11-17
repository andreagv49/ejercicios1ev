package unidad3;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char operacion;
		double num1, num2, resultado=0;
		
		do{
			System.out.println("Escoja una operación -> '+', '-', '*' o '/' o escriba 's' para salir ");
			operacion = scan.next().charAt(0);
			
			if(operacion != 's') {
				
				System.out.println("Introduzca un numero");
				num1= scan.nextDouble();
				System.out.println("Introduzca otro numero");
				num2= scan.nextDouble();
				
				switch(operacion) {
					case '+':
						resultado = num1 + num2;
						break;
					
					case '-':
						resultado = num1 - num2;
						break;
				
					case '*':
						resultado = num1 * num2;
						break;
			
					case '/':
						resultado = num1 / num2;
						break;
				}
				
				String op = String.valueOf(operacion);
				System.out.println(num1+op+num2+"="+resultado);
				
			}else {
				System.out.println("Fin de programa");
			}
			
		}while (operacion != 's');
			
		scan.close();

	}

}
