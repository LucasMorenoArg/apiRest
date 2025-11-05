package com.example.jsonToStringPrueba;


import com.example.jsonToStringPrueba.service.PersonaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class jsonToStringPruebaApplication {

    public static void main(String[] args) {
        SpringApplication.run(jsonToStringPruebaApplication.class, args);
        System.out.println("Hola Mundo jsonToStringPruebaApplication");
        System.out.println(PersonaService.getLastDayOfMonth(2025,9));
        //Persona pers = new Persona("Juan", "maaa0", 314);


    }
}


