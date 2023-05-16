package com.Biblioteca.services;


import com.Biblioteca.model.Categoria;
import com.Biblioteca.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    ICategoriaRepository categoriaRepository;


    public Categoria save(Categoria categoria) {
        Categoria nuevaCategoria = categoriaRepository.save(categoria);
        return nuevaCategoria;
    }

    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }

    public Categoria getUserById(int id) {
        return categoriaRepository.findById(id).orElse(null);
    }
}



