package com.Biblioteca.services;


import com.Biblioteca.model.Autor;
import com.Biblioteca.model.Usuario;
import com.Biblioteca.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutorService {
    /*@Autowired
    IAutorRepository usuarioRepository;


    public Usuario save (Usuario user) {
        Usuario userNew = usuarioRepository.save(user);
        return userNew;
    }
    public List<Usuario> getAll() {
        return  usuarioRepository.findAll();
    }

    public Usuario getUserById(int id) {
        return  usuarioRepository.findById(id).orElse(null);
    }*/
}

