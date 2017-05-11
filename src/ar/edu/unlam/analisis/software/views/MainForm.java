package ar.edu.unlam.analisis.software.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.SwingConstants;

public class MainForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 130, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu();
		menu.setToolTipText("Obtenga ayuda.");
		menu.setText("Ayuda");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem();
		menuItem.setToolTipText("Vista de gu\u00EDa r\u00E1pida de uso.");
		menuItem.setText("Manual");
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu();
		menu_1.setText("Ir a");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_1 = new JMenuItem();
		menuItem_1.setText("Ingreso de Datos");
		menu_1.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem();
		menuItem_2.setText("Informes");
		menu_1.add(menuItem_2);
		
		JMenu menu_2 = new JMenu();
		menu_2.setText("Opciones");
		menuBar.add(menu_2);
		
		JMenuItem menuItem_3 = new JMenuItem();
		menuItem_3.setText("Salir del Programa");
		menu_2.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem();
		menuItem_4.setText("Cerrar Sesi\u00F3n");
		menu_2.add(menuItem_4);
		
		JLabel label = new JLabel();
		label.setText("jLabel1");
		label.setBounds(0, -20, 780, 640);
		contentPane.add(label);
		
		informes = new JButton();
		informes.setToolTipText("Click para ver enfermedades y pacientes que atienden los m\u00E9dicos.");
		informes.setText("Informes");
		informes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		informes.setBounds(40, 270, 180, 64);
		informes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informesActionPerformed(evt);
            }
        });
        informes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                informesKeyTyped(evt);
            }
        });
		contentPane.add(informes);
		
		salir = new JButton();
		salir.setToolTipText("Click para salir del programa.");
		salir.setText("Salir");
		salir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		salir.setBounds(40, 360, 180, 64);
		salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        salir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salirKeyTyped(evt);
            }
        });
		contentPane.add(salir);
		
		ingreso = new JButton();
		ingreso.setToolTipText("Click para agregar informaci\u00F3n sobre m\u00E9dicos y pacientes.");
		ingreso.setText("Ingreso de Datos");
		ingreso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ingreso.setBounds(40, 180, 180, 64);
		ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoActionPerformed(evt);
            }
        });
		ingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoKeyTyped(evt);
            }
        });
		contentPane.add(ingreso);
		
		JLabel lblNewLabel = new JLabel("CONTROL DE PACIENTES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 120, 550, 26);
		lblNewLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		contentPane.add(lblNewLabel);
	}
	
	private void ingresoActionPerformed(java.awt.event.ActionEvent evt) {
        //IngresoPacientesW menu=new IngresoPacientesW();
        //menu.setVisible(true); // Vuelve el menu proncipal
        dispose(); // Desaparece el informes.
    }
	
	private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0); // SE SALE DEL PROGRAMA.
    }
	
	
	private void salirKeyTyped(java.awt.event.KeyEvent evt) {
        char cTeclaPresionada = evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada == KeyEvent.VK_ENTER){
            //Ejecuta el botón (dar click)
            salir.doClick();
        }// fin del if.
    }
	
	private void informesActionPerformed(java.awt.event.ActionEvent evt) {
        //InformesW ipw=new InformesW();
        //ipw.setVisible(true); // Hago visible la ventana de pacientes.
        dispose(); // Para que se oculte el menu.
    }
	
	private void informesKeyTyped(java.awt.event.KeyEvent evt) {
        char cTeclaPresionada = evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada == KeyEvent.VK_ENTER){
            //Ejecuta el botón (dar click)
            informes.doClick();
        }// fin del if.
    }
	
	private void ingresoKeyTyped(java.awt.event.KeyEvent evt) {
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el botón (dar click)
            ingreso.doClick();
        }// fin del if.
    }
	
	JButton salir;
	JButton informes;
	JButton ingreso;
}
