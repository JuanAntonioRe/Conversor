package ConversionDivisas;

public class TasasConversiones {
	
	private Double matrizTasaConversion [][];
	
	public TasasConversiones() {
		
	}

	public double matrizTasasConversiones(int fila, int columna) {
		
		matrizTasaConversion = new Double [6][6];
		
		matrizTasaConversion[0][0] = 1.0;
		matrizTasaConversion[0][1] = 18.476887;
		matrizTasaConversion[0][2] = 20.085867;
		matrizTasaConversion[0][3] = 22.724593;
		matrizTasaConversion[0][4] = 0.14078746;
		matrizTasaConversion[0][5] = 0.014299455;
		matrizTasaConversion[1][0] = 0.054251347;
		matrizTasaConversion[1][1] = 1.0;
		matrizTasaConversion[1][2] = 1.0876105;
		matrizTasaConversion[1][3] = 1.2276123;
		matrizTasaConversion[1][4] = 0.0076133547;
		matrizTasaConversion[1][5] = 0.0007747775;
		matrizTasaConversion[2][0] = 0.049770701;
		matrizTasaConversion[2][1] = 0.81162852;
		matrizTasaConversion[2][2] = 1.0;
		matrizTasaConversion[2][3] = 1.13038;
		matrizTasaConversion[2][4] = 0.00699842;
		matrizTasaConversion[2][5] = 0.0007120342;
		matrizTasaConversion[3][0] = 0.044036828;
		matrizTasaConversion[3][1] = 0.81226189;
		matrizTasaConversion[3][2] = 0.88466216;
		matrizTasaConversion[3][3] = 1.0;
		matrizTasaConversion[3][4] = 0.0061965;
		matrizTasaConversion[3][5] = 0.000629196;
		matrizTasaConversion[4][0] = 7.1238313;
		matrizTasaConversion[4][1] = 131.40906;
		matrizTasaConversion[4][2] = 142.88937;
		matrizTasaConversion[4][3] = 161.38152;
		matrizTasaConversion[4][4] = 1.0;
		matrizTasaConversion[4][5] = 0.10187143;
		matrizTasaConversion[5][0] = 69.935871;
		matrizTasaConversion[5][1] = 1290.5211;
		matrizTasaConversion[5][2] = 1403.1745;
		matrizTasaConversion[5][3] = 1589.3288;
		matrizTasaConversion[5][4] = 9.8462184;
		matrizTasaConversion[5][5] = 1.0;
		
		return matrizTasaConversion[fila][columna];
	}

}
