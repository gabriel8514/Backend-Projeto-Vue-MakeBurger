package com.br.backend.repository;

import com.br.backend.model.burgerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface burgerRepository extends JpaRepository<burgerModel, Long> {
}
