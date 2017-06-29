package ar.edu.unlam.analisis.software.grupo2.ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatosPacienteForm extends JFrame {

	private JPanel contentPane;
	private JTextField codigoPac;
	private JTextField nombrePac;


	public DatosPacienteForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		codigoPac = new JTextField();
		codigoPac.setBounds(335, 147, 205, 21);
		codigoPac.setFont(new Font("Tahoma", Font.PLAIN, 12));
		codigoPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoPacActionPerformed(evt);
            }
        });
        codigoPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoPacKeyTyped(evt);
            }
        });
		contentPane.add(codigoPac);
		
		nombrePac = new JTextField();
		nombrePac.setBounds(333, 190, 210, 21);
		nombrePac.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nombrePac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrePacKeyTyped(evt);
            }
        });
		contentPane.add(nombrePac);
		
		ingresarBtn = new JButton();
		ingresarBtn.setBounds(432, 363, 90, 33);
		ingresarBtn.setText("Ingresar");
		ingresarBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(ingresarBtn);
		
		anterior = new JButton();
		anterior.setBounds(28, 484, 100, 33);
		anterior.setText("Anterior");
		anterior.setMaximumSize(new Dimension(77, 33));
		anterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(anterior);
		
		borrarC = new JButton();
		borrarC.setBounds(287, 363, 140, 33);
		borrarC.setText("Borrar Campos");
		borrarC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(borrarC);
		

		
		JLabel jLabel2 = new JLabel();
		jLabel2.setBounds(267, 151, 48, 17);
		jLabel2.setText("C\u00F3digo:");
		jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(jLabel2);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setBounds(261, 191, 54, 17);
		jLabel3.setText("Nombre:");
		jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(jLabel3);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setFont(new Font("Cambria", Font.PLAIN, 18));
		jLabel1.setText("DATOS DEL PACIENTE");
		jLabel1.setBounds(10, 24, 380, 26);
		contentPane.add(jLabel1);
		
		JMenuBar jMenuBar3 = new JMenuBar();
		jMenuBar3.setBounds(0, 0, 130, 21);
		contentPane.add(jMenuBar3);
		
		JMenu jMenu4 = new JMenu();
		jMenu4.setToolTipText("");
		jMenu4.setText("Ayuda");
		jMenuBar3.add(jMenu4);
		
		JMenuItem menuItem = new JMenuItem();
		menuItem.setToolTipText("Vista de gu\u00EDa r\u00E1pida de uso.");
		menuItem.setText("Manual");
		menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
		jMenu4.add(menuItem);
		
		JMenu jMenu5 = new JMenu();
		jMenu5.setText("Ir a");
		jMenuBar3.add(jMenu5);
		
		JMenuItem menuItem_1 = new JMenuItem();
		menuItem_1.setText("Menu Inicio");
		menuItem_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mINIActionPerformed(evt);
            }
        });
		jMenu5.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem();
		menuItem_2.setText("Ingreso de Datos");
		/*menuItem_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIngDatActionPerformed(evt);
            }
        });*/
		jMenu5.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem();
		menuItem_3.setText("Informes");
		menuItem_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInfActionPerformed(evt);
            }
        });
		jMenu5.add(menuItem_3);
		
		JMenu opciones = new JMenu();
		opciones.setText("Opciones");
		jMenuBar3.add(opciones);
		
		JMenuItem menuItem_4 = new JMenuItem();
		menuItem_4.setText("Salir del Programa");
		menuItem_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
		opciones.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem();
		menuItem_5.setText("Cerrar Sesi\u00F3n");
		/*menuItem_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });*/
		opciones.add(menuItem_5);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtApellido.setBounds(333, 227, 210, 21);
		contentPane.add(txtApellido);
		
		JLabel lblApellido = new JLabel();
		lblApellido.setText("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellido.setBounds(261, 228, 54, 17);
		contentPane.add(lblApellido);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmail.setBounds(330, 260, 210, 21);
		contentPane.add(txtEmail);
		
		JLabel lblEmail = new JLabel();
		lblEmail.setText("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(258, 261, 54, 17);
		contentPane.add(lblEmail);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTelefono.setBounds(330, 297, 210, 21);
		contentPane.add(txtTelefono);
		
		JLabel lblTelefono = new JLabel();
		lblTelefono.setText("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(254, 298, 58, 17);
		contentPane.add(lblTelefono);
		
		txtCelular = new JTextField();
		txtCelular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCelular.setBounds(330, 330, 210, 21);
		contentPane.add(txtCelular);
		
		JLabel lblCelular = new JLabel();
		lblCelular.setText("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCelular.setBounds(258, 331, 54, 17);
		contentPane.add(lblCelular);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(335, 114, 205, 21);
		contentPane.add(textField);
		
		JLabel lblNroDocumento = new JLabel();
		lblNroDocumento.setText("Nro Doc. :");
		lblNroDocumento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNroDocumento.setBounds(253, 118, 62, 17);
		contentPane.add(lblNroDocumento);
		
		JLabel lblTipoDoc = new JLabel();
		lblTipoDoc.setText("Tipo Doc. :");
		lblTipoDoc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDoc.setBounds(241, 78, 73, 17);
		contentPane.add(lblTipoDoc);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(338, 75, 194, 27);
		contentPane.add(comboBox);
	}

	    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {
	        //IngresoPacientesW menu=new IngresoPacientesW();
	        //menu.setVisible(true); // Vuelve el menu de ingreso de datos
	        dispose(); // Desaparece el ingreso de datos de paciente.
	    }

	    private void ingresarBtnKeyTyped(java.awt.event.KeyEvent evt) {
            // Creamos un evento para que cuando se presione la tecla Enter sea como presionar el bot�n.

	        char cTeclaPresionada=evt.getKeyChar();
	        // da click al detectar la tecla ENTER.
	        if(cTeclaPresionada==KeyEvent.VK_ENTER){
	            //Ejecuta el bot�n (dar click)
	            ingresarBtn.doClick();
	        }// fin del if.
	    }

	    private void anteriorKeyTyped(java.awt.event.KeyEvent evt) {
	                // Creamos un evento para que cuando se presione la tecla Enter sea como presionar el bot�n.
	     
	        char cTeclaPresionada=evt.getKeyChar();
	        // da click al detectar la tecla ENTER.
	        if(cTeclaPresionada==KeyEvent.VK_ENTER){
	            //Ejecuta el bot�n (dar click)
	            anterior.doClick();
	        }// fin del if.
	    }



	    private void codigoPacActionPerformed(java.awt.event.ActionEvent evt) {
	        // Creamos un evento para que cuando se presione la tecla Enter sea como presionar el bot�n Ingresar.
	    }

	    private void codigoPacKeyTyped(java.awt.event.KeyEvent evt) {
	     
	                char cTeclaPresionada=evt.getKeyChar();
	        // da click en ingresar al detectar la tecla ENTER.
	        if(cTeclaPresionada==KeyEvent.VK_ENTER){
	            //Ejecuta el bot�n (dar click)
	            ingresarBtn.doClick();
	        }// fin del if.
	    }

	    private void nombrePacKeyTyped(java.awt.event.KeyEvent evt) {
	                char cTeclaPresionada=evt.getKeyChar();
	        // da click en ingresar al detectar la tecla ENTER.
	        if(cTeclaPresionada==KeyEvent.VK_ENTER){
	            //Ejecuta el bot�n (dar click)
	            ingresarBtn.doClick();
	        }// fin del if.
	    }

	    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
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

	    /*private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
	        LoginForm log=new LoginForm(); // Abre el log principal del sistema.
	        log.setVisible(true); // Hace visible el log.
	        dispose();//SE OCULTA
	    }//GEN-LAST:event_cerrarSesionActionPerformed

	    private void mIngDatActionPerformed(java.awt.event.ActionEvent evt) {

	        //IngresoPacientesW ipw=new IngresoPacientesW();
	        //ipw.setVisible(true); // Hago visible la ventana de pacientes.
	        dispose(); // Para que se oculte el menu.
	    }*/

	    private JButton anterior;
		private JButton ingresarBtn;
	    private JButton borrarC;
	    private JTextField txtApellido;
	    private JTextField txtEmail;
	    private JTextField txtTelefono;
	    private JTextField txtCelular;
	    private JTextField textField;

		public String getCodigoPac(){
			// Obtenemos el codigo del paciente ingresado.
			return codigoPac.getText();
		}

		public String getNombrePac(){
			// Obtenemos el nombre del paciente ingresado.
			return nombrePac.getText();
		}

		public JButton getAnterior() {
			return anterior;
		}

		public JButton getIngresarBtn() {
			return ingresarBtn;
		}

		public JButton getBorrarC() {
			return borrarC;
		}
}
