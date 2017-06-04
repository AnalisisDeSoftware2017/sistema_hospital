package ar.edu.unlam.analisis.software.grupo2.ui;

import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;



@Component
public class MainForm extends JFrame {

	private JPanel contentPane;
	private JButton salir;
	private JButton informes;
	private JButton ingreso;


	/**
	 * Create the frame.
	 */
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 130, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu();
		menu.setToolTipText("Obtenga ayuda.");
		menu.setText("Ayuda");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem();
		menuItem.setToolTipText("Vista de gu\u00EDa r\u00E1pida de uso.");
		menuItem.setText("Manual");
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu();
		menu_1.setText("Ir a");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_1 = new JMenuItem();
		menuItem_1.setText("Ingreso de Datos");
		menu_1.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem();
		menuItem_2.setText("Informes");
		menu_1.add(menuItem_2);
		
		JMenu menu_2 = new JMenu();
		menu_2.setText("Opciones");
		menuBar.add(menu_2);
		
		JMenuItem menuItem_3 = new JMenuItem();
		menuItem_3.setText("Salir del Programa");
		menu_2.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem();
		menuItem_4.setText("Cerrar Sesi\u00F3n");
		menu_2.add(menuItem_4);
		
		JLabel label = new JLabel();
		label.setBounds(0, 0, 861, 447);
		contentPane.add(label);
		
		informes = new JButton();
		//TODO add internacionalizancion
		informes.setToolTipText("Click para ver enfermedades y pacientes que atienden los m\u00E9dicos.");
		informes.setText("Informes");
		informes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		informes.setBounds(40, 270, 180, 64);
		contentPane.add(informes);
		
		salir = new JButton();
		//TODO add internacionalizancion
		salir.setToolTipText("Click para salir del programa.");
		salir.setText("Salir");
		salir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		salir.setBounds(40, 360, 180, 64);
		contentPane.add(salir);
		
		ingreso = new JButton();
		//TODO add internacionalizancion
		ingreso.setToolTipText("Click para agregar informaci\u00F3n sobre m\u00E9dicos y pacientes.");
		//TODO add internacionalizancion
		ingreso.setText("Ingreso de Datos");
		ingreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ingreso.setBounds(40, 180, 180, 64);
		contentPane.add(ingreso);

		//TODO add internacionalizancion
		JLabel lblNewLabel = new JLabel("CONTROL DE PACIENTES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 120, 550, 26);
		lblNewLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		contentPane.add(lblNewLabel);
	}

	public JButton getSalir(){
		return  salir;
	}

	public JButton getInformes(){
		return informes;
	}
	public JButton getIngreso(){
		return ingreso;
	}

}
