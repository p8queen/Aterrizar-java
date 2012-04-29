package ar.com.aterrizar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Fecha {
	
	Date fecha;
	String formatoDeStr;
	SimpleDateFormat formatoDelTexto;
		
	public Date getFecha() {
		return fecha;
	}
	

	public void setFechaISO8601(String strFecha){
		formatoDeStr = "yyyy-MM-dd";
		strToDate(strFecha);
	}
	
	public void setFechaLatinoAmericana(String strFecha){
		formatoDeStr = "dd/MM/yyyy";
		strToDate(strFecha);
	}

	public void setFechaNorteAmericana(String strFecha){
		formatoDeStr = "yyyy-MM-dd";
		strToDate(strFecha);
	}
	
	
	private void strToDate(String strFecha){
		formatoDelTexto = new SimpleDateFormat(formatoDeStr);
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
	
	
	public void setFechaFlexible(String strFecha){
		
	}

}
	




