package GUI;

import java.awt.event.*;
import javax.swing.*;
import ConversionDivisas.CambioDeMoneda;
import ConversionGrados.CambioDeGrados;
import ConversionLongitud.CambioDeLongitudes;

public class FrameEvents implements ActionListener{
	
	private JTextField valorACambiar;
	private JTextField resultado;
	private JLabel noEsNumeroLabel;
	
	protected double valor;
	protected int fila;
	protected int columna;
	protected double resultadoConversion;
	
	private JComboBox<String> cmbTipoDeCambio;
	private JComboBox<String> cmbDe;
	private JComboBox<String> cmbA;
	
	private String[] unidadesMoneda = {"MXN","USD","EUR","GBP","JPY","KRW"};
	private String[] unidadesTemperatura = {"°C", "°F","°K"};
	private String[] unidadesLongitud = {"metros", "Yardas", "Millas"};
	
	public FrameEvents(JTextField valorACambiar, JFormattedTextField resultado, JLabel noEsNumeroLabel, JComboBox<String> cmbTipoDeCambio, 
			JComboBox<String> cmbDe, JComboBox<String> cmbA) {
		
		this.valorACambiar = valorACambiar;
		this.resultado = resultado;
		this.noEsNumeroLabel = noEsNumeroLabel;
		this.cmbTipoDeCambio = cmbTipoDeCambio;
		this.cmbDe = cmbDe;
		this.cmbA = cmbA;
	}
	
	public void llenarComboBoxes(JComboBox<String> cmbTipoDeCambio, JComboBox<String> cmbDe, JComboBox<String> cmbA) {
		
		cmbTipoDeCambio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(cmbTipoDeCambio.getSelectedItem().equals("Moneda")) {
					
					cmbDe.removeAllItems();
					cmbA.removeAllItems();
					
					for(String str : unidadesMoneda) {
						cmbDe.addItem(str);
						cmbA.addItem(str);
					}
					
					cmbA.setSelectedItem(null);
					valorACambiar.setText("");
					resultado.setText("");
					
				} else if(cmbTipoDeCambio.getSelectedItem() == "Temperatura") {
					
					cmbDe.removeAllItems();
					cmbA.removeAllItems();
					
					for(String str : unidadesTemperatura) {
						cmbDe.addItem(str);
						cmbA.addItem(str);
					}
					
					cmbA.setSelectedItem(null);
					valorACambiar.setText("");
					resultado.setText("");
					
				} else if(cmbTipoDeCambio.getSelectedItem() == "Longitud") {
					cmbDe.removeAllItems();
					cmbA.removeAllItems();
					
					for(String str : unidadesLongitud) {
						cmbDe.addItem(str);
						cmbA.addItem(str);
					}
					
					cmbA.setSelectedItem(null);
					valorACambiar.setText("");
					resultado.setText("");
					
				}
				
			}
		});
		
		//---------------------------------------------------------
		
		cmbDe.addActionListener(this);
		cmbA.addActionListener(this);
		
	}
	
	public void eventoNumeroIngresado() {
		valorACambiar.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				int key = e.getKeyCode();
				
				boolean esNumero = key >= 48 && key <= 57 || key >= 96 && key <= 105 || key == 46 || key == 110 || key == 8;
				
				if(esNumero) {
					
					noEsNumeroLabel.setVisible(false);
					valor = Double.parseDouble(valorACambiar.getText());
					columna = cmbDe.getSelectedIndex();
					fila = cmbA.getSelectedIndex();
					
					switch(cmbTipoDeCambio.getSelectedIndex()) {
					case 0 :
						
						CambioDeMoneda conversion = new CambioDeMoneda(valor, fila, columna);
						
						resultadoConversion = conversion.multiplicaion();
						resultado.setText(Double.toString(resultadoConversion));
						break;
						
					case 1 :
						CambioDeGrados conversion2 = new CambioDeGrados();
						
						conversion2.setColumna(columna);
						conversion2.setFila(fila);
						conversion2.setValor(valor);
						
						resultadoConversion = conversion2.conversionGrados();
						resultado.setText(String.format("%.2f", resultadoConversion));
						break;
						
					case 2 :
						
						CambioDeLongitudes conversion3 = new CambioDeLongitudes();
						
						conversion3.setColumna(columna);
						conversion3.setFila(fila);
						conversion3.setValor(valor);
						
						resultadoConversion = conversion3.cambioDeLongitud();
						resultado.setText(String.format("%.4f", resultadoConversion));
						break;
					}
					
				} else {
					noEsNumeroLabel.setVisible(true);
					
				}
			}
			
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cmbDe || e.getSource() == cmbA) {
			valorACambiar.setText("");
			resultado.setText("");
		}
		
	}
	
}
