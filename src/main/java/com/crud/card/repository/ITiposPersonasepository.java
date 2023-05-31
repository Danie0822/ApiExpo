package com.crud.card.repository;



import com.crud.card.model.tbTiposPersonas;

import java.util.List;

public interface ITiposPersonasepository {
    public List<tbTiposPersonas> findAll();
    public int save(tbTiposPersonas TiposPersonas);
    public int update(tbTiposPersonas TiposPersonas);
    public int deleteById(int id);
}
