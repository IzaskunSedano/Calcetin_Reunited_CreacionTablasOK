package vista;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PanelTablas extends JFrame {
	//ATRIBUTOS
	private JPanel tablePanel;
	private JLabel titleVista3Label;
	private JLabel ajustesCuentaLabel;
	private JPanel newsPanel;
	private JLabel newsLabel;
	private JTextPane newsTextPane;
	private JSeparator newsAccessSeparator;
	private JLabel rAccessLabel;
	private JLabel ejemplo1Label;
	private JLabel ejemplo2Label;
	private JButton createTableButton;
	private JButton managTableButton;
	private JButton imporTableButton;
	private JButton exitButton;
	private JButton returnLoginButton;
	
	//CONSTRUCTOR
	public PanelTablas() {
		initComponents();
	}

	
	//MÉTODOS
	private void initComponents() {
		
		tablePanel = new JPanel();
		titleVista3Label = new JLabel();
		ajustesCuentaLabel = new JLabel();
		newsPanel = new JPanel();
		newsLabel = new JLabel();
		newsTextPane = new JTextPane();
		newsAccessSeparator = new JSeparator();
		rAccessLabel = new JLabel();
		ejemplo1Label = new JLabel();
		ejemplo2Label = new JLabel();
		createTableButton = new JButton();
		managTableButton = new JButton();
		imporTableButton = new JButton();
		exitButton = new JButton();
		returnLoginButton = new JButton();

		
		//======== tablePanel ========
		{

			tablePanel.setLayout(new GridBagLayout());
			((GridBagLayout)tablePanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)tablePanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)tablePanel.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
			((GridBagLayout)tablePanel.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};

			//---- titleVista3Label ----
			titleVista3Label.setText("ABCD permisos a");
			titleVista3Label.setHorizontalAlignment(SwingConstants.LEFT);
			tablePanel.add(titleVista3Label, new GridBagConstraints(1, 0, 8, 4, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));

			//---- ajustesCuentaLabel ----
			ajustesCuentaLabel.setText("Ajustes Cuenta");
			ajustesCuentaLabel.setForeground(Color.red);
			ajustesCuentaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			tablePanel.add(ajustesCuentaLabel, new GridBagConstraints(9, 0, 5, 4, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));

			//======== newsPanel ========
			{
				newsPanel.setLayout(new GridBagLayout());
				((GridBagLayout)newsPanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)newsPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)newsPanel.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
				((GridBagLayout)newsPanel.getLayout()).rowWeights = new double[] {1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};

				//---- newsLabel ----
				newsLabel.setText("Noticias");
				newsPanel.add(newsLabel, new GridBagConstraints(1, 0, 9, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));
				newsPanel.add(newsTextPane, new GridBagConstraints(1, 2, 9, 4, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));
				newsPanel.add(newsAccessSeparator, new GridBagConstraints(1, 6, 9, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 0, 1, 1), 0, 0));

				//---- rAccessLabel ----
				rAccessLabel.setText("Accesos recientes");
				newsPanel.add(rAccessLabel, new GridBagConstraints(1, 7, 9, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));

				//---- ejemplo1Label ----
				ejemplo1Label.setText("\u00b7 Tabla 1");
				newsPanel.add(ejemplo1Label, new GridBagConstraints(1, 8, 4, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));

				//---- ejemplo2Label ----
				ejemplo2Label.setText("\u00b7 Tabla 5");
				newsPanel.add(ejemplo2Label, new GridBagConstraints(1, 9, 4, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));
			}
			
			tablePanel.add(newsPanel, new GridBagConstraints(3, 5, 12, 18, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 0), 0, 0));

				//---- createTableButton ----
				createTableButton.setText("Crear tablas");
				tablePanel.add(createTableButton, new GridBagConstraints(1, 7, 1, 2, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));

				//---- managTableButton ----
				managTableButton.setText("Gestion tablas");
				tablePanel.add(managTableButton, new GridBagConstraints(1, 11, 1, 2, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));

				//---- imporTableButton ----
				imporTableButton.setText("Importar tablas");
				tablePanel.add(imporTableButton, new GridBagConstraints(1, 15, 1, 2, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));

				//---- exitButton ----
				exitButton.setText("Salir");
				tablePanel.add(exitButton, new GridBagConstraints(1, 19, 1, 2, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));

				//---- returnLoginButton ----
				returnLoginButton.setText("Return");
				tablePanel.add(returnLoginButton, new GridBagConstraints(13, 23, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));
		}
	}


	public JPanel getTablePanel() {
		return tablePanel;
	}


	public void setTablePanel(JPanel tablePanel) {
		this.tablePanel = tablePanel;
	}


	public JLabel getTitleVista3Label() {
		return titleVista3Label;
	}


	public void setTitleVista3Label(JLabel titleVista3Label) {
		this.titleVista3Label = titleVista3Label;
	}


	public JLabel getAjustesCuentaLabel() {
		return ajustesCuentaLabel;
	}


	public void setAjustesCuentaLabel(JLabel ajustesCuentaLabel) {
		this.ajustesCuentaLabel = ajustesCuentaLabel;
	}


	public JPanel getNewsPanel() {
		return newsPanel;
	}


	public void setNewsPanel(JPanel newsPanel) {
		this.newsPanel = newsPanel;
	}


	public JLabel getNewsLabel() {
		return newsLabel;
	}


	public void setNewsLabel(JLabel newsLabel) {
		this.newsLabel = newsLabel;
	}


	public JTextPane getNewsTextPane() {
		return newsTextPane;
	}


	public void setNewsTextPane(JTextPane newsTextPane) {
		this.newsTextPane = newsTextPane;
	}


	public JSeparator getNewsAccessSeparator() {
		return newsAccessSeparator;
	}


	public void setNewsAccessSeparator(JSeparator newsAccessSeparator) {
		this.newsAccessSeparator = newsAccessSeparator;
	}


	public JLabel getrAccessLabel() {
		return rAccessLabel;
	}


	public void setrAccessLabel(JLabel rAccessLabel) {
		this.rAccessLabel = rAccessLabel;
	}


	public JLabel getEjemplo1Label() {
		return ejemplo1Label;
	}


	public void setEjemplo1Label(JLabel ejemplo1Label) {
		this.ejemplo1Label = ejemplo1Label;
	}


	public JLabel getEjemplo2Label() {
		return ejemplo2Label;
	}


	public void setEjemplo2Label(JLabel ejemplo2Label) {
		this.ejemplo2Label = ejemplo2Label;
	}


	public JButton getCreateTableButton() {
		return createTableButton;
	}


	public void setCreateTableButton(JButton createTableButton) {
		this.createTableButton = createTableButton;
	}


	public JButton getReturnLoginButton() {
		return returnLoginButton;
	}


	public void setReturnLoginButton(JButton returnLoginButton) {
		this.returnLoginButton = returnLoginButton;
	}


	public JButton getManagTableButton() {
		return managTableButton;
	}


	public void setManagTableButton(JButton managTableButton) {
		this.managTableButton = managTableButton;
	}


	public JButton getImporTableButton() {
		return imporTableButton;
	}


	public void setImporTableButton(JButton imporTableButton) {
		this.imporTableButton = imporTableButton;
	}


	public JButton getExitButton() {
		return exitButton;
	}


	public void setExitButton(JButton exitButton) {
		this.exitButton = exitButton;
	}
}
