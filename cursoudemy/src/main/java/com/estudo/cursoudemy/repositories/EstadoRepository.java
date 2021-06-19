package com.estudo.cursoudemy.repositories;

import com.estudo.cursoudemy.domains.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
