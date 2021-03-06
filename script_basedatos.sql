-- MySQL Script generated by MySQL Workbench
-- vie 14 dic 2018 21:35:39 -03
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema administracion_campos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema administracion_campos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `administracion_campos` DEFAULT CHARACTER SET latin1 ;
USE `administracion_campos` ;

-- -----------------------------------------------------
-- Table `administracion_campos`.`campo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `administracion_campos`.`campo` (
  `id_campo` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(255) NULL DEFAULT NULL,
  `superficie` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id_campo`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `administracion_campos`.`lote`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `administracion_campos`.`lote` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `numero` BIGINT(20) NULL DEFAULT NULL,
  `superficie` BIGINT(20) NULL DEFAULT NULL,
  `tipo_suelo` INT(11) NULL DEFAULT NULL,
  `id_campo` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `FK_arpayd7onxu2hu7cjk9guqnk2` (`id_campo` ASC),
  CONSTRAINT `FK_arpayd7onxu2hu7cjk9guqnk2`
    FOREIGN KEY (`id_campo`)
    REFERENCES `administracion_campos`.`campo` (`id_campo`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
