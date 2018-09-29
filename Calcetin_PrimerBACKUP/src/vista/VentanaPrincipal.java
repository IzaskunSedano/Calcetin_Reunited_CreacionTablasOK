package vista;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import control.ControlCreacionTablas;
import control.ControlLogin;

public class VentanaPrincipal extends JFrame {

	
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		VentanaPrincipal ventanaPrincipal= new VentanaPrincipal();
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.setSize(900,700);
		ventanaPrincipal.setLocationRelativeTo(null);
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//ATRIBUTOS
	private PanelAcceso newPanelAcesso;
	private PanelLogin newPanelLogin;
	private PanelTablas newPanelTablas;
	private PanelGestionTablas newPanelGestionTablas;
	private PanelCreacionTablas newPanelCreacionTablas;
	private JPanel view1;
	private JPanel view2;
	private JPanel view3;
	private JPanel view4Manag;
	private JPanel view4Create;
	
	//CONTROLADORES
	private ControlLogin newControladorLogin;
    @SuppressWarnings("unused")
	private ControlCreacionTablas newControlCreacionTablas;
	
	//CONSTRUCTOR
	public VentanaPrincipal() {
		
		newPanelAcesso= new PanelAcceso();
		view1=newPanelAcesso.getAccessPanel();
		view1.setVisible(true);
		
		newPanelLogin=new PanelLogin();
		view2=newPanelLogin.getLoginPanel();
		view2.setVisible(false);
		
		newPanelTablas=new PanelTablas();
		view3=newPanelTablas.getTablePanel();
		view3.setVisible(false);
		
		newPanelGestionTablas=new PanelGestionTablas();
		view4Manag=newPanelGestionTablas.getTableManagPanel();
		view4Manag.setVisible(false);
		
		newPanelCreacionTablas=new PanelCreacionTablas();
		view4Create=newPanelCreacionTablas.getTableCreationPanel();
		view4Create.setVisible(false);
		
		newControladorLogin = new ControlLogin(view2);

		newControlCreacionTablas = new ControlCreacionTablas(newPanelCreacionTablas);

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridBagLayout());
		((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};
		((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0E-4};

		
		contentPane.add(view1, new GridBagConstraints(1, 0, 10, 18, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 1), 0, 0));
		
		contentPane.add(view2, new GridBagConstraints(1, 0, 10, 18, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 1), 0, 0));
		
		contentPane.add(view3, new GridBagConstraints(1, 0, 10, 18, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 1), 0, 0));
		
		contentPane.add(view4Manag, new GridBagConstraints(1, 0, 10, 18, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 1), 0, 0));
		
		contentPane.add(view4Create, new GridBagConstraints(1, 0, 10, 18, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 1), 0, 0));
		
			//===== Eventos ====
		
			newPanelAcesso.getAccessButton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                    
					if(view1.isVisible()){
						newPanelLogin.getUserField().setText(null);
						newPanelLogin.getPassField().setText(null);
						view2.setVisible(true);
						view1.setVisible(false);
						view3.setVisible(false);
						view4Manag.setVisible(false);
						view4Create.setVisible(false);
						validate();
					}
				}
			});
			//ACEPTA
			newPanelLogin.getAcceptIdButton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean isCorrect = false;
					isCorrect = newControladorLogin.acceptSession(newPanelLogin.getUserField().getText(), String.valueOf(newPanelLogin.getPassField().getPassword()), newPanelLogin.getIsSavedCheckBox().isSelected());
					if(view2.isVisible() && isCorrect){
						view3.setVisible(true);
						view1.setVisible(false);
						view2.setVisible(false);
						view4Manag.setVisible(false);
						view4Create.setVisible(false);
						validate();
					}
				}
			});
		
			newPanelTablas.getManagTableButton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                    
					if(view3.isVisible()){
						view4Manag.setVisible(true);
						view1.setVisible(false);
						view2.setVisible(false);
						view3.setVisible(false);
						view4Create.setVisible(false);
						validate();
					}
				}
			});
			
			newPanelTablas.getCreateTableButton().addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent e) {
	                    
					if(view3.isVisible()){
						view4Create.setVisible(true);
						view1.setVisible(false);
						view2.setVisible(false);
						view3.setVisible(false);
						view4Manag.setVisible(false);
						validate();
		             }
		           }
			});
			//CANCELA
			newPanelLogin.getReturnAccessButton().addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent e) {
		                    
					if(view2.isVisible()){
						view1.setVisible(true);
						view2.setVisible(false);
						view3.setVisible(false);
						view4Manag.setVisible(false);
						view4Create.setVisible(false);
						validate();
		             }
		           }
			});
			
			newPanelLogin.getModifyLabel().addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent e) {
		        	newControladorLogin.modifyPass(newPanelLogin.getUserField().getText(), String.valueOf(newPanelLogin.getPassField().getPassword()));
		         }
		     });
			
			newPanelTablas.getReturnLoginButton().addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent e) {
	                    
					if(view3.isVisible()){
						view2.setVisible(true);
						view1.setVisible(false);
						view3.setVisible(false);
						view4Manag.setVisible(false);
						view4Create.setVisible(false);
						validate();
		             }
		           }
			});
			
			newPanelGestionTablas.getReturnManagTablesButton().addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent e) {
	                    
					if(view4Manag.isVisible()){
						view3.setVisible(true);
						view1.setVisible(false);
						view2.setVisible(false);
						view4Manag.setVisible(false);
						view4Create.setVisible(false);
						validate();
		             }
		           }
			});
			
			newPanelCreacionTablas.getReturnManagTablesButton2().addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent e) {
	                    
					if(view4Create.isVisible()){
						view3.setVisible(true);
						view1.setVisible(false);
						view2.setVisible(false);
						view4Manag.setVisible(false);
						view4Create.setVisible(false);
						validate();
		             }
		           }
			});
	}
}
