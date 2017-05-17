package ar.edu.unlam.analisis.software.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unlam.analisis.software.utils.EncryptHelper;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JLabel;

public class DatosPacienteForm extends JFrame {

	private JPanel contentPane;
	private JTextField codigoPac;
	private JTextField nombrePac;
	
	String codPac = "";
    String nomPac = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosPacienteForm frame = new DatosPacienteForm();
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
	public DatosPacienteForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		codigoPac = new JTextField();
		codigoPac.setBounds(130, 93, 93, 21);
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
		nombrePac.setBounds(103, 133, 210, 21);
		nombrePac.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nombrePac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrePacKeyTyped(evt);
            }
        });
		contentPane.add(nombrePac);
		
		ingresarBtn = new JButton();
		ingresarBtn.setBounds(275, 172, 90, 33);
		ingresarBtn.setText("Ingresar");
		ingresarBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ingresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBtnActionPerformed(evt);
            }
        });
        ingresarBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresarBtnKeyTyped(evt);
            }
        });
		contentPane.add(ingresarBtn);
		
		anterior = new JButton();
		anterior.setBounds(31, 251, 100, 33);
		anterior.setText("Anterior");
		anterior.setMaximumSize(new Dimension(77, 33));
		anterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
		anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        anterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                anteriorKeyTyped(evt);
            }
        });
		contentPane.add(anterior);
		
		borrarC = new JButton();
		borrarC.setBounds(130, 172, 140, 33);
		borrarC.setText("Borrar Campos");
		borrarC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		borrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCActionPerformed(evt);
            }
        });
        borrarC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                borrarCKeyTyped(evt);
            }
        });
		contentPane.add(borrarC);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.setBounds(0, -10, 530, 390);
		contentPane.add(jLabel4);
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setBounds(37, 94, 48, 17);
		jLabel2.setText("C\u00F3digo:");
		jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(jLabel2);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setBounds(31, 134, 54, 17);
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
		menuItem_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIngDatActionPerformed(evt);
            }
        });
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
		menuItem_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
		opciones.add(menuItem_5);
	}

	public DatosPacienteForm(String codigo) { //CONSTRUCTOR para crear un paciente desde otras clases.
        this.codPac=codigo; // Guardo el dato pasado. 
   }
   
   public String getCodigoPac(){
       // Obtenemos el codigo del paciente ingresado.
       this.codPac=codigoPac.getText();
       return codPac;
   }
   
   public String getNombrePac(){
       // Obtenemos el nombre del paciente ingresado.
       this.nomPac=nombrePac.getText();
       return nomPac;
   }
   
   private static boolean soloLetras(String cadena){
	      if(cadena.matches("[áéíóúña-zÑÁÉÍÓÚA-Z][áéíóúña-zÁÉÍÓÚÑA-z ]*")) // Se valida en esta función que no puede ser vacía la cadena.
	        return true; //Son letras.
	      else
	        return false; //No son letras.
	    }

	    private static boolean alfanumerico(String cadena){
	      if(cadena.matches("[0-9a-zA-z]+")) // Tampoco puede ser vacía una cadena.
	        return true; // Es alfanimerico
	      else
	        return false; //No es alfanumerico
	    }
	    
	    public int validarDatosPac(){
	        String mensaje="";
	        int ret=0; // comienza siendo valido.
	        if(!alfanumerico(codPac)){ // El codigo del paciente debe ser alfanumerico sin espacios.
	                mensaje="El código no es válido o no se ha ingresado. "; //Se guarda mensaje de aviso.
	                ret++; //Ret se incrementa porque ya no es valido.
	        }
	        if(!soloLetras(nomPac)){ // El nombre del paciente sólo debe contener letras.
	         mensaje= mensaje + "El nombre del paciente posee caracteres incorrectos o no se ha ingresado."; //Se guarda mensaje de aviso.
	         ret++; // Ret deja de ser valido.
	        }
	        if(ret!=0)
	            JOptionPane.showMessageDialog(null, mensaje);
	        return ret; // Correctos o Incorrectos.
	    }
	    
	    public boolean ExistePac(){
	        boolean found = false; // Creo una variable boolena que será la que idique si existe o no el paciente.
	        try {
	            DataInputStream datopac = null; // Luego abro el archivo de pacientes para recorrerlo.
	            datopac = new DataInputStream(new FileInputStream(System.getProperty("user.home") + "\\datopac.txt")); // abre el archivo de pacientes para lectura
	            int sw1 = 1; // Bandera para recorrer el archivo hasta su fin. 
	            while (sw1 != 0) {// recorre los registros
	                try {
	                    String codpa = EncryptHelper.Desencriptar(datopac.readUTF());// lee el registro
	                    datopac.readUTF();
	                    if (codpa.equals(codPac)){
	                        /*compara el codigo digitado con el codigo del peciente de la
	                        tabla "datopac" */
	                        found = true; //ENCONTRADO
	                    }
	                } catch (EOFException e) {
	                    sw1 = 0;
	                }
	            }
	        } catch (Exception e) {
	            //JOptionPane.showMessageDialog(null, "Error al verificar la existencia del paciente"); // Mensaje inesperado de error.
	        }
	        return found; // Se devuelve true or false.
	  }
	    
	    public void grabarDatosPac(){
	        // Esta función se encarga de grabar los datos en el archivo de pacientes.
	        try{
	            DataOutputStream datopac = null; //Para luego abrir el archivo de pacientes para escritura con append habilitado.
	            datopac = new DataOutputStream(new FileOutputStream(System.getProperty("user.home") + "\\datopac.txt", true)); //Se abre el arvhivo.
	            // graba los datos en el archivo
	            datopac.writeUTF(EncryptHelper.Encriptar(codPac)); //Se graba el codigo de paciente.
	            datopac.writeUTF(EncryptHelper.Encriptar(nomPac)); // Se graba el nombre de paciente.
	            JOptionPane.showMessageDialog(null, "Datos guardados de forma exitosa.");
	        }catch(Exception ioe){
	            JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo de Pacientes");
	        }
	    }
	    
	    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {
	        //IngresoPacientesW menu=new IngresoPacientesW();
	        //menu.setVisible(true); // Vuelve el menu de ingreso de datos
	        dispose(); // Desaparece el ingreso de datos de paciente.
	    }

	    private void ingresarBtnKeyTyped(java.awt.event.KeyEvent evt) {
            // Creamos un evento para que cuando se presione la tecla Enter sea como presionar el botón.

	        char cTeclaPresionada=evt.getKeyChar();
	        // da click al detectar la tecla ENTER.
	        if(cTeclaPresionada==KeyEvent.VK_ENTER){
	            //Ejecuta el botón (dar click)
	            ingresarBtn.doClick();
	        }// fin del if.
	    }

	    private void anteriorKeyTyped(java.awt.event.KeyEvent evt) {
	                // Creamos un evento para que cuando se presione la tecla Enter sea como presionar el botón.
	     
	        char cTeclaPresionada=evt.getKeyChar();
	        // da click al detectar la tecla ENTER.
	        if(cTeclaPresionada==KeyEvent.VK_ENTER){
	            //Ejecuta el botón (dar click)
	            anterior.doClick();
	        }// fin del if.
	    }

	    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {
	             
	            getCodigoPac(); //Obtenemos el codigo del paciente ingresado.
	            getNombrePac(); // Obtenemos el nombre del paciente ingresado.
	            if(validarDatosPac()==0){ // Si los datos estan bien ingresados, verifico la existencia del paciente.
	                if(!ExistePac()) // Si el paciente no está registrado en el archivo entonces lo agrego.
	                    grabarDatosPac(); //Se guardan los datos ingresados en el archivo.
	                else
	                    JOptionPane.showMessageDialog(null, "El código de paciente ya existe."); //Se informa que el paciente ya existe.
	            }      
	    }

	    private void codigoPacActionPerformed(java.awt.event.ActionEvent evt) {
	        // Creamos un evento para que cuando se presione la tecla Enter sea como presionar el botón Ingresar.
	    }

	    private void codigoPacKeyTyped(java.awt.event.KeyEvent evt) {
	     
	                char cTeclaPresionada=evt.getKeyChar();
	        // da click en ingresar al detectar la tecla ENTER.
	        if(cTeclaPresionada==KeyEvent.VK_ENTER){
	            //Ejecuta el botón (dar click)
	            ingresarBtn.doClick();
	        }// fin del if.
	    }

	    private void nombrePacKeyTyped(java.awt.event.KeyEvent evt) {
	                char cTeclaPresionada=evt.getKeyChar();
	        // da click en ingresar al detectar la tecla ENTER.
	        if(cTeclaPresionada==KeyEvent.VK_ENTER){
	            //Ejecuta el botón (dar click)
	            ingresarBtn.doClick();
	        }// fin del if.
	    }

	    private void borrarCKeyTyped(java.awt.event.KeyEvent evt) {
	        // TODO add your handling code here:
	        char cTeclaPresionada=evt.getKeyChar();
	        // da click al detectar la tecla ENTER.
	        if(cTeclaPresionada==KeyEvent.VK_ENTER){
	            //Ejecuta el botón (dar click)
	            borrarC.doClick();
	        }// fin del if.
	    }//GEN-LAST:event_borrarCKeyTyped

	    private void borrarCActionPerformed(java.awt.event.ActionEvent evt) {
	     
	        codigoPac.setText(""); // Se borra el contenido del codigo.
	        nombrePac.setText(""); // Se borra el contenido del nombre.
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
	     
	     
	        //InformesW iw=new InformesW();
	        //iw.setVisible(true); // Hago visible la ventana de Informes.
	        dispose(); // Desaparece el menu.
	    }

	    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {
	        System.exit(0); // SE SALE DEL PROGRAMA.
	    }

	    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
	        LoginForm log=new LoginForm(); // Abre el log principal del sistema.
	        log.setVisible(true); // Hace visible el log.
	        dispose();//SE OCULTA
	    }//GEN-LAST:event_cerrarSesionActionPerformed

	    private void mIngDatActionPerformed(java.awt.event.ActionEvent evt) {
	     
	        //IngresoPacientesW ipw=new IngresoPacientesW();
	        //ipw.setVisible(true); // Hago visible la ventana de pacientes.    
	        dispose(); // Para que se oculte el menu.
	    }
	    
	    JButton anterior;
	    JButton ingresarBtn;
	    JButton borrarC;
}
