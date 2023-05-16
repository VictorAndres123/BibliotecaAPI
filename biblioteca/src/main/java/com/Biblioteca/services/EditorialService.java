package com.Biblioteca.services;


import com.Biblioteca.model.Editorial;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EditorialService {
    /*private List<Editorial> editoriales = new ArrayList<>();

    public void agregarEditorial(Editorial editorial) {
        editoriales.add(editorial);
        System.out.println("La editorial " + editorial.getNombre() + " ha sido agregada a la lista.");
    }

    public List<Editorial> listarEditoriales() {
        if (editoriales.isEmpty()) {
            System.out.println("No hay editoriales en la lista.");
        }
        return editoriales;
    }

    public Editorial buscarEditorial(String nombre) {
        for (Editorial editorial : editoriales) {
            if (editorial.getNombre().equalsIgnoreCase(nombre)) {
                return editorial;
            }
        }
        return null;
    }

    public void actualizarEditorial(String nombre, Editorial nuevaEditorial) {
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

    public void eliminarEditorial(String nombre) {
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

