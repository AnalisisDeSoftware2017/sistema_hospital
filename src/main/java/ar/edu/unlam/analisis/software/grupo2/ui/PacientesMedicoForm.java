package ar.edu.unlam.analisis.software.grupo2.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class PacientesMedicoForm extends JFrame {

	private JPanel contentPane;
	
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
    String checkPaciente=""; //Para que no se un mismo paciente en la lista, ya que puede tener muchos diagnosticos.
    String lista=""; // Limpio la lista de pacientes a mostrar.
    private JTextField codigoMed;
    private JTextField nombreMed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PacientesMedicoForm frame = new PacientesMedicoForm();
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
	public PacientesMedicoForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setBounds(31, 62, 544, 127);
		contentPane.add(jPanel2);
		
		JLabel label = new JLabel();
		label.setText("C\u00C3\u00B3gido del m\u00C3\u00A9dico:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		codigoMed = new JTextField();
		codigoMed.setFont(new Font("Tahoma", Font.PLAIN, 12));
				
		consultarBtn = new JButton();
		consultarBtn.setText("Consultar");
		consultarBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 consultarBtn.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                consultarBtnActionPerformed(evt);
	            }
	        });
		
		borrarC = new JButton();
		borrarC.setText("Borrar");
		borrarC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		borrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCActionPerformed(evt);
            }
        });
		
		GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 544, Short.MAX_VALUE)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGap(28)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(codigoMed, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(224, Short.MAX_VALUE))
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGap(0, 331, Short.MAX_VALUE)
					.addComponent(consultarBtn)
					.addGap(18)
					.addComponent(borrarC, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		gl_jPanel2.setVerticalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 127, Short.MAX_VALUE)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addContainerGap(28, Short.MAX_VALUE)
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
						.addComponent(label, Alignment.TRAILING)
						.addComponent(codigoMed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(consultarBtn, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(borrarC, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(23))
		);
		jPanel2.setLayout(gl_jPanel2);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("<html><u>Pacientes por m\u00C3\u00A9dico</u></html>");
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setFont(new Font("Cambria", Font.PLAIN, 18));
		jLabel1.setBounds(90, 21, 544, 26);
		contentPane.add(jLabel1);
		
		ant = new JButton();
		ant.setText("Anterior");
		ant.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ant.setBounds(535, 368, 120, 33);
		ant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antActionPerformed(evt);
            }
        });
		contentPane.add(ant);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setText("Nombre del m\u00C3\u00A9dico:");
		jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel3.setBounds(230, 200, 123, 17);
		contentPane.add(jLabel3);
		
		nombreMed = new JTextField();
		nombreMed.setSelectionColor(new Color(204, 204, 204));
		nombreMed.setSelectedTextColor(Color.BLACK);
		nombreMed.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nombreMed.setEnabled(false);
		nombreMed.setDisabledTextColor(Color.BLACK);
		nombreMed.setBounds(359, 200, 150, 21);
		contentPane.add(nombreMed);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 130, 21);
		contentPane.add(menuBar);
		
		JMenu jMenu2 = new JMenu();
		jMenu2.setToolTipText("");
		jMenu2.setText("Ayuda");
		menuBar.add(jMenu2);
		
		JMenuItem jMenuItem2 = new JMenuItem();
		jMenuItem2.setToolTipText("Vista de gu\u00C3\u00ADa r\u00C3\u00A1pida de uso.");
		jMenuItem2.setText("Manual");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
		jMenu2.add(jMenuItem2);
		
		JMenu opciones = new JMenu();
		opciones.setText("Ir a");
		menuBar.add(opciones);
		
		JMenuItem mINI = new JMenuItem();
		mINI.setText("Menu Inicio");
		mINI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mINIActionPerformed(evt);
            }
        });
		opciones.add(mINI);
		
		JMenuItem mIngDat = new JMenuItem();
		mIngDat.setText("Ingreso de Datos");
		mIngDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIngDatActionPerformed(evt);
            }
        });
		opciones.add(mIngDat);
		
		JMenuItem mInf = new JMenuItem();
		mInf.setText("Informes");
		mInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInfActionPerformed(evt);
            }
        });
		opciones.add(mInf);
		
		JMenu menu_2 = new JMenu();
		menu_2.setText("Opciones");
		menuBar.add(menu_2);
		
		JMenuItem Salir = new JMenuItem();
		Salir.setText("Salir del Programa");
		Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
		menu_2.add(Salir);
		
		JMenuItem cerrarSesion = new JMenuItem();
		cerrarSesion.setText("Cerrar Sesi\u00C3\u00B3n");
		cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
		menu_2.add(cerrarSesion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 232, 481, 169);
		contentPane.add(scrollPane);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setBounds(28, 232, 481, 169);
		contentPane.add(jPanel1);
		GroupLayout gl_jPanel1 = new GroupLayout(jPanel1);
		gl_jPanel1.setHorizontalGroup(
			gl_jPanel1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 517, Short.MAX_VALUE)
		);
		gl_jPanel1.setVerticalGroup(
			gl_jPanel1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 169, Short.MAX_VALUE)
		);
		jPanel1.setLayout(gl_jPanel1);
	}
	
	private void antActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        InformesForm menu=new InformesForm();
        menu.setVisible(true); // Vuelve el menu de informes
        dispose(); // Desaparece el informe de pacientes por medico.
    }

    private void antKeyTyped(KeyEvent evt) {
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            ant.doClick();
        }// fin del if.
    }

    private void borrarCActionPerformed(java.awt.event.ActionEvent evt) {
        codigoMed.setText(""); // Limpio los datos.
        nombreMed.setText("");
        //listaPac.setText("");
        
    }

    private void borrarCKeyTyped(KeyEvent evt) {
                char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            borrarC.doClick();
        }// fin del if.
    }

    private void consultarBtnKeyTyped(KeyEvent evt) {

                char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            consultarBtn.doClick();
        }// fin del if.
    }

    private void consultarBtnActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void codigoMedKeyTyped(KeyEvent evt) {

                char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            consultarBtn.doClick();
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

    private void mInfActionPerformed(java.awt.event.ActionEvent evt) {
        InformesForm iw=new InformesForm();
        iw.setVisible(true); // Hago visible la ventana de Informes.
        dispose(); // Desaparece el menu.
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
    }

    private void mIngDatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //IngresoPacientesW ipw=new IngresoPacientesW();
        //ipw.setVisible(true); // Hago visible la ventana de pacientes.    
        dispose(); // Para que se oculte el menu.
    }
    
    JButton consultarBtn;
	JButton borrarC;
	JButton ant;

}
