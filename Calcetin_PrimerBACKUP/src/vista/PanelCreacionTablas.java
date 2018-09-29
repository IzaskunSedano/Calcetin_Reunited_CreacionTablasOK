package vista;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class PanelCreacionTablas{
	//ATRIBUTOS
	private JPanel tableCreationPanel;
	private JPanel panelCreateTable;
	private JLabel labelTableName;
	private JTextField textFieldTableName;
	private JButton buttonCreate;
	private JButton buttonFinish;
	private JScrollPane scroll;
	private JPanel panelScroll;
	private JButton returnManagTablesButton2;
	private JButton buttonAddNewLine;
	private JLabel nameFieldTitleLabel;
	private JLabel keyLabel;
	private JLabel nameFieldLabel;
	private JLabel dataTypeLabel;
    private ArrayList<Component> componentGeneratorArray = new ArrayList<Component>();
    private String[] dataTypeArray = {"Null","Number","Float","Date","Currency","String"};
    private int counter = 0; //Controla los arrayComponents creados
    
	//CONSTRUCTOR
	public PanelCreacionTablas() {
		initComponents();
        generateComponents();

	}
    
	private void initComponents() {
		tableCreationPanel = new JPanel();
		panelCreateTable = new JPanel();
		labelTableName = new JLabel();
		textFieldTableName = new JTextField();
		buttonCreate = new JButton();
		buttonFinish = new JButton();
		buttonAddNewLine = new JButton();
        nameFieldTitleLabel = new JLabel();
        keyLabel = new JLabel();
        nameFieldLabel = new JLabel();
        dataTypeLabel = new JLabel();
		scroll = new JScrollPane();
		panelScroll = new JPanel();
		returnManagTablesButton2 = new JButton();

		//======== tableCreationPanel ========
		
		{
			
			tableCreationPanel.setLayout(new GridBagLayout());
			((GridBagLayout)tableCreationPanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)tableCreationPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)tableCreationPanel.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
			((GridBagLayout)tableCreationPanel.getLayout()).rowWeights = new double[] {0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};

			//======== panelA ========
			{
				panelCreateTable.setLayout(new GridBagLayout());
				((GridBagLayout)panelCreateTable.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)panelCreateTable.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)panelCreateTable.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
				((GridBagLayout)panelCreateTable.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};

				//---- l1 ----
				labelTableName.setText("Nombre de la tabla:");
				panelCreateTable.add(labelTableName, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));
				panelCreateTable.add(textFieldTableName, new GridBagConstraints(2, 1, 4, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));

				//---- buttonCreate ----
				buttonCreate.setText("buttonCreate");
				panelCreateTable.add(buttonCreate, new GridBagConstraints(7, 1, 2, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));

				//---- buttonFinish ----
				buttonFinish.setText("buttonFinish");
				panelCreateTable.add(buttonFinish, new GridBagConstraints(10, 1, 2, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));

				//---- button1 ----
				buttonAddNewLine.setText("+");
				panelCreateTable.add(buttonAddNewLine, new GridBagConstraints(13, 1, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 0, 0), 0, 0));

                //---- fieldnameLbel ----
                nameFieldTitleLabel.setText("Nombre del campo");
                nameFieldTitleLabel.setVisible(false);
                panelCreateTable.add(nameFieldTitleLabel, new GridBagConstraints(0, 6, 3, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 0), 0, 0));

                //---- keyLabel ----
                keyLabel.setText("LLave");
                keyLabel.setVisible(false);
                panelCreateTable.add(keyLabel, new GridBagConstraints(3, 6, 4, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 0), 0, 0));

                //---- introTextLabel ----
                nameFieldLabel.setText("Texto a introducir");
                nameFieldLabel.setVisible(false);
                panelCreateTable.add(nameFieldLabel, new GridBagConstraints(7, 6, 4, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 0), 0, 0));

                //---- dataTypeLabel ----
                dataTypeLabel.setText("Tipo de datos");
                dataTypeLabel.setVisible(false);
                panelCreateTable.add(dataTypeLabel, new GridBagConstraints(11, 6, 3, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                        new Insets(0, 0, 0, 0), 0, 0));
			}
			tableCreationPanel.add(panelCreateTable, new GridBagConstraints(0, 0, 15, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 0), 0, 0));

			//======== scroll ========
			{

				//======== panelScroll ========
				{
					panelScroll.setLayout(new GridLayout(0, 4));
				}
				scroll.setViewportView(panelScroll);
			    scroll.setVisible(false);
			}
			tableCreationPanel.add(scroll, new GridBagConstraints(0, 3, 15, 20, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 0), 0, 0));

			//---- returnManagTablesButton2 ----
			returnManagTablesButton2.setText("Return");
			tableCreationPanel.add(returnManagTablesButton2, new GridBagConstraints(13, 24, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));
		}
	}

    public void generateComponents() {
        for(int i=0; i<11; i++) {
            componentGeneratorArray.add(new JLabel("Campo "+(counter +1)));
            componentGeneratorArray.add(new JCheckBox());
            componentGeneratorArray.add(new JTextField());
            componentGeneratorArray.add(new JComboBox<String>(dataTypeArray));
            counter++;
        }

        for(Component e: componentGeneratorArray) {  // Se definen los arrayComponents despues de meterlos en el array y se añaden al panelScroll
            panelScroll.add(e);
        }
    }

    public void addExtraLine(){
        componentGeneratorArray.add(new JLabel("Campo "+(counter +1)));
        componentGeneratorArray.add(new JCheckBox());
        componentGeneratorArray.add(new JTextField());
        componentGeneratorArray.add(new JComboBox<String>(dataTypeArray));
        counter++;

        for(Component e: componentGeneratorArray) {
            panelScroll.add(e);
        }
    }

    public void setLabelsVisibles(){
        nameFieldTitleLabel.setVisible(true);
        keyLabel.setVisible(true);
        nameFieldLabel.setVisible(true);
        dataTypeLabel.setVisible(true);
    }

    public JButton getbuttonCreate() { //Se usa en CONTROL_CREACION_TABLAS
        return buttonCreate;
    }

    public JButton getAddLineButton() { //Se usa en CONTROL_CREACION_TABLAS
        return buttonAddNewLine;
    }

    public JButton getbuttonFinish() { //Se usa en CONTROL_CREACION_TABLAS
        return buttonFinish;
    }

    public JScrollPane getscroll() { //Se usa en CONTROL_CREACION_TABLAS
        return scroll;
    }

    public JTextField getTextFieldTableName() { //Se usa en CONTROL_CREACION_TABLAS
        return textFieldTableName;
    }

    public ArrayList<Component> getArrayComponents() { //Se usa en CONTROL_CREACION_TABLAS
        return componentGeneratorArray;
    }

	public JPanel getTableCreationPanel() { //Se usa en VENTANA_PRINCIPAL
		return tableCreationPanel;
	}

    public JButton getReturnManagTablesButton2() { //Se usa en VENTANA_PRINCIPAL
        return returnManagTablesButton2;
    }
}
