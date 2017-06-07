package ar.edu.unlam.analisis.software.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EnfermedadesMedicoForm extends JFrame {

	private JPanel contentPane;
	private JTextField nombreMed;
	private JTextField codigoMed;
	
    String codMed="";
String nomMed="";

String codm=""; // En estas variables vamos a guardar los datos de la b�squeda del medico.
String nomm="";
String espm="";
String codp="";// Estas variables que siguen nos ayudan en la b�squeda de datos del m�dico.
String codme="";
String enfp="";
String codpa="";// Nos sirven para la lectura de pacientes.
String nompa="";
String checkEnfermedades=""; //Para que no se muestre una misma enfermedad en la lista, ya que puede haber muchos diagnosticos de esa enfermedad.
String lista=""; // Limpio la lista de enfermedades a mostrar.

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnfermedadesMedicoForm frame = new EnfermedadesMedicoForm();
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
	public EnfermedadesMedicoForm() {
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
		jMenu2.setText("Ayuda");
		jMenuBar1.add(jMenu2);
		
		JMenuItem jMenuItem2 = new JMenuItem();
		jMenuItem2.setToolTipText("Vista de gu\u00C3\u00ADa r\u00C3\u00A1pida de uso.");
		jMenuItem2.setText("Manual");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
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
		
		JMenuItem mIngDat = new JMenuItem();
		mIngDat.setText("Ingreso de Datos");
		mIngDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIngDatActionPerformed(evt);
            }
        });
		jMenu3.add(mIngDat);
		
		JMenuItem mInf = new JMenuItem();
		mInf.setText("Informes");
		mInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInfActionPerformed(evt);
            }
        });
		jMenu3.add(mInf);
		
		JMenu opciones = new JMenu();
		opciones.setText("Opciones");
		jMenuBar1.add(opciones);
		
		JMenuItem salir = new JMenuItem();
		salir.setText("Salir del Programa");
		salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
		opciones.add(salir);
		
		JMenuItem cerrarSesion = new JMenuItem();
		cerrarSesion.setText("Cerrar Sesi\u00C3\u00B3n");
		cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
		opciones.add(cerrarSesion);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("<html><u>Enfermedades que atiende cada m\u00C3\u00A9dico</u></html>");
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setFont(new Font("Cambria", Font.PLAIN, 14));
		jLabel1.setBounds(10, 41, 290, 26);
		contentPane.add(jLabel1);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText("Nombre M\u00E9dico:");
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
		
		JButton anterior = new JButton();
		anterior.setText("Anterior");
		anterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
		anterior.setBounds(10, 361, 100, 30);
		anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
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
		lblCdigoMdico.setText("C\u00F3digo M\u00E9dico");
		lblCdigoMdico.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		codigoMed = new JTextField();
		
		consultarBtn = new JButton();
		consultarBtn.setText("Consultar");
		consultarBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		borrarC = new JButton();
		borrarC.setText("Borrar");
		borrarC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		borrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCActionPerformed(evt);
            }
        });
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
	
	private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
        InformesForm menu=new InformesForm();
        menu.setVisible(true); // Vuelve el menu de informes
        dispose(); // Desaparece el informe de pacientes por medico.
    }

    private void anteriorKeyTyped(java.awt.event.KeyEvent evt) {
     
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            anterior.doClick();
        }// fin del if.
    }

    private void consultarBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
         this.codMed=codigoMed.getText(); // Ser�a un getCodMed();
         lista="";
         checkEnfermedades="";
         //listaEnf.setText("");
        DatosMedicoForm medico=new DatosMedicoForm(codMed); // Creo un medico para usar el metodo que verifique que existe.
    }

    private void consultarBtnKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO addAll your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            consultarBtn.doClick();
        }// fin del if.
    }

    private void borrarCActionPerformed(java.awt.event.ActionEvent evt) {
        codigoMed.setText(""); // Limpio los datos.
        nombreMed.setText("");

    }

    private void borrarCKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO addAll your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            borrarC.doClick();
        }// fin del if.
    }

    

    private void codigoMedKeyTyped(java.awt.event.KeyEvent evt) {
                // TODO addAll your handling code here:
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            consultarBtn.doClick();
        }// fin del if.
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
       //ManualW guiaRapida=new ManualW();
        //guiaRapida.setVisible(true);
        setTitle("Manual de Ayuda");
    }

    private void mINIActionPerformed(java.awt.event.ActionEvent evt) {
        MainForm menu=new MainForm();
        menu.setVisible(true); // Vuelve el menu proncipal
        dispose(); // Desaparece el informes.
    }

    private void mInfActionPerformed(java.awt.event.ActionEvent evt) {
        InformesForm iw=new InformesForm();
        iw.setVisible(true); // Hago visible la ventana de Informes.
        dispose(); // Desaparece el menu.
    }

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0); // SE SALE DEL PROGRAMA.
    }

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
        LoginForm log=new LoginForm(); // Abre el log principal del sistema.
        log.setVisible(true); // Hace visible el log.
        dispose();//SE OCULTA
    }
    private void mIngDatActionPerformed(java.awt.event.ActionEvent evt) {
         //IngresoPacientesW ipw=new IngresoPacientesW();
        //ipw.setVisible(true); // Hago visible la ventana de pacientes.    
        dispose(); // Para que se oculte el menu.
    }
	
    JButton consultarBtn;
    JButton borrarC;
    JButton anterior;
}
