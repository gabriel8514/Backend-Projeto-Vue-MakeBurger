package com.br.backend.repository;

import com.br.backend.model.statusModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface statusRepository extends JpaRepository<statusModel, Long> {
}
