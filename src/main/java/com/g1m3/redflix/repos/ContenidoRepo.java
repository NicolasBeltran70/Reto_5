package com.g1m3.redflix.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.g1m3.redflix.modelos.*;
import java.util.List;

@Repository
public interface ContenidoRepo extends JpaRepository <Contenido, String>{//<que se va a recuperar, el tipo de la primarykey >
    // ek pero sirve para persistir-mapear el modelo
    

}
