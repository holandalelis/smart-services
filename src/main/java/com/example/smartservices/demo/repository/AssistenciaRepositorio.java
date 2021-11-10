package com.example.smartservices.demo.repository;


import com.example.smartservices.demo.model.Assistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssistenciaRepositorio extends JpaRepository <Assistencia, Long> {


}
