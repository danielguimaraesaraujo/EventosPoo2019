insert into db_eventos.tb_logins values (LAST_INSERT_ID(),'Joao dos Santos','joao@senac.br','123','administrador');
insert into db_eventos.tb_logins values (LAST_INSERT_ID(),'Maira dos Santos','maria@senac.br','123','administrador');


--tb_eventos
INSERT INTO `db_eventos`.`tb_eventos` (`nome`, `descricao`, `dataEvento`, `local`, `id_login`, `dataAtualizacao`) VALUES ('CASE 2019', 'O Jogo Virou', '2019-11-30', 'SÃO PAULO', '1', '2019-11-24');
INSERT INTO `db_eventos`.`tb_eventos` (`nome`, `descricao`, `dataEvento`, `local`, `id_login`, `dataAtualizacao`) VALUES ('Shawn Mendes em São Paulo', 'O cantor canadense Shawn Mendes vem ao Brasil para três shows no fim de 2019', '2019-11-30', 'Minas Gerais', '1', SYSDATE());
INSERT INTO `db_eventos`.`tb_eventos` (`nome`, `descricao`, `dataEvento`, `local`, `id_login`, `dataAtualizacao`) VALUES ('30° Festival do Vinho', 'A última degustação de 2019! Endereço: Rua dos Pinheiros, 1.174 Horário: Das 17h as 21h', '2019-11-30', 'Sao Paulo', '1', SYSDATE());



-- Delete tb_eventos
DELETE FROM `db_eventos`.`tb_eventos` WHERE `id`='2' and`id_login`='1'


-- Select tb_eventos
SELECT nome,descricao, DATE_FORMAT(dataEvento,'%d/%m/%Y'), local FROM db_eventos.tb_eventos
select nome, descricao, DATE_FORMAT(dataEvento,'%d/%m/%Y'), local, id_login,DATE_FORMAT(dataAtualizacao,'%d/%m/%Y') from db_eventos.tb_eventos 

