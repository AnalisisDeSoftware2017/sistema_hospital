package ar.edu.unlam.analisis.software.grupo2.ui;

import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * Created by sbogado on 5/8/17.
 */
@Component
public class LoginJFrame extends AbstractPantalla {

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
        super(messageSource);
        initComponents();
        setLocationRelativeTo(null); // Para que el login aparezca en el centro de la pantalla.
        setResizable(false); // que no pueda agrandar la pantalla.
        
        
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
    	this.setPanel("/img/Atencion_Pacientes.jpg");
        user = new javax.swing.JTextField();
        user.setBounds(128, 17, 193, 20);
        password = new javax.swing.JPasswordField();
        password.setBounds(128, 48, 193, 20);
        ingresar = new javax.swing.JButton();
        ingresar.setBounds(138, 86, 137, 23);

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(21, 20, 57, 14);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(21, 51, 97, 14);
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acceso al Sistema", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Candara", 0, 12), java.awt.Color.darkGray)); // NOI18N
        //TODO: agragar internacionalizacion
        jLabel1.setText("Usuario:");
        jLabel4.setText("Contraseña:");

        user.setToolTipText("Ingrese su nombre de usuario.");

        password.setToolTipText("Ingrese su contrase?a.");

        ingresar.setText("Ingresar");

        ingresar.setToolTipText("Click para Ingresar al Sistema");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(391, 288, 428, 120);
        jPanel1.setLayout(null);
        jPanel1.add(ingresar);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel1);
        jPanel1.add(user);
        jPanel1.add(password);

        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -190, 820, 700);

    }

    public JButton getButtonIngresar(){
        return this.ingresar;
    }
    public JTextField getUserNameBox(){
        return this.user;
    }
    public JPasswordField getPasswordBox(){
        return this.password;
    }

    @Override
    public void setTexto() {
        setTitle(getMessage("ui.LoginJFrame.titulo", null, AppContext.getLocale())); // Le da un titulo a la ventana.
    }

    public void showErrorMessage() {
        JOptionPane.showMessageDialog(this,
                getMessage("login.error", null, AppContext.getLocale()),
                "Error",
                JOptionPane.ERROR_MESSAGE);

    }
    
    
}

