package com.example.jsonToStringPrueba.service;

import com.example.jsonToStringPrueba.mappers.JsonToObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class quoteService {

    private final JsonToObjectMapper jsonToObjectMapper;

    public quoteService(JsonToObjectMapper jsonToObjectMapper) {
        this.jsonToObjectMapper = jsonToObjectMapper;
    }
}
