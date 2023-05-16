package com.Biblioteca.controller;

import com.Biblioteca.model.Editorial;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class EditorialController {


/*
        private List<Editorial> editoriales = new ArrayList<>();

        @PostMapping("/editoriales")
        public void agregarEditorial(@RequestBody Editorial editorial) {
            editoriales.add(editorial);
            System.out.println("La editorial " + editorial.getNombre() + " ha sido agregada a la lista.");
        }

        @GetMapping("/editoriales")
        public List<Editorial> listarEditoriales() {
            if (editoriales.isEmpty()) {
                System.out.println("No hay editoriales en la lista.");
            }
            return editoriales;
        }

        @GetMapping("/editoriales/{nombre}")
        public Editorial buscarEditorial(@PathVariable String nombre) {
            for (Editorial editorial : editoriales) {
                if (editorial.getNombre().equalsIgnoreCase(nombre)) {
                    return editorial;
                }
            }
            return null;
        }

        @PutMapping("/editoriales/{nombre}")
        public void actualizarEditorial(@PathVariable String nombre, @RequestBody Editorial nuevaEditorial) {
            for (Editorial editorial : editoriales) {
                if (editorial.getNombre().equalsIgnoreCase(nombre)) {
                    editorial.setNombre(nuevaEditorial.getNombre());
                    editorial.setDireccion(nuevaEditorial.getDireccion());
                    System.out.println("La editorial " + editorial.getNombre() + " ha sido actualizada.");
                    return;
                }
            }
            System.out.println("No se encontró la editorial en la lista.");
        }

        @DeleteMapping("/editoriales/{nombre}")
        public void eliminarEditorial(@PathVariable String nombre) {
            for (Editorial editorial : editoriales) {
                if (editorial.getNombre().equalsIgnoreCase(nombre)) {
                    editoriales.remove(editorial);
                    System.out.println("La editorial " + editorial.getNombre() + " ha sido eliminada de la lista.");
                    return;
                }
            }
            System.out.println("No se encontró la editorial en la lista.");
        }*/


}
