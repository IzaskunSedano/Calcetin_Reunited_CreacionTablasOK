package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import modelo.ModeloLogin;
import vista.PanelModificarPass;


public class ControlLogin{
	private JPanel newView;
	private ModeloLogin newModel;
	private PanelModificarPass newModify;

	
	public ControlLogin(JPanel panel) {
		this.newModel = new ModeloLogin("src/archivos/txt/users.txt");
		this.newView = panel;
	}
	
	public void modifyPass(String usuario, String contraseña) {
		if(newModel.isInDB(usuario)) {
        	newModify = new PanelModificarPass(usuario);
        	
        	newModify.getOkButton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						String oldPass = getPass(newModify.getOldPassField());
						String newPass = getPass(newModify.getNewPassField());
						String confirmPass = getPass(newModify.getConfirmPassField());
						
						if(!confirmPass.equals(newPass) || !oldPass.equals(newModel.getUserPass(usuario))) {
							JOptionPane.showMessageDialog(newModify, new JLabel("La nueva contraseña no coincide"),"Error", JOptionPane.ERROR_MESSAGE);
						}
						else {
							if(newPass.equals(oldPass)) {
								JOptionPane.showMessageDialog(newModify, new JLabel("La nueva contraseña es igual a la previa"),"Error", JOptionPane.ERROR_MESSAGE);
							}
							else {
								if(newModel.updatePass(usuario, newPass))
									JOptionPane.showMessageDialog(newModify, new JLabel("Contraseña cambiada correctamente"),"Bien!", JOptionPane.INFORMATION_MESSAGE);
								newModify.dispose();
							}
						}
					}
			});
        	
        	newModify.getCancelButton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						newModify.dispose();
					}
			});
    	}
    	else
			JOptionPane.showMessageDialog(newView, new JLabel("Everything is not fine, Commander"),"We found an error.", JOptionPane.ERROR_MESSAGE);
	}
	
	private String getPass(JPasswordField field) {
		return String.valueOf(field.getPassword());
	}
	
	public boolean acceptSession(String usuario, String contraseña, boolean isSaved) {
		boolean result = true;
		if (isSaved) {
			if(!newModel.isInDB(usuario)) {
				if(contraseña.length() == 4) {
					if(newModel.updateDB(usuario, contraseña)) {
						JOptionPane.showMessageDialog(newView, new JLabel("Everything is fine, Commander"),"Creation Successful", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(newView, new JLabel("Commander, we found hostiles"),"We found an error." , JOptionPane.ERROR_MESSAGE);
						result = false;
					}
				}
				else {
					JOptionPane.showMessageDialog(newView, new JLabel("Forbidden Password"),"500 Error" , JOptionPane.ERROR_MESSAGE);
					result = false;
				}
			}
			else {
				JOptionPane.showMessageDialog(newView, new JLabel("User already in Database"),"500 Error" , JOptionPane.ERROR_MESSAGE);
				result = false;
			}
		}
		else {
			if(newModel.isInDB(usuario)) {
				if(contraseña.equals(newModel.getUserPass(usuario))) {
					switch(Integer.parseInt(newModel.getUserPerm(usuario))) {
					case 1:
						JOptionPane.showMessageDialog(newView, new JLabel("Welcome back, Commander"),"Log In: ADMINISTRATOR" , JOptionPane.INFORMATION_MESSAGE);
						break;
					case 2:
						JOptionPane.showMessageDialog(newView, new JLabel("Welcome back, Commander"),"Log In: USER" , JOptionPane.INFORMATION_MESSAGE);
						break;
					case 3:
						JOptionPane.showMessageDialog(newView, new JLabel("Welcome back, Commander"),"Log In: GUEST" , JOptionPane.INFORMATION_MESSAGE);
						break;
					}
				}
				else {
					JOptionPane.showMessageDialog(newView, new JLabel("Wrong Password"),"500 Error" , JOptionPane.ERROR_MESSAGE);
					result = false;
				}
			}
			else {
				JOptionPane.showMessageDialog(newView, new JLabel("User Not Found"),"404 Error" , JOptionPane.ERROR_MESSAGE);
				result = false;
			}
		}
		
		return result;
	}
}


