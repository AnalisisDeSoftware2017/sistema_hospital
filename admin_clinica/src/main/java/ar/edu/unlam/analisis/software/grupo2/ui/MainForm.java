package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.context.MessageSource;
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
	public MainForm(MessageSource messageSource) {
		super(messageSource);
        
        contentPane = this.setPanel("/img/Hospital_Laurel.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 130, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu();
		menu.setToolTipText(getMessage("ui.MainForm.obtenerAyuda", null, AppContext.getLocale()));
		menu.setText(getMessage("ui.MainForm.text.ayuda", null, AppContext.getLocale()));
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem();
		menuItem.setToolTipText(getMessage("ui.MainForm.guia", null, AppContext.getLocale()));
		menuItem.setText(getMessage("ui.MainForm.text.manual", null, AppContext.getLocale()));
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu();
		menu_1.setText("Ir a");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_1 = new JMenuItem();
		menuItem_1.setText(getMessage("ui.MainForm.ingresoDatos", null, AppContext.getLocale()));
		menu_1.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem();
		menuItem_2.setText(getMessage("ui.MainForm.text.informes", null, AppContext.getLocale()));
		menu_1.add(menuItem_2);
		
		JMenu menu_2 = new JMenu();
		menu_2.setText(getMessage("ui.MainForm.text.opciones", null, AppContext.getLocale()));
		menuBar.add(menu_2);
		
		JMenuItem menuItem_3 = new JMenuItem();
		menuItem_3.setText(getMessage("ui.MainForm.salirPrograma", null, AppContext.getLocale()));
		menu_2.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem();
		menuItem_4.setText(getMessage("ui.MainForm.cerrarSesion", null, AppContext.getLocale()));
		menu_2.add(menuItem_4);
		
		informes = new JButton();
		informes.setToolTipText(getMessage("ui.MainForm.clickEnfermedadesPacientes", null, AppContext.getLocale()));
		informes.setText(getMessage("ui.MainForm.text.informes", null, AppContext.getLocale()));
		informes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		informes.setBounds(412, 315, 404, 64);
		contentPane.add(informes);
		
		salir = new JButton();
		salir.setToolTipText(getMessage("ui.MainForm.clickSalirPrograma", null, AppContext.getLocale()));
		salir.setText(getMessage("ui.MainForm.text.salir", null, AppContext.getLocale()));
		salir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		salir.setBounds(412, 421, 404, 64);
		contentPane.add(salir);
		
		ingreso = new JButton();
		ingreso.setToolTipText(getMessage("ui.MainForm.clickAgregarInformacion", null, AppContext.getLocale()));
		ingreso.setText(getMessage("ui.MainForm.ingresoDatos", null, AppContext.getLocale()));
		ingreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ingreso.setBounds(412, 197, 404, 64);
		contentPane.add(ingreso);

		JLabel lblNewLabel = new JLabel(getMessage("ui.MainForm.text.menu", null, AppContext.getLocale()));
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
