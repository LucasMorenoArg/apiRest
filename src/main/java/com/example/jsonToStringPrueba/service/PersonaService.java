package com.example.jsonToStringPrueba.service;

import com.example.jsonToStringPrueba.dto.Persona;
import com.example.jsonToStringPrueba.mappers.JsonToObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.YearMonth;


@Service
public class PersonaService {

    @Autowired
    private JsonToObjectMapper jsonToObjectMapper;

    public Persona mapeo(String persona) throws JsonProcessingException {

        return jsonToObjectMapper.jsonToObject(persona, Persona.class);
    }

    public static int getLastDayOfMonth(int year, int month){
        String.valueOf(YearMonth.of(year, month).lengthOfMonth());
        return YearMonth.of(year, month).lengthOfMonth();
    }
}
