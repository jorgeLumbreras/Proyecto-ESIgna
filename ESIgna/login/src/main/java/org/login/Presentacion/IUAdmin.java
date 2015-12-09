package org.login.Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.borrarAsignaturas.Presentacion.IUborrarAsignaturas;
import org.borrarUsuarios.Presentacion.IUborrarUsuarios;
import org.crearAsignaturas.Presentacion.IUcrearAsignaturas;
import org.crearUsuarios.Presentacion.IUcrearUsuario;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IUAdmin extends JFrame {

	private JPanel contentPane;
	private JLabel lblAdministrador;
	private JButton btnCrearUsuario;
	private JButton btnBorrarUsuario;
	private JButton btnCrearAsignatura;
	private JButton btnBorrarAsignatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IUAdmin frame = new IUAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IUAdmin() {
		setResizable(false);
		setTitle("Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		{
			lblAdministrador = new JLabel("Administrador");
			lblAdministrador.setFont(new Font("Tahoma", Font.BOLD, 28));
			GridBagConstraints gbc_lblAdministrador = new GridBagConstraints();
			gbc_lblAdministrador.gridwidth = 2;
			gbc_lblAdministrador.insets = new Insets(0, 0, 5, 5);
			gbc_lblAdministrador.gridx = 1;
			gbc_lblAdministrador.gridy = 1;
			contentPane.add(lblAdministrador, gbc_lblAdministrador);
		}
		{
			btnCrearUsuario = new JButton("Crear Usuario");
			btnCrearUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					IUcrearUsuario window = new IUcrearUsuario();
					window.setVisible(true);
				}
			});
			GridBagConstraints gbc_btnCrearUsuario = new GridBagConstraints();
			gbc_btnCrearUsuario.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnCrearUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_btnCrearUsuario.gridx = 1;
			gbc_btnCrearUsuario.gridy = 3;
			contentPane.add(btnCrearUsuario, gbc_btnCrearUsuario);
		}
		{
			btnBorrarUsuario = new JButton("Borrar Usuario");
			btnBorrarUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					IUborrarUsuarios window = new IUborrarUsuarios();
					window.setVisible(true);
				}
			});
			GridBagConstraints gbc_btnBorrarUsuario = new GridBagConstraints();
			gbc_btnBorrarUsuario.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnBorrarUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_btnBorrarUsuario.gridx = 2;
			gbc_btnBorrarUsuario.gridy = 3;
			contentPane.add(btnBorrarUsuario, gbc_btnBorrarUsuario);
		}
		{
			btnCrearAsignatura = new JButton("Crear Asignatura");
			btnCrearAsignatura.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					IUcrearAsignaturas window = new IUcrearAsignaturas();
					window.setVisible(true);
				}
			});
			GridBagConstraints gbc_btnCrearAsignatura = new GridBagConstraints();
			gbc_btnCrearAsignatura.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnCrearAsignatura.insets = new Insets(0, 0, 5, 5);
			gbc_btnCrearAsignatura.gridx = 1;
			gbc_btnCrearAsignatura.gridy = 4;
			contentPane.add(btnCrearAsignatura, gbc_btnCrearAsignatura);
		}
		{
			btnBorrarAsignatura = new JButton("Borrar Asignatura");
			btnBorrarAsignatura.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					IUborrarAsignaturas window = new IUborrarAsignaturas();
					window.setVisible(true);
				}
			});
			GridBagConstraints gbc_btnBorrarAsignatura = new GridBagConstraints();
			gbc_btnBorrarAsignatura.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnBorrarAsignatura.insets = new Insets(0, 0, 5, 5);
			gbc_btnBorrarAsignatura.gridx = 2;
			gbc_btnBorrarAsignatura.gridy = 4;
			contentPane.add(btnBorrarAsignatura, gbc_btnBorrarAsignatura);
		}
	}

}
