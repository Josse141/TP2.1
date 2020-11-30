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

public class Lista
{
    // instance variables - replace the example below with your own
    private Nodo inicio;
    private int tamano;
    
    private String contenidoLista="";

    public void Lista()
    {
        inicio = null;
        tamano = 0;
    }

    public boolean esVacia()
    {
        return inicio == null;
    }
    
    public int getTamano()
    {
        return tamano;
    }
    
    public void agregarAlFinal(String valor)
    {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setValor(valor);
        
        if(esVacia())
        {
            inicio = nuevoNodo;
        }
        else
        {
            Nodo auxiliar = inicio;
            
            while(auxiliar.getSiguiente() != null)
            {
                auxiliar = auxiliar.getSiguiente();
            }
            
            auxiliar.setSiguiente(nuevoNodo);
        }
        
        tamano++;
    }
    
         
    public String retornarLista()
    {
        if(!esVacia())
        {
            Nodo auxiliar = inicio;
            int posicion = 0;
            
            while(auxiliar.getSiguiente() != null)
            {
                
            	contenidoLista = contenidoLista +"H" + auxiliar.getValor();
            	auxiliar = auxiliar.getSiguiente();
            	      
                posicion++;
            }
            
            contenidoLista = contenidoLista +"H" + auxiliar.getValor();
        }
        
        return contenidoLista;
    }
    
    
    /**
     * 
     * No es necesario para la implementacion actual
     * 
     * @param valorReferencia
     * @return
     */
    
    /*
    public boolean existeElemento(int valorReferencia)
    {
        Nodo auxiliar = inicio;
        boolean encontrado = false;
        
        while(auxiliar != null && !encontrado)
        {
            encontrado = (auxiliar.getValor() == valorReferencia);
            auxiliar = auxiliar.getSiguiente();
        }
        
        return encontrado;
    }
    
    */
    
    /**
     * 
     * No es necesario para la implementacion actual
     * 
     * @param valor
     * @param valorReferencia
     */
    
    /*
    public void insertarDespuesDeValor(int valor, int valorReferencia)
    {
        if(!esVacia())
        {
            if(existeElemento(valorReferencia))
            {
                Nodo nuevoNodo = new Nodo();
                nuevoNodo.setValor(valor);
                
                Nodo auxiliar = inicio;
                
                while(valorReferencia != auxiliar.getValor())
                {
                    auxiliar = auxiliar.getSiguiente();
                }
   
                nuevoNodo.setSiguiente(auxiliar.getSiguiente());
                auxiliar.setSiguiente(nuevoNodo);
                
                tamano++;
            }
        }
    }
    
    */
    
    /**
     * 
     * No es necesario para la implementacion actual
     * 
     * @param valor
     * @param posicion
     */
    /*
    public void insertarEnPosicion(int valor, int posicion)
    {
        if(posicion >= 0 && posicion <= tamano)
        {
            if(posicion == 0)
            {
                agregarAlInicio(valor);
            }
            else if(posicion == tamano)
            {
                agregarAlFinal(valor);
            }
            else
            {
                Nodo nuevoNodo = new Nodo();
                nuevoNodo.setValor(valor);
                
                Nodo auxiliar = inicio;
                
                for(int indice = 0; indice < (posicion - 1); indice++)
                {
                    auxiliar = auxiliar.getSiguiente();
                }
                
                nuevoNodo.setSiguiente(auxiliar.getSiguiente());
                auxiliar.setSiguiente(nuevoNodo);
                tamano++;
            }
        }
    }
    */
    
    
    /**
     * 
     * No es necesario para la implementacion actual
     * 
     * @param valorReferencia
     */
    
    /*
    
     
    
    public int obtenerPosicion(int valorReferencia)
    {
        int posicion = -1;
        
        if(existeElemento(valorReferencia))
        {
            
            Nodo auxiliar = inicio;
            posicion = 0;
            
            while(valorReferencia != auxiliar.getValor())
            {
                auxiliar = auxiliar.getSiguiente();
                posicion++;
            }
        }
        
        return posicion;
    }
    */
    
    /**
     * 
     * No es necesario para la implementacion actual
     * 
     * @param valorReferencia
     */
    
    /*
    public void eliminarElementoPorValor(int valorReferencia)
    {
        if(existeElemento(valorReferencia))
        {
            Nodo auxiliar = inicio;
            
            if(auxiliar.getValor() == valorReferencia)
            {
                inicio = inicio.getSiguiente();
                auxiliar.setSiguiente(null);
            }
            else
            {
                while(auxiliar.getSiguiente().getValor() != valorReferencia)
                {
                    auxiliar = auxiliar.getSiguiente();
                }
                
                Nodo nodoSiguiente = auxiliar.getSiguiente().getSiguiente();
                auxiliar.getSiguiente().setSiguiente(null);
                auxiliar.setSiguiente(nodoSiguiente);
            }
            
            tamano--;
        }
    }
    */
    
    /**
     * 
     * Se utiliza para limpiar la lista y dejarla en blanco
     * 
     * @param posicion
     */
    
    public void eliminarElementoPorPosicion(int posicion)
    {
         if(posicion >= 0 && posicion <= tamano)
        {
            Nodo auxiliar = inicio;
            
            if(posicion == 0)
            {
                inicio = inicio.getSiguiente();
                auxiliar.setSiguiente(null);
            }
            else
            {
                for(int indice = 0; indice < (posicion - 1); indice++)
                {
                    auxiliar = auxiliar.getSiguiente();
                }
                
                Nodo nodoSiguiente = auxiliar.getSiguiente().getSiguiente();
                auxiliar.getSiguiente().setSiguiente(null);
                auxiliar.setSiguiente(nodoSiguiente);
            }
            
            tamano--;
        }
    }
}
