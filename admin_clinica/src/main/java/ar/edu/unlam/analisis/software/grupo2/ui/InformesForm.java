package ar.edu.unlam.analisis.software.grupo2.ui;

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
		label.setText("BUSQUEDAS");
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
		jMenu2.setText("Ayuda");
		jMenuBar1.add(jMenu2);
		
		JMenuItem jMenuItem2 = new JMenuItem();
		jMenuItem2.setToolTipText("Vista de gu\u00C3\u00ADa r\u00C3\u00A1pida de uso.");
		jMenuItem2.setText("Manual");
		jMenu2.add(jMenuItem2);
		
		JMenu jMenu3 = new JMenu();
		jMenu3.setText("Ir a");
		jMenuBar1.add(jMenu3);
		
		JMenuItem mINI = new JMenuItem();
		mINI.setText("Menu Inicio");
		 mINI.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                mINIActionPerformed(evt);
	            }
	        });
	        jMenu3.add(mINI);
		jMenu3.add(mINI);

		//TODO addAll this to controller
		JMenuItem mIngDat = new JMenuItem();
		mIngDat.setText("Ingreso de Datos");
		/* mIngDat.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                mIngDatActionPerformed(evt);
	            }
	        });*/
		jMenu3.add(mIngDat);
		
		JMenu opciones = new JMenu();
		opciones.setText("Opciones");
		jMenuBar1.add(opciones);
		
		JMenuItem Salir = new JMenuItem();
		Salir.setText("Salir del Programa");
		 Salir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                SalirActionPerformed(evt);
	            }
	        });
		opciones.add(Salir);

		//TODO addAll this to a controller
		JMenuItem cerrarSesion = new JMenuItem();
		cerrarSesion.setText("Cerrar Sesi\u00C3\u00B3n");
	/*	cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });*/
		opciones.add(cerrarSesion);
		
				
				anterior = new JButton();
				anterior.setBounds(564, 466, 162, 40);
				contentPane.add(anterior);
				anterior.setText("Anterior");
				anterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
				
				        btnMedico = new JButton();
				        btnMedico.setBounds(504, 339, 289, 35);
				        contentPane.add(btnMedico);
				        btnMedico.setText("Buscar medico");
				        btnMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
				        
				                btnPaciente = new JButton();
				                btnPaciente.setBounds(504, 196, 289, 36);
				                contentPane.add(btnPaciente);
				                btnPaciente.setText("Buscar Paciente");
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
