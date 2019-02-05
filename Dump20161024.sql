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
-- Table structure for table `arrivefrom`
--

DROP TABLE IF EXISTS `arrivefrom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `arrivefrom` (
  `idarriveFrom` int(11) NOT NULL AUTO_INCREMENT,
  `Place` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idarriveFrom`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `customersIndex` int(10) NOT NULL AUTO_INCREMENT,
  `customerID` bigint(15) NOT NULL,
  `birthday` date DEFAULT NULL,
  `Rdate` date DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `degree` int(2) DEFAULT NULL,
  `trainigProgram` int(2) DEFAULT NULL,
  `arriveFrom` int(2) DEFAULT NULL,
  `notes` varchar(45) DEFAULT NULL,
  `SchoolID` int(10) NOT NULL,
  `active` int(2) DEFAULT NULL,
  PRIMARY KEY (`customersIndex`),
  UNIQUE KEY `customerID_UNIQUE` (`customerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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

--
-- Table structure for table `defaultaddress`
--

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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `degree`
--

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
-- Table structure for table `durationmembership`
--

DROP TABLE IF EXISTS `durationmembership`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `durationmembership` (
  `idduration` int(11) NOT NULL AUTO_INCREMENT,
  `part` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idduration`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `employeesIndex` int(10) NOT NULL AUTO_INCREMENT,
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
  `SchoolID` int(10) NOT NULL,
  PRIMARY KEY (`employeesIndex`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `insurance`
--

DROP TABLE IF EXISTS `insurance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `insurance` (
  `insuranceID` int(10) NOT NULL,
  `PaymentId` int(10) DEFAULT NULL,
  `MemberId` int(10) DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  PRIMARY KEY (`insuranceID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment` (
  `PaymentId` int(10) NOT NULL,
  `memberid` int(10) NOT NULL,
  `Amount` decimal(10,0) DEFAULT NULL,
  `DatePaid` date DEFAULT NULL,
  PRIMARY KEY (`PaymentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
-- Table structure for table `school`
--

DROP TABLE IF EXISTS `school`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `school` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `managerName` varchar(45) DEFAULT NULL,
  `numberOfChapters` int(5) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `wbesite` varchar(45) DEFAULT NULL,
  `mainMAtype` int(5) DEFAULT NULL,
  `logo` varchar(45) DEFAULT NULL,
  `active` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `subscription`
--

DROP TABLE IF EXISTS `subscription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subscription` (
  `SubscriptionId` int(11) NOT NULL AUTO_INCREMENT,
  `PaymentId` int(15) DEFAULT NULL,
  `MemberId` int(15) DEFAULT NULL,
  `trainigProgram` int(5) DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  PRIMARY KEY (`SubscriptionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `supplierIndex` int(10) NOT NULL AUTO_INCREMENT,
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
  `SchoolID` int(10) NOT NULL,
  PRIMARY KEY (`supplierIndex`),
  KEY `tax` (`taxScan`),
  KEY `address` (`addressID`),
  CONSTRAINT `tax` FOREIGN KEY (`taxScan`) REFERENCES `textsystem` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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
-- Table structure for table `trainigprogram`
--

DROP TABLE IF EXISTS `trainigprogram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trainigprogram` (
  `idtrainigProgram` int(11) NOT NULL,
  `durationid` int(2) DEFAULT NULL,
  `numberPerWeek` int(2) DEFAULT NULL,
  `numberofMA` int(2) DEFAULT NULL,
  PRIMARY KEY (`idtrainigProgram`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

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

-- Dump completed on 2016-10-24 15:09:34
