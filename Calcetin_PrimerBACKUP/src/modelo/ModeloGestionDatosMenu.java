package modelo;

import java.io.*;

public class ModeloGestionDatosMenu {
	
	private String[] tablasIndex;
	
	public String[] darIndexTablas() {
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;

	      try {
	         archivo = new File ("src/archivos/txt/index.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         String linea=br.readLine();
	         tablasIndex=linea.split(":");
	        
	     }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	       try{                    
	            if( null != fr ){   
	               fr.close();
	               br.close();
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	    return tablasIndex;
	}
}
