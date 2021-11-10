package com.example.smartservices.demo.service;


import com.example.smartservices.demo.controller.dto.AgendamentoDto;
import com.example.smartservices.demo.model.Agendamento;
import com.example.smartservices.demo.model.Assistencia;
import com.example.smartservices.demo.model.Cliente;
import com.example.smartservices.demo.model.EquipamentoEnum;
import com.example.smartservices.demo.repository.AgendamentoRepositorio;
import com.example.smartservices.demo.repository.AssistenciaRepositorio;
import com.example.smartservices.demo.repository.ClienteRepositorio;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {
    @Autowired
    private   AgendamentoRepositorio agendamentoRepositorio;
    @Autowired
    private   AssistenciaRepositorio assistenciaRepositorio;
    @Autowired
    private  ClienteRepositorio clienteRepositorio;


    public List<Assistencia> listarAssistenciasDisponiveis(LocalDate horario) {
        return null;
    }


    public List<LocalDateTime> consultarHorariosDisponiveis(Long id_assistencia) {
        return null;
   }
    public class DadosAgendamento {
         Cliente cliente;
         Assistencia assitencia;
         Agendamento agendamento;
    }
    public Agendamento marcarAgendamento(AgendamentoDto agendamentoDto) {
        Cliente cliente = null;
        Optional<Cliente> clienteById = clienteRepositorio.findById(agendamentoDto.getClienteId());
        if (clienteById.isPresent()){
            cliente = clienteById.get();
        }
        Assistencia assistencia = null;
        Optional<Assistencia> assistenciaById = assistenciaRepositorio.findById(agendamentoDto.getAssistenciaId());
        if (assistenciaById.isPresent()){
            assistencia = assistenciaById.get();
        }
        Agendamento agendamento = new Agendamento();
        BeanUtils.copyProperties(agendamentoDto,agendamento);
        agendamento.setAssistencia(assistencia);
        agendamento.setCliente(cliente);
        Agendamento save = agendamentoRepositorio.save(agendamento);
        return save;



    }

}

