package vista;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class PanelModificarPass extends JFrame {
	public PanelModificarPass(String user) {
		initComponents(user);
		setUndecorated(true);
		dialogPane.setBackground(new Color(45,63,45));
		contentPanel.setBackground(new Color(45,63,45));
		buttonBar.setBackground(new Color(45,63,45));
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(45,63,45)));
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(PanelModificarPass.DISPOSE_ON_CLOSE);
	}

	private void initComponents(String user) {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Random Dude
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		titleLabel = new JLabel();
		oldPassLabel = new JLabel();
		oldPassField = new JPasswordField();
		newPassLabel = new JLabel();
		newPassField = new JPasswordField();
		confirmPassLabel = new JLabel();
		confirmPassField = new JPasswordField();
		buttonBar = new JPanel();
		okButton = new JButton();
		cancelButton = new JButton();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
			dialogPane.setLayout(new BorderLayout());
			//======== contentPanel ========
			{
				contentPanel.setLayout(new GridBagLayout());
				((GridBagLayout)contentPanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)contentPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)contentPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0E-4};
				((GridBagLayout)contentPanel.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};

				//---- titleLabel ----
				titleLabel.setText("Contrase\u00f1a de "+user);
				titleLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16
						));
				titleLabel.setForeground(new Color(255,255,246));
				contentPanel.add(titleLabel, new GridBagConstraints(2, 1, 9, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- oldPassLabel ----
				oldPassLabel.setText("Antigua Contrase\u00f1a:");
				oldPassLabel.setFont(new Font("Lucida Grande", Font.BOLD, 12));
				oldPassLabel.setForeground(new Color(255,255,246));
				contentPanel.add(oldPassLabel, new GridBagConstraints(2, 2, 3, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));
				contentPanel.add(oldPassField, new GridBagConstraints(5, 2, 7, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- newPassLabel ----
				newPassLabel.setText("Nueva Contrase\u00f1a:");
				newPassLabel.setFont(new Font("Lucida Grande", Font.BOLD, 12));
				newPassLabel.setForeground(new Color(255,255,246));
				contentPanel.add(newPassLabel, new GridBagConstraints(2, 4, 3, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));
				contentPanel.add(newPassField, new GridBagConstraints(5, 4, 7, 1, 1.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- confirmPassLabel ----
				confirmPassLabel.setText("Repita Contrase\u00f1a:");
				confirmPassLabel.setFont(new Font("Lucida Grande", Font.BOLD, 12));
				confirmPassLabel.setForeground(new Color(255,255,246));
				contentPanel.add(confirmPassLabel, new GridBagConstraints(2, 6, 3, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));
				contentPanel.add(confirmPassField, new GridBagConstraints(5, 6, 7, 1, 1.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 0, 5, 5), 0, 0));
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
				buttonBar.setLayout(new GridBagLayout());
				((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
				((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

				//---- okButton ----
				okButton.setText("Aceptar");
				buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 5), 0, 0));

				//---- cancelButton ----
				cancelButton.setText("Cancelar");
				buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		setSize(300, 200);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	public JPanel getDialogPane() {
		return dialogPane;
	}

	public void setDialogPane(JPanel dialogPane) {
		this.dialogPane = dialogPane;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public void setContentPanel(JPanel contentPanel) {
		this.contentPanel = contentPanel;
	}

	public JLabel getTitleLabel() {
		return titleLabel;
	}

	public void setTitleLabel(JLabel titleLabel) {
		this.titleLabel = titleLabel;
	}

	public JLabel getOldPassLabel() {
		return oldPassLabel;
	}

	public void setOldPassLabel(JLabel oldPassLabel) {
		this.oldPassLabel = oldPassLabel;
	}

	public JPasswordField getOldPassField() {
		return oldPassField;
	}

	public void setOldPassField(JPasswordField oldPassField) {
		this.oldPassField = oldPassField;
	}

	public JLabel getNewPassLabel() {
		return newPassLabel;
	}

	public void setNewPassLabel(JLabel newPassLabel) {
		this.newPassLabel = newPassLabel;
	}

	public JPasswordField getNewPassField() {
		return newPassField;
	}

	public void setNewPassField(JPasswordField newPassField) {
		this.newPassField = newPassField;
	}

	public JLabel getConfirmPassLabel() {
		return confirmPassLabel;
	}

	public void setConfirmPassLabel(JLabel confirmPassLabel) {
		this.confirmPassLabel = confirmPassLabel;
	}

	public JPasswordField getConfirmPassField() {
		return confirmPassField;
	}

	public void setConfirmPassField(JPasswordField confirmPassField) {
		this.confirmPassField = confirmPassField;
	}

	public JPanel getButtonBar() {
		return buttonBar;
	}

	public void setButtonBar(JPanel buttonBar) {
		this.buttonBar = buttonBar;
	}

	public JButton getOkButton() {
		return okButton;
	}

	public void setOkButton(JButton okButton) {
		this.okButton = okButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}

	private JPanel dialogPane;
	private JPanel contentPanel;
	private JLabel titleLabel;
	private JLabel oldPassLabel;
	private JPasswordField oldPassField;
	private JLabel newPassLabel;
	private JPasswordField newPassField;
	private JLabel confirmPassLabel;
	private JPasswordField confirmPassField;
	private JPanel buttonBar;
	private JButton okButton;
	private JButton cancelButton;
}
