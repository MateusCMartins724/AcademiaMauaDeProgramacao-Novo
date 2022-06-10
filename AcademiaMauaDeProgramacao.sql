-- MySQL Script generated by MySQL Workbench
-- Thu Jun  9 22:37:48 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `AcademiaMauaDeProgramacao` DEFAULT CHARACTER SET utf8 ;
USE `AcademiaMauaDeProgramacao` ;

-- -----------------------------------------------------
-- Table `mydb`.`Jogador`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `Jogador` (
  `nome` VARCHAR(30) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `idade` INT NOT NULL,
  `telefone` VARCHAR(11) NOT NULL,
  `nomeUsuario` VARCHAR(30) NOT NULL,
  `senhaUsuario` VARCHAR(20) NOT NULL,
  `tentativas` INT NOT NULL,
  `pontuacao` INT NOT NULL,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `telefone_UNIQUE` (`telefone` ASC) VISIBLE,
  UNIQUE INDEX `nomeUsuario_UNIQUE` (`nomeUsuario` ASC) VISIBLE,
  PRIMARY KEY (`nomeUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`MaterialDeApoio`
-- -----------------------------------------------------


CREATE TABLE IF NOT EXISTS `MaterialDeApoio` (
  `escopo` VARCHAR(10) NOT NULL,
  `material` MEDIUMTEXT NOT NULL,
  `idMaterial` INT NOT NULL,
  PRIMARY KEY (`idMaterial`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Ranking`
-- -----------------------------------------------------


CREATE TABLE IF NOT EXISTS `Ranking` (
  `posicao` INT NOT NULL,
  `pontuacao` INT NOT NULL,
  `tentativas` INT NOT NULL,
  `Jogador_nomeUsuario` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`posicao`, `Jogador_nomeUsuario`),
  INDEX `fk_Ranking_Jogador1_idx` (`Jogador_nomeUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Ranking_Jogador1`
    FOREIGN KEY (`Jogador_nomeUsuario`)
    REFERENCES `mydb`.`Jogador` (`nomeUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Pergunta`
-- -----------------------------------------------------


CREATE TABLE IF NOT EXISTS `Pergunta` (
  `numeroQuestao` INT NOT NULL,
  `alternativaCorreta` MEDIUMTEXT NOT NULL,
  `alternativa1` MEDIUMTEXT NOT NULL,
  `alternativa2` MEDIUMTEXT NOT NULL,
  `alternativa3` MEDIUMTEXT NOT NULL,
  `alternativa4` MEDIUMTEXT NOT NULL,
  
  `questao` MEDIUMTEXT NOT NULL,
  PRIMARY KEY (`numeroQuestao`),
  UNIQUE INDEX `numeroQuestao_UNIQUE` (`numeroQuestao` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Jogador_has_Pergunta`
-- -----------------------------------------------------


CREATE TABLE IF NOT EXISTS `Jogador_has_Pergunta` (
  `Jogador_nomeUsuario` VARCHAR(20) NOT NULL,
  `Pergunta_numeroQuestao` INT NOT NULL,
  PRIMARY KEY (`Jogador_nomeUsuario`, `Pergunta_numeroQuestao`),
  INDEX `fk_Jogador_has_Pergunta_Pergunta1_idx` (`Pergunta_numeroQuestao` ASC) VISIBLE,
  INDEX `fk_Jogador_has_Pergunta_Jogador1_idx` (`Jogador_nomeUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Jogador_has_Pergunta_Jogador1`
    FOREIGN KEY (`Jogador_nomeUsuario`)
    REFERENCES `mydb`.`Jogador` (`nomeUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Jogador_has_Pergunta_Pergunta1`
    FOREIGN KEY (`Pergunta_numeroQuestao`)
    REFERENCES `mydb`.`Pergunta` (`numeroQuestao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Jogador_has_MaterialDeApoio`
-- -----------------------------------------------------
;

CREATE TABLE IF NOT EXISTS `Jogador_has_MaterialDeApoio` (
  `Jogador_nomeUsuario` VARCHAR(30) NOT NULL,
  `MaterialDeApoio_idMaterial` INT NOT NULL,
  PRIMARY KEY (`Jogador_nomeUsuario`, `MaterialDeApoio_idMaterial`),
  INDEX `fk_Jogador_has_MaterialDeApoio_MaterialDeApoio1_idx` (`MaterialDeApoio_idMaterial` ASC) VISIBLE,
  INDEX `fk_Jogador_has_MaterialDeApoio_Jogador1_idx` (`Jogador_nomeUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Jogador_has_MaterialDeApoio_Jogador1`
    FOREIGN KEY (`Jogador_nomeUsuario`)
    REFERENCES `mydb`.`Jogador` (`nomeUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Jogador_has_MaterialDeApoio_MaterialDeApoio1`
    FOREIGN KEY (`MaterialDeApoio_idMaterial`)
    REFERENCES `mydb`.`MaterialDeApoio` (`idMaterial`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SELECT * FROM Jogador;
SELECT * FROM Pergunta;

#DROP DATABASE AcademiaMauaDeProgramacao;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
