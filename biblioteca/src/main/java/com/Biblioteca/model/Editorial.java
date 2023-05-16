package com.Biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "editorial")
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="editorialId", nullable = false, insertable=false)
    private int id;
    private String nombre;
    private String fundador;
    private String direccion;
    private String industria;
    private String sitioWeb;
    private String correo;
    private boolean estado;

    @OneToMany(mappedBy="editorial")
    private Set<Libro> libros;
}
