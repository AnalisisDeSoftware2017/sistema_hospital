package ar.edu.unlam.analisis.software.grupo2.core.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by sbogado on 07/05/17.
 */

@Entity
@Table(name = "usuarios_sistema")
public class User extends AbmEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @NotNull
    @NotEmpty
    @Size(max=100)
    @Column(unique = true)
    private String username;


    @NotNull
    @NotEmpty
    @Size(max=100)
    private String password;

    @NotNull
    @NotEmpty
    @Size(max=100)
    @Column(unique = true)
    private String email;

    @NotNull
    @NotEmpty
    @Size(max=100)
    private String nombre;

    @NotNull
    @NotEmpty
    @Size(max=100)
    private String apellido;
    
    @NotNull
    private Boolean isActive=false;

    @NotNull
    private Boolean isLocked=false;

    @NotNull
    private Date fechaCreacion=new Date();

    private Date lastLogin;

    @NotNull
    private Integer failedLogin;


    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (nombre != null ? !nombre.equals(user.nombre) : user.nombre != null) return false;
        if (apellido != null ? !apellido.equals(user.apellido) : user.apellido != null) return false;
        if (isActive != null ? !isActive.equals(user.isActive) : user.isActive != null) return false;
        if (isLocked != null ? !isLocked.equals(user.isLocked) : user.isLocked != null) return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(user.fechaCreacion) : user.fechaCreacion != null)
            return false;
        if (lastLogin != null ? !lastLogin.equals(user.lastLogin) : user.lastLogin != null) return false;
        return failedLogin != null ? failedLogin.equals(user.failedLogin) : user.failedLogin == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (isLocked != null ? isLocked.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        result = 31 * result + (failedLogin != null ? failedLogin.hashCode() : 0);
        return result;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getFailedLogin() {
        return failedLogin;
    }

    public void setFailedLogin(Integer failedLogin) {
        this.failedLogin = failedLogin;
    }

    @Override
    public String getName() {
        return this.username + "    " + this.nombre + "    " + this.apellido;
    }
}
