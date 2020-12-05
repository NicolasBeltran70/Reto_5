package com.g1m3.redflix;

import com.g1m3.redflix.vistas.*;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("com.g1m3.redflix")
public class RedflixApplication {

    public static void main(String[] args) {
        
        ControlCRUD inter = new ControlCRUD();
        inter.setVisible(true);
    }
    
    public static void runSpringServer(String[] args) {
        
        SpringApplication.run(RedflixApplication.class, args);
    }

}
