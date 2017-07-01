package ar.edu.unlam.analisis.software.grupo2.ui;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

@org.springframework.stereotype.Component
public class IngresoForm extends AbstractPantalla {

	private JPanel contentPane;
	private JButton btnAbmUsuarios;
	private JButton btnABMPaciente;
	private JButton btnABMMedico;
	private JButton anterior;
	private JButton btnAbmEnfermedades;
    /**
	 * Create the frame.
	 */
	public IngresoForm() {
        super();
        contentPane = this.setPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAbms = new JLabel();
        lblAbms.setBounds(215, 25, 834, 51);
        lblAbms.setText("ADMINISTRACION");
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
		anterior.setText("Anterior");
		anterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
		anterior.setBounds(215, 468, 777, 40);
		contentPane.add(anterior);
		
		this.btnAbmUsuarios= new JButton("ABM Usuarios");
		btnAbmUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAbmUsuarios.setBounds(215, 386, 777, 32);
		contentPane.add(btnAbmUsuarios);
		
		btnABMPaciente = new JButton();
		btnABMPaciente.setText("ABM Paciente");
		btnABMPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnABMPaciente.setBounds(215, 305, 777, 35);
		contentPane.add(btnABMPaciente);
		
		btnABMMedico = new JButton();
		btnABMMedico.setText("ABM Medico");
		btnABMMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnABMMedico.setBounds(215, 219, 777, 36);
		contentPane.add(btnABMMedico);
		
		btnAbmEnfermedades = new JButton();
		btnAbmEnfermedades.setText("ABM Enfermedades");
		btnAbmEnfermedades.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAbmEnfermedades.setBounds(215, 146, 777, 36);
		contentPane.add(btnAbmEnfermedades);
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
        MainForm menu=new MainForm();
        menu.setVisible(true); // Vuelve el menu proncipal
        dispose(); // Desaparece el informes.   
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
