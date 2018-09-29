package vista;
import java.awt.*;
import javax.swing.*;

public class PanelLogin{
	//ATRIBUTOS
	private JPanel loginPanel;
	private JLabel titleLoginLabel;
	private JLabel iconLabel;
	private JLabel userLabel;
	private JTextField userField;
	private JLabel passLabel;
	private JPasswordField passField;
	private JLabel modifyLabel;
	private JCheckBox isSavedCheckBox;
	private JButton acceptIdButton;
	private JButton cancelLogInButton;
	private JButton returnAccessButton;
	
	//CONSTRUCTOR
	public PanelLogin() {
		initComponents();
	}

	//MÉTODOS
	private void initComponents() {
		loginPanel = new JPanel();
		titleLoginLabel = new JLabel();
		iconLabel = new JLabel();
		userLabel = new JLabel();
		userField = new JTextField();
		passLabel = new JLabel();
		passField = new JPasswordField();
		modifyLabel = new JLabel();
		isSavedCheckBox = new JCheckBox();
		acceptIdButton = new JButton();
		cancelLogInButton = new JButton();
		returnAccessButton = new JButton();

		
		//======== loginPanel  ========
		{

			loginPanel.setLayout(new GridBagLayout());
			((GridBagLayout)loginPanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)loginPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)loginPanel.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
			((GridBagLayout)loginPanel.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};

			//---- titleLoginLabel ----
			titleLoginLabel.setText("MONSTRUOSAURIO INC.");
			titleLoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
			titleLoginLabel.setFont(new Font("Lucida Grande", Font.BOLD, 22));
			loginPanel.add(titleLoginLabel, new GridBagConstraints(0, 0, 10, 3, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 0), 0, 0));

			//---- iconLabel ----
			iconLabel.setText("METER AQUI ICONO");
			loginPanel.add(iconLabel, new GridBagConstraints(2, 3, 6, 5, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));

			//---- userLabel ----
			userLabel.setText("User name:");
			userLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			loginPanel.add(userLabel, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));
			loginPanel.add(userField, new GridBagConstraints(3, 9, 5, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));

			//---- passLabel ----
			passLabel.setText("Password:");
			loginPanel.add(passLabel, new GridBagConstraints(2, 11, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));
			loginPanel.add(passField, new GridBagConstraints(3, 11, 5, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));

			//---- modifyLabel ----
			modifyLabel.setText("Modify Password?");
			modifyLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			loginPanel.add(modifyLabel, new GridBagConstraints(4, 13, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));

			//---- isSavedCheckBox ----
			isSavedCheckBox.setText("Create Me!");
			isSavedCheckBox.setHorizontalAlignment(SwingConstants.RIGHT);
			loginPanel.add(isSavedCheckBox, new GridBagConstraints(6, 14, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));

			//---- acceptIdButton ----
			acceptIdButton.setText("Accept");
			loginPanel.add(acceptIdButton, new GridBagConstraints(4, 16, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(4, 4, 5, 5), 0, 0));

			//---- cancelLogInButton ----
			cancelLogInButton.setText("Cancel");
			loginPanel.add(cancelLogInButton, new GridBagConstraints(6, 16, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(4, 4, 5, 5), 0, 0));
			
			//---- returnAccessButton ----
			returnAccessButton.setText("Return");
			loginPanel.add(returnAccessButton, new GridBagConstraints(8, 18, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 1, 1), 0, 0));
		}
	}

	public JPanel getLoginPanel() {
		return loginPanel;
	}

	public void setLoginPanel(JPanel loginPanel) {
		this.loginPanel = loginPanel;
	}

	public JLabel getTitleLoginLabel() {
		return titleLoginLabel;
	}

	public void setTitleLoginLabel(JLabel titleLoginLabel) {
		this.titleLoginLabel = titleLoginLabel;
	}

	public JLabel getIconLabel() {
		return iconLabel;
	}

	public void setIconLabel(JLabel iconLabel) {
		this.iconLabel = iconLabel;
	}

	public JLabel getUserLabel() {
		return userLabel;
	}

	public void setUserLabel(JLabel userLabel) {
		this.userLabel = userLabel;
	}

	public JTextField getUserField() {
		return userField;
	}

	public void setUserField(JTextField userField) {
		this.userField = userField;
	}

	public JLabel getPassLabel() {
		return passLabel;
	}

	public void setPassLabel(JLabel passLabel) {
		this.passLabel = passLabel;
	}

	public JPasswordField getPassField() {
		return passField;
	}

	public void setPassField(JPasswordField passField) {
		this.passField = passField;
	}

	public JLabel getModifyLabel() {
		return modifyLabel;
	}

	public void setModifyLabel(JLabel modifyLabel) {
		this.modifyLabel = modifyLabel;
	}

	public JCheckBox getIsSavedCheckBox() {
		return isSavedCheckBox;
	}

	public void setIsSavedCheckBox(JCheckBox isSavedCheckBox) {
		this.isSavedCheckBox = isSavedCheckBox;
	}

	public JButton getAcceptIdButton() {
		return acceptIdButton;
	}

	public void setAcceptIdButton(JButton acceptIdButton) {
		this.acceptIdButton = acceptIdButton;
	}

	public JButton getCancelLogInButton() {
		return cancelLogInButton;
	}

	public JButton getReturnAccessButton() {
		return returnAccessButton;
	}

	public void setReturnAccessButton(JButton returnAccessButton) {
		this.returnAccessButton = returnAccessButton;
	}

	public void setCancelLogInButton(JButton cancelLogInButton) {
		this.cancelLogInButton = cancelLogInButton;
	}

}
