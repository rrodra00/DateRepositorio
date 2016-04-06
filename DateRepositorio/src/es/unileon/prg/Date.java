//package es.unileon.prg;

public class Date {
	int year, month, day;
	

	public static void main(String[] args) {
		
	}
	
	public static void isSameYear(int year){
		
	}
	
	public static void isSameMonth(int month){
		
	}

	public static void isSameDay(int day){
	
	}
	
	String getMonthName(){
		String mes = new String (" ");
		switch(month){
			case 1: mes = "Enero";
				break;
			case 2: mes = "Febrero";
			break;
			case 3: mes = "Marzo";
			break;
			case 4: mes = "Abril";
			break;
			case 5: mes = "Mayo";
			break;
			case 6: mes = "Junio";
			break;
			case 7: mes = "Julio";
			break;
			case 8: mes = "Agosto";
			break;
			case 9: mes = "Septiembre";
			break;
			case 10: mes = "Octubre";
			break;
			case 11: mes = "Noviembre";
			break;
			case 12: mes = "Diciembre";
			break;
		}
		return mes ;	
	}
	
	String getSeasonMonth(){
		String season = new String(" ");
		switch(month){
			case 1: season = "Invierno";
			if (month = "Enero"|"Febrero"||"Diciembre")
			break;
			case 2: season = "Primavera";
			if (month == "Marzo"||"Abril"||"Mayo")
			break;
			case 3: season = "Verano";
			if (month == "Junio"||"Julio"||"Agosto")
			break;
			case 4: season = "Otoño";
			if (month == "Septiembre"||"Octubre"||"Noviembre")
			break;
		}
		return season;
		
	}
}
