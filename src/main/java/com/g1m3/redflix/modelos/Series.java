package com.g1m3.redflix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity// sera una entidad de la base de datos
@Table(name="series")
public class Series {
    
    @Id    
    //@generatedValue 
    @Column(name="id_serie")
    private int id_serie;
    
    @Column(name="titulo_contenido")
    private String titulo_contenido;
    
    @Column(name="ser_episodio")
    private int ser_episodio;
    
    @Column(name="ser_temporadas")
    private int ser_temporadas;
    
    public int getId_serie(){
        return id_serie;
    }

    public void setId_serie(int id) {
        this.id_serie = id;
    }
    
    public String getTitulo_contenido(){
        return titulo_contenido;
    }

    public void setTitulo_contenido(String titulo) {
        this.titulo_contenido = titulo;
    }
    
    public int getSer_episodio(){
        return ser_episodio;
    }

    public void setSer_episodio(int epi) {
        this.ser_episodio = epi;
    }
    
    public int getSer_temporadas(){
        return ser_temporadas;
    }

    public void setSer_temporadas(int temp) {
        this.ser_temporadas = temp;
    }
    
    
    
}
