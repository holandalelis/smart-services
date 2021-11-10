package com.example.smartservices.demo.service;


import com.example.smartservices.demo.model.Assistencia;
import com.example.smartservices.demo.repository.AssistenciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistenciaService {
    private final AssistenciaRepositorio assistenciaRepositorio;

    @Autowired
    public AssistenciaService(AssistenciaRepositorio assistenciaRepositorio) {
        this.assistenciaRepositorio = assistenciaRepositorio;
    }

    public List<Assistencia> getAssistencias() {
        return assistenciaRepositorio.findAll();
    }


    public void addNovaAssistencia(Assistencia assistencia) {
        assistenciaRepositorio.save(assistencia);
    }

}
