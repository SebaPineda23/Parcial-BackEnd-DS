package com.Api.demo.services;


import java.io.Serializable;
import java.util.List;

import com.Api.demo.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BaseService<E extends Base, ID extends Serializable> {

    public List<E> findAll() throws Exception;
    public Page<E> findAll(Pageable pageable) throws Exception;
    public E findById(ID id) throws Exception;
    public E save (E entity) throws Exception;
    public E update (E entity, ID id) throws Exception;
    public boolean delete (ID id) throws Exception;

}
