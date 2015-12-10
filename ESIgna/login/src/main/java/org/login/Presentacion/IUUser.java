package org.login.Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.matricularse.Presentacion.IUmatriculas;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IUUser extends JFrame {

	private JPanel contentPane;
	private JButton btnCerrarSesin;
	private JLabel lblAlumno;
	private JButton btnMatricular;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IUUser frame = new IUUser();
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
	public IUUser() {
		setTitle("Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		{
			btnCerrarSesin = new JButton("Cerrar Sesión");
			btnCerrarSesin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					IULogin window = new IULogin();
					window.setVisible(true);
					dispose();
				}
			});
			GridBagConstraints gbc_btnCerrarSesin = new GridBagConstraints();
			gbc_btnCerrarSesin.anchor = GridBagConstraints.EAST;
			gbc_btnCerrarSesin.gridwidth = 2;
			gbc_btnCerrarSesin.insets = new Insets(0, 0, 5, 0);
			gbc_btnCerrarSesin.gridx = 1;
			gbc_btnCerrarSesin.gridy = 0;
			contentPane.add(btnCerrarSesin, gbc_btnCerrarSesin);
		}
		{
			lblAlumno = new JLabel("Alumno");
			lblAlumno.setFont(new Font("Tahoma", Font.BOLD, 28));
			GridBagConstraints gbc_lblAlumno = new GridBagConstraints();
			gbc_lblAlumno.insets = new Insets(0, 0, 5, 5);
			gbc_lblAlumno.gridx = 1;
			gbc_lblAlumno.gridy = 2;
			contentPane.add(lblAlumno, gbc_lblAlumno);
		}
		{
			btnMatricular = new JButton("Matricular");
			btnMatricular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					IUmatriculas window = new IUmatriculas();
					window.setVisible(true);
				}
			});
			GridBagConstraints gbc_btnMatricular = new GridBagConstraints();
			gbc_btnMatricular.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnMatricular.insets = new Insets(0, 0, 5, 5);
			gbc_btnMatricular.gridx = 1;
			gbc_btnMatricular.gridy = 4;
			contentPane.add(btnMatricular, gbc_btnMatricular);
		}
	}

}
