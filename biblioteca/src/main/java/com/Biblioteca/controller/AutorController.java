package com.Biblioteca.controller;


import com.Biblioteca.model.Autor;
import com.Biblioteca.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {
    @Autowired
    AutorService autorService;

    @GetMapping
    public ResponseEntity<List<Autor>> getAll() {
        List<Autor> autores = autorService.getAll();
        if (autores.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(autores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> getById(@PathVariable("id") int id) {
        Autor autor = autorService.getAutorById(id);
        if (autor == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(autor);
    }

    @PostMapping
    public ResponseEntity<Autor> save(@RequestBody Autor autor) {
        Autor autorNew = autorService.save(autor);
        return ResponseEntity.ok(autorNew);
    }

}
