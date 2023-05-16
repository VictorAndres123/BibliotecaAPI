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

@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="autorId", nullable = false, insertable=false)
    private int id;
    private String nombre;
    private String apellido;
    private String genero;
    private Date fechaNacimiento;
    private Date fechaFallecimiento;
    private String especialidad;
    private String nacionalidad;
    private boolean estado;

    @Transient
    @OneToMany(mappedBy="autor")
    private Set<Libro> libros;



}
