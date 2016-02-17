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
-- Table structure for table `aqmreadings`
--

DROP TABLE IF EXISTS `aqmreadings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aqmreadings` (
  `id` int(11) DEFAULT NULL,
  `largeValue` varchar(255) DEFAULT NULL,
  `smallValue` varchar(255) DEFAULT NULL,
  `synced` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `device_id` int(11) DEFAULT NULL,
  `date_field` timestamp NULL DEFAULT NULL,
  `geo_latitude` decimal(10,5) DEFAULT NULL,
  `geo_longitude` decimal(10,5) DEFAULT NULL,
  `geo_method` varchar(255) DEFAULT NULL,
  `createdAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aqmreadings`
--

LOCK TABLES `aqmreadings` WRITE;
/*!40000 ALTER TABLE `aqmreadings` DISABLE KEYS */;
INSERT INTO `aqmreadings` VALUES (100,'test','test','Synced',1,2,'2016-02-15 21:23:34',10.25000,20.29000,'method','2016-02-15 21:23:34'),(100,'test','test','Synced',1,2,'2016-02-15 22:52:51',10.25000,20.29000,'method','2016-02-15 22:52:51'),(101,'testingagain','testingagain','syncedtesting',123,123,'2016-02-15 22:52:51',12.31000,-10.24000,'method','2016-02-15 23:22:59'),(101,'testingagain','testingagain','syncedtesting',123,123,'2016-02-15 22:52:51',12.31000,-10.24000,'method','2016-02-16 01:58:20');
/*!40000 ALTER TABLE `aqmreadings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logs`
--

DROP TABLE IF EXISTS `logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `logs` (
  `id` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `synced` varchar(255) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  `extras` varchar(255) DEFAULT NULL,
  `createdAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logs`
--

LOCK TABLES `logs` WRITE;
/*!40000 ALTER TABLE `logs` DISABLE KEYS */;
INSERT INTO `logs` VALUES (100,'test','Synced','2016-02-15 22:54:29','extras','2016-02-15 22:54:29'),(101,'testingagain','syncedtesting','2016-02-15 22:52:51','extra','2016-02-16 00:52:33'),(101,'testingagain','syncedtesting','2016-02-15 22:52:51','extra','2016-02-16 01:58:20');
/*!40000 ALTER TABLE `logs` ENABLE KEYS */;
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
  `synced` varchar(255) DEFAULT NULL,
  `timestamp` timestamp NULL DEFAULT NULL,
  `time_of_day` varchar(255) DEFAULT NULL,
  `createdAt` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sprioreading`
--

LOCK TABLES `sprioreading` WRITE;
/*!40000 ALTER TABLE `sprioreading` DISABLE KEYS */;
INSERT INTO `sprioreading` VALUES (100,'reading','Synced','2016-02-15 22:55:24','afternoon','2016-02-15 22:55:24'),(101,'read','syncedtesting','2016-02-15 22:52:51',NULL,'2016-02-16 01:34:47'),(101,'read','syncedtesting','2016-02-15 22:52:51',NULL,'2016-02-16 01:58:19');
/*!40000 ALTER TABLE `sprioreading` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-02-16 17:43:51
