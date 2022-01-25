package com.br.backend.repository;

import com.br.backend.model.ingredienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ingredienteRepository extends JpaRepository<ingredienteModel, Long> {

}
