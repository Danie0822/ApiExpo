package com.crud.card.repository;

import com.crud.card.model.tbPersonas;
import com.crud.card.model.tbTiposPersonas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PersonasRepository  implements  IPersonasepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<tbPersonas> findAll() {
        String SQL = " SELECT * FROM tbPersonas;";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(tbPersonas.class));
    }

    @Override
    public int save(tbPersonas Personas) {
        String SQL = "exec AgregarPersonas ?,?,?,?,?,? ;";
        return jdbcTemplate.update(SQL, new Object[]{Personas.getIdPersona(), Personas.getNombrePersona(), Personas.getApellidoPersona(), Personas.getNacimientoPersona(), Personas.getIdTipoPersona(), (Personas.getFoto())});
    }

    @Override
    public int update(tbPersonas Personas) {
        String SQL = "exec UpdatesPersonas?,?,?,?,?,?;";
        return jdbcTemplate.update(SQL, new Object[]{Personas.getIdPersona(), Personas.getNombrePersona(), Personas.getApellidoPersona(), Personas.getNacimientoPersona(), Personas.getIdTipoPersona(), Personas.getFoto()});
    }

    @Override
    public int deleteById(String id) {
        String SQL = "exec DeletePersonas ?;";
        return jdbcTemplate.update(SQL, new Object[]{id});
    }

}


