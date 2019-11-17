package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Calificaciones {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.00");
		//PROMEDIOS EN MATEMÁTICAS
		
		System.out.println("Introduce calificación en el examen de matemáticas: ");
		String notaM = reader.readLine();
		double notaExamMate = Double.parseDouble(notaM);
		
		System.out.println("Introduce calificación en la tarea 1 de matemáticas: ");
		String notaT1M = reader.readLine();
		double notaTar1Mate = Double.parseDouble(notaT1M);
		
		System.out.println("Introduce calificación en la tarea 2 de matemáticas: ");
		String notaT2M = reader.readLine();
		double notaTar2Mate = Double.parseDouble(notaT2M);
		
		System.out.println("Introduce calificación en la tarea 3 de matemáticas: ");
		String notaT3M = reader.readLine();
		double notaTar3Mate = Double.parseDouble(notaT3M);
		
		double promedioMate = (notaExamMate * 0.9) + ((notaTar1Mate + notaTar2Mate + notaTar3Mate)/3 * 0.1); 
		
		System.out.println("Tu promedio en matemáticas es: " + df.format(promedioMate));
		
		//PROMEDIOS EN FÍSICA
		
		System.out.println("Introduce calificación en el examen de física: ");
		String notaF = reader.readLine();
		double notaExamFis = Double.parseDouble(notaF);
			
		System.out.println("Introduce calificación en la tarea 1 de física: ");
		String notaT1F = reader.readLine();
		double notaTar1Fis = Double.parseDouble(notaT1F);
			
		System.out.println("Introduce calificación en la tarea 2 de física: ");
		String notaT2F = reader.readLine();
		double notaTar2Fis = Double.parseDouble(notaT2F);
								
		double promedioFis = (notaExamFis * 0.8) + ((notaTar1Fis + notaTar2Fis)/2 * 0.2); 
				
		System.out.println("Tu promedio en física es: " + df.format(promedioFis));
		
		//PROMEDIOS EN QUÍMICA
		
		System.out.println("Introduce calificación en el examen de química: ");
		String notaQ = reader.readLine();
		double notaExamQuim = Double.parseDouble(notaQ);
		
		System.out.println("Introduce calificación en la tarea 1 de química: ");
		String notaT1Q = reader.readLine();
		double notaTar1Quim = Double.parseDouble(notaT1Q);
		
		System.out.println("Introduce calificación en la tarea 2 de química: ");
		String notaT2Q = reader.readLine();
		double notaTar2Quim = Double.parseDouble(notaT2Q);
		
		System.out.println("Introduce calificación en la tarea 3 de química: ");
		String notaT3Q = reader.readLine();
		double notaTar3Quim = Double.parseDouble(notaT3Q);
		
		double promedioQuim = (notaExamQuim * 0.85) + ((notaTar1Quim + notaTar2Quim + notaTar3Quim)/3 * 0.15); 
		
		System.out.println("Tu promedio en química es: " + df.format(promedioQuim));
		
		
		//PROMEDIO GENERAL
		double promedio = (promedioMate + promedioFis + promedioQuim) / 3;
		
		System.out.println("Tu promedio total en matemáticas, física y química es: " + df.format(promedio));
		
	}

}
