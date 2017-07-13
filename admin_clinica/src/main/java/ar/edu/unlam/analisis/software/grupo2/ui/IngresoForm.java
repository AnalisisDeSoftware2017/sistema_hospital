package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

@org.springframework.stereotype.Component
public class IngresoForm extends AbstractPantalla {

	private JPanel contentPane;
	private JButton btnAbmUsuarios;
	private JButton btnABMPaciente;
	private JButton btnABMMedico;
	private JButton anterior;
    private JButton btnAbmSituacionPaciente;
    private JButton btnAbmEnfermedades;
    /**
	 * Create the frame.
	 */
    @Autowired
	public IngresoForm(MessageSource messageSource) {
		super(messageSource);
        contentPane = this.setPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAbms = new JLabel();
        lblAbms.setBounds(215, 25, 834, 51);
        lblAbms.setText(getMessage("ui.IngresoForm.text.administracion", null, AppContext.getLocale()));
		lblAbms.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbms.setFont(new Font("Cambria", Font.PLAIN, 18));
		contentPane.add(lblAbms);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setBounds(0, 0, 434, 256);
		contentPane.add(jLabel1);
		
		JMenuBar jMenuBar1 = new JMenuBar();
		jMenuBar1.setBounds(0, 0, 130, 21);
		contentPane.add(jMenuBar1);
		
		JMenu jMenu2 = new JMenu();
		jMenu2.setToolTipText("");
		jMenu2.setText(getMessage("ui.IngresoForm.text.ayuda", null, AppContext.getLocale()));
		jMenuBar1.add(jMenu2);
		
		JMenuItem jMenuItem2 = new JMenuItem();
		jMenuItem2.setToolTipText(getMessage("ui.IngresoForm.guia", null, AppContext.getLocale()));
		jMenuItem2.setText(getMessage("ui.IngresoForm.text.manual", null, AppContext.getLocale()));
		jMenu2.add(jMenuItem2);
		
		JMenu jMenu3 = new JMenu();
		jMenu3.setText(getMessage("ui.IngresoForm.text.irA", null, AppContext.getLocale()));
		jMenuBar1.add(jMenu3);
		
		JMenuItem mINI = new JMenuItem();
		mINI.setText(getMessage("ui.IngresoForm.menuInicio", null, AppContext.getLocale()));
		 mINI.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                mINIActionPerformed(evt);
	            }
	        });
	        jMenu3.add(mINI);
		jMenu3.add(mINI);

		//TODO addAll this to controller
		JMenuItem mIngDat = new JMenuItem();
		mIngDat.setText(getMessage("ui.IngresoForm.ingresoDatos", null, AppContext.getLocale()));
		/* mIngDat.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                mIngDatActionPerformed(evt);
	            }
	        });*/
		jMenu3.add(mIngDat);
		
		JMenu opciones = new JMenu();
		opciones.setText(getMessage("ui.IngresoForm.text.opciones", null, AppContext.getLocale()));
		jMenuBar1.add(opciones);
		
		JMenuItem Salir = new JMenuItem();
		Salir.setText(getMessage("ui.IngresoForm.salirPrograma", null, AppContext.getLocale()));
		 Salir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                SalirActionPerformed(evt);
	            }
	        });
		opciones.add(Salir);

		//TODO addAll this to a controller
		JMenuItem cerrarSesion = new JMenuItem();
		cerrarSesion.setText(getMessage("ui.IngresoForm.cerrarSesion", null, AppContext.getLocale()));
	/*	cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });*/
		opciones.add(cerrarSesion);
		
		
		this.btnAbmUsuarios= new JButton(getMessage("ui.IngresoForm.text.ABMusuarios", null, AppContext.getLocale()));
		btnAbmUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAbmUsuarios.setBounds(215, 386, 777, 32);
		contentPane.add(btnAbmUsuarios);
		
		btnABMPaciente = new JButton();
		btnABMPaciente.setText(getMessage("ui.IngresoForm.text.ABMpacientes", null, AppContext.getLocale()));
		btnABMPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnABMPaciente.setBounds(215, 305, 777, 35);
		contentPane.add(btnABMPaciente);
		
		btnABMMedico = new JButton();
		btnABMMedico.setText(getMessage("ui.IngresoForm.text.ABMmedicos", null, AppContext.getLocale()));
		btnABMMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnABMMedico.setBounds(215, 219, 777, 36);
		contentPane.add(btnABMMedico);
		
		btnAbmEnfermedades = new JButton();
        btnAbmEnfermedades.setText(getMessage("ui.IngresoForm.text.ABMespecialidades", null, AppContext.getLocale()));
        btnAbmEnfermedades.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAbmEnfermedades.setBounds(215, 146, 777, 36);
		contentPane.add(btnAbmEnfermedades);

        btnAbmSituacionPaciente = new JButton();
        btnAbmSituacionPaciente.setText(getMessage("ui.IngresoForm.text.ABMsituacionPaciente", null, AppContext.getLocale()));
        btnAbmSituacionPaciente.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnAbmSituacionPaciente.setBounds(215, 468, 777, 40);
        contentPane.add(btnAbmSituacionPaciente);

        anterior = new JButton();
        anterior.setText(getMessage("ui.IngresoForm.text.anterior", null, AppContext.getLocale()));
        anterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
        anterior.setBounds(215, 520, 777, 40);
        contentPane.add(anterior);

	}

    @Override
    public void setTexto() {

    }


    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
        ManualForm guiaRapida=new ManualForm();
        guiaRapida.setVisible(true);
        setTitle("Manual de Ayuda");
    }

    private void mINIActionPerformed(java.awt.event.ActionEvent evt) {
      /*  MainForm menu=new MainForm();
        menu.setVisible(true); // Vuelve el menu principal
        dispose(); // Desaparece el informes.  */
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
    }*

    /*private void mIngDatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
        //IngresoPacientesW ipw=new IngresoPacientesW();
        //ipw.setVisible(true); // Hago visible la ventana de pacientes.    
        dispose(); // Para que se oculte el menu.
    }*/


    public JButton getBtnABMSituacionPaciente() {
        return this.btnAbmSituacionPaciente;
    }
    
	public JButton getBtnABMPaciente(){
		return this.btnABMPaciente;
	}
	public JButton getBtnABMMedico(){
		return btnABMMedico;
	}
	public JButton getBtnAbmEnfermedades(){return this.btnAbmEnfermedades;}
	public JButton getAnterior(){
		return this.anterior;
	}
    public JButton getBtnAbmUsuarios() {
        return this.btnAbmUsuarios;
    }
}
