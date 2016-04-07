import java.util.Scanner;

//package es.unileon.prg;

public class Date {
	private int day1, day2;
	private int month1, month2;
	private int year1, year2;
	
	/*
	public Date(){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	*/
		
	public void entrada(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca dia 1");
		int day1 = sc.nextInt();
		System.out.println("Introduzca mes 1");
		int month1 = sc.nextInt();
		System.out.println("Introduzca año 1");
		int year1 = sc.nextInt();
		System.out.println("Introduzca dia 2");
		int day2 = sc.nextInt();
		System.out.println("Introduzca mes 2");
		int month2 = sc.nextInt();
		System.out.println("Introduzca año 2");
		int year2 = sc.nextInt();
	}
	
	public boolean isSameYear(){
		if(year1 == year2)
		return true;
		else
			return false;
	}
	
	public boolean isSameMonth(int month){
		if(month1 == month2)
		return true;
		else
			return false;
	}

	public boolean isSameDay(int day){
		if(day1 == day2)
		return true;
		else
			return false;
	}
	
	public String getMonthName(){
		String mes = new String (" ");
		switch(month1){
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
	
	public boolean checkDay(){
		switch(month1){
		case 1:
			if(day1 <= 31)
				return true;
			else 
				return false;
		case 2:
			if(day1 <= 28)
				return true;
			else 
				return false;
		case 3:
			if(day1 <= 31)
				return true;
			else 
				return false;
		case 4:
			if(day1 <= 30)
				return true;
			else 
				return false;
		case 5:
			if(day1 <= 31)
				return true;
			else 
				return false;
		case 6:
			if(day1 <= 30)
				return true;
			else 
				return false;
		case 7:
			if(day1 <= 31)
				return true;
			else 
				return false;
		case 8:
			if(day1 <= 31)
				return true;
			else 
				return false;
		case 9:
			if(day1 <= 30)
				return true;
			else 
				return false;
		case 10:
			if(day1 <= 31)
				return true;
			else 
				return false;
		case 11:
			if(day1 <= 30)
				return true;
			else 
				return false;
		case 12:
			if(day1 <= 31)
				return true;
			else 
				return false;
		}
	return true;
	}
	
	public String getSeasonMonth(){
		String season = new String(" ");
		switch(month1){
			case 1:
			season = "Invierno";
			break;
			case 2:
			season = "Invierno";
			break;
			case 3:
			season = "Primavera";
			break;
			case 4:
			season = "Primavera";
			break;
			case 5:
			season = "Primavera";
			break;
			case 6:
			season = "Verano";
			break;
			case 7:
			season = "Verano";
			break;
			case 8:
			season = "Verano";
			break;
			case 9:
			season = "Otoño";
			break;
			case 10:
			season = "Otoño";
			break;
			case 11:
			season = "Otoño";
			break;
			case 12:
			season = "Invierno";
			break;	
		}
		return season;		
	}
	
	public void imprimirDate(){
		System.out.println(day1+"-"+month1+"-"+year1);
	}
	
	public  void mesesRestantes(){
		int aux = month1;
		int contador=0;
		for(int i=aux;i<12;i++){
			contador++;
		}
		System.out.println("Quedan "+contador+" meses para final de año");
	}

	public void diasRestantesMes(){
		int aux = day1;
		int diaFinal;
		if(month1==1|| month1==3||month1==5|| month1==7||month1==8|| month1==10||month1==12){
			diaFinal=31;
		}
		if(month1==2){
			diaFinal=28;
		}
		else{
			diaFinal=30;
		}
		
		for(int i=aux;i<diaFinal;i++){
			System.out.println(aux+"-"+month1+"-"+year1);
		}

	}
}
