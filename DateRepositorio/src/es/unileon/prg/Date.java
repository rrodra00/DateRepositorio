//package es.unileon.prg;

public class Date {
	private int year, month, day;
	
	public Date(){
		this.day=day;
		this.month=motnh;
		this.year=year;
	}
	
	public boolean isSameYear(int year){
		return null;
	}
	
	public boolean isSameMonth(int month){
		return null;
	}

	public boolean isSameDay(int day){
		return null;
	}
	
	public String getMonthName(){
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
	
	public int checkDay(){
		int mes = new int;
		switch(month){
		case 1|3:
		day <= 31
		break;
		case 2:
		if(month = "Abril"|"Junio"|"Septiembre"|"Noviembre")
		day <=30
		break;
		case 3:
		if(month = "Febrero")
		day <= 28
		break;
		}
	
	}
	
	public String getSeasonMonth(){
		String season = new String(" ");
		switch(month){
			case 1: 
			if (month = "Enero"|"Febrero"||"Diciembre")
			season = "Invierno";
			break;
			case 2: 
			if (month == "Marzo"||"Abril"||"Mayo")
			season = "Primavera";
			break;
			case 3: 
			if (month == "Junio"||"Julio"||"Agosto")
			season = "Verano";
			break;
			case 4: 
			if (month == "Septiembre"||"Octubre"||"Noviembre")
			season = "Oto�o";
			break;
		}
		return season;
		
	}
}
