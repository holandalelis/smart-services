package com.example.smartservices.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table
@ToString

public class Agendamento  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate dataServico;
    private LocalTime horarioServico;
    @Enumerated(EnumType.STRING)
    public EquipamentoEnum equipamento;
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "assistencia_id", nullable = false )
    private Assistencia assistencia;




}
