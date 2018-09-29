package control;

import javax.swing.*;
import modelo.*;
import vista.*;

public class ControlIndexGestionDatos {
	private PanelGestionTablas elmarco;
	private ModeloGestionDatosMenu menu=new ModeloGestionDatosMenu();
	private String[] tablasIndex;
	private JComboBox<String> campos;
	
	public ControlIndexGestionDatos(PanelGestionTablas elmarco) {
		this.elmarco=elmarco;
	}
	
	public void cargarIndex() {
		campos=elmarco.getTablas();
		tablasIndex=menu.darIndexTablas();
	
			for(int i=0;i<tablasIndex.length;i++) {
				campos.setSelectedIndex(-1);
				campos.addItem(tablasIndex[i]);
			}	
	}

	public JComboBox<String> getCampos() {
		return campos;
	}

	public void setCampos(JComboBox<String> campos) {
		this.campos = campos;
	}

}
