package com.crud.card.service;

import com.crud.card.model.tbPersonas;

import java.util.List;

public interface PersonasService {
    public List<tbPersonas> findAll();
    public int save(tbPersonas Personas);
    public int update(tbPersonas Personas);
    public int deleteById(String id);
}
