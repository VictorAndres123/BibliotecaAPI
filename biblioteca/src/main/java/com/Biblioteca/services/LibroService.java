package com.Biblioteca.services;

import com.Biblioteca.model.Libro;
import com.Biblioteca.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {

    @Autowired
    ILibroRepository libroRepository;

    public Libro guardarLibro (Libro libro) {
        Libro nuevoLibro = libroRepository.save(libro);
        return nuevoLibro;
    }
    public List<Libro> obtenerTodo() {
        return  libroRepository.findAll();
    }

    public Libro obtenerLibroId(int id) {
        return  libroRepository.findById(id).orElse(null);
    }
}

