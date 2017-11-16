import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.Label;

public class Administrador extends JFrame {

	private JPanel contentPane;
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
	private JButton btnCrear;
	private Admin controlador;
	private JComboBox<String> cmbxDeporte;
	private MiListener listener;
	private JComboBox<String> cmbxDep;
	private JComboBox<String> cmbxTor;
	private JComboBox<String> cmbxEqui;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JButton btnCrearUsuario;
	private JButton btnCEquipo;
	private JComboBox<String> comboBox_1;
	private JComboBox<String>  comboBox_7;
	private JTextPane textPane;
	private JComboBox<String> cmbxUsu1;
	private db db;
	/**
	 * Create the frame.
	 */
	public Administrador() {
		db = new db();
		/*
		String[] s = {"Futbol", "Basketball", "Volleyball"};
		controlador = new Admin(s);
		db.guardarD(controlador.getDeportes());
		db.guardarU(controlador.getUsuarios());
		*/
		//
		controlador = new Admin(db.cargarD(),db.cargarU());
		
		/*
		controlador.getUsuarios().add(new Usuario(new Jugador("yo","j",1,"Arte","yo@","2"),"ya",false));
		controlador.getUsuarios().add(new Usuario(new Jugador("yoa","ja",1,"Arte","yoa@","2a"),"ya",false));
		*/
		listener = new MiListener();
		
		setTitle("Administrador");
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
		tabbedPane.addTab("Editar", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 530, 285);
		panel_1.add(tabbedPane_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		tabbedPane_1.addTab("Modificar Jugador", null, panel_2, null);
		
		JLabel label_3 = new JLabel("Equipo");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(10, 26, 70, 23);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Jugador");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_4.setBounds(10, 60, 80, 23);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("Modificar");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(10, 94, 84, 23);
		panel_2.add(label_5);
		
		JButton button_1 = new JButton("Aceptar");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(10, 128, 500, 45);
		panel_2.add(button_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(110, 30, 400, 20);
		panel_2.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(110, 64, 400, 20);
		panel_2.add(comboBox_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 98, 400, 20);
		panel_2.add(textField_1);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_5, null);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{262, 262, 0};
		gbl_panel_5.rowHeights = new int[]{51, 51, 51, 51, 51, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		cmbxTor = new JComboBox();
		cmbxTor.addActionListener(listener);
		
		cmbxDep = new JComboBox();
		cmbxDep.addActionListener(listener);
		cmbxDep.setModel(new DefaultComboBoxModel(new String[] {"Seleccione el deporte"}));
		GridBagConstraints gbc_cmbxDep = new GridBagConstraints();
		gbc_cmbxDep.fill = GridBagConstraints.BOTH;
		gbc_cmbxDep.insets = new Insets(0, 0, 5, 5);
		gbc_cmbxDep.gridx = 0;
		gbc_cmbxDep.gridy = 0;
		panel_5.add(cmbxDep, gbc_cmbxDep);
		cmbxTor.setModel(new DefaultComboBoxModel(new String[] {"Seleccione el torneo"}));
		GridBagConstraints gbc_cmbxTor = new GridBagConstraints();
		gbc_cmbxTor.fill = GridBagConstraints.BOTH;
		gbc_cmbxTor.insets = new Insets(0, 0, 5, 0);
		gbc_cmbxTor.gridx = 1;
		gbc_cmbxTor.gridy = 0;
		panel_5.add(cmbxTor, gbc_cmbxTor);
		
		textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.gridheight = 3;
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.insets = new Insets(0, 0, 5, 5);
		gbc_textPane.gridx = 0;
		gbc_textPane.gridy = 1;
		panel_5.add(textPane, gbc_textPane);
		
		cmbxEqui = new JComboBox();
		cmbxEqui.setModel(new DefaultComboBoxModel(new String[] {"Seleccione el equipo"}));
		GridBagConstraints gbc_cmbxEqui = new GridBagConstraints();
		gbc_cmbxEqui.fill = GridBagConstraints.BOTH;
		gbc_cmbxEqui.insets = new Insets(0, 0, 5, 0);
		gbc_cmbxEqui.gridx = 1;
		gbc_cmbxEqui.gridy = 1;
		panel_5.add(cmbxEqui, gbc_cmbxEqui);
		
		cmbxUsu1= new JComboBox();
		GridBagConstraints gbc_cmbxUsu1 = new GridBagConstraints();
		gbc_cmbxUsu1.fill = GridBagConstraints.BOTH;
		gbc_cmbxUsu1.insets = new Insets(0, 0, 5, 0);
		gbc_cmbxUsu1.gridx = 1;
		gbc_cmbxUsu1.gridy = 2;
		panel_5.add(cmbxUsu1, gbc_cmbxUsu1);
		
		JButton btnBorrar = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.fill = GridBagConstraints.BOTH;
		gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnBorrar.gridx = 0;
		gbc_btnBorrar.gridy = 4;
		panel_5.add(btnBorrar, gbc_btnBorrar);
		
		JButton btnAgregar = new JButton("Agregar");
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.fill = GridBagConstraints.BOTH;
		gbc_btnAgregar.gridx = 1;
		gbc_btnAgregar.gridy = 4;
		panel_5.add(btnAgregar, gbc_btnAgregar);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane_1.addTab("Modificar Partido", null, panel_4, null);
		
		JLabel label_9 = new JLabel("Enfrentamiento");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(186, 25, 142, 22);
		panel_4.add(label_9);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(10, 58, 500, 20);
		panel_4.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(10, 105, 222, 20);
		panel_4.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(288, 105, 222, 20);
		panel_4.add(comboBox_6);
		
		JButton button_3 = new JButton("ACEPTAR");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_3.setBounds(10, 155, 500, 45);
		panel_4.add(button_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		tabbedPane_1.addTab("Estadisticas", null, panel_3, null);
		
		JLabel label_6 = new JLabel("Equipo 1");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setBounds(62, 11, 83, 22);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("Equipo 2");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_7.setBounds(363, 9, 83, 27);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("VS");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_8.setBounds(231, 15, 36, 14);
		panel_3.add(label_8);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(33, 50, 176, 20);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(294, 50, 176, 20);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(33, 81, 176, 20);
		panel_3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(33, 112, 176, 20);
		panel_3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(33, 143, 176, 20);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(294, 81, 176, 20);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(294, 112, 176, 20);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(294, 143, 176, 20);
		panel_3.add(textField_9);
		
		JButton button_2 = new JButton("ACEPTAR");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_2.setBounds(32, 174, 438, 44);
		panel_3.add(button_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		tabbedPane.addTab("Crear", null, panel, null);
		
		JLabel label = new JLabel("Nombre");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(225, 30, 70, 14);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 55, 505, 20);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("Deporte");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(225, 86, 70, 14);
		panel.add(label_1);
		
		cmbxDeporte = new JComboBox<String>();
		cmbxDeporte.setBounds(194, 111, 121, 20);
		panel.add(cmbxDeporte);
		for (int i = 0; i < controlador.getDeportes().size();i++) {
			cmbxDeporte.addItem(controlador.getDeportes().get(i).getTipo());
		}
		
		btnCrear = new JButton("Crear");
		btnCrear.addActionListener(listener);
		btnCrear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCrear.setBounds(10, 163, 505, 41);
		panel.add(btnCrear);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_6, null);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Nombre\r\n");
		panel_6.add(lblNewLabel);
		
		textField_10 = new JTextField();
		panel_6.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		panel_6.add(lblNewLabel_1);
		
		textField_11 = new JTextField();
		panel_6.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Carne");
		panel_6.add(lblNewLabel_2);
		
		textField_12 = new JTextField();
		panel_6.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Carrera");
		panel_6.add(lblNewLabel_3);
		
		textField_13 = new JTextField();
		panel_6.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		panel_6.add(lblNewLabel_4);
		
		textField_14 = new JTextField();
		panel_6.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono");
		panel_6.add(lblNewLabel_5);
		
		textField_15 = new JTextField();
		panel_6.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Constrase\u00F1a");
		panel_6.add(lblNewLabel_6);
		
		textField_16 = new JTextField();
		panel_6.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		panel_6.add(label_2);
		
		btnCrearUsuario = new JButton("Crear Usuario\r\n");
		btnCrearUsuario.addActionListener(listener);
		panel_6.add(btnCrearUsuario);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_7, null);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{265, 265, 0};
		gbl_panel_7.rowHeights = new int[]{71, 71, 71, 71, 0};
		gbl_panel_7.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(listener);
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.fill = GridBagConstraints.BOTH;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridx = 0;
		gbc_comboBox_1.gridy = 0;
		panel_7.add(comboBox_1, gbc_comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Seleccione el deporte"}));
		for (int i = 0; i < controlador.getDeportes().size(); i++) {
			comboBox_1.addItem(controlador.getDeportes().get(i).getTipo());
		}
		
		comboBox_7 = new JComboBox();
		comboBox_7.addActionListener(listener);
		GridBagConstraints gbc_comboBox_7 = new GridBagConstraints();
		gbc_comboBox_7.fill = GridBagConstraints.BOTH;
		gbc_comboBox_7.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_7.gridx = 1;
		gbc_comboBox_7.gridy = 0;
		panel_7.add(comboBox_7, gbc_comboBox_7);
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Seleccione el torneo"}));
		
		JLabel lblNewLabel_7 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 1;
		panel_7.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_17 = new JTextField();
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.fill = GridBagConstraints.BOTH;
		gbc_textField_17.insets = new Insets(0, 0, 5, 0);
		gbc_textField_17.gridx = 1;
		gbc_textField_17.gridy = 1;
		panel_7.add(textField_17, gbc_textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Descripci\u00F3n");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 2;
		panel_7.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_18 = new JTextField();
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.gridheight = 2;
		gbc_textField_18.fill = GridBagConstraints.BOTH;
		gbc_textField_18.insets = new Insets(0, 0, 5, 0);
		gbc_textField_18.gridx = 1;
		gbc_textField_18.gridy = 2;
		panel_7.add(textField_18, gbc_textField_18);
		textField_18.setColumns(10);
		
		btnCEquipo = new JButton("Crear equipo\r\n");
		btnCEquipo.addActionListener(listener);
		GridBagConstraints gbc_btnCEquipo = new GridBagConstraints();
		gbc_btnCEquipo.fill = GridBagConstraints.BOTH;
		gbc_btnCEquipo.insets = new Insets(0, 0, 0, 5);
		gbc_btnCEquipo.gridx = 0;
		gbc_btnCEquipo.gridy = 3;
		panel_7.add(btnCEquipo, gbc_btnCEquipo);
		for (int i = 0; i < controlador.getDeportes().size();i++) {
			cmbxDep.addItem(controlador.getDeportes().get(i).getTipo());
		}
	}
	public class MiListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (arg0.getSource() == btnCrearUsuario) {
				controlador.getUsuarios().add(new Usuario(new Jugador(textField_10.getText(),textField_11.getText(),Integer.parseInt(textField_12.getText()),textField_13.getText()
						, textField_14.getText(),textField_15.getText()),textField_16.getText(),false));
				db.guardarU(controlador.getUsuarios());
			}
			
			if (arg0.getSource() == btnCrear) {
				for (int i = 0; i<controlador.getDeportes().size(); i++) {
					if (cmbxDeporte.getSelectedItem().equals(controlador.getDeportes().get(i).getTipo())) {
						controlador.getDeportes().get(i).agregarTorneo(new Torneo(textField.getText()));
					}
				}
				db.guardarD(controlador.getDeportes());
			}
			if (arg0.getSource() == btnCEquipo) {
				for (int i = 0; i< controlador.getDeportes().size();i++) {
					if (comboBox_1.getSelectedItem().equals(controlador.getDeportes().get(i).getTipo())){
						for (int j = 0; j< controlador.getDeportes().get(i).getTorneo().size(); j++) {
							if (comboBox_7.getSelectedItem().equals(controlador.getDeportes().get(i).getTorneo().get(j).getNombre())){
								controlador.getDeportes().get(i).getTorneo().get(j).agregarE(new Equipo(null,textField_17.getText(),textField_18.getText()));
							}
						}
					}
				}
				db.guardarD(controlador.getDeportes());
			}
			if (arg0.getSource() == cmbxDep) {
				for (int j = 1; j<cmbxTor.getItemCount(); j++) {
					cmbxTor.removeItemAt(j);
				}
				for (int i = 0; i<controlador.getDeportes().size(); i++) {
					if (cmbxDep.getSelectedItem().equals(controlador.getDeportes().get(i).getTipo())) {
						for (int f =0; f < controlador.getDeportes().get(i).getTorneo().size(); f++) {
							cmbxTor.addItem(controlador.getDeportes().get(i).getTorneo().get(f).getNombre());
						}
					}
				}
			}
			if (arg0.getSource() == comboBox_1) {
				for (int j = 1; j<comboBox_7.getItemCount(); j++) {
					comboBox_7.removeItemAt(j);
				}
				for (int i = 0; i<controlador.getDeportes().size(); i++) {
					if (comboBox_1.getSelectedItem().equals(controlador.getDeportes().get(i).getTipo())) {
						for (int f =0; f < controlador.getDeportes().get(i).getTorneo().size(); f++) {
							comboBox_7.addItem(controlador.getDeportes().get(i).getTorneo().get(f).getNombre());
						}
					}
				}
			}
			if (arg0.getSource() == cmbxTor) {
				for (int j = 1; j<cmbxEqui.getItemCount(); j++) {
					cmbxEqui.removeItemAt(j);
					}
				for (int i = 0; i<controlador.getDeportes().size(); i++) {
					if (cmbxDep.getSelectedItem().equals(controlador.getDeportes().get(i).getTipo())) {
						for (int f =0; f < controlador.getDeportes().get(i).getTorneo().size(); f++) {
							if (cmbxTor.getSelectedItem().equals(controlador.getDeportes().get(i).getTorneo().get(f).getNombre()))
								for (int e = 0; e<controlador.getDeportes().get(i).getTorneo().get(f).getEquipo().size(); e++) {
									cmbxEqui.addItem(controlador.getDeportes().get(i).getTorneo().get(f).getEquipo().get(e).getNombre());
									}
						}
					}
				}
				
			}
		}
		
	}
}

