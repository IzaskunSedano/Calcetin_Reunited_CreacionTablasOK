package control;

import java.awt.event.*;
import java.util.Vector;

import modelo.ModeloGestionDatosExportar;
import vista.*;

public class ControlGestionDatosExportar implements ActionListener {
	private PanelGestionTablas elmarco;
	private ModeloGestionDatosExportar exportar;
	private String fichero;
	private Object[][] datosRegistros;
	private Object[] campos;
	private Vector<Object> v;
	private Vector<Object> vv;

	public ControlGestionDatosExportar(PanelGestionTablas elmarco) {
		this.elmarco=elmarco;
	}
	public void actionPerformed(ActionEvent e) {
		//--------nombre de la tabla-----------
		fichero=" ";
		fichero=(String) elmarco.getTablas().getSelectedItem();
		
		//--------datos de la tabla-----------
		v= elmarco.getModel().getDataVector();
		vv=(Vector<Object>) v.get(0);
		datosRegistros=new Object[v.size()][vv.size()];
		for(int i=0;i<v.size();i++) {
			vv= (Vector<Object>) v.get(i);
				for(int j=0;j<vv.size();j++) {
					datosRegistros[i][j]=vv.get(j);
				}
			 
		}	
		
		//--------nombre de los campos d ela tabla-----------
		campos=new Object[elmarco.getModel().getColumnCount()];
		for(int i=0;i<elmarco.getModel().getColumnCount();i++) {
			campos[i]=elmarco.getModel().getColumnName(i);
			
		//-----------mandar los datos al modelo
			exportar=new ModeloGestionDatosExportar();
			exportar.exportarFicheros(fichero, campos, datosRegistros);
		}
	}
	public String getFichero() {
		return fichero;
	}

	public Object[][] getDatosRegistros() {
		return datosRegistros;
	}
	
	public Object[] getCampos() {
		return campos;
	}


}
