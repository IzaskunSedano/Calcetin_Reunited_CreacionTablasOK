package modelo;

import java.io.*;
import java.util.*;

public class ModeloGestionDatos {
	
	private Object[][] datosRegistros;
	private Object[] campos;
	private ArrayList<String[]> tablas=new ArrayList<String[]>();
	
	public void cargarDatos(String seleccionado) {
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;

	      try {
	         archivo = new File ("src/archivos/txt/"+seleccionado+".txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         tablas.clear();
	         String linea=br.readLine();
	         while(linea!=null) {
	        	 tablas.add(linea.split(":"));
	        	 linea=br.readLine();
	         }
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
	}
	public Object[]darCamposTabla (){
		campos=tablas.get(0);

		return campos;
	}
	public Object[][] darDatosTabla() {
		datosRegistros=new Object[tablas.size()-2][tablas.get(0).length];
		for(int i=0;i<tablas.size()-2;i++) {
			for(int j=0;j<tablas.get(0).length;j++) {

				datosRegistros[i][j]=tablas.get(i+2)[j];
			
			}
		}
		
		return datosRegistros;
	}
	public Object[] getCampos() {
		return campos;
	}
	public void setCampos(Object[] campos) {
		this.campos = campos;
	}
	
}
