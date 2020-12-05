package com.g1m3.redflix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity// sera una entidad de la base de datos
@Table(name = "peliculas")
public class Peliculas {

    @Id
    //@generatedValue 
    @Column(name = "id_pelicula")
    private long id_pelicula;

    @Column(name = "titulo_contenido")
    private String titulo_contenido;

    @Column(name = "pel_resumen")
    private String pel_resumen;

    @Column(name = "pel_fecha")
    private int pel_fecha;

    @Column(name = "id_director")
    private int id_director;

    @Column(name = "pel_nom_director")
    private String pel_nom_director;

    public long getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(long id) {
        this.id_pelicula = id;
    }

    public String getTitulo_contenido() {
        return titulo_contenido;
    }

    public void setTitulo_contenido(String titulo) {
        this.titulo_contenido = titulo;
    }

    public String getPel_resumen() {
        return pel_resumen;
    }

    public void setPel_resumen(String resumen) {
        this.pel_resumen = resumen;
    }

    public int getPel_fecha() {
        return pel_fecha;
    }

    public void setPel_fecha(int fecha) {
        this.pel_fecha = fecha;
    }

    public int getId_director() {
        return id_director;
    }

    public void setId_director(int id) {
        this.id_director = id;
    }
    
    public String getPel_nom_director() {
        return pel_nom_director;
    }

    public void setPel_nom_director(String nombre) {
        this.pel_nom_director = nombre;
    }

}
