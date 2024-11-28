package hn.unah.poo.proyecto.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @PostMapping("/crear/nuevo")
    public String crearNuevoCliente(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
}
