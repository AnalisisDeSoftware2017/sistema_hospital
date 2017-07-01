package ar.edu.unlam.analisis.software.grupo2.ui;

import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;



@Component
public class MainForm extends AbstractPantalla {

	private JPanel contentPane;
	private JButton salir;
	private JButton informes;
	private JButton ingreso;


	/**
	 * Create the frame.
	 */
	public MainForm() {
        super();
        
        contentPane = this.setPanel("/img/Hospital_Laurel.jpg");
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
		
		informes = new JButton();
		//TODO addAll internacionalizancion
		informes.setToolTipText("Click para ver enfermedades y pacientes que atienden los m\u00E9dicos.");
		informes.setText("Informes");
		informes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		informes.setBounds(412, 315, 404, 64);
		contentPane.add(informes);
		
		salir = new JButton();
		//TODO addAll internacionalizancion
		salir.setToolTipText("Click para salir del programa.");
		salir.setText("Salir");
		salir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		salir.setBounds(412, 421, 404, 64);
		contentPane.add(salir);
		
		ingreso = new JButton();
		//TODO addAll internacionalizancion
		ingreso.setToolTipText("Click para agregar informaci\u00F3n sobre m\u00E9dicos y pacientes.");
		//TODO addAll internacionalizancion
		ingreso.setText("Ingreso de Datos");
		ingreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ingreso.setBounds(412, 197, 404, 64);
		contentPane.add(ingreso);

		//TODO addAll internacionalizancion
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 45));
		lblNewLabel.setBounds(115, 102, 1105, 57);
	
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

    @Override
    public void setTexto() {
        // TODO Auto-generated method stub

    }

}
