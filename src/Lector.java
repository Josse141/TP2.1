/** 
 * @author Jose Alonso Mora Artavia B54665
 * 
 *  
 * @version 29-11-2020
 * 
 * 
 */

import java.io.*;
import java.net.URL;

public class Lector
{
    private BufferedReader lector;
    private boolean enUso;

    public Lector(String rutaCarpeta, String ruta)
    {
        try
        {
        	//InputStream is= new FileInputStream(ruta);
        	
        	//lector = new BufferedReader( new FileReader(""+is));
        	
        	//URL url = getClass().getResource(ruta);
           
        	lector = new BufferedReader( new FileReader(rutaCarpeta+ '/' +ruta+".txt"));
        	
        	//lector = new BufferedReader(new FileReader(url.getPath()));
        	
            enUso = true;
        }
        catch(IOException e)
        {
            enUso = false;
            System.out.println("Error " + e);
        }
    }
    
    public void cerrar()
    {
        if(enUso)
        {
            try
            {
                lector.close();
            }
            catch(IOException e)
            {
                System.out.println("Error " + e);
            }
        }
        
        enUso = false;
    }
    
    public String leerLinea()
    {
        String contenido = null;
        
        if(enUso)
        {
            try
            {
                contenido = lector.readLine();
            }
            catch(IOException e)
            {
                System.out.println("Error " + e);
            }
        }
        
        return contenido;
    }
    
    public String leerArchivo()
    {
        String contenido = "";
        
	if(enUso){
		String linea = "";
		while((linea = leerLinea()) != null){
			contenido += linea;
			contenido += "\r\n";
		}
	}
	return contenido;
    }
}
