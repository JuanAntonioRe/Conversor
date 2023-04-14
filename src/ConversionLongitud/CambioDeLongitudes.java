package ConversionLongitud;

import java.text.DecimalFormat;

import Logica.Atributos;

public class CambioDeLongitudes extends Atributos{
	
	double resultado;
	
	public CambioDeLongitudes() {
		
	}

	public CambioDeLongitudes(Double valor, int fila, int columna) {
		super(valor, fila, columna);
		// TODO Auto-generated constructor stub
	}

	public double cambioDeLongitud() {
		if(columna == fila) {
			resultado = valor;
		}else if(columna == 0 && fila == 1) {
			resultado = valor * 1.0936;
		} else if(columna == 0 && fila == 2) {
			resultado = valor * (1 / 1609.344);
		} else if(columna == 1 && fila == 0) {
			resultado = valor / 1.0936;
		} else if(columna == 1 && fila == 2) {
			resultado = valor * (1 / 1760);
		} else if(columna == 2 && fila == 0) {
			resultado = valor * 1609.344;
		} else if(columna == 2 && fila == 1) {
			resultado = valor * 1760;
		}
		
		return resultado;
	}
	
}
