package com.example.smartservices.demo.controller;

import com.example.smartservices.demo.Horarios;
import com.example.smartservices.demo.controller.dto.AgendamentoDto;
import com.example.smartservices.demo.model.Agendamento;
import com.example.smartservices.demo.service.AgendamentoService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/agendamento")
public class AgendamentoController {
    private final AgendamentoService agendamentoService;
    private final Horarios horarios;

    public AgendamentoController(AgendamentoService agendamentoService, Horarios horarios) {this.agendamentoService = agendamentoService;
        this.horarios = horarios;
    }

    @GetMapping
    public void teste(){
        horarios.exibirHorariosDisponiveisDataAssitencia(LocalDate.of(2021, 10, 28), 1L);
    }

    @PostMapping
    public Agendamento marcarAgendamento(@RequestBody AgendamentoDto agendamento){
     //

        return  agendamentoService.marcarAgendamento(agendamento);
//
    }

}




