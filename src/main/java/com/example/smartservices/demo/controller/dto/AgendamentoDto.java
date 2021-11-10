package com.example.smartservices.demo.controller.dto;

import com.example.smartservices.demo.model.Assistencia;
import com.example.smartservices.demo.model.Cliente;
import com.example.smartservices.demo.model.EquipamentoEnum;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class                 AgendamentoDto {
    private LocalDate dataServico;
    private LocalTime horarioServico;
    public EquipamentoEnum equipamento;
    private Long clienteId;
    private Long assistenciaId;

}
