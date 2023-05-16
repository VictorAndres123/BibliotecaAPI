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

@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="usuarioId", nullable = false, insertable=false)
    private int id;
    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String correo;
    private String contrasena;
    private String genero;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String telefono;
    private boolean estado;

    @Transient
    @OneToMany(mappedBy="usuario")
    private Set<Prestamo> prestamos;

}







