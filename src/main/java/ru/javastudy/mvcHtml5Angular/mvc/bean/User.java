package ru.javastudy.mvcHtml5Angular.mvc.bean;

import com.sun.javafx.beans.IDProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by belstrel on 09.10.17.
 */
@Entity
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUSER")
    private int idUser;

    @NotEmpty
    @Size(min = 5, max = 20)
    @Column(name = "USERNAME")
    private String username;

    @NotEmpty
    @Size(min=5, max=20)
    @Column(name="PASSWORD")
    private String password;

    @Column(name="ENABLED")
    private boolean enabled;


    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enebled) {
        this.enabled = enebled;
    }
}
