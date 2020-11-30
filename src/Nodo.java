/** 
 * @author Jose Alonso Mora Artavia B54665
 * 
 *  
 * @version 29-11-2020
 * 
 * 
 */

public class Nodo
{
    // instance variables - replace the example below with your own
    private String valor;
    private String operador;
    private Nodo siguiente;

    /**
     * Constructor for objects of class Nodo
     */
    public void Nodo()
    {
        this.valor = "";
        this.operador ="";
        this.siguiente = null;
    }
    
    public String getValor()
    {
        return valor;
    }
    
    public void setValor(String valor, String operador)
    {
        this.valor = valor.replace("X", "");
        this.operador = operador.replace(" ", "");
        
        System.out.println(valor);
        System.out.println(operador);
    }

    public Nodo getSiguiente()
    {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }
}
