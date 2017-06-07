package ar.edu.unlam.analisis.software.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SituacionPacienteForm extends JFrame {

	private JPanel contentPane;
	private JTextField codigoPac;
	private JTextField codigoMed;
	
	String codMed=""; // Para guardar el codigo de medico ingresado.
    String codPac=""; //Para guardar el codigo del paciente ingresado.
    String diagMed=""; // Para guardar el diagnostico del m�dico.

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SituacionPacienteForm frame = new SituacionPacienteForm();
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
	public SituacionPacienteForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 738, 21);
		contentPane.add(menuBar);
		
		JMenu jMenu2 = new JMenu();
		jMenu2.setToolTipText("");
		jMenu2.setText("Ayuda");
		menuBar.add(jMenu2);
		
		JMenuItem jMenuItem2 = new JMenuItem();
		jMenuItem2.setToolTipText("Vista de gu\u00C3\u00ADa r\u00C3\u00A1pida de uso.");
		jMenuItem2.setText("Manual");
		jMenu2.add(jMenuItem2);
		
		JMenu Ira = new JMenu();
		Ira.setText("Ir a");
		menuBar.add(Ira);
		
		JMenuItem mINI = new JMenuItem();
		mINI.setText("Menu Inicio");
		Ira.add(mINI);
		
		JMenuItem mIngDat = new JMenuItem();
		mIngDat.setText("Ingreso de Datos");
		Ira.add(mIngDat);
		
		JMenuItem mInf = new JMenuItem();
		mInf.setText("Informes");
		Ira.add(mInf);
		
		JMenu opciones = new JMenu();
		opciones.setText("Opciones");
		menuBar.add(opciones);
		
		JMenuItem salir = new JMenuItem();
		salir.setText("Salir del Programa");
		opciones.add(salir);
		
		JMenuItem cerrarSesion = new JMenuItem();
		cerrarSesion.setText("Cerrar Sesi\u00C3\u00B3n");
		opciones.add(cerrarSesion);
		
		codigoPac = new JTextField();
		codigoPac.setBounds(463, 73, 144, 20);
		contentPane.add(codigoPac);
		
		codigoMed = new JTextField();
		codigoMed.setBounds(152, 73, 144, 21);
		contentPane.add(codigoMed);
		
		 ingresarBtn = new JButton();
		ingresarBtn.setBounds(544, 380, 77, 44);
		ingresarBtn.setText("Ingresar");
		ingresarBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(ingresarBtn);
		
		ant = new JButton();
		ant.setBounds(25, 380, 122, 44);
		ant.setText("Anterior");
		ant.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(ant);
		
		borrarC = new JButton();
		borrarC.setBounds(406, 380, 128, 44);
		borrarC.setText("Borrar Campos");
		borrarC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(borrarC);
		
		JLabel label = new JLabel();
		label.setText("SITUACION  DEL PACIENTE");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Cambria", Font.PLAIN, 18));
		label.setBounds(49, 32, 541, 26);
		contentPane.add(label);
		
		JLabel lblCdigoPaciente = new JLabel();
		lblCdigoPaciente.setText("C\u00F3digo Paciente");
		lblCdigoPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCdigoPaciente.setBounds(333, 73, 124, 17);
		contentPane.add(lblCdigoPaciente);
		
		JLabel lblCdigoMido = new JLabel();
		lblCdigoMido.setText("C\u00F3digo M\u00E9dico");
		lblCdigoMido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCdigoMido.setBounds(25, 73, 117, 17);
		contentPane.add(lblCdigoMido);
	}
	
	private void antActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
        //IngresoPacientesW menu=new IngresoPacientesW();
        //menu.setVisible(true); // Vuelve el menu de ingreso de datos
        dispose(); // Desaparece el ingreso de diagnostico.
    }

    private void antKeyTyped(java.awt.event.KeyEvent evt) {
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            ant.doClick();
        }// fin del if.
    }

    private void ingresarBtnKeyTyped(java.awt.event.KeyEvent evt) {
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            ingresarBtn.doClick();
        }// fin del if.
    }

    private void borrarCKeyTyped(java.awt.event.KeyEvent evt) {

                char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el bot�n (dar click)
            borrarC.doClick();
        }// fin del if.
    }

    private void borrarCActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
        codigoPac.setText(""); //Limpio todos los campos.
        codigoMed.setText("");
        //diagnostico.setText("");
    }

    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {
           
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        //ManualW guiaRapida=new ManualW();
        //guiaRapida.setVisible(true);
        setTitle("Manual de Ayuda");
    }

    private void mINIActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
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
        // TODO addAll your handling code here:
        System.exit(0); // SE SALE DEL PROGRAMA.
    }

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void mIngDatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO addAll your handling code here:
        //IngresoPacientesW ipw=new IngresoPacientesW();
        //ipw.setVisible(true); // Hago visible la ventana de pacientes.    
        dispose(); // Para que se oculte el menu.         
        dispose(); // Desaparece el informes.
    }
    
    public String getCodMed(){
        this.codMed=codigoMed.getText(); // Se obtienen los datos ingresados.
        return codMed;
    }
    
    public String getCodPac(){
        this.codPac=codigoPac.getText(); // Se obtienen los datos ingresados.
        return codPac;
    }
    
    public String getDiagMed(){
        this.diagMed=diagnostico.getText(); // Se obtienen los datos ingresados.
        return diagMed;
    }
    
    public void guardarSitPac(){
        
    }
    
    JButton ingresarBtn;
    JButton ant;
    JButton borrarC;
    JTextArea diagnostico;
}
