package unidad3;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		int number;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		number = scan.nextInt();
		scan.close();
		if(number%2 == 0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		
		
	}

}
