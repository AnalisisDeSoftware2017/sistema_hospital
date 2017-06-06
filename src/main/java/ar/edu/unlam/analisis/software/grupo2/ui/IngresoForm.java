package ar.edu.unlam.analisis.software.grupo2.ui;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

@org.springframework.stereotype.Component
public class IngresoForm extends JFrame {

	private JPanel contentPane;
	private JButton listaddoPacXMedBtn;
	private JButton enfermedadesBtn;
	private JButton anterior;
	/**
	 * Create the frame.
	 */
	public IngresoForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAbms = new JLabel();
		lblAbms.setBounds(5, 29, 834, 26);
		lblAbms.setText("ABMS");
		lblAbms.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbms.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblAbms.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(lblAbms);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setBounds(18, 66, 834, 383);
		contentPane.add(jPanel1);
		
		enfermedadesBtn = new JButton();
		enfermedadesBtn.setText("ABM medico");
		enfermedadesBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));

		listaddoPacXMedBtn = new JButton();
		listaddoPacXMedBtn.setText("ABM Paciente");
		listaddoPacXMedBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));

		
		anterior = new JButton();
		anterior.setText("Anterior");
		anterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnAbmEnfermedades = new JButton();
		btnAbmEnfermedades.setText("ABM Enfermedades");
		btnAbmEnfermedades.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_jPanel1 = new GroupLayout(jPanel1);
		gl_jPanel1.setHorizontalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_jPanel1.createSequentialGroup()
					.addContainerGap(286, Short.MAX_VALUE)
					.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_jPanel1.createSequentialGroup()
							.addComponent(anterior, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addGap(97))
						.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(enfermedadesBtn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(listaddoPacXMedBtn, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnAbmEnfermedades, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)))
					.addGap(259))
		);
		gl_jPanel1.setVerticalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_jPanel1.createSequentialGroup()
					.addContainerGap(111, Short.MAX_VALUE)
					.addComponent(btnAbmEnfermedades, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(enfermedadesBtn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(listaddoPacXMedBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(anterior, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(89))
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

		//TODO add this to controller
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

		//TODO add this to a controller
		JMenuItem cerrarSesion = new JMenuItem();
		cerrarSesion.setText("Cerrar Sesi\u00C3\u00B3n");
	/*	cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });*/
		opciones.add(cerrarSesion);
	}
	

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
        // TODO add your handling code here:
        System.exit(0); // SE SALE DEL PROGRAMA.
    }



   /* private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        LoginForm log=new LoginForm(); // Abre el log principal del sistema.
        log.setVisible(true); // Hace visible el log.     
        dispose();//SE OCULTA
    }*///GEN-LAST:event_cerrarSesionActionPerformed

    /*private void mIngDatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //IngresoPacientesW ipw=new IngresoPacientesW();
        //ipw.setVisible(true); // Hago visible la ventana de pacientes.    
        dispose(); // Para que se oculte el menu.
    }*/


	public JButton getListaddoPacXMedBtn(){
		return this.listaddoPacXMedBtn;
	}
	public JButton getEnfermedadesBtn(){
		return enfermedadesBtn;
	}
	public JButton getAnterior(){
		return this.anterior;
	}
}
