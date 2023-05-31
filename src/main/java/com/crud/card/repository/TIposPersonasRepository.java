package com.crud.card.repository;

import com.crud.card.model.tbTiposPersonas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TIposPersonasRepository  implements ITiposPersonasepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<tbTiposPersonas> findAll() {
        String SQL = " SELECT * from tbTiposPersonas;";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(tbTiposPersonas.class));
    }

    @Override
    public int save(tbTiposPersonas TiposPersonas) {
        String SQL = "exec AgregarTiposPersonas ?;";
        return jdbcTemplate.update(SQL, new Object[]{TiposPersonas.getTipoPersona()});
    }

    @Override
    public int update(tbTiposPersonas TiposPersonas) {
        String SQL = "exec UpdateTiposPersonas ?, ?;";
        return jdbcTemplate.update(SQL, new Object[]{TiposPersonas.getTipoPersona(), TiposPersonas.getIdTipoPersona()});
    }

    @Override
    public int deleteById(int id) {
        String SQL = "exec DeleteTiposPersonas ?;";
        return jdbcTemplate.update(SQL, new Object[]{id});
    }
}