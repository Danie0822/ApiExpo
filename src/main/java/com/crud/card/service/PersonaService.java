package com.crud.card.service;

import com.crud.card.model.tbPersonas;
import com.crud.card.model.tbTiposPersonas;
import com.crud.card.repository.IPersonasepository;
import com.crud.card.repository.ITiposPersonasepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaService implements PersonasService {
    @Autowired
    private IPersonasepository IPersonasepository;
    @Override
    public List<tbPersonas> findAll() {
        List<tbPersonas> list;
        try{
            list = IPersonasepository.findAll();
        }catch (Exception ex){
            throw ex;
        }
        return list;
    }

    @Override
    public int save(tbPersonas Personas) {
        int row;
        try{
            row = IPersonasepository.save(Personas);
        }catch (Exception ex){
            throw ex;
        }
        return row;
    }

    @Override
    public int update(tbPersonas Personas) {
        int row;
        try{
            row = IPersonasepository.update(Personas);
        }catch (Exception ex){
            throw ex;
        }
        return row;
    }

    @Override
    public int deleteById(String id) {
        int row;
        try{
            row = IPersonasepository.deleteById(id);
        }catch (Exception ex){
            throw ex;
        }
        return row;
    }
}
