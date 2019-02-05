CREATE DATABASE  IF NOT EXISTS `mao` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mao`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: mao
-- ------------------------------------------------------
-- Server version	5.7.15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `age`
--

DROP TABLE IF EXISTS `age`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `age` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `age`
--

LOCK TABLES `age` WRITE;
/*!40000 ALTER TABLE `age` DISABLE KEYS */;
INSERT INTO `age` VALUES (1,'6-8'),(2,'9-11'),(3,'12-14'),(4,'15-18'),(5,'18+');
/*!40000 ALTER TABLE `age` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curency`
--

DROP TABLE IF EXISTS `curency`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `curency` (
  `supplierID` bigint(30) DEFAULT NULL,
  `USDollars` int(1) DEFAULT NULL,
  `NIS` int(1) DEFAULT NULL,
  `Euro` int(1) DEFAULT NULL,
  `AUDollars` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curency`
--


--
-- Table structure for table `dayscode`
--

DROP TABLE IF EXISTS `dayscode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dayscode` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `type` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dayscode`
--

LOCK TABLES `dayscode` WRITE;
/*!40000 ALTER TABLE `dayscode` DISABLE KEYS */;
INSERT INTO `dayscode` VALUES (1,'Full Day'),(2,'Half First Day'),(3,'Half Second Day'),(4,'Closing For Lau'),(5,'Close All Day L');
/*!40000 ALTER TABLE `dayscode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daysoftheweek`
--

DROP TABLE IF EXISTS `daysoftheweek`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daysoftheweek` (
  `supplierID` bigint(30) NOT NULL AUTO_INCREMENT,
  `Sunday` int(1) DEFAULT NULL,
  `Monday` int(1) DEFAULT NULL,
  `Tuesday` int(11) DEFAULT NULL,
  `Wednesday` int(1) DEFAULT NULL,
  `Thursday` int(1) DEFAULT NULL,
  `Friday` int(1) DEFAULT NULL,
  `Saturday` int(1) DEFAULT NULL,
  PRIMARY KEY (`supplierID`),
  KEY `day1` (`Sunday`),
  KEY `day2` (`Monday`),
  KEY `day3` (`Tuesday`),
  KEY `day4` (`Wednesday`),
  KEY `day5` (`Thursday`),
  KEY `day6` (`Friday`),
  KEY `day7` (`Saturday`)
) ENGINE=InnoDB AUTO_INCREMENT=362435361 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


DROP TABLE IF EXISTS `defaultaddress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `defaultaddress` (
  `personID` bigint(30) DEFAULT NULL,
  `address1` varchar(20) DEFAULT NULL,
  `address2` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `zipCode` int(11) DEFAULT NULL,
  `region` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `degree`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `degree` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `belt` tinytext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `degree`
--

LOCK TABLES `degree` WRITE;
/*!40000 ALTER TABLE `degree` DISABLE KEYS */;
INSERT INTO `degree` VALUES (1,'white'),(2,'yellow'),(3,'orange'),(4,'green'),(5,'blue'),(6,'purple'),(7,'brown'),(8,'black1'),(9,'black2'),(10,'black3'),(11,'black4'),(12,'black5'),(13,'black6'),(14,'black7'),(15,'black8'),(16,'black9'),(17,'red');
/*!40000 ALTER TABLE `degree` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diploma`
--

DROP TABLE IF EXISTS `diploma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diploma` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `location` tinytext,
  `type` tinytext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diploma`
--

LOCK TABLES `diploma` WRITE;
/*!40000 ALTER TABLE `diploma` DISABLE KEYS */;
INSERT INTO `diploma` VALUES (1,'Wingate','Trainer'),(2,'Wingate','Teacher'),(3,'PH','Trainer');
/*!40000 ALTER TABLE `diploma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `durationpaycheck`
--

DROP TABLE IF EXISTS `durationpaycheck`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `durationpaycheck` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` varchar(45) DEFAULT NULL,
  `additional` varchar(45) DEFAULT NULL,
  `comment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `durationpaycheck`
--

LOCK TABLES `durationpaycheck` WRITE;
/*!40000 ALTER TABLE `durationpaycheck` DISABLE KEYS */;
INSERT INTO `durationpaycheck` VALUES (1,'weekly',NULL,NULL),(2,'two weeks',NULL,NULL),(3,'three weeks',NULL,NULL),(4,'monuthly',NULL,NULL),(5,'Simester',NULL,NULL),(6,'6 mounth',NULL,NULL),(7,'seosen',NULL,NULL),(8,'year',NULL,NULL);
/*!40000 ALTER TABLE `durationpaycheck` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `EmployeeID` bigint(30) NOT NULL,
  `StartWorkDay` date DEFAULT NULL,
  `EndWorkDay` date DEFAULT NULL,
  `Active` int(1) DEFAULT NULL,
  `Name` tinytext,
  `Phone` tinytext,
  `Email` tinytext,
  `SalaryRate` int(1) DEFAULT NULL,
  `MAtype` int(1) DEFAULT NULL,
  `Degree` int(1) DEFAULT NULL,
  `Diploma` int(1) DEFAULT NULL,
  `Notes` tinytext,
  PRIMARY KEY (`EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `level`
--

DROP TABLE IF EXISTS `level`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `level` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `levelType` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level`
--

LOCK TABLES `level` WRITE;
/*!40000 ALTER TABLE `level` DISABLE KEYS */;
INSERT INTO `level` VALUES (1,'Beginners'),(2,'Expiriences'),(3,'Pro');
/*!40000 ALTER TABLE `level` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matype`
--

DROP TABLE IF EXISTS `matype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `matype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` tinytext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matype`
--

LOCK TABLES `matype` WRITE;
/*!40000 ALTER TABLE `matype` DISABLE KEYS */;
INSERT INTO `matype` VALUES (1,'Karate'),(2,'Judo'),(3,'Aikido'),(4,'Sambo'),(5,'Wresling'),(6,'Bjj'),(7,'MMA'),(8,'Boxing'),(9,'ThaiBoxing'),(10,'Arnis'),(11,'KravMaga'),(12,'Ninjitsu'),(13,'CMA'),(14,'KongFu');
/*!40000 ALTER TABLE `matype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salaryrate`
--

DROP TABLE IF EXISTS `salaryrate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salaryrate` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `duration` int(1) DEFAULT NULL,
  `age` int(1) DEFAULT NULL,
  `level` int(1) DEFAULT NULL,
  `rate` float DEFAULT NULL,
  `extra` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salaryrate`
--

LOCK TABLES `salaryrate` WRITE;
/*!40000 ALTER TABLE `salaryrate` DISABLE KEYS */;
/*!40000 ALTER TABLE `salaryrate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `supplierID` bigint(30) NOT NULL,
  `dateAdded` date DEFAULT NULL,
  `name` text,
  `phone` text,
  `website` text,
  `email` text,
  `taxScan` int(11) DEFAULT NULL,
  `active` int(1) DEFAULT NULL,
  `notes` longtext,
  `addressID` int(10) DEFAULT NULL,
  KEY `tax` (`taxScan`),
  KEY `address` (`addressID`),
  CONSTRAINT `tax` FOREIGN KEY (`taxScan`) REFERENCES `textsystem` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;


--
-- Table structure for table `textsystem`
--

DROP TABLE IF EXISTS `textsystem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `textsystem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `percentage` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `textsystem`
--

LOCK TABLES `textsystem` WRITE;
/*!40000 ALTER TABLE `textsystem` DISABLE KEYS */;
INSERT INTO `textsystem` VALUES (1,'NoTax',0);
/*!40000 ALTER TABLE `textsystem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vsupplier`
--

DROP TABLE IF EXISTS `vsupplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vsupplier` (
  `Index` int(10) NOT NULL AUTO_INCREMENT,
  `OwnershipType` int(11) DEFAULT NULL,
  `accepts_marketing` tinyint(1) DEFAULT NULL,
  `addresses_count` int(11) DEFAULT NULL,
  `virtualNamePayment` text,
  `has_Ebay_account` tinyint(1) DEFAULT NULL,
  `has_PrivateSite` tinyint(1) DEFAULT NULL,
  `continent` int(11) DEFAULT NULL,
  `taxType` int(11) DEFAULT NULL,
  `maximumPerOrder` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Index`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vsupplier`
--

LOCK TABLES `vsupplier` WRITE;
/*!40000 ALTER TABLE `vsupplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `vsupplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'mao'
--

--
-- Dumping routines for database 'mao'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-15 14:52:23
