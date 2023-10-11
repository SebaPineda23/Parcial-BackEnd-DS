package com.Api.demo.services;

import com.Api.demo.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.demo.entities.Autor;
import com.Api.demo.repositories.AutorRepository;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository){
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}
