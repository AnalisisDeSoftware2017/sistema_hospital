package com.tssa.gilbco.pmob.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.tssa.gilbco.pmob.utils.UserService;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@Component
public class Pantalla extends JFrame {

    @Autowired
    protected MessageSource messageSource;
    
    @Autowired 
    private UserService userService;
    
    private JTextField textField;
    private JLabel lblPasswordHasheada;

    public Pantalla() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 720, 403);
        getContentPane().setLayout(null);
        
        JLabel lblPasswordAHashear = new JLabel("Password a hashear:");
        lblPasswordAHashear.setBounds(110, 133, 181, 15);
        getContentPane().add(lblPasswordAHashear);
        
        textField = new JTextField();
        textField.setBounds(312, 131, 271, 19);
        getContentPane().add(textField);
        textField.setColumns(10);
        
         lblPasswordHasheada = new JLabel("");
        lblPasswordHasheada.setBounds(29, 169, 660, 148);
        getContentPane().add(lblPasswordHasheada);
        
        JButton btnHashearPassword = new JButton("Hashear password");
        btnHashearPassword.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Pantalla.this.hashPassword();
        	}
        });
        btnHashearPassword.setBounds(250, 329, 195, 25);
        getContentPane().add(btnHashearPassword);
        
        JLabel lblSaras = new JLabel("Clinica Los Laureles");
        lblSaras.setFont(new Font("Montserrat Alternates Medium", Font.BOLD, 28));
        lblSaras.setBounds(186, 22, 317, 54);
        getContentPane().add(lblSaras);
        
        
    }
    
    private void hashPassword(){
    	this.lblPasswordHasheada.setText(userService.hashPassword(this.textField.getText()));
    }
}
