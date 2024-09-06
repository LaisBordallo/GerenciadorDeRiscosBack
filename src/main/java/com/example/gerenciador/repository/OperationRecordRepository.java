package com.example.gerenciador.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gerenciador.model.OperationRecord;

@Repository
public interface OperationRecordRepository extends JpaRepository<OperationRecord, Long> {

    // Encontra todas as operações que foram uma vitória (win = true)
    List<OperationRecord> findByWin(boolean win);

    // Encontra todas as operações que ocorreram em uma data específica ou após ela
    List<OperationRecord> findByTimestampAfter(LocalDateTime timestamp);

    // Encontra todas as operações de um intervalo de datas
    List<OperationRecord> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
}
