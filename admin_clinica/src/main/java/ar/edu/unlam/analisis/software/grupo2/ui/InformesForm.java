package ar.edu.unlam.analisis.software.grupo2.ui;

import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
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
	public InformesForm() {
        super();
        contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel();
		label.setBounds(5, 29, 424, 26);
		label.setText("CONTROL DE PACIENTES");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Cambria", Font.PLAIN, 18));
		label.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(label);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setBounds(5, 66, 424, 190);
		contentPane.add(jPanel1);

        btnPaciente = new JButton();
        btnPaciente.setText("Buscar Paciente");
        btnPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));

        btnMedico = new JButton();
        btnMedico.setText("Buscar medico");
        btnMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));

		
		anterior = new JButton();
		anterior.setText("Anterior");
		anterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GroupLayout gl_jPanel1 = new GroupLayout(jPanel1);
		gl_jPanel1.setHorizontalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel1.createSequentialGroup()
					.addContainerGap(71, Short.MAX_VALUE)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_jPanel1.createSequentialGroup()
							.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
                                    .addComponent(btnMedico, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPaciente))
                                .addGap(64))
						.addGroup(Alignment.TRAILING, gl_jPanel1.createSequentialGroup()
							.addComponent(anterior, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addGap(161))))
		);
		gl_jPanel1.setVerticalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel1.createSequentialGroup()
					.addGap(24)
                        .addComponent(btnPaciente, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(btnMedico, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addGap(18)
					.addComponent(anterior, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		jPanel1.setLayout(gl_jPanel1);
		
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
