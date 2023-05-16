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

@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="libroId", nullable = false, insertable=false)
    private int id;
    private String titulo;
    private String isbn;
    private String descripcion;
    private int numeroPagina;
    private Date fechaPublicacion;
    private boolean leido;
    private boolean estado;


    //FK
    @Transient
    @ManyToOne()
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_libro_categoria"), name="categoriaId",
            nullable = false)
    private Categoria categoria;

    @Transient
    @ManyToOne()
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_libro_autor"), name="autorId",
            nullable = false)
    private Autor autor;

    @Transient
    @ManyToOne()
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_libro_editorial"), name="editorialId",
            nullable = false)
    private Editorial editorial;


    @Transient
    @OneToMany(mappedBy="libro")
    private Set<Prestamo> prestamos;


}
