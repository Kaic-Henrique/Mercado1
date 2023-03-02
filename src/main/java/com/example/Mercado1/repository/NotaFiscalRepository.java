package com.example.Mercado1.repository;

import com.example.Mercado1.entity.NotaFiscalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalRepository extends JpaRepository<NotaFiscalEntity, Long> {
}
