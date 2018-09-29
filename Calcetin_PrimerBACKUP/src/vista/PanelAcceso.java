package vista;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PanelAcceso{
	//ATRIBUTOS
	private JPanel accessPanel;
	private JLabel accessTitle;
	private JSeparator titleSeparator;
	private JButton productsButton;
	private JButton locateButton;
	private JButton workButton;
	private JButton eMailButton;
	private JButton accessButton;
	private JPanel infoPanel;
	private JTextPane columnLeftTextPane;
	private JTextPane columnCentralTextPane;
	private JTextPane columnRightTextPane;
	private JLabel cambiarPorIconInfolabel;
	
	//CONSTRUCTOR
	public PanelAcceso() {
		initComponents();
	}

	//MÉTODOS
	private void accessButtonActionPerformed(ActionEvent e) {
		// TODO add your code here
	}
	private void initComponents() {
		accessPanel = new JPanel();
		accessTitle = new JLabel();
		titleSeparator = new JSeparator();
		productsButton = new JButton();
		locateButton = new JButton();
		workButton = new JButton();
		eMailButton = new JButton();
		accessButton = new JButton();
		infoPanel = new JPanel();
		columnLeftTextPane = new JTextPane();
		columnCentralTextPane = new JTextPane();
		columnRightTextPane = new JTextPane();
		cambiarPorIconInfolabel = new JLabel();

		
		//======== accessPanel ========
		{
			accessPanel.setLayout(new GridBagLayout());
			((GridBagLayout)accessPanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)accessPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)accessPanel.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
			((GridBagLayout)accessPanel.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};

			//---- accessTitle ----
			accessTitle.setText("MONSTRUOSAURIO INC.");
			accessTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
			accessTitle.setHorizontalAlignment(SwingConstants.CENTER);
			accessPanel.add(accessTitle, new GridBagConstraints(0, 1, 10, 3, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 0), 0, 0));
			accessPanel.add(titleSeparator, new GridBagConstraints(0, 4, 10, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 0), 0, 0));

			//---- productsButton ----
			productsButton.setText("Productos");
			accessPanel.add(productsButton, new GridBagConstraints(0, 5, 2, 3, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));

			//---- locateButton ----
			locateButton.setText("Localizar");
			accessPanel.add(locateButton, new GridBagConstraints(2, 5, 2, 3, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));

			//---- workButton ----
			workButton.setText("Trabajo");
			accessPanel.add(workButton, new GridBagConstraints(4, 5, 2, 3, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));

			//---- eMailButton ----
			eMailButton.setText("Icono");
			accessPanel.add(eMailButton, new GridBagConstraints(6, 5, 2, 3, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));

			//---- accessButton ----
			accessButton.setText("Acceso");
			accessButton.addActionListener(e -> {
			accessButtonActionPerformed(e);
			});
			accessPanel.add(accessButton, new GridBagConstraints(8, 5, 2, 3, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 0), 0, 0));

			//======== infoPanel ========
			{
				infoPanel.setLayout(new GridBagLayout());
				((GridBagLayout)infoPanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)infoPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)infoPanel.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
				((GridBagLayout)infoPanel.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};

				//---- columnLeftTextPane ----
				columnLeftTextPane.setText("Lorem ipsum dolor sit amet consectetur adipiscing elit mollis magnis, habitasse justo faucibus sem eu dictumst nisi mus pulvinar, facilisi luctus ridiculus vehicula torquent mauris sapien aenean. Integer est duis lectus quam torquent quis phasellus ante nibh, himenaeos curae sapien primis cursus tristique suspendisse dictum egestas, dictumst mattis interdum luctus venenatis eu fringilla class. Fusce rhoncus enim blandit sociosqu mus euismod sollicitudin gravida interdum diam, laoreet magnis ac dis netus turpis duis mollis ad.");
				infoPanel.add(columnLeftTextPane, new GridBagConstraints(0, 1, 3, 4, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));

				//---- columnCentralTextPane ----
				columnCentralTextPane.setText("Lorem ipsum dolor sit amet consectetur adipiscing elit mollis magnis, habitasse justo faucibus sem eu dictumst nisi mus pulvinar, facilisi luctus ridiculus vehicula torquent mauris sapien aenean. Integer est duis lectus quam torquent quis phasellus ante nibh, himenaeos curae sapien primis cursus tristique suspendisse dictum egestas, dictumst mattis interdum luctus venenatis eu fringilla class. Fusce rhoncus enim blandit sociosqu mus euismod sollicitudin gravida interdum diam, laoreet magnis ac dis netus turpis duis mollis ad.");
				infoPanel.add(columnCentralTextPane, new GridBagConstraints(4, 1, 3, 4, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 1), 0, 0));

				//---- columnRightTextPane ----
				columnRightTextPane.setText("Lorem ipsum dolor sit amet consectetur adipiscing elit mollis magnis, habitasse justo faucibus sem eu dictumst nisi mus pulvinar, facilisi luctus ridiculus vehicula torquent mauris sapien aenean. Integer est duis lectus quam torquent quis phasellus ante nibh, himenaeos curae sapien primis cursus tristique suspendisse dictum egestas, dictumst mattis interdum luctus venenatis eu fringilla class. Fusce rhoncus enim blandit sociosqu mus euismod sollicitudin gravida interdum diam, laoreet magnis ac dis netus turpis duis mollis ad.");
				infoPanel.add(columnRightTextPane, new GridBagConstraints(8, 1, 3, 4, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 0), 0, 0));

				//---- cambiarPorIconInfolabel ----
				cambiarPorIconInfolabel.setText("text");
				infoPanel.add(cambiarPorIconInfolabel, new GridBagConstraints(0, 8, 11, 3, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 1, 0), 0, 0));
			}
			
			accessPanel.add(infoPanel, new GridBagConstraints(0, 8, 10, 11, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
	}

	public JPanel getAccessPanel() {
		return accessPanel;
	}

	public void setAccessPanel(JPanel accessPanel) {
		this.accessPanel = accessPanel;
	}

	public JLabel getAccessTitle() {
		return accessTitle;
	}

	public void setAccessTitle(JLabel accessTitle) {
		this.accessTitle = accessTitle;
	}

	public JSeparator getTitleSeparator() {
		return titleSeparator;
	}

	public void setTitleSeparator(JSeparator titleSeparator) {
		this.titleSeparator = titleSeparator;
	}

	public JButton getProductsButton() {
		return productsButton;
	}

	public void setProductsButton(JButton productsButton) {
		this.productsButton = productsButton;
	}

	public JButton getLocateButton() {
		return locateButton;
	}

	public void setLocateButton(JButton locateButton) {
		locateButton = locateButton;
	}

	public JButton getWorkButton() {
		return workButton;
	}

	public void setWorkButton(JButton workButton) {
		this.workButton = workButton;
	}

	public JButton geteMailButton() {
		return eMailButton;
	}

	public void seteMailButton(JButton eMailButton) {
		this.eMailButton = eMailButton;
	}

	public JButton getAccessButton() {
		return accessButton;
	}

	public void setAccessButton(JButton accessButton) {
		this.accessButton = accessButton;
	}

	public JPanel getInfoPanel() {
		return infoPanel;
	}

	public JTextPane getColumnLeftTextPane() {
		return columnLeftTextPane;
	}

	public void setColumnLeftTextPane(JTextPane columnLeftTextPane) {
		this.columnLeftTextPane = columnLeftTextPane;
	}

	public JTextPane getColumnCentralTextPane() {
		return columnCentralTextPane;
	}

	public void setColumnCentralTextPane(JTextPane columnCentralTextPane) {
		this.columnCentralTextPane = columnCentralTextPane;
	}

	public JTextPane getColumnRightTextPane() {
		return columnRightTextPane;
	}

	public void setColumnRightTextPane(JTextPane columnRightTextPane) {
		this.columnRightTextPane = columnRightTextPane;
	}

	public void setInfoPanel(JPanel infoPanel) {
		this.infoPanel = infoPanel;
	}

	

	public JLabel getCambiarPorIconInfolabel() {
		return cambiarPorIconInfolabel;
	}

	public void setCambiarPorIconInfolabel(JLabel cambiarPorIconInfolabel) {
		this.cambiarPorIconInfolabel = cambiarPorIconInfolabel;
	}

	

	
}
