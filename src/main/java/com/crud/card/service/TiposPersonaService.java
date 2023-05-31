package com.crud.card.service;

import com.crud.card.model.tbTiposPersonas;
import com.crud.card.repository.ITiposPersonasepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposPersonaService implements ITipoPersonasService {

    @Autowired
    private ITiposPersonasepository iTiposPersonasRepository;

    @Override
    public List<tbTiposPersonas> findAll() {
        List<tbTiposPersonas> list;
        try{
            list = iTiposPersonasRepository.findAll();
        }catch (Exception ex){
            throw ex;
        }
        return list;
    }

    @Override
    public int save(tbTiposPersonas TiposPersonas) {
        int row;
        try{
            row = iTiposPersonasRepository.save(TiposPersonas);
        }catch (Exception ex){
            throw ex;
        }
        return row;
    }

    @Override
    public int update(tbTiposPersonas TiposPersonas) {
        int row;
        try{
            row = iTiposPersonasRepository.update(TiposPersonas);
        }catch (Exception ex){
            throw ex;
        }
        return row;
    }

    @Override
    public int deleteById(int id) {
        int row;
        try{
            row = iTiposPersonasRepository.deleteById(id);
        }catch (Exception ex){
            throw ex;
        }
        return row;
    }
}
