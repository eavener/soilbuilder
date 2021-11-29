package org.launchcode.soilbuilder.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class User extends AbstractEntity {

    @NotBlank(message = "Please enter a username")
    @Size(min = 5, max = 15, message = "Username must be between 5 amd 15 characters")
    private String username;

    @Email(message = "Please enter a valid email")
    private String email;

    @NotBlank(message = "Please create a password")
    @NotNull
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @NotBlank
    @NotNull(message = "Passwords do not match")
    private String verify;

    private void checkPassword() {
        if(!Objects.equals(this.password, this.verify)) {
            verify = null;
        }
    }

    public User() {

    }

    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
        checkPassword();
    }

    @Override
    public String toString() {
        return username;
    }
}
