
package com.g1m3.redflix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity// sera una entidad de la base de datos
@Table(name="contenido")//asociamos ala clase a una tabla
public class Contenido {
    
    @Id//primary kwy    
    //@generatedValue // para un id que auto incrementa
    @Column(name="titulo_contenido")//es una columna-atributo
    private String titulo_contenido;
    
    @Column(name="tipo_contenido")
    private String tipo_contenido;

    public String getTitulo_contenido(){
        return titulo_contenido;
    }

    public void setTitulo_contenido(String titulo) {
        this.titulo_contenido = titulo;
    }
    
    public String getTipo_contenido(){
        return tipo_contenido;
    }

    public void setTipo_contenido(String tipo) {
        this.tipo_contenido = tipo;
    }

}




