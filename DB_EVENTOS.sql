SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema DB_EVENTOS
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DB_EVENTOS
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DB_EVENTOS` DEFAULT CHARACTER SET utf8 ;
USE `DB_EVENTOS` ;

-- -----------------------------------------------------
-- Table `DB_EVENTOS`.`tb_logins`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_EVENTOS`.`tb_logins` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NULL,
  `email` VARCHAR(255) NOT NULL,
  `senha` VARCHAR(100) NULL,
  `descricao` VARCHAR(255) NULL,
  PRIMARY KEY (`id`, `email`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC),
  INDEX `idx_email_senha` (`email` ASC, `senha` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_EVENTOS`.`tb_eventos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_EVENTOS`.`tb_eventos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `descricao` VARCHAR(255) NULL,
  `dataEvento` DATE NOT NULL,
  `local` VARCHAR(55) NOT NULL,
  `id_login` INT NOT NULL,
  `dataAtualizacao` DATE NULL,
  PRIMARY KEY (`id`, `id_login`),
  INDEX `idx_nome_evento` (`nome` ASC),
  INDEX `fk_tb_cadastro_eventos_tb_logins_idx` (`id_login` ASC),
  CONSTRAINT `fk_tb_cadastro_eventos_tb_logins`
    FOREIGN KEY (`id_login`)
    REFERENCES `DB_EVENTOS`.`tb_logins` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_EVENTOS`.`tb_inscricao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_EVENTOS`.`tb_inscricao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `data` DATE NOT NULL,
  `tb_logins_id` INT NOT NULL,
  `tb_eventos_id` INT NOT NULL,
  PRIMARY KEY (`id`, `tb_logins_id`, `tb_eventos_id`),
  INDEX `fk_tb_inscricao_tb_logins1_idx` (`tb_logins_id` ASC),
  INDEX `fk_tb_inscricao_tb_eventos1_idx` (`tb_eventos_id` ASC),
  CONSTRAINT `fk_tb_inscricao_tb_logins1`
    FOREIGN KEY (`tb_logins_id`)
    REFERENCES `DB_EVENTOS`.`tb_logins` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_inscricao_tb_eventos1`
    FOREIGN KEY (`tb_eventos_id`)
    REFERENCES `DB_EVENTOS`.`tb_eventos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


