package es.unileon.prg;

import java.util.Scanner;

public class Date {
	private String day1, day2;
	private String month1, month2;
	private String year1, year2;
	
		
	public void entrada(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca dia 1");
		this.day1 = sc.next();
		System.out.println("Introduzca mes 1");
		this.month1 = sc.next();
		System.out.println("Introduzca anio 1");
		this.year1 = sc.next();
		System.out.println("Introduzca dia 2");
		this.day2 = sc.next();
		System.out.println("Introduzca mes 2");
		this.month2 = sc.next();
		System.out.println("Introduzca anio 2");
		this.year2 = sc.next();
	}
	
	public void isSameYear(){
		boolean isEqual = year1.equals(year2);
		System.out.println(isEqual);
	}
	
	public void isSameMonth(){
		boolean isEqual = month1.equals(month2);
		System.out.println(isEqual);
	}

	public void isSameDay(){
		boolean isEqual = day1.equals(day2);
		System.out.println(isEqual);
	}
	
	public void getMonthName(){
		int month = Integer.parseInt(month1);
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
		//return mes;
		System.out.println(mes);
	}
	
	public boolean checkDay(){
		int day = Integer.parseInt(day1);
		int month = Integer.parseInt(month1);
		switch(month){
		case 1:
			if(day <= 31)
				return true;
			else 
				return false;
		case 2:
			if(day <= 28)
				return true;
			else 
				return false;
		case 3:
			if(day <= 31)
				return true;
			else 
				return false;
		case 4:
			if(day <= 30)
				return true;
			else 
				return false;
		case 5:
			if(day <= 31)
				return true;
			else 
				return false;
		case 6:
			if(day <= 30)
				return true;
			else 
				return false;
		case 7:
			if(day <= 31)
				return true;
			else 
				return false;
		case 8:
			if(day <= 31)
				return true;
			else 
				return false;
		case 9:
			if(day <= 30)
				return true;
			else 
				return false;
		case 10:
			if(day <= 31)
				return true;
			else 
				return false;
		case 11:
			if(day <= 30)
				return true;
			else 
				return false;
		case 12:
			if(day <= 31)
				return true;
			else 
				return false;
		}
		return true;
	}
	
	public void getSeasonMonth(){
		int month = Integer.parseInt(month1);
		String season = new String(" ");
		switch(month){
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
			season = "Otonio";
			break;
			case 10:
			season = "Otonio";
			break;
			case 11:
			season = "Otonio";
			break;
			case 12:
			season = "Invierno";
			break;	
		}
		//return season;
		System.out.println(season);
	}
	
	public void imprimirDate(){
		System.out.println(day1+"-"+month1+"-"+year1);
	}
	
	public  void mesesRestantes(){
		int month = Integer.parseInt(month1);
		int aux = month;
		int contador=0;
		for(int i=aux;i<12;i++){
			contador++;
		}
		System.out.println("Quedan "+contador+" meses para final de anio");
	}

	public void diasRestantesMes(){
		int day = Integer.parseInt(day1);
		int month = Integer.parseInt(month1);
		int aux = day;
		int diaFinal;
		if(month==1|| month==3||month==5|| month==7||month==8|| month==10||month==12){
			diaFinal=31;
		}
		else if(month==2){
			diaFinal=28;
		}
		else{
			diaFinal=30;
		}
		
		for(int i=aux+1;i<diaFinal+1;i++){
			System.out.println(i+"-"+month1+"-"+year1);
		}

	}

	public void mesesMismosDias(){
		String[] meses31 = {"Enero","Marzo","Mayo","Julio","Agosto","Octubre","Diciembre"};
		String[] meses30 = {"Abril","Junio","Septiembre","Noviembre"};
		String[] mes28 = {"Febrero"};
		int month = Integer.parseInt(month1);
		String[] mesesPrint;
		if(month==1|| month==3||month==5|| month==7||month==8|| month==10||month==12){
			mesesPrint = meses31;
		}
		else if(month==2){
			mesesPrint=mes28;
		}
		else{
			mesesPrint = meses30;
		}
		for(int i=0;i<mesesPrint.length;i++){
			System.out.println(mesesPrint[i]);
		}
	}

	public void cuentaDias(){
		int day = Integer.parseInt(day1);
		int month = Integer.parseInt(month1);
		int diasTranscurridos = 0;
		
		int[]diasMes={31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<month-1;i++){
			diasTranscurridos = diasTranscurridos+diasMes[i];
		}
		diasTranscurridos=diasTranscurridos+day;
		System.out.println(diasTranscurridos);
	}
}
