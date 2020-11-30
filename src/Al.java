/** 
 * @author Jose Alonso Mora Artavia B54665
 * 
 *  
 * @version 29-11-2020
 * 
 * Clase encargada de escuchar los eventos de la interfaz mostrada al usuario y pasar esos eventos al controlador
 * 
 */

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
	
	private boolean modoEcuacion = false;

	public Al(Interfaz i, Controlador c) {
		controlador= c ;
		interfaz = i;
	}

	/**
	 * Lector de Eventos
	 * 
	 */
	public void actionPerformed(ActionEvent arg0) {

		String h = arg0.getActionCommand();
		
		try {
		
		if(h=="Ecuacion") {
			
			modoEcuacion=true;
			
			
		}	
			
		
		
		
		if(modoEcuacion==true)	{
			
			
			String ecuacionesSumas[]=interfaz.getTextoIngreso1().split("+");
			
			//String ecuacionesRestas[];
			
			//String ecuacionesMultiplicaciones[];
			
			//String ecuacionesDivisiones[];
			
			for(int contador =0; contador<ecuacionesSumas.length; contador++) {
				
				ecuacionesSumas[contador] = ecuacionesSumas[contador]+"+";
				
				if(ecuacionesSumas[contador].contains("-")) {
					
					
					
				}
			}
			
			
			String ecuaciones[]=interfaz.getTextoIngreso1().split(",");
			
			String ecuacionesString = "";
			
			for(int contador = 0; contador<ecuaciones.length; contador++) {
				
				
				controlador.agregarALista(ecuaciones[contador].substring(0,ecuaciones[contador].length()-1), ecuaciones[contador].substring(ecuaciones[contador].length()-1));
				
			}
					
			
			this.interfaz.clearText();
			
			for(int contador = 0; contador<ecuaciones.length; contador++) {
				
				String numero=ecuaciones[contador].split("elev")[0];
				
				numero = numero.replace("X", "");
				
				String elevacion=ecuaciones[contador].split("elev")[1];
				
				controlador.guardarDig1(numero);
				
				if(elevacion.substring(0, elevacion.length()-1).isEmpty()==true) {
					
					controlador.guardarDig2(elevacion);
					
				}else {
					
				controlador.guardarDig2(elevacion.substring(0, elevacion.length()-1));
				
				}
				ecuacionesString = ecuacionesString +" "+controlador.potenciarEcuacion()+" "+elevacion.substring(elevacion.length()-1);
				
				
				
			}
			
			System.out.println(ecuacionesString);
			
			controlador.setArchivoLeido(ecuacionesString);
			
			//agregar a lista
			
			//cuando se presiona "=" se hace llamado a metodo para obtener todos los nodos y calcular a partir de lo obtenido.
			
			modoEcuacion=false;
			
		
		
		
			
		}else {
			
			
		
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
				
				temporalDigito1 = interfaz.getTextoIngreso1();
				
				this.controlador.guardarDig1(temporalDigito1);
								
				this.interfaz.clearText();
				
				temporalDigito1 = "";
					
			}
			
			
			
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
			
			
			
			break;
			//-----------------------------	
			
		case "info":
			
			interfaz.mostrarMensaje("Para agregar una ecuacion, por favor ingresela de forma alfanumerica con el teclado \nIngrese el numero seguido por la incognita X, \nLuego la palabra ( elev ) para simbolar la potencia, \nLuego el numero de potencia y el simbolo de operacion (+, -, *, /) \nque quiera usar seguido de una coma ( , )\nEl resto de la calculadora funciona normalmente.");
			
			break;
			
			//------------------------------

		case "=":
			
			try {
				
			temporalDigito2 = interfaz.getTextoIngreso1();
				
			controlador.guardarDig2(temporalDigito2);			
			
			
			//switch para elegir operacion a realizar
			
			switch (operador) {
			
			case "Leer":
				
				controlador.ejecutarEcuacion();
				
				break;
			
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
				
				
			case"^":
				
				controlador.potenciar();
				
				break;
				
				//------------------------------
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
		}catch(Exception e) {
			
			modoEcuacion=false;
						
			
	}
		
	


}
}
