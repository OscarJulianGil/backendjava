package com.example.api.services;

import com.example.api.entities.Usuario;
import com.example.api.repository.IUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {

    private IUsuarioRepository userRepository;

    public UsuarioService(IUsuarioRepository rep){
        this.userRepository = rep;
    }

    public ArrayList<Usuario> getUsers(){
        return (ArrayList<Usuario>) this.userRepository.findAll();
    }

    public void create(Usuario data){
        this.userRepository.save(data);
    }
}
