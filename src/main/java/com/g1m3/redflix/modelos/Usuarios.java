
package com.g1m3.redflix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity// sera una entidad de la base de datos
@Table(name="usuarios")
public class Usuarios {
    
    @Id    
    //@generatedValue 
    @Column(name="alias")
    private String alias;
    
    @Column(name="nombre_usuario")
    private String nombre_usuario;
    
    @Column(name="apellido_usuario")
    private String apellido_usuario;
    
    @Column(name="email_usuario")
    private String email_usuario;
    
    @Column(name="celular_usuario")
    private long celular_usuario;
    
    @Column(name="pass_usuario")
    private String pass_usuario;
    
    @Column(name="nacimiento_usuario")
    private int nacimiento_usuario;
    
    
    public String getAlias(){
        return alias;
    }

    public void setAlias(String id) {
        this.alias = id;
    
    }
    
    public String getNombre_usuario(){
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre) {
        this.nombre_usuario = nombre;
    
    }
    
    public String getApellido_usuario(){
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido) {
        this.apellido_usuario = apellido;
    
    }
    
    public String getEmail_usuario(){
        return email_usuario;
    }

    public void setEmail_usuario(String email) {
        this.email_usuario = email;
    
    }
    
    public long getCelular_usuario(){
        return celular_usuario;
    }

    public void setCelular_usuario(long cell) {
        this.celular_usuario = cell;
    }
    
    public String getPass_usuario(){
        return pass_usuario;
    }

    public void setPass_usuario(String pass) {
        this.pass_usuario = pass;
    }
    
    public int getNacimiento_usuario(){
        return nacimiento_usuario;
    }

    public void setNacimiento_usuario(int fecha) {
        this.nacimiento_usuario = fecha;
    }
    
    
    
    
    
}
