package unidad3;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int veces,cara;
		int vecesUno = 0;
		int vecesDos = 0;
		int vecesTres = 0;
		int vecesCuatro = 0;
		int vecesCinco = 0;
		int vecesSeis = 0;
		
		System.out.println("Empezamos lanzando el dado! ¿Cuántas veces quieres lanzarlo?");
		veces = scan.nextInt();
		
		for(int i=0;i<veces;i++) {
			cara = (int) (Math.random()* 6 + 1);
			
			switch(cara) {
				case 1:
					vecesUno++;
					break;
				case 2:
					vecesDos++;
					break;
				case 3:
					vecesTres++;
					break;
				case 4:
					vecesCuatro++;
					break;
				case 5:
					vecesCinco++;
					break;
				case 6:
					vecesSeis++;
					break;
			}
		}
		
		System.out.println("El numero 1 ha salido " + vecesUno + " veces.");
		System.out.println("El numero 2 ha salido " + vecesDos + " veces.");
		System.out.println("El numero 3 ha salido " + vecesTres + " veces.");
		System.out.println("El numero 4 ha salido " + vecesCuatro + " veces.");
		System.out.println("El numero 5 ha salido " + vecesCinco + " veces.");
		System.out.println("El numero 6 ha salido " + vecesSeis + " veces.");
		scan.close();

	}

}
