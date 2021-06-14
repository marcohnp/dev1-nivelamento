package com.marcohnp.nivelamento.repository;

import com.marcohnp.nivelamento.model.entity.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoEntity, Integer> {
}
