//Jose Alonso Mora

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Al implements ActionListener{

	public Interfaz interfaz;
	//private Calculadora calculadora = new Calculadora();
	public Controlador controlador;
	
	
	//private double digito1;
	//private double digito2;
	
	String resultado;
	
	
	String operador;
	
	private String temporalDigito1="";
	
	private String temporalDigito2="";

	public Al(Interfaz i, Controlador c) {
		controlador= c ;
		interfaz = i;
	}

	public void actionPerformed(ActionEvent arg0) {

		String h = arg0.getActionCommand();
		//String j="";
		
		//if(h.contains("X")==true) {
			
			//j = h.substring(0,h.length()-1);
		//}
		
		switch(h) {

		case "Leer":
			
			controlador.setArchivoLeido(controlador.leerArchivo(interfaz.solicitarRuta(),interfaz.solicitarArchivo()));
			
			interfaz.mostrarArchivoLeido(controlador.getArchivoLeido());
			
			break;
			//-----------------------------	
			
		
		case "+":
			
			operador = "+";
			
			
			
			//String digito1 = interfaz.getTextoIngreso1();
			
			//digito1 = digito1.substring(0, digito1.length()-1);
			
			//double d1 = Double.parseDouble(digito1);
			
			if(interfaz.getTextoIngreso1().contains("X")) {
				
				String temporal = interfaz.getTextoIngreso1().replace('X', ' ');
				
				temporal = (temporal.substring(0, temporal.length()-1));
					
				temporalDigito1 = temporal;
				
				this.controlador.guardarDig1(temporalDigito1);
								
				this.interfaz.clearText();
				
				temporalDigito1="";
				
				
			}else {
				
				temporalDigito1 = interfaz.getTextoIngreso1();
				
				this.controlador.guardarDig1(temporalDigito1);
								
				this.interfaz.clearText();
				
				temporalDigito1 = "";
					
			}
			//String digito2 = interfaz.getTextoIngreso2();
			
			//controlador.guardarDig2(interfaz.getTextoIngreso2());
									
			break;
			//-----------------------------	

		case "-":

			operador = "-";

			if(interfaz.getTextoIngreso1().contains("X")) {
				
				String temporal = interfaz.getTextoIngreso1().replace('X', ' ');
				
				temporal = (temporal.substring(0, temporal.length()-1));
					
				temporalDigito1 = temporal;
				
				this.controlador.guardarDig1(temporalDigito1);
										
				this.interfaz.clearText();
				
				temporalDigito1="";
				
				
			}else {
				
				temporalDigito1 = interfaz.getTextoIngreso1();
				
				this.controlador.guardarDig1(temporalDigito1);
								
				this.interfaz.clearText();
				
				temporalDigito1 = "";
					
			}
			
			//controlador.guardarDig2(interfaz.getTextoIngreso2());

			break;
			//-----------------------------	

		case "*":
			
			operador = "*";
			
				if(interfaz.getTextoIngreso1().contains("X")) {
				
				String temporal = interfaz.getTextoIngreso1().replace('X', ' ');
				
				temporal = (temporal.substring(0, temporal.length()-1));
					
				temporalDigito1 = temporal;
				
				this.controlador.guardarDig1(temporalDigito1);
										
				this.interfaz.clearText();
				
				temporalDigito1="";
				
				
			}else {
				
				temporalDigito1 = interfaz.getTextoIngreso1();
				
				this.controlador.guardarDig1(temporalDigito1);
								
				this.interfaz.clearText();
				
				temporalDigito1 = "";
						
				
					
			}
			
			//controlador.guardarDig2(interfaz.getTextoIngreso2());

			break;
			//-----------------------------				
		case "÷":
			
			operador = "÷";
			
				if(interfaz.getTextoIngreso1().contains("X")) {
				
				String temporal = interfaz.getTextoIngreso1().replace('X', ' ');
				
				temporal = (temporal.substring(0, temporal.length()-1));
					
				temporalDigito1 = temporal;
				
				this.controlador.guardarDig1(temporalDigito1);
										
				this.interfaz.clearText();
				
				temporalDigito1="";
				
				
			}else {
				
				temporalDigito1 = interfaz.getTextoIngreso1();
				
				this.controlador.guardarDig1(temporalDigito1);
								
				this.interfaz.clearText();
				
				temporalDigito1 = "";
						
				
					
			}

			//controlador.guardarDig2(interfaz.getTextoIngreso2());

			break;
			//-----------------------------			

		case "^":
			
			operador = "^";
			
			if(interfaz.getTextoIngreso1().contains("X")) {
				
				String temporal = interfaz.getTextoIngreso1().replace('X', ' ');
				
				temporal = (temporal.substring(0, temporal.length()-1));
						
				this.controlador.guardarDig1(temporal);
				
				
				this.interfaz.clearText();
				
				
			}else {
				
				this.controlador.guardarDig1(interfaz.getTextoIngreso1());
				
				this.interfaz.clearText();
					
			}
			
			controlador.potenciar();
			
			break;
			//-----------------------------	

		case "√":
			
			operador = "√";
			
			this.controlador.guardarDig1(interfaz.getTextoIngreso1());

			this.interfaz.clearText();
			
			controlador.raiz();

			break;
			//-----------------------------	
			
			
		case "Leer Archivo":
			
			operador = "Leer";
			
			this.controlador.leerArchivo(interfaz.solicitarRuta(),interfaz.solicitarArchivo());

			//TODO Agregar funciones luego de leer archivo
			
			this.interfaz.clearText();
			
			controlador.raiz();

			break;
			//-----------------------------	

		case "=":
			
			try {
				
			temporalDigito2 = interfaz.getTextoIngreso1();
				
			controlador.guardarDig2(temporalDigito2);			
			
			
			//switch para elegir operacion a realizar
			
			switch (operador) {
			
			case "+":
				
				controlador.sumar();
			
			break;
			
			case "-":
				
				controlador.restar();

				break;
				//-----------------------------	

			case "*":
				
				controlador.multiplicar();

				break;
				//-----------------------------				
			case "÷":
				
				controlador.dividir();

				break;
				//-----------------------------			
/*
			case "xÂ²":

				controlador.potenciar();

				break;
				//-----------------------------	

			//case "âˆš":

				//controlador.raiz();

				break;
				//-----------------------------	
*/
			
			default:
				
			//digito2 = digito2.substring(0, digito2.length()-1);

			//double d2 = Double.parseDouble(digito2);
			
			
			
			//controlador.guardarDig2(Double.parseDouble(digito2));

			//controlador.guardarDig2(interfaz.getTextoIngreso2());


			
			//resultado = "" + calculadora.Suma(digito1, digito2);

			//interfaz.agregarDigito(resultado);

			break;
			//-----------------------------	
			}
			}
			catch(Exception e) {
				
				
			}
			break;
		
			

		case "M":
			
			if(controlador.getResultado().equals("")) {
				
				controlador.guardarMemoria(interfaz.getTextoIngreso1());
			}else {
				
				controlador.guardarMemoria(resultado);
							}

			break;
			//-----------------------------	

		case "MC":
			
			controlador.limpiarMemoria();

			break;
			//-----------------------------	

		case "MR":
			
			interfaz.setText(controlador.pedirMemoria());

			break;
			//-----------------------------	
			
		case "C":

			interfaz.clearText();
			controlador.guardarDig1("0");
			controlador.guardarDig2("0");
			controlador.limpiarC();
			
			break;
			//-----------------------------	

		case "CE":

			interfaz.clearText();
			
			break;
			//-----------------------------	
			
		case "Historial":

			interfaz.mostrarHistorial();

			break;

			//----------------------------
			
			
		case "Convertir":
			
			try {
			this.controlador.guardarDig1(interfaz.getTextoIngreso1());

			this.interfaz.clearText();

			interfaz.mostrarConversion();
			}
			
			catch(Exception e) {
				
				
			}
			
			break;

			//----------------------------

		default:
			
			interfaz.agregarDigito(h);
			
			

			break;

		}

	}


}
