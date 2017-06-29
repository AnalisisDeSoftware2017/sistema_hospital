package ar.edu.unlam.analisis.software.grupo2.ui;

import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;





@Component
public class DatosMedicoForm extends AbstractPantalla {

	private JPanel contentPane;

	public DatosMedicoForm() {
		//setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconoCM.png")).getImage()); //Agrego el icono a la ventana
        setSize(529,383); 
        setLocationRelativeTo(null); // En el centro la ventana.
        setResizable(false); // Anula poder maximizar la ventana.
        setTitle("Ingreso de Datos"); // Le da un titulo a la ventana.
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar jMenuBar1 = new JMenuBar();
		jMenuBar1.setBounds(0, 0, 127, 21);
		contentPane.add(jMenuBar1);
		
		JMenu jMenu2 = new JMenu();
		jMenu2.setToolTipText("");
		jMenu2.setText("Ayuda");
		jMenuBar1.add(jMenu2);
		
		JMenuItem menuItem = new JMenuItem();
		menuItem.setToolTipText("Vista de gu\u00C3\u00ADa r\u00C3\u00A1pida de uso.");
		menuItem.setText("Manual");
		menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
		jMenu2.add(menuItem);
		
		JMenu jMenu3 = new JMenu();
		jMenu3.setText("Ir a");
		jMenuBar1.add(jMenu3);
		
		JMenuItem menuItem_1 = new JMenuItem();
		menuItem_1.setText("Menu Inicio");
		menuItem_1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                mINIActionPerformed(evt);
	            }
	        });
		jMenu3.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem();
		menuItem_2.setText("Ingreso de Datos");
		menuItem_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIngDatActionPerformed(evt);
            }
        });
		jMenu3.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem();
		menuItem_3.setText("Informes");
		menuItem_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInfActionPerformed(evt);
            }
        });
		jMenu3.add(menuItem_3);
		
		JMenu opciones = new JMenu();
		opciones.setText("Opciones");
		jMenuBar1.add(opciones);
		
		JMenuItem menuItem_4 = new JMenuItem();
		menuItem_4.setText("Salir del Programa");
		
		opciones.add(menuItem_4);
		
		JMenuItem mntmCerrarSesin = new JMenuItem();
		mntmCerrarSesin.setText("Cerrar Sesi\u00F3n");
		opciones.add(mntmCerrarSesin);
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setBounds(161, 84, 54, 17);
		jLabel1.setText("C\u00F3digo:");
		jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(jLabel1);
		
		codigo = new JTextField();
		codigo.setBounds(214, 83, 93, 21);
		codigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });
		contentPane.add(codigo);
		
		JLabel jLabel3 = new JLabel();
		jLabel3.setBounds(225, 123, 54, 17);
		jLabel3.setText("Nombre:");
		jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(jLabel3);
		
		nombre = new JTextField();
		nombre.setBounds(284, 122, 157, 21);
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
		contentPane.add(nombre);
		
		anterior = new JButton();
		anterior.setBounds(295, 253, 110, 33);
		anterior.setText("Anterior");
		anterior.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(anterior);
		
		ingresarBtn = new JButton();
		ingresarBtn.setBounds(381, 200, 120, 30);
		ingresarBtn.setText("Ingresar");
		ingresarBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(ingresarBtn);
		
		borrarC = new JButton();
		borrarC.setBounds(135, 200, 170, 30);
		borrarC.setText("Borrar Campos");
		borrarC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(borrarC);
		
		JLabel jLabel4 = new JLabel();
		jLabel4.setBounds(265, 162, 77, 17);
		jLabel4.setText("Especialidad:");
		jLabel4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(jLabel4);
		
		especialidad = new JTextField();
		especialidad.setBounds(347, 161, 157, 21);
		especialidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		especialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                especialidadKeyTyped(evt);
            }
        });
		contentPane.add(especialidad);
		
		JLabel jLabel5 = new JLabel();
		jLabel5.setBounds(0, 0, 520, 350);
		contentPane.add(jLabel5);
	}

	@Override
	public void setTexto() {

	}
	
	/*public DatosMedicoForm(String codigo) { // Constructor 2 para crear un medico desde otras clases
        this.codigoMed=codigo;
        //S�lo cargamos el dato b�sico para poder usar los metodos de medico.
    }*/
	
	public String getCodigoMed(){
        return codigo.getText(); //Guarda el codigo ingresado.
    }    
    
    public String getNombreMed(){

        return nombre.getText(); //Guarda el nombre Ingresado.
    }
    
    public String getEspecialidadMed(){
        return especialidad.getText();
    }
    
    private static boolean soloLetras(String cadena){
		// Se valida en esta funci�n que no puede ser vac�a la cadena.
//Son letras.
//No son letras.
		return cadena.matches("[������a-z������A-Z][������a-z������A-z ]*");
	}

    /*private static boolean alfanumerico(String cadena){
      if(cadena.matches("[0-9a-zA-z]+")) // Tampoco puede ser vac�a una cadena.
        return true; // Es alfanimerico
      else
        return false; //No es alfanumerico
    }
    
    public int validarDatosMed(){
        String mensaje="";
        int ret=0; // comienza siendo valido.
        if(!alfanumerico(codigoMed)){ // El codigo del paciente debe ser alfanumerico sin espacios.
                mensaje="El c�digo no es v�lido o no se ha ingresado. "; //Se guarda mensaje de aviso.
                ret++; //Ret se incrementa porque ya no es valido.
        }
        if(!soloLetras(nombreMed)){ // El nombre del paciente s�lo debe contener letras.
         mensaje= mensaje + "El nombre del m�dico posee caracteres incorrectos o no se ha ingresado. "; //Se guarda mensaje de aviso.
         ret++; // Ret deja de ser valido.
        }
          if(!soloLetras(especialidadMed)){ // El nombre del paciente s�lo debe contener letras.
         mensaje= mensaje + "La especialidad del m�dico posee caracteres incorrectos o no se ha ingresado"; //Se guarda mensaje de aviso.
         ret++; // Ret deja de ser valido.
        }
        if(ret!=0)
            JOptionPane.showMessageDialog(null, mensaje);
        return ret; // Correctos o Incorrectos.
    }
    
    public boolean medicoExiste() {
        int sw1 = 1; 
        boolean found = false; //Contiene el resultado de la busqueda.
        try {
            DataInputStream datomedInput = null; // Luego abrimos el archivo de medicos.
            datomedInput = new DataInputStream(new FileInputStream(System.getProperty("user.home") + "\\datomed.txt")); // abre el archivo de medicos para lectura
            while (sw1 != 0) { //Bandera para la busqueda.
                //String codm = EncryptHelper.Desencriptar(datomedInput.readUTF());		// lee el registro
                datomedInput.readUTF(); 
                datomedInput.readUTF();
                if (codm.equals(codigoMed)) {
					//compara el codigo digitado con el codigo del medico de la tabla "datomed"
                    found = true; //ENCONTRADO
                }
            }
        } catch (Exception e) {
            sw1 = 0;
        }
        return found; // Encontrado o no encontrado.
 }*/


