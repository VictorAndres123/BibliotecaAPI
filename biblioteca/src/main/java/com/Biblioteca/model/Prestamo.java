package com.Biblioteca.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="prestamoId", nullable = false, insertable=false)
    private int id;
    private String penalizar;
    private int numeroDia;
    private Date fechaPrestamo;
    private Date fechaEntrega;
    private boolean estado;

    @Transient
    @ManyToOne()
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_prestamo_usuario"), name="usuarioId",
            nullable = false)
    private Usuario usuario;

    @Transient
    @ManyToOne()
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_prestamo_libro"), name="libroId",
            nullable = false)
    private Libro libro;

}
