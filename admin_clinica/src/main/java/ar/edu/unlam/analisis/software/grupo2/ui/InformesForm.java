package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

@Component
public class InformesForm extends AbstractPantalla {

	private JPanel contentPane;
    private JButton btnMedico;
    private JButton btnPaciente;
    private JButton anterior;
	/**
	 * Create the frame.
	 */
	@Autowired
	public InformesForm(MessageSource messageSource) {
		super(messageSource);
        contentPane = setPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel();
		label.setBounds(444, 67, 424, 68);
		label.setText(getMessage("ui.InformesForm.text.busquedas", null, AppContext.getLocale()));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Cambria", Font.PLAIN, 40));
		contentPane.add(label);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setBounds(0, 0, 434, 256);
		contentPane.add(jLabel1);
		
		JMenuBar jMenuBar1 = new JMenuBar();
		jMenuBar1.setBounds(0, 0, 130, 21);
		contentPane.add(jMenuBar1);
		
		JMenu jMenu2 = new JMenu();
		jMenu2.setToolTipText("");
		jMenu2.setText(getMessage("ui.InformesForm.text.ayuda", null, AppContext.getLocale()));
		jMenuBar1.add(jMenu2);
		
		JMenuItem jMenuItem2 = new JMenuItem();
		jMenuItem2.setToolTipText(getMessage("ui.InformesForm.guia", null, AppContext.getLocale()));
		jMenuItem2.setText(getMessage("ui.InformesForm.text.manual", null, AppContext.getLocale()));
		jMenu2.add(jMenuItem2);
		
		JMenu jMenu3 = new JMenu();
		jMenu3.setText(getMessage("ui.InformesForm.text.irA", null, AppContext.getLocale()));
		jMenuBar1.add(jMenu3);
		
		JMenuItem mINI = new JMenuItem();
		mINI.setText(getMessage("ui.InformesForm.menuInicio", null, AppContext.getLocale()));
		 mINI.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                mINIActionPerformed(evt);
	            }
	        });
	        jMenu3.add(mINI);
		jMenu3.add(mINI);

		//TODO addAll this to controller
		JMenuItem mIngDat = new JMenuItem();
		mIngDat.setText(getMessage("ui.InformesForm.ingresoDatos", null, AppContext.getLocale()));
		/* mIngDat.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                mIngDatActionPerformed(evt);
	            }
	        });*/
		jMenu3.add(mIngDat);
		
		JMenu opciones = new JMenu();
		opciones.setText(getMessage("ui.InformesForm.text.opciones", null, AppContext.getLocale()));
		jMenuBar1.add(opciones);
		
		JMenuItem Salir = new JMenuItem();
		Salir.setText(getMessage("ui.InformesForm.salirPrograma", null, AppContext.getLocale()));
		 Salir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                SalirActionPerformed(evt);
	            }
	        });
		opciones.add(Salir);

		//TODO addAll this to a controller
		JMenuItem cerrarSesion = new JMenuItem();
		cerrarSesion.setText(getMessage("ui.InformesForm.cerrarSesion", null, AppContext.getLocale()));
	/*	cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });*/
		opciones.add(cerrarSesion);
		
				
				anterior = new JButton();
				anterior.setBounds(564, 466, 162, 40);
				contentPane.add(anterior);
				anterior.setText(getMessage("ui.InformesForm.text.anterior", null, AppContext.getLocale()));
				anterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
				
				        btnMedico = new JButton();
				        btnMedico.setBounds(504, 339, 289, 35);
				        contentPane.add(btnMedico);
				        btnMedico.setText(getMessage("ui.InformesForm.buscarMedico", null, AppContext.getLocale()));
				        btnMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
				        
				                btnPaciente = new JButton();
				                btnPaciente.setBounds(504, 196, 289, 36);
				                contentPane.add(btnPaciente);
				                btnPaciente.setText(getMessage("ui.InformesForm.buscarPaciente", null, AppContext.getLocale()));
				                btnPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
	}

    @Override
    public void setTexto() {

    }


    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
        //ManualW guiaRapida=new ManualW();
        //guiaRapida.setVisible(true);
        setTitle("Manual de Ayuda");
    }

    private void mINIActionPerformed(java.awt.event.ActionEvent evt) {
        /*MainForm menu=new MainForm();
        menu.setVisible(true); // Vuelve el menu proncipal
        dispose(); // Desaparece el informes.   */
    }

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
        System.exit(0); // SE SALE DEL PROGRAMA.
    }



   /* private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
        LoginForm log=new LoginForm(); // Abre el log principal del sistema.
        log.setVisible(true); // Hace visible el log.     
        dispose();//SE OCULTA
    }*///GEN-LAST:event_cerrarSesionActionPerformed

    /*private void mIngDatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
        //IngresoPacientesW ipw=new IngresoPacientesW();
        //ipw.setVisible(true); // Hago visible la ventana de pacientes.    
        dispose(); // Para que se oculte el menu.
    }*/


    public JButton getBtnMedico() {
        return this.btnMedico;
    }

    public JButton getBtnPaciente() {
        return btnPaciente;
    }

    public JButton getAnterior(){
		return this.anterior;
	}


}
