package com.Biblioteca.controller;

import com.Biblioteca.model.Libro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/libro")
public class LibroController {
    /*private List<Libro> libros = new ArrayList<>();

    @PostMapping("/libros")
    public void agregarLibro(@RequestBody Libro libro) {
        libros.add(libro);
        System.out.println("El libro " + libro.getTitulo() + " de " + libro.getAutor() + " ha sido agregado a la biblioteca.");
    }

    @GetMapping("/libros")
    public List<Libro> listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        }
        return libros;
    }

    @GetMapping("/libros/{titulo}")
    public Libro buscarLibro(@PathVariable String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    @PutMapping("/libros/{titulo}")
    public void marcarComoLeido(@PathVariable String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.setLeido(true);
                System.out.println("El libro " + libro.getTitulo() + " ha sido marcado como leído.");
                return;
            }
        }
        System.out.println("No se encontró el libro en la biblioteca.");
    }

    @DeleteMapping("/libros/{titulo}")
    public void eliminarLibro(@PathVariable String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libros.remove(libros);
                System.out.println("El libro " + libro.getTitulo() + " ha sido eliminado de la biblioteca.");
                return ;
            }
        }
        System.out.println("No se encontró el libro en la biblioteca.");
    }*/

}

