package ar.edu.unlam.analisis.software.grupo2.ui.impl;

import ar.edu.unlam.analisis.software.grupo2.core.model.User;
import ar.edu.unlam.analisis.software.grupo2.ui.AbstractFormCreate;
import ar.edu.unlam.analisis.software.grupo2.utils.AppContext;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * Created by sbogado on 6/6/17.
 */
@Component
public class FormCreateUser extends AbstractFormCreate<User> {
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtUsername;
    private JPasswordField fldPassword;
    private JPasswordField confirmPassword;
    private JTextField txtEmail;

    public FormCreateUser() {
        setLayout(null);

        txtNombre = new JTextField();
        txtNombre.setBounds(227, 77, 285, 26);
        add(txtNombre);
        txtNombre.setColumns(10);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(227, 49, 61, 16);
        add(lblNombre);

        txtApellido = new JTextField();
        txtApellido.setColumns(10);
        txtApellido.setBounds(227, 143, 285, 26);
        add(txtApellido);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(227, 115, 61, 16);
        add(lblApellido);

        txtUsername = new JTextField();
        txtUsername.setColumns(10);
        txtUsername.setBounds(227, 210, 285, 26);
        add(txtUsername);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(227, 182, 112, 16);
        add(lblUsername);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(227, 316, 112, 16);
        add(lblPassword);

        JLabel lblConfirmPassword = new JLabel("Confirmar password:");
        lblConfirmPassword.setBounds(227, 392, 166, 16);
        add(lblConfirmPassword);

        fldPassword = new JPasswordField();
        fldPassword.setBounds(227, 343, 285, 26);
        add(fldPassword);

        confirmPassword = new JPasswordField();
        confirmPassword.setBounds(227, 419, 285, 26);
        add(confirmPassword);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(227, 253, 46, 14);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(227, 278, 285, 27);
        add(txtEmail);
        txtEmail.setColumns(10);
    }


    @Override
    public User getEntity() {
        entity.setNombre(this.txtNombre.getText());
        entity.setApellido(this.txtApellido.getText());
        entity.setUsername(this.txtUsername.getText());
        entity.setEmail(this.txtEmail.getText());
        String password = new String(this.fldPassword.getPassword());
        String confirmPassword = new String(this.confirmPassword.getPassword());
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this,
                    this.messageSource.getMessage("error.password.not.coincidence", null, AppContext.getLocale()),
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            entity.setPassword(null);
        } else {
            entity.setPassword(new String(this.fldPassword.getPassword()));
        }

        return entity;
    }

    @Override
    public void setEntity(User entitys) {
        this.entity = entitys == null ? new User() : entitys;
        this.txtApellido.setText(entity.getApellido());
        this.txtNombre.setText(entity.getNombre());
        this.txtUsername.setText(entity.getUsername());
        this.txtEmail.setText(entity.getEmail());
        this.confirmPassword.setText("");
        this.fldPassword.setText("");
    }


    @Override
    public void setTexto() {

    }
}
