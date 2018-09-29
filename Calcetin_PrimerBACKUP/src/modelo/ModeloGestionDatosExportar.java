package modelo;
import java.io.*;


public class ModeloGestionDatosExportar {
	private File archivo;
	private FileWriter escribir;
	private StringBuilder sb;
	private char delimitador = ';'; 
	private String siguienteLinea = System.getProperty("line.separator"); 
	public void exportarFicheros(String fichero,Object[] campos,Object[][] datosRegistros) {
		try {
			archivo=new File("src/archivos/csv/"+fichero+".csv");
			escribir=new FileWriter(archivo);
			sb=new StringBuilder();
			//---------introducimos los campos---------
			for (int i=0;i<campos.length;i++) {
				sb.append(campos[i]).append(delimitador);
				
			}
			sb.append(siguienteLinea);
			for (int i=0;i<datosRegistros.length;i++) {
				for (int j=0;j<datosRegistros[0].length;j++) {
					sb.append(datosRegistros[i][j]).append(delimitador);
				}
			sb.append(siguienteLinea);	
			}
		escribir.write(sb.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				escribir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
