
package com.portfolio.ana.Security.Dto;

import jakarta.validation.constraints.NotBlank;


public class LoginUsuario {
    @NotBlank
    private String nombreUsuario;
    private String password;
    
    //getter and setter

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
