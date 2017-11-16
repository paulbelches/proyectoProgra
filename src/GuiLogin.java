import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GuiLogin extends JFrame {

	private JPanel contentPane;
	public static JTextField txtUSU;
	public static JPasswordField pssCON;
	private JButton btn1;
	private JButton btn2;
	final DatosUsuarios data=new DatosUsuarios();


	/**
	 * Create the frame.
	 */
	public GuiLogin() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 232, 137);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsuario.setBounds(10, 11, 56, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContrasea.setBounds(10, 37, 86, 14);
		contentPane.add(lblContrasea);
		
		txtUSU = new JTextField();
		txtUSU.setBounds(120, 9, 86, 20);
		contentPane.add(txtUSU);
		txtUSU.setColumns(10);
		
		pssCON = new JPasswordField();
		pssCON.setBounds(120, 35, 86, 20);
		contentPane.add(pssCON);
		
		btn1 = new JButton("INGRESAR");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn1){
					if(data.validarUsuario()==2) {
						JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
						Administrador admin=new Administrador();
						admin.setVisible(true);
					}
					else if(data.validarUsuario()==1) {
						JOptionPane.showMessageDialog(null, "Bienvenido Estudiante");
						Estudiante usu=new Estudiante();
						usu.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorectas");
					}
				}
			}
		});
		btn1.setBounds(10, 62, 89, 23);
		contentPane.add(btn1);
		
		
		 btn2 = new JButton("SALIR");
		btn2.setBounds(117, 62, 89, 23);
		contentPane.add(btn2);
		
	}
	
}
