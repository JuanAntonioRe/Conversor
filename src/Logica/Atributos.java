package Logica;

public class Atributos {

	protected Double valor;
	protected int fila, columna;
	
	
	public Atributos() {
		
	}

	public Atributos(Double valor, int fila, int columna) {
		super();
		this.valor = valor;
		this.fila = fila;
		this.columna = columna;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
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
