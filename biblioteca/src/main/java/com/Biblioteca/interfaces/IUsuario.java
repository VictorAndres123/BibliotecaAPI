package com.Biblioteca.interfaces;

import com.Biblioteca.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {
}


