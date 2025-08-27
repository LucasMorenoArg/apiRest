package com.example.jsonToStringPrueba.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class JsonToObjectMapper {

    private ObjectMapper objectMapper = new ObjectMapper();

    public <T> T jsonToObject(String json, Class<T> type) throws JsonProcessingException {
        return objectMapper.readValue(json, type);
    }
}
