//Jose Alonso Mora


public class Controlador {

	Interfaz interfaz; 
	
	Calculadora calculadora;
	
	public Controlador() {
		
		interfaz = new Interfaz(this);
		
		calculadora = new Calculadora();
		
		interfaz.mostrar();
	}
	


	public void guardarDig1(String numeroIngreso1) {
		
		System.out.println(numeroIngreso1);
		
		this.calculadora.guardarDigito1(numeroIngreso1);
				
	}

	public void guardarDig2(String numeroIngreso2) {
		
		System.out.println(numeroIngreso2);
		
		this.calculadora.guardarDigito2(numeroIngreso2);
	}



	public void sumar() {
		interfaz.mostrarResultado(calculadora.suma());

	}
	
	public void restar() {
		interfaz.mostrarResultado(calculadora.resta());

	}
	
	public void multiplicar() {
		interfaz.mostrarResultado(calculadora.multiplicacion());

	}
	
	public void dividir() {
		interfaz.mostrarResultado(calculadora.division());

	}
	
	public void potenciar() {
		interfaz.mostrarResultado(calculadora.potencia());

	}
	
	public void raiz() {
		interfaz.mostrarResultado(calculadora.raizCuadrada());
		
		
	}	
		public void guardarMemoria(String memoria) {
			
			calculadora.memorySave(memoria);
		}
		
		public void limpiarMemoria() {
			
			calculadora.memoryClear();
		}
		
		public String pedirMemoria() {
			
			return calculadora.memoryRecall();
		}
		
		public String historial() {
			
			return calculadora.pedirHistorial();
		}
		
		public void limpiarC(){
			
			calculadora.setResultado("");
			
		}



		public String conversion() {
							
			return calculadora.pedirConversion();
		}
		
		public String getResultado() {
			
			return calculadora.getResultado();
		}
		
		

	}

			
