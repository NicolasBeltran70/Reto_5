
package com.g1m3.redflix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity// sera una entidad de la base de datos
@Table(name="directores")
public class Directores {
    
    @Id    
    //@generatedValue 
    @Column(name="id_director")
    private int id_director;
    
    @Column(name="nombre_director")
    private String nombre_director;
    
    @Column(name="apellido_director")
    private String apellido_director;
    
    @Column(name="nacionalidad_director")
    private String nacionalidad_director;
    
    

    public int getId_director(){
        return id_director;
    }

    public void setId_director(int id) {
        this.id_director = id;
    }
    
    public String getNombre_director(){
        return nombre_director;
    }

    public void setNombre_director(String nombre) {
        this.nombre_director = nombre;
    }
    
    public String getApellido_director(){
        return apellido_director;
    }

    public void setApellido_director(String apellido) {
        this.apellido_director = apellido;
    }
    
    public String getNacionalidad_director(){
        return apellido_director;
    }

    public void setNacionalidad_director(String nacionalidad) {
        this.nacionalidad_director = nacionalidad;
    }
    
    
    
}
