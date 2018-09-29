package vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import control.ControlIndexGestionDatos;
import control.ControlGestionDatos;
import control.ControlGestionDatosExportar;

 
public class PanelGestionTablas {
	
	//ATRIBUTOS
	private JPanel tableManagPanel;
	private JPanel titlePanel;
	private JLabel titleLabel;
	private JPanel panelBox;
	private JComboBox<String> tablas;
	private JScrollPane scroll;
	private JTable dataTable;
	private JPanel footerPanel;
	private JButton insertButton;
	private JButton modifyButton;
	private JButton exportButton;
	private JButton deleteButton;
	private JButton returnManagTablesButton;
	private Object[][] dataRows;
	private Object[] dataColumn;
	private DefaultTableModel tableModel;
	private int[] selectedRows;
	private ControlIndexGestionDatos cargarIndex;
	//CONSTRUCTOR
	public PanelGestionTablas() {
		initComponents();
	}
	
	//MÉTODOS
	private void initComponents() {
		tableManagPanel = new JPanel();
		titlePanel = new JPanel();
		titleLabel = new JLabel();
		panelBox = new JPanel();
		tablas = new JComboBox<String>();
		scroll = new JScrollPane();
		dataTable = new JTable();
		footerPanel = new JPanel();
		insertButton = new JButton();
		modifyButton = new JButton();
		exportButton = new JButton();
		deleteButton = new JButton();
		returnManagTablesButton = new JButton();
		cargarIndex=new ControlIndexGestionDatos(this);

		//======== tableManagPanel ========
		{
			tableManagPanel.setLayout(new GridBagLayout());
			((GridBagLayout)tableManagPanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)tableManagPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)tableManagPanel.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
			((GridBagLayout)tableManagPanel.getLayout()).rowWeights = new double[] {0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};

			//======== panelTitulo ========
			{
				titlePanel.setLayout(new GridBagLayout());
				((GridBagLayout)titlePanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)titlePanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)titlePanel.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
				((GridBagLayout)titlePanel.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};

				//---- titulo ----
				titleLabel.setText("Gesti\u00f3n de tablas");
				titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
				titlePanel.add(titleLabel, new GridBagConstraints(4, 1, 6, 2, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));

				//======== panelBox ========
				{
					panelBox.setLayout(new GridBagLayout());
					((GridBagLayout)panelBox.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
					((GridBagLayout)panelBox.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
					((GridBagLayout)panelBox.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
					((GridBagLayout)panelBox.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0E-4};

					//---- tablas ----
					
					cargarIndex.cargarIndex();
					tablas.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
					panelBox.add(tablas, new GridBagConstraints(3, 1, 3, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 0), 0, 0));

				}
				titlePanel.add(panelBox, new GridBagConstraints(2, 4, 10, 2, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));
			}
			tableManagPanel.add(titlePanel, new GridBagConstraints(0, 0, 15, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 0), 0, 0));

			//======== escrol ========
			tableModel = new DefaultTableModel(dataRows,dataColumn) {
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			dataTable.setModel(tableModel);
			dataTable.setEnabled(true);
			dataTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			dataTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			{
				scroll.setViewportView(dataTable);
			}
			tableManagPanel.add(scroll, new GridBagConstraints(0, 1, 15, 20, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 0), 0, 0));

			//======== panelPie ========
			{
				footerPanel.setLayout(new GridBagLayout());
				((GridBagLayout)footerPanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)footerPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
				((GridBagLayout)footerPanel.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
				((GridBagLayout)footerPanel.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0E-4};

				//---- insertar ----
				insertButton.setText("Insertar");
				footerPanel.add(insertButton, new GridBagConstraints(1, 1, 2, 2, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));

				//---- modificar ----
				modifyButton.setText("Modificar");
				footerPanel.add(modifyButton, new GridBagConstraints(4, 1, 2, 2, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));

				//---- exportar ----
				exportButton.setText("Exportar");
				footerPanel.add(exportButton, new GridBagConstraints(7, 1, 2, 2, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));

				//---- eliminar ----
				deleteButton.setText("Eliminar");
				footerPanel.add(deleteButton, new GridBagConstraints(10, 1, 2, 2, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));
				
				
			}
			
			tableManagPanel.add(footerPanel, new GridBagConstraints(0, 21, 15, 2, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 0), 0, 0));

			//---- returnManagTablesButton y limpiar de datos----
			returnManagTablesButton.setText("Return");
			returnManagTablesButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					tableModel=getModel();
					tableModel.setColumnCount(0);
					tableModel.setRowCount(0);
					setModel(tableModel);
				}
				
			});
			tableManagPanel.add(returnManagTablesButton, new GridBagConstraints(13, 24, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));
			tablas.addActionListener(new ControlGestionDatos(this));
			//modificar.addActionListener(new ControlGestionDatosModificar(this));
			//eliminar.addActionListener(new ControlGestionDatosEliminar(this));
			exportButton.addActionListener(new ControlGestionDatosExportar(this));
		
		}
		
	}//fin inicomp


	public JPanel getTableManagPanel() {
		return tableManagPanel;
	}

	public void setTableManagPanel(JPanel tableManagPanel) {
		this.tableManagPanel = tableManagPanel;
	}

	public JPanel getPanelTitulo() {
		return titlePanel;
	}

	public void setPanelTitulo(JPanel panelTitulo) {
		this.titlePanel = panelTitulo;
	}

	public JButton getReturnManagTablesButton() {
		return returnManagTablesButton;
	}

	public void setReturnManagTablesButton(JButton returnManagTablesButton) {
		this.returnManagTablesButton = returnManagTablesButton;
	}

	public JLabel getTitulo() {
		return titleLabel;
	}

	public void setTitulo(JLabel titulo) {
		this.titleLabel = titulo;
	}

	public JPanel getPanelBox() {
		return panelBox;
	}

	public void setPanelBox(JPanel panelBox) {
		this.panelBox = panelBox;
	}

	public JComboBox<String> getTablas() {
		return tablas;
	}

	public void setTablas(JComboBox<String> tablas) {
		this.tablas = tablas;
	}

	public JScrollPane getEscrol() {
		return scroll;
	}

	public void setEscrol(JScrollPane escrol) {
		this.scroll = escrol;
	}

	public JTable getLaTablaDatos() {
		return dataTable;
	}

	public void setLaTablaDatos(JTable laTablaDatos) {
		this.dataTable = laTablaDatos;
	}

	public JPanel getPanelPie() {
		return footerPanel;
	}

	public void setPanelPie(JPanel panelPie) {
		this.footerPanel = panelPie;
	}

	public JButton getInsertar() {
		return insertButton;
	}

	public void setInsertar(JButton insertar) {
		this.insertButton = insertar;
	}

	public JButton getModificar() {
		return modifyButton;
	}

	public void setModificar(JButton modificar) {
		this.modifyButton = modificar;
	}

	public JButton getExportar() {
		return exportButton;
	}

	public void setExportar(JButton exportar) {
		this.exportButton = exportar;
	}

	public JButton getEliminar() {
		return deleteButton;
	}

	public void setEliminar(JButton eliminar) {
		this.deleteButton = eliminar;
	}

	public DefaultTableModel getModel() {
		return tableModel;
	}

	public void setModel(DefaultTableModel model) {
		this.tableModel = model;
	}

	public int[] getSelectedRows() {
		return selectedRows;
	}

	public void setSelectedRows(int[] selectedRows) {
		this.selectedRows = selectedRows;
	}
	
}
