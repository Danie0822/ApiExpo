package com.crud.card.controller;

import com.crud.card.model.ServiceResponse;
import com.crud.card.model.tbPersonas;
import com.crud.card.service.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Personas")
@CrossOrigin("*")
public class PersonasController {
    @Autowired
    private PersonasService PersonasService;
    @GetMapping("/list")
    public ResponseEntity<List<tbPersonas>> list() {
        var result = PersonasService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ServiceResponse> save(@RequestBody tbPersonas tbPersonas) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = PersonasService.save(tbPersonas);
        if (result == 1) {
            serviceResponse.setMessage("Item saved with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ServiceResponse> update(@RequestBody tbPersonas tbPersonas) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = PersonasService.update(tbPersonas);
        if (result == 1) {
            serviceResponse.setMessage("Item update with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ServiceResponse> update(@PathVariable String id) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = PersonasService.deleteById(id);
        if (result == 1) {
            serviceResponse.setMessage("Item removed with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }
}