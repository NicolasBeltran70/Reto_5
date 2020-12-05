package com.g1m3.redflix.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.g1m3.redflix.modelos.*;
import java.util.List;
import java.util.Optional;

@Repository
public interface PeliculasRepo extends JpaRepository <Peliculas, Long>{//<que se va a recuperar, el tipo de la primarykey >

    
}