/** 
 * @author Jose Alonso Mora Artavia B54665
 * 
 *  
 * @version 29-11-2020
 * 
 * Clase que se encarga de realizar los calculos solicitados por el usuario y aislar las varientes de forma segura
 * 
 */

public class Calculadora {

		
	private String savedInMemory;
	
	double digito1;
	
	double digito2;
	
	private String historial = "";
	
	private String octal;
	
	private String hexadecimal;
	
	private String binario;
	
	private String resultado = "";
	
	private String archivoLeido ="";
	
	private String ecuacion="";
	
	private String resultadoEcuacion="";
	
	public Calculadora(){
		
		
	}
	
	/**
	 * Se encarga de sumas dos numeros suministrados
	 * 
	 * @return resultado de sumar 2 numeros
	 */
	
	public double suma() {

		historial = historial +digito1+ " + " + digito2+ " = " + (digito1+digito2) + "\n";
		
		resultado = "" + (digito1+digito2);
		
		return digito1+digito2;
	}


	/**
	 * Se encarga de restar dos numeros suministrados
	 * 
	 * @return resultado de restar 2 numeros
	 */
	
	public double resta() {

		historial = historial +digito1+ " - " + digito2+ " = " + (digito1-digito2) + "\n";
		
		resultado = "" + (digito1-digito2);
		
		return digito1-digito2;
	}

	/**
	 * Se encarga de multiplicar dos numeros suministrados
	 * 
	 * @return resultado de multiplicar 2 numeros
	 */
	
	public double multiplicacion() {

		historial = historial +digito1+ " x " + digito2+ " = " + (digito1*digito2) + "\n";
		
		resultado = "" + (digito1*digito2);
		
		return digito1*digito2;
	}

	/**
	 * Se encarga de dividir dos numeros suministrados
	 * 
	 * @return resultado de dividir 2 numeros
	 */
	
	public double division() {

		historial = historial +digito1+ " / " + digito2+ " = " + (digito1/digito2) + "\n";
		
		resultado = "" + (digito1/digito2);
		
		return digito1/digito2;
	}

	/**
	 * Se encarga de elevar un numero suministrado a la potencia suministrada
	 * 
	 * @return resultado de elevar un numero a una potencia 
	 */
	
	public double potencia() {

		historial = historial +digito1+"^ = " + (Math.pow(digito1, digito2)) + "\n";
		
		//cambiar el valor de la potencia
		
		//TODO cambiar valor de la potencia
		
		resultado = "" + (Math.pow(digito1, digito2));
		
		return Math.pow(digito1, digito2);
	}

	/**
	 * Se encarga de calcular la raiz cuadrada de un numero suministrado
	 * 
	 * @return raiz cuadrada de un numero
	 */
	
	public double raizCuadrada() {

		historial = historial + "√"+digito1+" = " + (Math.sqrt(digito1)) + "\n";
		
		resultado = "" + (Math.sqrt(digito1));
		
		return Math.sqrt(digito1);
				
	}

	/**
	 * Se encarga de salvar en una variable
	 * 
	 * 
	 */
	
	public void  memorySave(String memory) {
		
		historial = historial + "Memory Saved" + "\n";
		
		savedInMemory=memory;

	}

	/**
	 * Se encarga de limpiar una variable guardada previamente
	 * 
	 * 
	 */
	
	public void  memoryClear() {

		historial = historial + "Memory Cleared" + "\n";
		
		this.savedInMemory = "";
		
	}
	
	/**
	 * Se encarga de suministrar el valor de una variable previamente guardada
	 * 
	 * @return variable savedInMemory
	 */

	public String  memoryRecall() {
		
		historial = historial + "Memory Recalled" + "\n";
		
		return savedInMemory;
		
	}
	
	
	

	/**
	 * Se encarga de guardar un numero Suministrado para posterior uso
	 * 
	 * 
	 */

	public void guardarDigito1(String digito) {
		
		System.out.println(digito);
		
		this.digito1 = Double.parseDouble(digito);
		
		System.out.println(digito1);
		
	}

	/**
	 * Se encarga de guardar un numero Suministrado para posterior uso
	 * 
	 * 
	 */

	public void guardarDigito2(String digito) {
		
		this.digito2 = Double.parseDouble(digito);
		
	}
	
	/**
	 * Agrega variable suministrada a variable de historial
	 * 
	 * 
	 */
	
	public void agregarHistorial(String historial) {
		
		this.historial = historial;
	}
	
	/**
	 * 
	 * Solicita variable de historial
	 * 
	 * @return historial
	 */
	
	public String pedirHistorial() {
		
		return historial;
	}
	
	
	
	public String pedirConversion() {
		
		this.conversionOctal(digito1);
		
		this.conversionHexadecimal(digito1);
		
		this.conversionBinario(digito1);
		
		String resultadoConversion = "Decimal = " + digito1 + "\n" + "Octal = " + this.getValorOctal() + "\n" + "Hexadecimal = " + this.getValorHexadecimal() + "\n" + "Binario = " + this.getValorBinario() + "\n";
		
		historial = historial + "Conversion Bases" + "\n" + resultadoConversion;
		
		return resultadoConversion;
	}

	//--------------------------------------------------------
	
	public void conversionOctal(double digito) {
		
		octal = Integer.toOctalString((int)digito);
			
	}
	
	public String getValorOctal() {
		
		return octal;
	}


	//----------------------------------------------------------

	public void conversionHexadecimal(double digito) {

		hexadecimal = Integer.toHexString((int)digito);
			
	}


	public String getValorHexadecimal() {

		return hexadecimal;
	}
	
	
	//----------------------------------------------------------
	
	
	public void conversionBinario(double digito) {

		
		binario = Integer.toBinaryString((int)digito);

	}


	public String getValorBinario() {

		return binario;
	}
	
	public String getResultado() {
		
		return resultado;
	}
	
	public void setResultado(String r) {
		
		resultado = r;
	}
	
	public void setArchivoLeido(String lectura) {
		
		archivoLeido = lectura;
		
	}
	
	public String getArchivoLeido() {
		
		return archivoLeido;
	}


	/**
	 * Establece campo de Ecuacion para futuro uso en calculo
	 * 
	 * @param archivoLeido
	 */
	
	public void establecerEcuacion(String archivoLeido) {


		ecuacion = archivoLeido;
		
	}

	/**
	 * Ejecuta la escuacion usando "ecuacion"
	 * 	
	 */

	
	public void ejecutarEcuacion() {
		// TODO Auto-generated method stub
		
	}


	public String getResultadoEcuacion() {
		
		// TODO Auto-generated method stub
		
		
		return resultadoEcuacion;
	}
}
