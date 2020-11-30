//Jose Alonso Mora


public class Calculadora {

		
	String savedInMemory;
	
	double digito1;
	
	double digito2;
	
	String historial = "";
	
	String octal;
	
	String hexadecimal;
	
	String binario;
	
	String resultado = "";
	
	String archivoLeido ="";
	
	String ecuacion="";
	
	String resultadoEcuacion="";
	
	public Calculadora(){
		
		
	}
	
	
	public double suma() {

		historial = historial +digito1+ " + " + digito2+ " = " + (digito1+digito2) + "\n";
		
		resultado = "" + (digito1+digito2);
		
		return digito1+digito2;
	}


	public double resta() {

		historial = historial +digito1+ " - " + digito2+ " = " + (digito1-digito2) + "\n";
		
		resultado = "" + (digito1-digito2);
		
		return digito1-digito2;
	}

	public double multiplicacion() {

		historial = historial +digito1+ " x " + digito2+ " = " + (digito1*digito2) + "\n";
		
		resultado = "" + (digito1*digito2);
		
		return digito1*digito2;
	}

	public double division() {

		historial = historial +digito1+ " / " + digito2+ " = " + (digito1/digito2) + "\n";
		
		resultado = "" + (digito1/digito2);
		
		return digito1/digito2;
	}

	public double potencia() {

		historial = historial +digito1+"^ = " + (Math.pow(digito1, digito2)) + "\n";
		
		//cambiar el valor de la potencia
		
		//TODO cambiar valor de la potencia
		
		resultado = "" + (Math.pow(digito1, digito2));
		
		return Math.pow(digito1, digito2);
	}

	public double raizCuadrada() {

		historial = historial + "√"+digito1+" = " + (Math.sqrt(digito1)) + "\n";
		
		resultado = "" + (Math.sqrt(digito1));
		
		return Math.sqrt(digito1);
				
	}

	public void  memorySave(String memory) {
		
		historial = historial + "Memory Saved" + "\n";
		
		savedInMemory=memory;

	}

	public void  memoryClear() {

		historial = historial + "Memory Cleared" + "\n";
		
		this.savedInMemory = "";
		
	}

	public String  memoryRecall() {
		
		historial = historial + "Memory Recalled" + "\n";
		
		return savedInMemory;
		
	}
	
	
	


	public void guardarDigito1(String digito) {
		
		System.out.println(digito);
		
		this.digito1 = Double.parseDouble(digito);
		
		System.out.println(digito1);
		
	}


	public void guardarDigito2(String digito) {
		
		this.digito2 = Double.parseDouble(digito);
		
	}
	
	
	public void agregarHistorial(String historial) {
		
		this.historial = historial;
	}
	
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
