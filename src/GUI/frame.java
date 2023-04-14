package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

import javax.swing.SwingConstants;
import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;

public class frame extends JFrame{
	
	JPanel contentPane;
	JTextField valorACambiar;
	JFormattedTextField resultado;
	JLabel noEsNumeroLabel;
	
	JComboBox<String> cmbTipoDeCambio;
	String[] tipoDeCambio = {"Moneda", "Temperatura", "Longitud"};
	
	JComboBox<String> cmbDe;
	JComboBox<String> cmbA;
	
	/**
	 * Create the frame.
	 */
	public frame() {
		iniciarVentana();
		FrameEvents frameEvents = new FrameEvents(valorACambiar, resultado, noEsNumeroLabel, cmbTipoDeCambio, cmbDe, cmbA);
		frameEvents.llenarComboBoxes(cmbTipoDeCambio, cmbDe, cmbA);
		frameEvents.eventoNumeroIngresado();
	}

	private void iniciarVentana() {
		
		setTitle("Conversor");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelAzul = new JPanel();
		panelAzul.setBackground(new Color(142, 181, 244));
		panelAzul.setBounds(639, 0, 197, 413);
		contentPane.add(panelAzul);
		panelAzul.setLayout(null);
		
		JLabel aluraLabel = new JLabel("");
		aluraLabel.setBackground(Color.WHITE);
		aluraLabel.setForeground(Color.WHITE);
		aluraLabel.setBounds(35, 23, 125, 84);
		aluraLabel.setIcon(new ImageIcon(frame.class.getResource("/GUI/aluraImage.png")));
		panelAzul.add(aluraLabel);
		
		JLabel challengeLabel = new JLabel("Challenge 2");
		challengeLabel.setForeground(Color.WHITE);
		challengeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		challengeLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
		challengeLabel.setBounds(0, 160, 197, 34);
		panelAzul.add(challengeLabel);
		
		JLabel euroLabel = new JLabel("");
		euroLabel.setHorizontalAlignment(SwingConstants.CENTER);
		euroLabel.setIcon(new ImageIcon(frame.class.getResource("/GUI/EuroImage.png")));
		euroLabel.setBounds(10, 217, 96, 89);
		panelAzul.add(euroLabel);
		
		JLabel dolarLabel = new JLabel("");
		dolarLabel.setIcon(new ImageIcon(frame.class.getResource("/GUI/dolarImage.png")));
		dolarLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dolarLabel.setBounds(91, 314, 96, 89);
		panelAzul.add(dolarLabel);
		
		JLabel conversorLabel = new JLabel("Conversor de unidades");
		conversorLabel.setBackground(new Color(18, 98, 218));
		conversorLabel.setBounds(-2, 0, 650, 56);
		contentPane.add(conversorLabel);
		conversorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		conversorLabel.setOpaque(true);
		conversorLabel.setForeground(Color.WHITE);
		conversorLabel.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 28));
		
		JLabel lblNewLabel = new JLabel("Escoge el tipo de cambio");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		lblNewLabel.setBounds(176, 99, 288, 56);
		contentPane.add(lblNewLabel);
		
		valorACambiar = new JTextField();
		valorACambiar.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		valorACambiar.setBounds(45, 266, 127, 28);
		contentPane.add(valorACambiar);
		valorACambiar.setColumns(10);
		
		resultado = new JFormattedTextField();
		resultado.setHorizontalAlignment(SwingConstants.LEFT);
		resultado.setBackground(Color.WHITE);
		resultado.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		resultado.setBounds(310, 266, 127, 28);
		contentPane.add(resultado);
		resultado.setEditable(false);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(270, 275, 53, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lapizLabel = new JLabel("");
		lapizLabel.setIcon(new ImageIcon(frame.class.getResource("/GUI/reglaImage.png")));
		lapizLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lapizLabel.setBounds(23, 97, 96, 89);
		contentPane.add(lapizLabel);
		
		JLabel termometroLabel = new JLabel("");
		termometroLabel.setIcon(new ImageIcon(frame.class.getResource("/GUI/temperatureImage.png")));
		termometroLabel.setHorizontalAlignment(SwingConstants.CENTER);
		termometroLabel.setBounds(505, 97, 96, 89);
		contentPane.add(termometroLabel);
		
		cmbTipoDeCambio = new JComboBox<String>();
		cmbTipoDeCambio.setModel(new DefaultComboBoxModel<String>(tipoDeCambio));
		cmbTipoDeCambio.setSelectedItem(null);
		cmbTipoDeCambio.setBackground(Color.WHITE);
		cmbTipoDeCambio.setFont(new Font("MV Boli", Font.PLAIN, 20));
		cmbTipoDeCambio.setBounds(217, 165, 210, 21);
		contentPane.add(cmbTipoDeCambio);
		
		cmbDe = new JComboBox<>();
		cmbDe.setBackground(Color.WHITE);
		cmbDe.setFont(new Font("MV Boli", Font.PLAIN, 20));
		cmbDe.setBounds(182, 266, 96, 28);
		contentPane.add(cmbDe);
		
		cmbA = new JComboBox<String>();
		cmbA.setFont(new Font("MV Boli", Font.PLAIN, 20));
		cmbA.setBackground(Color.WHITE);
		cmbA.setBounds(456, 266, 96, 28);
		contentPane.add(cmbA);
		
		noEsNumeroLabel = new JLabel("Debes colocar sólo números");
		noEsNumeroLabel.setForeground(Color.RED);
		noEsNumeroLabel.setHorizontalAlignment(SwingConstants.CENTER);
		noEsNumeroLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		noEsNumeroLabel.setBounds(176, 332, 288, 56);
		contentPane.add(noEsNumeroLabel);
		noEsNumeroLabel.setVisible(false);

		
	}
}
