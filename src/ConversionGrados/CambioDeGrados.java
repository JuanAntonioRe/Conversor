package ConversionGrados;

import Logica.Atributos;

public class CambioDeGrados extends Atributos{

	double resultado;
	
	public CambioDeGrados() {
		
	}

	public CambioDeGrados(Double valor, int fila, int columna) {
		super(valor, fila, columna);
		
	}
	
	public double conversionGrados() {
		if(fila == columna) {
			resultado = valor;
		} else if(columna == 0 && fila == 1) {
			resultado = valor * 1.8 + 32;
		} else if(columna == 0 && fila == 2) {
			resultado = valor + 273.15;
		} else if(columna == 1 && fila == 0) {
			resultado = (valor -32) * 5/9;
		} else if(columna == 1 && fila == 2) {
			resultado = ((valor -32) * 5/9) + 273.15;
		} else if(columna == 2 && fila == 0) {
			resultado = valor - 273.15;
		} else if(columna == 2 && fila == 1) {
			resultado = (valor - 273.15) * 1.8 + 32;
		}
		
		return resultado;
	}
	
}
