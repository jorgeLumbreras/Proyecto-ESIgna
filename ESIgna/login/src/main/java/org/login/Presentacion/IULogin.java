package org.login.Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.crearUsuarios.Dominio.Usuario;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IULogin extends JFrame {

	private JPanel contentPane;
	private JLabel lblLogin;
	private JButton btnNewButton;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNombre;
	private JLabel lblPassword;
	private JLabel lbljaimeAdmin;
	private JLabel lblError;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IULogin frame = new IULogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public IULogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		{
			lblLogin = new JLabel("Login");
			lblLogin.setFont(new Font("Tahoma", Font.BOLD, 26));
			GridBagConstraints gbc_lblLogin = new GridBagConstraints();
			gbc_lblLogin.gridwidth = 2;
			gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
			gbc_lblLogin.gridx = 1;
			gbc_lblLogin.gridy = 1;
			contentPane.add(lblLogin, gbc_lblLogin);
		}
		{
			lbljaimeAdmin = new JLabel("(jaime -> admin;   paco -> alumno)");
			lbljaimeAdmin.setForeground(Color.BLUE);
			GridBagConstraints gbc_lbljaimeAdmin = new GridBagConstraints();
			gbc_lbljaimeAdmin.insets = new Insets(0, 0, 5, 5);
			gbc_lbljaimeAdmin.gridx = 2;
			gbc_lbljaimeAdmin.gridy = 3;
			contentPane.add(lbljaimeAdmin, gbc_lbljaimeAdmin);
		}
		{
			lblNombre = new JLabel("Nombre:");
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.anchor = GridBagConstraints.WEST;
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 4;
			contentPane.add(lblNombre, gbc_lblNombre);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 2;
			gbc_textField.gridy = 4;
			contentPane.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			lblPassword = new JLabel("Password:");
			GridBagConstraints gbc_lblPassword = new GridBagConstraints();
			gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
			gbc_lblPassword.anchor = GridBagConstraints.WEST;
			gbc_lblPassword.gridx = 1;
			gbc_lblPassword.gridy = 5;
			contentPane.add(lblPassword, gbc_lblPassword);
		}
		{
			passwordField = new JPasswordField();
			GridBagConstraints gbc_passwordField = new GridBagConstraints();
			gbc_passwordField.insets = new Insets(0, 0, 5, 5);
			gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
			gbc_passwordField.gridx = 2;
			gbc_passwordField.gridy = 5;
			contentPane.add(passwordField, gbc_passwordField);
		}
		{
			btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(textField.getText().equals("jaime")){
						IUAdmin window=new IUAdmin();
						window.setVisible(true);
						dispose();
					}else if(textField.getText().equals("paco")){
						IUUser window=new IUUser();
						window.setVisible(true);
						dispose();
					}else{
						lblError.setText("Introduce como usuario a jaime o paco");
					}
						
					
				}
			});
			{
				lblError = new JLabel("");
				lblError.setForeground(Color.RED);
				GridBagConstraints gbc_lblError = new GridBagConstraints();
				gbc_lblError.insets = new Insets(0, 0, 5, 5);
				gbc_lblError.gridx = 2;
				gbc_lblError.gridy = 6;
				contentPane.add(lblError, gbc_lblError);
			}
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton.gridx = 2;
			gbc_btnNewButton.gridy = 7;
			contentPane.add(btnNewButton, gbc_btnNewButton);
		}
	}

}
