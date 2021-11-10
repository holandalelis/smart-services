package com.example.smartservices.demo.controller;

import com.example.smartservices.demo.model.Cliente;
import com.example.smartservices.demo.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @PostMapping
    public List<Cliente> solicitarAgendamento() {
        return null;
    }
    @GetMapping(path = "/clientes/horariosdisponiveis")
    public String consultarHorariosDisponiveis() {
        return "";
    }
    @GetMapping(path = "/clientes/ordemservico")
    public String consultarOrdensServico() {
        return "";
    }
    @DeleteMapping
    public List<Cliente> desmarcarAgendamento() {
        return null;
    }
}
