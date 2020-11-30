/**
 * 
 * 
 * @author Jose Alonso Mora Artavia
 * 
 * B54665
 * 
 * @version (25-11-2020)
 * 
 */

public class Nodo
{
    // instance variables - replace the example below with your own
    private String valor;
    private Nodo siguiente;

    /**
     * Constructor for objects of class Nodo
     */
    public void Nodo()
    {
        this.valor = "";
        this.siguiente = null;
    }
    
    public String getValor()
    {
        return valor;
    }
    
    public void setValor(String valor)
    {
        this.valor = valor;
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
