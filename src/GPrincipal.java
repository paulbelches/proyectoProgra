import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class GPrincipal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				//try {
				//GPrincipal window = new GPrincipal();
					//window.frame.setVisible(true);
				//} catch (Exception e) {
					//e.printStackTrace();
				//}
			//}
	//	});
	//}

	/**
	 * Create the application.
	 */
	public GPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 571, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 535, 313);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Administrador", null, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 530, 285);
		panel.add(tabbedPane_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Crear", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombre.setBounds(225, 30, 70, 14);
		panel_2.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(10, 55, 505, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblDeporte = new JLabel("Deporte");
		lblDeporte.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDeporte.setBounds(83, 86, 70, 14);
		panel_2.add(lblDeporte);
		
		JLabel lblSemestre = new JLabel("Semestre");
		lblSemestre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSemestre.setBounds(373, 86, 86, 14);
		panel_2.add(lblSemestre);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(56, 111, 121, 20);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(352, 111, 121, 20);
		panel_2.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 163, 505, 41);
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Editar", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 525, 257);
		panel_3.add(tabbedPane_3);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_3.addTab("Modificar Jugador", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEquipo.setBounds(10, 26, 70, 23);
		panel_6.add(lblEquipo);
		
		JLabel lblJugador = new JLabel("Jugador");
		lblJugador.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblJugador.setBounds(10, 60, 80, 23);
		panel_6.add(lblJugador);
		
		JLabel lblModificar = new JLabel("Modificar");
		lblModificar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblModificar.setBounds(10, 94, 84, 23);
		panel_6.add(lblModificar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAceptar.setBounds(10, 128, 500, 45);
		panel_6.add(btnAceptar);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(110, 30, 400, 20);
		panel_6.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(110, 64, 400, 20);
		panel_6.add(comboBox_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(110, 98, 400, 20);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_3.addTab("Estadisticas", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblEquipo_1 = new JLabel("Equipo 1");
		lblEquipo_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEquipo_1.setBounds(62, 11, 83, 22);
		panel_7.add(lblEquipo_1);
		
		JLabel lblEquipo_2 = new JLabel("Equipo 2");
		lblEquipo_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEquipo_2.setBounds(363, 9, 83, 27);
		panel_7.add(lblEquipo_2);
		
		JLabel lblVs = new JLabel("VS");
		lblVs.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVs.setBounds(231, 15, 36, 14);
		panel_7.add(lblVs);
		
		textField_5 = new JTextField();
		textField_5.setBounds(33, 50, 176, 20);
		panel_7.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(294, 50, 176, 20);
		panel_7.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(33, 81, 176, 20);
		panel_7.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(33, 112, 176, 20);
		panel_7.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(33, 143, 176, 20);
		panel_7.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(294, 81, 176, 20);
		panel_7.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(294, 112, 176, 20);
		panel_7.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(294, 143, 176, 20);
		panel_7.add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("ACEPTAR");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBounds(32, 174, 438, 44);
		panel_7.add(btnNewButton_4);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_3.addTab("Modificar Partido", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel lblEnfrentamiento = new JLabel("Enfrentamiento");
		lblEnfrentamiento.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnfrentamiento.setBounds(186, 25, 142, 22);
		panel_8.add(lblEnfrentamiento);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(10, 58, 500, 20);
		panel_8.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(10, 105, 222, 20);
		panel_8.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(288, 105, 222, 20);
		panel_8.add(comboBox_8);
		
		JButton btnAceptar_1 = new JButton("ACEPTAR");
		btnAceptar_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAceptar_1.setBounds(10, 155, 500, 45);
		panel_8.add(btnAceptar_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Estudiante", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 530, 285);
		panel_1.add(tabbedPane_2);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_2.addTab("Ver", null, panel_4, null);
		panel_4.setLayout(null);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(10, 11, 505, 20);
		panel_4.add(comboBox_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 42, 505, 103);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Estadisticas");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(10, 156, 505, 23);
		panel_4.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 190, 505, 20);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(10, 223, 505, 23);
		panel_4.add(btnNewButton_2);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_2.addTab("Crear", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblDeporte_1 = new JLabel("Deporte");
		lblDeporte_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDeporte_1.setBounds(10, 41, 93, 20);
		panel_5.add(lblDeporte_1);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNombre_1.setBounds(10, 96, 81, 14);
		panel_5.add(lblNombre_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(101, 96, 414, 20);
		panel_5.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(101, 44, 414, 20);
		panel_5.add(comboBox_3);
		
		JButton btnNewButton_3 = new JButton("Crear");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(10, 149, 505, 34);
		panel_5.add(btnNewButton_3);
	}

	
	
}