/*

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {

        //IngresoPacientesW menu=new IngresoPacientesW();
        //menu.setVisible(true); // Vuelve el menu de ingreso de datos
        dispose(); // Desaparece el ingreso de datos de medico.
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

    private void anteriorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anteriorKeyTyped

                // Creamos un evento para que cuando se presione la tecla Enter sea como presionar el bot�n.

        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            anterior.doClick();
        }// fin del if.
    }

    private void borrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCActionPerformed

        codigo.setText(""); // Se borra el contenido del codigo del medico.
        nombre.setText(""); // Se borra el contenido del nombre de medico.
        especialidad.setText(""); // Se borra el contenido de la especialidad.
    }

    private void borrarCKeyTyped(java.awt.event.KeyEvent evt) {

        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            borrarC.doClick();
        }// fin del if.
    }

    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {

        getCodigoMed(); //Obtenemos el codigo del medico ingresado.
        getNombreMed(); // Obtenemos el nombre del medico ingresado.
        getEspecialidadMed(); // Obtenemos la especialidad del medico.
        if(validarDatosMed()==0){ // Si los datos estan bien ingresados, verifico la existencia del medico.
          if(!medicoExiste()) // Si el medico no est� registrado en el archivo entonces lo agrego.
            grabarDatosMed(); //Se guardan los datos ingresados en el archivo.
          else
           JOptionPane.showMessageDialog(null, "El c�digo del m�dico ya existe."); //Se informa que el medico ya existe.
        }
    }
*/

    private void especialidadKeyTyped(java.awt.event.KeyEvent evt) {
        
                char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n ingresar datos (dar click)
            ingresarBtn.doClick();
        }// fin del if.
    }

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {
        
                char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n ingresar datos(dar click)
            ingresarBtn.doClick();
        }// fin del if.
    }

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {
        
                char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n ingresar datos(dar click)
            ingresarBtn.doClick();
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

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0); // SE SALE DEL PROGRAMA.
    }


    private void mInfActionPerformed(java.awt.event.ActionEvent evt) {
        InformesForm iw=new InformesForm();
        iw.setVisible(true); // Hago visible la ventana de Informes.
        dispose(); // Desaparece el menu.
    }

    private void mIngDatActionPerformed(java.awt.event.ActionEvent evt) {
        
       //         IngresoPacientesW ipw=new IngresoPacientesW();
     //   ipw.setVisible(true); // Hago visible la ventana de pacientes.    
        dispose(); // Para que se oculte el menu.
    }

    
    
    private JTextField codigo;
    private JTextField nombre;
    private JTextField especialidad;
    private JButton ingresarBtn;
    private JButton borrarC;
    private JButton anterior;




    public JButton getIngresarBtn(){return this.ingresarBtn;}
    public JButton  getBorrarC(){return borrarC;}
    public JButton  getAnterior(){return anterior;}
}
