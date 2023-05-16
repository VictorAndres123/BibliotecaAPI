package com.Biblioteca.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="categoriaId", nullable = false, insertable=false)
    private int id;
    private String nombre;
    private String descripcion;
    private boolean estado;

    @OneToMany(mappedBy="categoria")
    private Set<Libro> libros;


}
