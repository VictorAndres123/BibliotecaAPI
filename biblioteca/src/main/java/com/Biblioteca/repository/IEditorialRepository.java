package com.Biblioteca.repository;

import com.Biblioteca.model.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEditorialRepository extends JpaRepository<Editorial,Integer> {
}
