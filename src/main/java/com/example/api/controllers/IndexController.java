package com.example.api.controllers;


import com.example.api.entities.Usuario;
import com.example.api.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api")
public class IndexController {
    private UsuarioService service;

    public IndexController(UsuarioService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("usuarios")
    public ArrayList<Usuario> index(){
        return service.getUsers();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("crear")
    public Usuario crear(@RequestBody Usuario data){
        this.service.create(data);
        return data;
    }
}
