-- MySQL dump 10.13  Distrib 5.7.10, for Win64 (x86_64)
--
-- Host: localhost    Database: aspira
-- ------------------------------------------------------
-- Server version	5.7.10-log

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
-- Current Database: `aspira`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `aspira` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `aspira`;

--
-- Table structure for table `aqmreadings`
--

DROP TABLE IF EXISTS `aqmreadings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aqmreadings` (
  `id` int(11) DEFAULT NULL,
  `largeValue` varchar(255) DEFAULT NULL,
  `smallValue` varchar(255) DEFAULT NULL,
  `device_id` int(11) DEFAULT NULL,
  `date_field` timestamp NULL DEFAULT NULL,
  `createdAt` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aqmreadings`
--

LOCK TABLES `aqmreadings` WRITE;
/*!40000 ALTER TABLE `aqmreadings` DISABLE KEYS */;
INSERT INTO `aqmreadings` VALUES (101,'testingagain','testingagain',123,'2016-02-15 22:52:51','2016-02-17 21:53:45'),(102,'testingagain','testingagain',123,'2016-02-15 22:52:51','2016-02-17 21:53:50'),(103,'testingagain','testingagain',123,'2016-02-15 22:52:51','2016-02-17 21:53:55'),(111,'testingagain','testingagain',123,'2016-02-15 22:52:51','2016-02-17 21:55:54'),(101,'testingagain','testingagain',123,'2016-02-17 05:37:43','2016-02-17 23:35:39'),(201,'testingagain','testingagain',123,'2016-02-17 05:37:43','2016-02-17 23:35:47'),(211,'testingagain','testingagain',123,'2016-02-17 05:37:43','2016-02-17 23:35:52'),(221,'testingagain','testingagain',123,'2016-02-17 05:37:43','2016-02-17 23:36:08'),(231,'testingagain','testingagain',123,'2016-02-17 05:37:43','2016-02-17 23:37:20');
/*!40000 ALTER TABLE `aqmreadings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `errorlogs`
--

DROP TABLE IF EXISTS `errorlogs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `errorlogs` (
  `id` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  `extras` varchar(255) DEFAULT NULL,
  `createdAt` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `typecode` varchar(45) DEFAULT NULL,
  `device_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `errorlogs`
--

LOCK TABLES `errorlogs` WRITE;
/*!40000 ALTER TABLE `errorlogs` DISABLE KEYS */;
INSERT INTO `errorlogs` VALUES (101,'Error','2016-02-15 22:52:51','extra','2016-02-17 21:52:23','tsy',232),(102,'Error','2016-02-15 22:52:51','extra','2016-02-17 21:52:44','tsy',232),(103,'Error','2016-02-15 22:52:51','extra','2016-02-17 21:52:49','tsy',232),(1021,'Error','2016-02-15 22:52:51','extra','2016-02-17 21:55:54','tsy',232),(141,'Error','2016-02-17 05:37:43','extra','2016-02-17 22:30:59','tsy',232),(141,'Error','2016-02-17 05:37:43','extra','2016-02-17 22:43:41','tsy',232),(141,'Error','2016-02-17 05:37:43','extra','2016-02-17 22:43:58','tsy',232),(101,'Error','2016-02-17 05:37:43','extra','2016-02-17 22:43:58','tsy',232),(1671,'Error','2016-02-17 05:37:43','extra','2016-02-17 23:26:19','tsy',232);
/*!40000 ALTER TABLE `errorlogs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sprioreading`
--

DROP TABLE IF EXISTS `sprioreading`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sprioreading` (
  `id` int(11) DEFAULT NULL,
  `reading` varchar(255) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  `time_of_day` varchar(255) DEFAULT NULL,
  `createdAt` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `device_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sprioreading`
--

LOCK TABLES `sprioreading` WRITE;
/*!40000 ALTER TABLE `sprioreading` DISABLE KEYS */;
INSERT INTO `sprioreading` VALUES (101,'read','2016-02-15 22:52:51','extratime','2016-02-17 21:59:04',232),(102,'read','2016-02-15 22:52:51','extratime','2016-02-17 21:59:04',232),(103,'read','2016-02-15 22:52:51','extratime','2016-02-17 21:59:04',232),(221,'read','2016-02-17 07:19:02','extratime','2016-02-17 23:38:56',232),(231,'read','2016-02-17 07:19:02','extratime','2016-02-17 23:39:01',232),(241,'read','2016-02-17 07:19:02','extratime','2016-02-17 23:39:06',232);
/*!40000 ALTER TABLE `sprioreading` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `uilogs`
--

DROP TABLE IF EXISTS `uilogs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `uilogs` (
  `id` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  `extras` varchar(255) DEFAULT NULL,
  `createdAt` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `typecode` varchar(45) DEFAULT NULL,
  `device_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `uilogs`
--

LOCK TABLES `uilogs` WRITE;
/*!40000 ALTER TABLE `uilogs` DISABLE KEYS */;
INSERT INTO `uilogs` VALUES (104,'UI','2016-02-15 22:52:51','extra','2016-02-17 21:53:11','tsy',232),(105,'UI','2016-02-15 22:52:51','extra','2016-02-17 21:53:16','tsy',232),(106,'UI','2016-02-15 22:52:51','extra','2016-02-17 21:53:21','tsy',232),(111,'UI','2016-02-15 22:52:51','extra','2016-02-17 21:55:54','tsy',232);
/*!40000 ALTER TABLE `uilogs` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-02-17 16:45:18
