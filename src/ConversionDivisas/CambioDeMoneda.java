package ConversionDivisas;

public class CambioDeMoneda {
	
	protected double valor;
	protected int fila;
	protected int columna;

	public CambioDeMoneda() {

	}
	
	public double multiplicaion() {
		TasasConversiones tasas = new TasasConversiones();
		double valor2 = tasas.matrizTasasConversiones(fila, columna);
		return (double)Math.round((valor * valor2) * 100d) / 100;
		//return valor2;
	}
	
	public CambioDeMoneda(double valor, int fila, int columna) {
		this.valor = valor;
		this.fila = fila;
		this.columna = columna;
	}
	
	public static boolean esNumero(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}
	
}
