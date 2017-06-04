package ar.edu.unlam.analisis.software.grupo2.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

public class ManualForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManualForm frame = new ManualForm();
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
	public ManualForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGuiaRapidaPara = new JLabel();
		lblGuiaRapidaPara.setText("Guia Rapida para el Usuario");
		lblGuiaRapidaPara.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuiaRapidaPara.setFont(new Font("Cambria", Font.PLAIN, 18));
		lblGuiaRapidaPara.setBounds(0, 0, 380, 26);
		contentPane.add(lblGuiaRapidaPara);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFocusable(false);
		scrollPane.setAutoscrolls(true);
		scrollPane.setBounds(10, 33, 380, 312);
		contentPane.add(scrollPane);
		
		JTextPane txtpnAtajos = new JTextPane();
		scrollPane.setColumnHeaderView(txtpnAtajos);
		txtpnAtajos.setText("*****************************************************\r\n\t                ATAJOS     \t                                        \r\n*****************************************************\r\n\r\n\r\n\r\n*****************************************************\r\n                            OPERACIONES                              \t                   \r\n*****************************************************\r\n\r\n\r\n");
		txtpnAtajos.setFont(new Font("Calibri", Font.PLAIN, 11));
		txtpnAtajos.setEditable(false);
		txtpnAtajos.setBorder(new EmptyBorder(1, 1, 1, 1));
		
		cerrar = new JButton();
		cerrar.setText("Cerrar Manual");
		cerrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cerrar.setBounds(20, 357, 170, 39);
		cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        cerrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                cerrarKeyTyped(evt);
            }
        });
		contentPane.add(cerrar);
		
		JLabel label_1 = new JLabel();
		label_1.setBounds(0, 0, 398, 380);
		contentPane.add(label_1);
	}
	
	private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose(); // Se oculta la ayuda.
    }

   


    private void cerrarKeyTyped(KeyEvent evt) {
        char cTeclaPresionada=evt.getKeyChar();
        // da click al detectar la tecla ENTER.
        if(cTeclaPresionada==KeyEvent.VK_ENTER){
            //Ejecuta el botón (dar click)
            cerrar.doClick();
        }// fin del if.
    }

    JButton cerrar;
    
}
