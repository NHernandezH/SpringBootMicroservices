/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noe.com.example.basicauthentication.entity;

/**
 *
 * @author noe_5
 */
public class User {
    
    private String username;
    private String Password;
    private String role;

    public User(String username, String Password, String role) {
        this.username = username;
        this.Password = Password;
        this.role = role;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRole() {
        return role;
    }

    public void setRol(String role) {
        this.role = role;
    }
    
    
    
}
