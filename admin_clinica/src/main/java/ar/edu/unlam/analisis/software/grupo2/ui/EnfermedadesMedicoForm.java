package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.*;

@org.springframework.stereotype.Component
public class EnfermedadesMedicoForm extends AbstractPantalla {

	private JPanel contentPane;
	private JTextField nombreMed;
	private JTextField codigoMed;

	/**
	 * Create the frame.
	 */
	@Autowired
	public EnfermedadesMedicoForm(MessageSource messageSource) {
		super(messageSource);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar jMenuBar1 = new JMenuBar();
		jMenuBar1.setBounds(0, 0, 130, 21);
		contentPane.add(jMenuBar1);
		
		JMenu jMenu2 = new JMenu();
		jMenu2.setToolTipText("");
		jMenu2.setText(getMessage("ui.EnfermedadesMedicoForm.text.ayuda", null, AppContext.getLocale()));
		jMenuBar1.add(jMenu2);
		
		JMenuItem jMenuItem2 = new JMenuItem();
		jMenuItem2.setToolTipText(getMessage("ui.EnfermedadesMedicoForm.guia", null, AppContext.getLocale()));
		jMenuItem2.setText(getMessage("ui.EnfermedadesMedicoForm.text.manual", null, AppContext.getLocale()));
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
		jMenu2.add(jMenuItem2);
		
		JMenu jMenu3 = new JMenu();
		jMenu3.setText(getMessage("ui.EnfermedadesMedicoForm.text.irA", null, AppContext.getLocale()));
		jMenuBar1.add(jMenu3);
		
		JMenuItem mINI = new JMenuItem();
		mINI.setText(getMessage("ui.EnfermedadesMedicoForm.menuInicio", null, AppContext.getLocale()));
		 mINI.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                mINIActionPerformed(evt);
	            }
	        });
		jMenu3.add(mINI);
		
		JMenuItem mIngDat = new JMenuItem();
		mIngDat.setText(getMessage("ui.EnfermedadesMedicoForm.ingresoDatos", null, AppContext.getLocale()));
		mIngDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIngDatActionPerformed(evt);
            }
        });
		jMenu3.add(mIngDat);
		
		JMenuItem mInf = new JMenuItem();
		mInf.setText(getMessage("ui.EnfermedadesMedicoForm.text.informes", null, AppContext.getLocale()));
		mInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInfActionPerformed(evt);
            }
        });
		jMenu3.add(mInf);
		
		JMenu opciones = new JMenu();
		opciones.setText(getMessage("ui.EnfermedadesMedicoForm.text.opciones", null, AppContext.getLocale()));
		jMenuBar1.add(opciones);
		
		JMenuItem salir = new JMenuItem();
		salir.setText(getMessage("ui.EnfermedadesMedicoForm.salirPrograma", null, AppContext.getLocale()));
		salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
		opciones.add(salir);
		
		JMenuItem cerrarSesion = new JMenuItem();
		cerrarSesion.setText(getMessage("ui.EnfermedadesMedicoForm.cerrarSesion", null, AppContext.getLocale()));
		/*cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });*/
		opciones.add(cerrarSesion);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText(getMessage("ui.EnfermedadesMedicoForm.enfermedadesPorMedico", null, AppContext.getLocale()));
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setFont(new Font("Cambria", Font.PLAIN, 14));
		jLabel1.setBounds(10, 41, 290, 26);
		contentPane.add(jLabel1);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText(getMessage("ui.EnfermedadesMedicoForm.text.nombreMedico", null, AppContext.getLocale()));
		jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jLabel3.setBounds(333, 203, 119, 15);
		contentPane.add(jLabel3);
		
		nombreMed = new JTextField();
		nombreMed.setSelectionColor(new Color(153, 153, 153));
		nombreMed.setSelectedTextColor(Color.BLACK);
		nombreMed.setEnabled(false);
		nombreMed.setEditable(false);
		nombreMed.setDisabledTextColor(Color.BLACK);
		nombreMed.setBounds(466, 201, 93, 20);
		contentPane.add(nombreMed);
		
		anterior = new JButton();
		anterior.setText(getMessage("ui.EnfermedadesMedicoForm.text.anterior", null, AppContext.getLocale()));
		anterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
		anterior.setBounds(10, 361, 100, 30);
		contentPane.add(anterior);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.setBounds(0, 32, 586, 370);
		contentPane.add(jLabel4);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setBounds(20, 240, 560, 110);
		contentPane.add(jPanel1);
		
		JScrollPane jScrollPane1 = new JScrollPane();
		GroupLayout gl_jPanel1 = new GroupLayout(jPanel1);
		gl_jPanel1.setHorizontalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_jPanel1.createSequentialGroup()
					.addContainerGap()
					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_jPanel1.setVerticalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
		);
		jPanel1.setLayout(gl_jPanel1);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 78, 558, 85);
		contentPane.add(panel);
		
		JLabel lblCdigoMdico = new JLabel();
		lblCdigoMdico.setText(getMessage("ui.EnfermedadesMedicoForm.text.codigoMedico", null, AppContext.getLocale()));
		lblCdigoMdico.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		codigoMed = new JTextField();
		
		consultarBtn = new JButton();
		consultarBtn.setText(getMessage("ui.EnfermedadesMedicoForm.text.consultar", null, AppContext.getLocale()));
		consultarBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		borrarC = new JButton();
		borrarC.setText("Borrar");
		borrarC.setFont(new Font("Tahoma", Font.PLAIN, 12));

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCdigoMdico)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(codigoMed, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(0, 25, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(consultarBtn)
							.addPreferredGap(ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
							.addComponent(borrarC, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 85, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCdigoMdico)
						.addComponent(codigoMed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(consultarBtn)
						.addComponent(borrarC))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

	@Override
	public void setTexto() {

	}

/*
    private void codigoMedKeyTyped(KeyEvent evt) {
                // TODO addAll your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            consultarBtn.doClick();
        }// fin del if.
    }*/

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
       //ManualW guiaRapida=new ManualW();
        //guiaRapida.setVisible(true);
        setTitle("Manual de Ayuda");
    }

    private void mINIActionPerformed(java.awt.event.ActionEvent evt) {
       /* MainForm menu=new MainForm();
        menu.setVisible(true); // Vuelve el menu proncipal
        dispose(); // Desaparece el informes.*/
    }

    private void mInfActionPerformed(java.awt.event.ActionEvent evt) {
        /*InformesForm iw=new InformesForm();
        iw.setVisible(true); // Hago visible la ventana de Informes.
        dispose(); // Desaparece el menu.*/
    }

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0); // SE SALE DEL PROGRAMA.
    }

    /*private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
        LoginForm log=new LoginForm(); // Abre el log principal del sistema.
        log.setVisible(true); // Hace visible el log.
        dispose();//SE OCULTA
    }*/
    private void mIngDatActionPerformed(java.awt.event.ActionEvent evt) {
         //IngresoPacientesW ipw=new IngresoPacientesW();
        //ipw.setVisible(true); // Hago visible la ventana de pacientes.    
        dispose(); // Para que se oculte el menu.
    }
	
    private JButton consultarBtn;
    private JButton borrarC;
	private JButton anterior;


	public JButton getConsultarBtn() {
		return consultarBtn;
	}

	public JButton getBorrarC() {
		return borrarC;
	}

	public JButton getAnterior() {
		return anterior;
	}

}
