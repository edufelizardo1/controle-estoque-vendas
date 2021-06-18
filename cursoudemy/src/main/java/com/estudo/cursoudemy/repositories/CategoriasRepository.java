package com.estudo.cursoudemy.repositories;

import com.estudo.cursoudemy.domain.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {
}
