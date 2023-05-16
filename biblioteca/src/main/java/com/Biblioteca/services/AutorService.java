package com.Biblioteca.services;


import com.Biblioteca.model.Autor;
import com.Biblioteca.repository.IAutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    IAutorRepository autorRepository;


    public Autor save(Autor autor) {
        Autor userNew = autorRepository.save(autor);
        return userNew;
    }

    public List<Autor> getAll() {
        List<Autor> listAutores = autorRepository.findAll();
        return listAutores;
    }

    public Autor getAutorById(int id) {
        Autor autor = autorRepository.findById(id).orElse(null);
        return autor;
    }
}

