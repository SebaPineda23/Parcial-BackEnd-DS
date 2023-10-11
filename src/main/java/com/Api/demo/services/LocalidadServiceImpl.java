package com.Api.demo.services;

import com.Api.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import com.Api.demo.entities.Localidad;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements  LocalidadService{
    public LocalidadServiceImpl(BaseRepository<Localidad, Long>baseRepository){
        super(baseRepository);
    }
}
