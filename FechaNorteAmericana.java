package ar.com.aterrizar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaNorteAmericana extends Fecha implements IFecha {

	String formatoDeStr = "yyyy-MM-dd";
	
	@Override
	public Date validar(String fecha) {
		
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat(formatoDeStr);
		Date fechaConFormato = null;
		try {

			fechaConFormato = formatoDelTexto.parse(fecha);

		} catch (ParseException ex) {

			ex.printStackTrace();

		}

		return fechaConFormato;

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
