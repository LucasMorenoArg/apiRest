package com.example.apiRest.services;

import com.example.apiRest.entities.Persona;
import com.example.apiRest.mapper.JsonToObjectMapper;
import com.example.apiRest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements BaseService<Persona>{

    @Autowired
    private PersonaRepository personaRepository;

    private final JsonToObjectMapper jsonToObjectMapper;

    public PersonaService(JsonToObjectMapper jsonToObjectMapper) {
        this.jsonToObjectMapper = jsonToObjectMapper;
    }

    @Override
    @Transactional
    public List<Persona> findAll() throws Exception {

        try {
            List<Persona> entities = personaRepository.findAll();
             return entities;
        } catch (Exception e){
            throw new Exception(e.getMessage() +
                    " "+ e.getCause());
        }
    }

    @Override
    @Transactional
    public Persona findById(Long id) throws Exception {
        try {

            Optional<Persona> personaOptional= personaRepository.findById(id);
            return personaOptional.get();

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona save(Persona entity) throws Exception {
        try {

            entity = personaRepository.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Persona update(Long id, Persona entity) throws Exception {

        try {
            Optional<Persona> personaOptional=personaRepository.findById(id);
            Persona persona = personaOptional.get();
            return persona = personaRepository.save(entity);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        
        try {
            if (personaRepository.existsById(id)){
                personaRepository.deleteById(id);
                return true;}
            else throw new Exception("Error al borrar");
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
