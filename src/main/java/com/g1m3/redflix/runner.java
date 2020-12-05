/*
package com.g1m3.redflix;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.g1m3.redflix.modelos.*;
import com.g1m3.redflix.repos.*;
        
@Component
public class runner implements CommandLineRunner{
    
    @Autowired
    private ContenidoRepo repo;//declaramos el objeto repo
    
    @Override//sobre escritura
    public void run(String... args) throws Exception{
    
        /*
        
        
        
        
        Contenido cn = new Contenido();//declaracion tipo contenido 
        cn.setTitulo_contenido("lost");//almacenado titulo
        cn.setTipo_contenido("serie");//almacenado tipo 
        repo.save(cn);
        //repo.delete(cn);
        
        System.out.println("guardado con exito");
       
        System.out.println("cantidad de registros: "+repo.count());
        
 //--------------------------consulta si existe una variable---------------
        String x="lost";
        boolean existe = repo.existsById(x);
        
        if (existe){
            System.out.println("existe "+ x);
        }
//-------------------------consulta del objeto ---------------

        Optional<Contenido> consulta = repo.findById(x);// crea un objeto tipo contenido y lo iguala a la consulta
        
        if(consulta.isPresent()){
            
            Contenido llamado = consulta.get();// llama la consulta y lo guarda en un tipo contendio
            System.out.println("consulta");
            System.out.println("titulo: "+llamado.getTitulo_contenido());
            System.out.println("tipo: "+llamado.getTipo_contenido());
            
            /*
            
            //si queremos actualizar o modificar un valor de ese registro ya llamado.
            
            llamado.setTipo_contenido("mini serie");
            repo.save(llamado);
            
            
            
            
        
        
        }
    
    
    
    }
}
*/