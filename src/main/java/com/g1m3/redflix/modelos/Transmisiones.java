package com.g1m3.redflix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity// sera una entidad de la base de datos
@Table(name = "series")
public class Transmisiones {

    @Id
    //@generatedValue 
    @Column(name = "id_transmisiones")
    private int id_transmisiones;

    @Column(name = "usuarios_alias")
    private String usuarios_alias;

    @Column(name = "titulo_contenido")
    private String titulo_contenido;

    @Column(name = "fecha_transmisiones")
    private String fecha_transmisiones;

    public int getId_transmisiones() {
        return id_transmisiones;
    }

    public void setId_transmisiones(int id) {
        this.id_transmisiones = id;
    }

    public String getUsuarios_alias() {
        return usuarios_alias;
    }

    public void setUsuarios_alias(String user) {
        this.usuarios_alias = user;
    }

    public String getTitulo_contenido() {
        return titulo_contenido;
    }

    public void setTitulo_contenido(String titulo) {
        this.titulo_contenido = titulo;
    }

    public String getFecha_transmisiones() {
        return fecha_transmisiones;
    }

    public void setFecha_transmisiones(String fecha) {
        this.fecha_transmisiones = fecha;
    }

}
