package ar.com.aterrizar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaIso8601 extends Fecha implements IFecha {
	
	String formatoDeStr = "yyyy-MM-dd";
	
	@Override
	public Date validar(String fecha) {

		SimpleDateFormat formatoDelTexto = new SimpleDateFormat(formatoDeStr);
		Date fecha2 = null;
		try {

			fecha2 = formatoDelTexto.parse(fecha);

		} catch (ParseException ex) {

			ex.printStackTrace();

		}

		return fecha2;
	}

	public void setFecha(String fecha) {
		date = validar(fecha);
	}

	@Override
	public String getFechaStr() {
		SimpleDateFormat formatoDeFecha = new SimpleDateFormat(formatoDeStr);
		return (formatoDeFecha.format(date));
	}
}
