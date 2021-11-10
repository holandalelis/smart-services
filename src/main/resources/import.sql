-- insert into assistencia (id, horarios_disponiveis, nome) values (1, '8h, 8h30, 9h, 9h30, 10h, 10h30,11h, 11h30, 12h, 12h30, 13h, 13h30, 14h, 14h30, 15h, 15h30, 16h, 16h30, 17h, 17h30, 18h', 'Loja Shopping')
-- insert into assistencia (id, horarios_disponiveis, nome) values (2, '8h, 8h30, 9h, 9h30, 10h, 10h30,11h, 11h30, 12h, 12h30, 13h, 13h30, 14h, 14h30, 15h, 15h30, 16h, 16h30, 17h, 17h30, 18h', 'Loja Centro')
-- insert into assistencia (id, horarios_disponiveis, nome) values (3, '8h, 8h30, 9h, 9h30, 10h, 10h30,11h, 11h30, 12h, 12h30, 13h, 13h30, 14h, 14h30, 15h, 15h30, 16h, 16h30, 17h, 17h30, 18h', 'Loja Empresarial')
-- insert into assistencia (id, horarios_disponiveis, nome) values (4, '8h, 8h30, 9h, 9h30, 10h, 10h30,11h, 11h30, 12h, 12h30, 13h, 13h30, 14h, 14h30, 15h, 15h30, 16h, 16h30, 17h, 17h30, 18h', 'Loja Litoral')
-- insert into assistencia (id, horarios_disponiveis, nome) values (5, '8h, 8h30, 9h, 9h30, 10h, 10h30,11h, 11h30, 12h, 12h30, 13h, 13h30, 14h, 14h30, 15h, 15h30, 16h, 16h30, 17h, 17h30, 18h', 'Loja Zona Norte')
--

INSERT INTO `smart_services`.`cliente` (`id`, `cpf`, `nome`, `telefone`) VALUES ('1', '123123', 'Carlos', '31412344')
INSERT INTO `smart_services`.`assistencia` (`id`, `nome`) VALUES ('1', 'Loja Sul')
INSERT INTO `smart_services`.`agendamento` (`id`, `data_servico`, `equipamento`, `horario_servico`, `assistencia_id`, `cliente_id`) VALUES ('1', '2021-10-28', 'TV', '12:00:00', '1', '1')