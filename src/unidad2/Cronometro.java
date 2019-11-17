package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		
		//Ingrese datos usando BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Dime tu nombre: ");
        double ini = System.currentTimeMillis();
        
        // Leyendo datos usando readLine
        String name = reader.readLine();
						
		double fin = System.currentTimeMillis();
        
        double seconds = (fin - ini)/1000;
        double miliseconds = fin - ini;
        
        DecimalFormat df = new DecimalFormat("0.000");
          
        System.out.println("Hola " + name + ", has tardado " + df.format(miliseconds) + " milisegundos en decirme tu nombre, es decir, "+ df.format(seconds) + " segundos.");
 
	}

}
