package ar.com.aterrizar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Rodrigo De Luca
 *
 */
public class Fecha {
	
	Date fecha;
	String formatoDeStringDeEntrada;
	SimpleDateFormat formatoDelTexto;
		
	public Date getFecha() {
		return fecha;
	}
	

	public void setFechaISO8601(String strFecha){
		formatoDeStringDeEntrada = "yyyy-MM-dd";
		strToDate(strFecha);
	}
	
	public void setFechaLatinoAmericana(String strFecha){
		formatoDeStringDeEntrada = "dd/MM/yyyy";
		strToDate(strFecha);
	}

	public void setFechaNorteAmericana(String strFecha){
		formatoDeStringDeEntrada = "yyyy-MM-dd";
		strToDate(strFecha);
	}
	/*
	 * 
	 * @param string flexible dd/mm/yyyy, d/mm/yyyy, dd/m/yyyy, d-m-yyyy, etc
	 */
	
	/** @autor Rodrigo De Luca
	 * @param flexible dd/mm/yyyy, 
	 * d/mm/yyyy, dd/m/yyyy, d-m-yyyy, etc
	 */
	public void setFechaFlexible(String strFecha){
		String input = "2-31-2012"; // mm-dd-yyyy/m-d-yyyy/mm/dd/yyyy
		String expression1 = "^([01][012]|[1-9])[-/](0[1-9]|[12][0-9]|3[01]|[1-9])[-/](18|19|20|21)\\d{2}$";
		Pattern p = Pattern.compile(expression1);
		Matcher m = p.matcher(input);
		if (m.find())
			System.out.println("matched i1");
		else
			System.out.println("Error matching");		  
	}
	
	private void strToDate(String strFecha){
		formatoDelTexto = new SimpleDateFormat(formatoDeStringDeEntrada);
		try {
			fecha = formatoDelTexto.parse(strFecha);
		} catch (ParseException e) {
			fecha = null;
			
		}
			
			
		
	}
	
	public long diasEntre(Fecha otraFecha) {
		
		long diferenciaDeDias = this.getFecha().getTime() - otraFecha.getFecha().getTime();
		
		return Math.abs(diferenciaDeDias/(3600*24*1000));
	}
	
	public boolean esMenorQue(Date otraFecha){
		return (fecha.compareTo(otraFecha)<0);
	}

	public String fechaToString() {
		return fecha.toString();
		
	}
	
	
	

}
	




