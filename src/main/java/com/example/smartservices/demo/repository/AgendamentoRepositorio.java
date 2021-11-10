package com.example.smartservices.demo.repository;

import com.example.smartservices.demo.model.Agendamento;
import com.example.smartservices.demo.model.Assistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AgendamentoRepositorio  extends JpaRepository<Agendamento, Long> {
    List<Agendamento> findByDataServicoAndAssistencia(LocalDate dataService, Assistencia assistencia);



}
