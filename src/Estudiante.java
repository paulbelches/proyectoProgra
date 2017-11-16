import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Estudiante extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Estudiante() {
		setTitle("Estudiante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 535, 313);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		tabbedPane.addTab("Crear", null, panel_1, null);
		
		JLabel label_3 = new JLabel("Deporte");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(10, 41, 93, 20);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Nombre");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(10, 96, 81, 14);
		panel_1.add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(101, 96, 414, 20);
		panel_1.add(textField_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(101, 44, 414, 20);
		panel_1.add(comboBox_2);
		
		JButton button_1 = new JButton("Crear");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(10, 149, 505, 34);
		panel_1.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane.addTab("Ver", null, panel_2, null);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(10, 11, 505, 20);
		panel_2.add(comboBox_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 42, 505, 103);
		panel_2.add(textField_2);
		
		JButton button_2 = new JButton("Estadisticas");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_2.setBounds(10, 156, 505, 23);
		panel_2.add(button_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 190, 505, 20);
		panel_2.add(textField_3);
		
		JButton button_3 = new JButton("New button");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_3.setBounds(10, 223, 505, 23);
		panel_2.add(button_3);
	}
}