-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.42


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema banco
--

CREATE DATABASE IF NOT EXISTS banco;
USE banco;
CREATE TABLE  `banco`.`Usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
INSERT INTO `banco`.`Usuario` VALUES  (1,'giran@email.com','Giran','giran'),
 (2,'botelho@email.com','Botelho','botelho'),
 (3,'jeveaux@email.com','Jeveaux','jeveaux'),
 (4,'hackin@email.com','Hackin','hackin'),
 (5,'makoto@email.com','Makoto','makoto'),
 (6,'gabriel@email.com','Gabriel','gabriel'),
 (7,'junin@email.com','Junin','junin'),
 (8,'bernardo@email.com','Bernardo','bernardo'),
 (9,'francisco@email.com','Francisco','francisco'),
 (10,'keilinha@email.com','Keilinha','keilinha');



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
