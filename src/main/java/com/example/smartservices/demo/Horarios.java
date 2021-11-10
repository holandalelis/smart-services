package com.example.smartservices.demo;

import com.example.smartservices.demo.model.Agendamento;
import com.example.smartservices.demo.model.Assistencia;
import com.example.smartservices.demo.repository.AgendamentoRepositorio;
import com.example.smartservices.demo.repository.AssistenciaRepositorio;
import com.example.smartservices.demo.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Component
public class Horarios {
    @Autowired
    private AgendamentoRepositorio agendamentoRepositorio;
    @Autowired
    private AssistenciaRepositorio assistenciaRepositorio;
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public void exibirHorariosDisponiveisDataAssitencia(LocalDate data, Long assistencia_id)  {
        List<Time> horarios = new ArrayList<>();
        Time horarioInicio = new Time(8, 0, 0);
        Time horarioFinal = new Time(18, 0, 0);

        LocalTime of = LocalTime.of(12, 0);

        of.
        horarios.add(horarioInicio);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(horarioInicio);

        while (calendar.getTime().before(horarioFinal)) {
            Optional<Assistencia> assistenciaById = assistenciaRepositorio.findById(assistencia_id);

            List<Agendamento> byDataServicoAndAssistencia = agendamentoRepositorio.findByDataServicoAndAssistencia(data, assistenciaById.get());

            System.out.println("Teste " + (calendar.compareTo(byDataServicoAndAssistencia.get(0).getHorarioServico())));
            if (assistenciaById.isPresent()){
                if (byDataServicoAndAssistencia.get(0).getHorarioServico().equals(calendar)) {
                    continue;
                };
                calendar.add(Calendar.MINUTE, 30);

                horarios.add((new Time(calendar.getTimeInMillis())));
                //Assistencia assistencia = assistenciaById.get();
            }

        }


        System.out.println((horarios));



    }
}
