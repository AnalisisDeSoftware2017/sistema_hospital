package ar.edu.unlam.analisis.software.grupo2.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class InformesForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformesForm frame = new InformesForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InformesForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		
		JButton EnfermedadesBtn = new JButton();
		EnfermedadesBtn.setText("Enfermedades que atiende cada m\u00C3\u00A9dico");
		EnfermedadesBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		EnfermedadesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnfermedadesBtnActionPerformed(evt);
            }
        });
        EnfermedadesBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                EnfermedadesBtnKeyTyped(evt);
            }
        });
		
		JButton listaddoPacXMedBtn = new JButton();
		listaddoPacXMedBtn.setText("Listado de pacientes por m\u00C3\u00A9dico");
		listaddoPacXMedBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		listaddoPacXMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoPacXMedBtnActionPerformed(evt);
            }
        });
		listaddoPacXMedBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                listadoPacXMedBtnKeyTyped(evt);
            }
        });
		
		JButton anterior = new JButton();
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
								.addComponent(listaddoPacXMedBtn, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
								.addComponent(EnfermedadesBtn))
							.addGap(64))
						.addGroup(Alignment.TRAILING, gl_jPanel1.createSequentialGroup()
							.addComponent(anterior, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addGap(161))))
		);
		gl_jPanel1.setVerticalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel1.createSequentialGroup()
					.addGap(24)
					.addComponent(EnfermedadesBtn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(listaddoPacXMedBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
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
		
		JMenuItem mIngDat = new JMenuItem();
		mIngDat.setText("Ingreso de Datos");
		 mIngDat.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                mIngDatActionPerformed(evt);
	            }
	        });
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
		
		JMenuItem cerrarSesion = new JMenuItem();
		cerrarSesion.setText("Cerrar Sesi\u00C3\u00B3n");
		cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
		opciones.add(cerrarSesion);
	}
	
	private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {
        MainForm menu=new MainForm();
        menu.setVisible(true); // Vuelve el menu proncipal
        dispose(); // Desaparece el informes.        
    }

    private void listadoPacXMedBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //PacientesXMedW pxm=new PacientesXMedW();
        //pxm.setVisible(true);
        dispose(); // Se oculta la ventana de informes.
    }

    private void EnfermedadesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnfermedadesBtnActionPerformed
        // TODO add your handling code here:
     //   EnfermedadesMedW em=new EnfermedadesMedW();
       // em.setVisible(true);
        dispose(); // se oculta la ventana de informes.
    }

    private void listadoPacXMedBtnKeyTyped(KeyEvent evt) {

        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            //listadoPacXMedBtn.doClick();
        }// fin del if.
    }

    private void EnfermedadesBtnKeyTyped(KeyEvent evt) {
       
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            //EnfermedadesBtn.doClick();
        }// fin del if.
    }

    private void anteriorKeyTyped(KeyEvent evt) {

        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
     //       anterior.doClick();
        }// fin del if.
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

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        LoginForm log=new LoginForm(); // Abre el log principal del sistema.
        log.setVisible(true); // Hace visible el log.     
        dispose();//SE OCULTA
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void mIngDatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //IngresoPacientesW ipw=new IngresoPacientesW();
        //ipw.setVisible(true); // Hago visible la ventana de pacientes.    
        dispose(); // Para que se oculte el menu.
    }

}
