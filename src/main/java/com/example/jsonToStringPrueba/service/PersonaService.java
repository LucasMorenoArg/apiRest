package com.example.jsonToStringPrueba.service;

import com.example.jsonToStringPrueba.dto.Persona;
import com.example.jsonToStringPrueba.mappers.JsonToObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    private final JsonToObjectMapper jsonToObjectMapper;

    public PersonaService(JsonToObjectMapper jsonToObjectMapper) {
        this.jsonToObjectMapper = jsonToObjectMapper;
    }

    public Persona mapeo(String persona) throws JsonProcessingException {

        return jsonToObjectMapper.jsonToObject(persona, Persona.class);
    }
}
