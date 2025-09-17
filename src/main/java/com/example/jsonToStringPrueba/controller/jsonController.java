package com.example.jsonToStringPrueba.controller;

import com.example.jsonToStringPrueba.dto.Persona;
import com.example.jsonToStringPrueba.service.PersonaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("jsonController/")
public class jsonController {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private ObjectMapper objectMapper;

    private Logger logger;

    @PostMapping("")
    public String mapeo (@RequestBody String persona) throws JsonProcessingException {

        System.out.println(persona);
        //objectMapper.readValue(persona, Persona.class);
        personaService.mapeo(persona);
        String p = String.valueOf(personaService.mapeo(persona));

        return p;
    }

}
