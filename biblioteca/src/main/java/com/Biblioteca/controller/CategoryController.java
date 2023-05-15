package com.Biblioteca.controller;

import com.Biblioteca.model.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class CategoryController {
    private List<Category> categorias = new ArrayList<>();

    @PostMapping("/categorias")
    public void agregarCategoria(@RequestBody Category categoria) {
        categorias.add(categoria);
        System.out.println("La categoría " + categoria.getName() + " ha sido agregada a la lista.");
    }

    @GetMapping("/categorias")
    public List<Category> listarCategorias() {
        if (categorias.isEmpty()) {
            System.out.println("No hay categorías en la lista.");
        }
        return categorias;
    }

    @GetMapping("/categorias/{nombre}")
    public Category buscarCategoria(@PathVariable String nombre) {
        for (Category categoria : categorias) {
            if (categoria.getName().equalsIgnoreCase(nombre)) {
                return categoria;
            }
        }
        return null;
    }

    @PutMapping("/categorias/{nombre}")
    public void actualizarCategoria(@PathVariable String nombre, @RequestBody Category nuevaCategoria) {
        for (Category categoria : categorias) {
            if (categoria.getName().equalsIgnoreCase(nombre)) {
                categoria.setName(nuevaCategoria.getName());
                categoria.setDescription(nuevaCategoria.getDescription());
                System.out.println("La categoría " + categoria.getName() + " ha sido actualizada.");
                return;
            }
        }
        System.out.println("No se encontró la categoría en la lista.");
    }

    @DeleteMapping("/categorias/{nombre}")
    public void eliminarCategoria(@PathVariable String nombre) {
        for (Category categoria : categorias) {
            if (categoria.getName().equalsIgnoreCase(nombre)) {
                categorias.remove(categoria);
                System.out.println("La categoría " + categoria.getName() + " ha sido eliminada de la lista.");
                return;
            }
        }
        System.out.println("No se encontró la categoría en la lista.");
    }

}

