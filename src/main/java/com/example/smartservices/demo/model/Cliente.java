package com.example.smartservices.demo.model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
@ToString
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Long cpf;
    private String telefone;

    @OneToMany(mappedBy = "cliente")
    private List<Agendamento> agendamentos;



}
