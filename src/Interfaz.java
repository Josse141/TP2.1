/** 
 * @author Jose Alonso Mora Artavia B54665
 * 
 *  
 * @version 29-11-2020
 * 
 * 
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea; 


public class Interfaz extends JFrame {

	JButton botonSuma;
	JButton botonResta;
	JButton botonMultiplicacion;
	JButton botonDivision;
	JButton botonPotencia;
	JButton botonRaiz;
	JButton botonM;
	JButton botonMC;
	JButton botonMR;
	JButton botonC;
	JButton botonCE;
	JButton botonHistorial;
	JButton botonConvertir;
	JButton botonIncognita;
	JButton botonLeer;
	JButton botonEcuacion;
	JButton botonInfo;


	private JButton numerales[][];

	private JTextField textoIngreso;
	private JTextArea textoHistorial_Convertir;

	Controlador controlador;

	/*private*/ double digito1;

	/*private*/ double digito2;
	
	JOptionPane mensajes = new JOptionPane();


	public Interfaz(Controlador control) {
		
		this.setTitle("Calculadora y Ecuaciones Jose Alonso Mora Artavia");
		controlador = control;
		Al al = new Al(this, control);


		setBounds(100, 100, 355, 600);
		setLayout(null);

		numerales = new JButton[4][3];


		int numeralesCalc = 9;

		for (int i = 0; i < numerales.length; i++) {

			for (int j = numerales[0].length-1; j >= 0; j--) {
				numerales[i][j] = new JButton(numeralesCalc+"");
				numerales[i][j].setBounds(j*60+10, i*60+90, 60, 60);
				numerales[i][j].setActionCommand(numeralesCalc--+"");
				numerales[i][j].addActionListener(al);
				numerales[i][j].setBackground(new Color(197,255,211));
				add(numerales[i][j]);

			}

		}

		numerales[3][0].setText("0");
		numerales[3][0].setActionCommand("0");
		//numerales[3][0].addActionListener(al);

		numerales[3][1].setText(".");
		numerales[3][1].setActionCommand(".");

		numerales[3][2].setText("=");
		numerales[3][2].setActionCommand("=");



		textoIngreso = new JTextField();
		textoIngreso.setBounds(10, 10, 320, 30);

		textoHistorial_Convertir = new JTextArea();
		textoHistorial_Convertir.setBounds(10, 420, 320, 120);


		botonSuma = new JButton("+");
		botonSuma.setActionCommand("+");
		botonSuma.addActionListener(al);
		botonSuma.setBounds(200, 90, 60, 30);
		botonSuma.setBackground(new Color(195,181,235));


		botonResta = new JButton("-");
		botonResta.setActionCommand("-");
		botonResta.addActionListener(al);
		botonResta.setBounds(200, 150, 60, 30);
		botonResta.setBackground(new Color(195,181,235));


		botonMultiplicacion = new JButton("*");
		botonMultiplicacion.setActionCommand("*");
		botonMultiplicacion.addActionListener(al);
		botonMultiplicacion.setBounds(200, 210, 60, 30);
		botonMultiplicacion.setBackground(new Color(195,181,235));


		botonDivision = new JButton("÷");
		botonDivision.setActionCommand("÷");
		botonDivision.addActionListener(al);
		botonDivision.setBounds(200, 270, 60, 30);
		botonDivision.setBackground(new Color(195,181,235));


		botonPotencia = new JButton("^");
		botonPotencia.setActionCommand("^");
		botonPotencia.addActionListener(al);
		botonPotencia.setBounds(270, 90, 60, 30);
		botonPotencia.setBackground(new Color(195,181,235));


		botonRaiz = new JButton("√");
		botonRaiz.setActionCommand("√");
		botonRaiz.addActionListener(al);
		botonRaiz.setBounds(270, 150, 60, 30);
		botonRaiz.setBackground(new Color(195,181,235));


		botonM = new JButton("M");
		botonM.setActionCommand("M");
		botonM.addActionListener(al);
		botonM.setBounds(10, 50, 60, 30);
		botonM.setBackground(new Color(195,181,235));


		botonMC = new JButton("MC");
		botonMC.setActionCommand("MC");
		botonMC.addActionListener(al);
		botonMC.setBounds(70, 50, 60, 30);
		botonMC.setBackground(new Color(195,181,235));


		botonMR = new JButton("MR");
		botonMR.setActionCommand("MR");
		botonMR.addActionListener(al);
		botonMR.setBounds(130, 50, 60, 30);
		botonMR.setBackground(new Color(195,181,235));
		
		
		botonCE = new JButton("CE");
		botonCE.setActionCommand("CE");
		botonCE.addActionListener(al);
		botonCE.setBounds(200, 50, 60, 30);
		botonCE.setBackground(new Color(195,181,235));
		
		botonC = new JButton("C");
		botonC.setActionCommand("C");
		botonC.addActionListener(al);
		botonC.setBounds(270, 50, 60, 30);
		botonC.setBackground(new Color(195,181,235));
		
		botonHistorial = new JButton("Historial");
		botonHistorial.setActionCommand("Historial");
		botonHistorial.addActionListener(al);
		botonHistorial.setBounds(200, 380, 130, 30);
		botonHistorial.setBackground(new Color(189, 210,240));
		
		botonConvertir = new JButton("Convertir");
		botonConvertir.setActionCommand("Convertir");
		botonConvertir.addActionListener(al);
		botonConvertir.setBounds(10, 380, 180, 30);
		botonConvertir.setBackground(new Color(189, 210,240));
		
		botonIncognita = new JButton("X");
		botonIncognita.setActionCommand("X");
		botonIncognita.addActionListener(al);
		botonIncognita.setBounds(270, 210, 60, 30);
		botonIncognita.setBackground(new Color(195,181,235));
		
		
		botonInfo = new JButton("Info");
		botonInfo.setActionCommand("info");
		botonInfo.addActionListener(al);
		botonInfo.setBounds(270, 270, 60, 30);
		botonInfo.setBackground(new Color(255, 210,216));
		
		
		botonLeer = new JButton("Leer");
		botonLeer.setActionCommand("Leer");
		botonLeer.addActionListener(al);
		botonLeer.setBounds(200, 340, 130, 30);
		botonLeer.setBackground(new Color(255, 210,216));
		
		botonEcuacion = new JButton("Ecuacion");
		botonEcuacion.setActionCommand("Ecuacion");
		botonEcuacion.addActionListener(al);
		botonEcuacion.setBounds(10, 340, 180, 30);
		botonEcuacion.setBackground(new Color(255, 210,216));
		



		//Agregar Elementos

		add(textoIngreso);

		add(textoHistorial_Convertir);

		add(botonSuma);

		add(botonResta);

		add(botonMultiplicacion);

		add(botonDivision);

		add(botonPotencia);

		add(botonRaiz);

		add(botonM);

		add(botonMC);

		add(botonMR);
		
		add(botonCE);
		
		add(botonC);
		
		add(botonHistorial);
		
		add(botonConvertir);
		
		add(botonIncognita);
		
		add(botonLeer);
		
		add(botonEcuacion);
		
		add(botonInfo);


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	public void mostrar() {
		setVisible(true);
		textoHistorial_Convertir.setVisible(false);
	}

	public void mostrarHistorial() {

		textoHistorial_Convertir.setVisible(true);
		textoHistorial_Convertir.setText(controlador.historial());
	}

	public void mostrarConversion() {

		textoHistorial_Convertir.setVisible(true);
		textoHistorial_Convertir.setText(controlador.conversion());
	}

	public void agregarDigito(String digitoSeleccionado) {

		/*
		try {
			double seleccionado = Double.parseDouble(digitoSeleccionado);

			//if(Double.parseDouble(digitoSeleccionado)) {


			//}


		}catch(Exception e){

		}
		 */

		if(digitoSeleccionado=="x") {
			
			textoIngreso.setText(textoIngreso.getText());
			
		}else {
		
		textoIngreso.setText(textoIngreso.getText()+digitoSeleccionado);
		}
	}

	public String getTextoIngreso1() {

		//String textoSinSigno = textoIngreso.getText();

		//textoSinSigno = textoSinSigno.substring(0, textoSinSigno.length()-1); 

		//digito1=Double.parseDouble(textoSinSigno);

		return textoIngreso.getText();
	}

	public String getTextoIngreso2() {

		//String textoSinSigno = textoIngreso.getText();

		//textoSinSigno = textoSinSigno.substring(0, textoSinSigno.length()-1); 

		//digito2=Double.parseDouble(textoSinSigno);

		return textoIngreso.getText();
	}

	public void clearText() {

		textoIngreso.setText("");
	}


	public void mostrarResultado(double resultado) {

		textoIngreso.setText(""+resultado+"X");

	}
	
	
	public void mostrarArchivoLeido(String resultado) {

		textoIngreso.setText(resultado);

	}
	
	public void setText(String text) {
		
		textoIngreso.setText(text);
	}


	@SuppressWarnings("static-access")
	
	public String solicitarArchivo() {
		
		return mensajes.showInputDialog("Ingrese el nombre del archivo");
	}
	
	
	@SuppressWarnings("static-access")
	public String solicitarRuta() {
		
		return mensajes.showInputDialog("Ingrese la ruta de la carpeta que contiene el archivo");
	}
	
	
	
	public void mostrarMensaje(String mensaje) {
		
		
		mensajes.showMessageDialog(null, mensaje, "Informacion", 1);
		
	}
	
	
	

}
