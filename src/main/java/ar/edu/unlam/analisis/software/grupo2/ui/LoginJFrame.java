package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by sbogado on 5/8/17.
 */
@Component
public class LoginJFrame extends JFrame{


    private MessageSource messageSource;

    private static final long serialVersionUID = 1L;
    private String usuario = "";
    private String contrasenia = "";

    // Variables declaration - do not modify
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration

    /**
     * Launch the application.
     */
	/*public static void main(String[] args) {

	}*/

    /**
     * Create the frame.
     */
    @Autowired
    public LoginJFrame(MessageSource messageSource) {
        initComponents();
        setSize(666,464);
        setLocationRelativeTo(null); // Para que el login aparezca en el centro de la pantalla.
        setResizable(false); // que no pueda agrandar la pantalla.
        //TODO: add internacionalziacion
        this.messageSource=messageSource;
        setTitle(messageSource.getMessage("ui.LoginJFrame.titulo", null, AppContext.getLocale())); // Le da un titulo a la ventana.
    }

    public String getUsuario(){
        this.usuario = ""; //La cadena Limpia.
        this.usuario = user.getText(); //Obtenemos el nombre de usuario ingresado.
        return usuario; // Devolvemos el nombre de usuario.
    }

    public String getPass(){
        this.contrasenia = ""; //Cadena de String vac?a para luego guardar la contrase?a ingresada.
        char [] pass=password.getPassword(); // Obtenemos la contrase?a que ingres? el usuario.
        for(int i = 0; i < pass.length; i++){ //Debemos realizar un for para copiar la pass ingresada a la cadena.
            this.contrasenia += pass[i]; //Se copia.
        }
        return contrasenia;
    }

    private void initComponents() {

        user = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        ingresar = new javax.swing.JButton();

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acceso al Sistema", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Candara", 0, 12), java.awt.Color.darkGray)); // NOI18N
        jLabel1.setText("Usuario:");
        jLabel4.setText("contrase?a:");

        user.setToolTipText("Ingrese su nombre de usuario.");
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });

        password.setToolTipText("Ingrese su contrase?a.");
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });

        ingresar.setText("Ingresar");
        ingresar.setToolTipText("Click para Ingresar al Sistema");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        ingresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ingresar)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                                        .addComponent(password))))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingresar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(430, 150, 220, 120);

        //jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portadaL.jpg")));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -190, 820, 700);

    }

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        getUsuario(); //Obtenemos el usuario.
        getPass(); //Obtenemos la contrase?a.
        // Se muestra un mensaje si alguno de los campos est? vac?o.
        if(this.usuario == null || this.usuario.isEmpty() || this.contrasenia == null || this.contrasenia.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, ingrese nombre de usuario y contrase?a."); //Mensaje de Error.
        }else{
            //TODO validacion contra base de datos
        }
    }

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        // Creamos un evento para que cuando se presione la tecla Enter sea como presionar INGRESAR.
        //El usuario puede ingresar la contrase?a e ingresar con un Enter.
        //******************************************************************************************
        char cTeclaPresionada=evt.getKeyChar();
        // da click en el bot?n Ingresar al detectar la tecla ENTER.
        if(cTeclaPresionada== KeyEvent.VK_ENTER){
            //Ejecuta el bot?n Ingresar (dar click)
            ingresar.doClick();
        }// fin del if.

    }

    private void userKeyTyped(java.awt.event.KeyEvent evt) {
        // Creamos un evento para que cuando se presione la tecla Enter sea como presionar INGRESAR.
        //El usuario puede ingresar el usuario e ingresar con un Enter.
        //******************************************************************************************
        char cTeclaPresionada=evt.getKeyChar();
        // da click en el bot?n Ingresar al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot?n Ingresar (dar click)
            ingresar.doClick();
        }// fin del if.
    }

    private void ingresarKeyTyped(java.awt.event.KeyEvent evt) {
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot?n (dar click)
            ingresar.doClick();
        }// fin del if.
    }
}

