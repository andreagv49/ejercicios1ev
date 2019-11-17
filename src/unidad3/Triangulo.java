package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long a,b,c;
		
		System.out.println("Introduce un lado: ");
		a = scan.nextInt();
		System.out.println("Introduce otro lado: ");
		b = scan.nextInt();
		System.out.println("Introduce otro lado: ");
		c = scan.nextInt();
		scan.close();
		
		
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println("Es un triángulo");
			
			if(a!=b && b!=c && a!=c) {
				//escaleno -> ningun lado igual
				System.out.println("Es un triangulo 'escaleno'");
				
			}else if ((a==b && b!= c) || (a==c && b!=c) || (b==c && c!=a)){
				//isosceles -> dos lados iguales y uno diferente
				System.out.println("Es un triangulo 'isosceles'");
				
			}else if (a==b && b==c && c==a){
				//equilatero -> todos los lados iguales
				System.out.println("Es un triangulo 'equilatero'");
			}
		}else {
			System.out.println("No es triangulo");
		}
	}

}
