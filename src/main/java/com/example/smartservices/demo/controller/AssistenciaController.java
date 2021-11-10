package com.example.smartservices.demo.controller;


import com.example.smartservices.demo.service.AssistenciaService;
import com.example.smartservices.demo.model.Assistencia;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "/assistencias")
public class AssistenciaController {
    private final AssistenciaService assistenciaService;

    public AssistenciaController(AssistenciaService assistenciaService) {
        this.assistenciaService = assistenciaService;
    }

    @GetMapping
    public List<Assistencia> exibirAssistencias() {
        return assistenciaService.getAssistencias();
    }
    @PostMapping
    public void registrarNovaAssistencia (@RequestBody Assistencia assistencia){
        assistenciaService.addNovaAssistencia(assistencia);
    }
}
