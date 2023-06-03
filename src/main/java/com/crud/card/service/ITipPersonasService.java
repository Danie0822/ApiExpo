package com.crud.card.service;

import com.crud.card.model.tbTiposPersonas;

import java.util.List;

public interface ITipPersonasService {

    public List<tbTiposPersonas> findAll();
    public int save(tbTiposPersonas tbTiposPersonas);
    public int update(tbTiposPersonas tbTiposPersonas);
    public int deleteById(int id);
}
