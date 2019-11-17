package unidad3;

import java.util.Calendar;

public class Hora {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		
		int hora, minuto, segundo;
		String horaActual, horaMasUnSeg;
		
		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minuto = calendario.get(Calendar.MINUTE);
		segundo = calendario.get(Calendar.SECOND);
		
		horaActual = hora+":"+minuto+":"+segundo;
		
		segundo++;
		
		if(segundo>59) {
			segundo=0;
			minuto++;
			if(minuto>59) {
				minuto = 0;
				hora++;
				if(hora>23) {
					hora = 0;
				}
			}
		}
		horaMasUnSeg = hora+":"+minuto+":"+segundo;
		
		System.out.println("Hora actual: "+horaActual+", hora actual más un segundo: "+ horaMasUnSeg);
		
	}

}
