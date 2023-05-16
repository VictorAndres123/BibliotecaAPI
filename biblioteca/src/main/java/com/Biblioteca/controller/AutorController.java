package com.Biblioteca.controller;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorController {
    /*private List<Autor> autores = new ArrayList<>();

    @PostMapping("/autores")
    public void agregarAutor(@RequestBody Autor autor) {
        autores.add(autor);
        System.out.println("El autor " + autor.getNombre() + " ha sido agregado a la lista.");
    }

    @GetMapping("/autores")
    public List<Autor> listarAutores() {
        if (autores.isEmpty()) {
            System.out.println("No hay autores en la lista.");
        }
        return autores;
    }

    @GetMapping("/autores/{nombre}")
    public Autor buscarAutor(@PathVariable String nombre) {
        for (Autor autor : autores) {
            if (autor.getNombre().equalsIgnoreCase(nombre)) {
                return autor;
            }
        }
        return null;
    }

    @PutMapping("/autores/{nombre}")
    public void actualizarAutor(@PathVariable String nombre, @RequestBody Autor nuevoAutor) {
        for (Autor autor : autores) {
            if (autor.getNombre().equalsIgnoreCase(nombre)) {
                autor.setNombre(nuevoAutor.getNombre());
                autor.setNacionalidad(nuevoAutor.getNacionalidad());
                System.out.println("El autor " + autor.getNombre() + " ha sido actualizado.");
                return;
            }
        }
        System.out.println("No se encontró el autor en la lista.");
    }

    @DeleteMapping("/autores/{nombre}")
    public void eliminarAutor(@PathVariable String nombre) {
        for (Autor autor : autores) {
            if (autor.getNombre().equalsIgnoreCase(nombre)) {
                autores.remove(autor);
                System.out.println("El autor " + autor.getNombre() + " ha sido eliminado de la lista.");
                return;
            }
        }
        System.out.println("No se encontró el autor en la lista.");
    }*/

}
