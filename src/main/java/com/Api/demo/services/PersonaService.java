package com.Api.demo.services;

import java.util.List;

import com.Api.demo.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonaService extends BaseService<Persona, Long>{

    public List<Persona> search (String filtro) throws Exception;
    public Page<Persona> search (String filtro, Pageable pageable) throws Exception;
}
