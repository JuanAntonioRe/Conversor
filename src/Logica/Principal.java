package Logica;

import GUI.frame;

public class Principal {
	
	public static void main(String[] args) {
		
		presentarVentana();
		
	}

	private static void presentarVentana() {
		frame ventanaConversiones = new frame();
		ventanaConversiones.setVisible(true);
		ventanaConversiones.setLocationRelativeTo(null);
	}
	
}
