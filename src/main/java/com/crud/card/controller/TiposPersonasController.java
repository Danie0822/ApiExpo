package com.crud.card.controller;

import com.crud.card.model.ServiceResponse;
import com.crud.card.model.tbTiposPersonas;
import com.crud.card.service.ITipoPersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("TiposPersonas")
@CrossOrigin("*")
public class TiposPersonasController {
    @Autowired
    private ITipoPersonasService ICredecialesService;

    @GetMapping("/list")
    public ResponseEntity<List<tbTiposPersonas>> list() {
        var result = ICredecialesService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ServiceResponse> save(@RequestBody tbTiposPersonas tbTiposPersonas) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = ICredecialesService.save(tbTiposPersonas);
        if (result == 1) {
            serviceResponse.setMessage("Item saved with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ServiceResponse> update(@RequestBody tbTiposPersonas tbTiposPersonas) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = ICredecialesService.update(tbTiposPersonas);
        if (result == 1) {
            serviceResponse.setMessage("Item update with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ServiceResponse> update(@PathVariable int id) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = ICredecialesService.deleteById(id);
        if (result == 1) {
            serviceResponse.setMessage("Item removed with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }
}
