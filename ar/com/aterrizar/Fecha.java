package ar.com.aterrizar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
	
	Date date;
	String formatoDeStr;
		
	public Date getFecha() {
		return date;
	}
	

	public long diasEntre(Fecha otraFecha) {
		
		long diferenciaDeDias = this.getFecha().getTime() - otraFecha.getFecha().getTime();
		
		return Math.abs(diferenciaDeDias/(3600*24*1000));
	}
	
	public boolean esMenorQue(Date unaFecha, Date otraFecha){
		return false;
	
	}

	public String getFechaStr2() {
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat(formatoDeStr);
		return (formatoDeFecha.format(date));
	}
}
	




