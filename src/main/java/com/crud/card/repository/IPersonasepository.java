package com.crud.card.repository;

import com.crud.card.model.tbPersonas;
import com.crud.card.model.tbTiposPersonas;

import java.util.List;

public interface IPersonasepository {
    public List<tbPersonas> findAll();
    public int save(tbPersonas Personas);
    public int update(tbPersonas Personas);
    public int deleteById(String id);
}
