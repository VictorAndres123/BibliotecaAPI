package com.Biblioteca.model;

import lombok.Data;

@Data


public class Libros {
    private String categorias;
    private String autor;
    private String editorial;
    private String titulo;
    private String isbn;
    private int paginas;
    private String FechaPublicacion;
    private String estado;
    private boolean leido;
}
