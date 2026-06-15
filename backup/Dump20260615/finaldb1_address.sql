-- MySQL dump 10.13  Distrib 8.0.45, for Win64 (x86_64)
--
-- Host: localhost    Database: finaldb1
-- ------------------------------------------------------
-- Server version	8.0.45

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `flatno` int NOT NULL,
  `area` varchar(255) DEFAULT NULL,
  `pincode` int NOT NULL,
  `country_id` int DEFAULT NULL,
  `district_id` int DEFAULT NULL,
  `state_id` int DEFAULT NULL,
  `taluka_id` int DEFAULT NULL,
  `town_id` int DEFAULT NULL,
  PRIMARY KEY (`flatno`),
  KEY `FKe54x81nmccsk5569hsjg1a6ka` (`country_id`),
  KEY `FKlfbgmvnqd77ic0ojmwvk07tlm` (`district_id`),
  KEY `FK4cx5jughttw4h3qfxrcitbtxl` (`state_id`),
  KEY `FKpdur73q6b7s31x8wvys2v2gju` (`taluka_id`),
  KEY `FKf8t39xik4v0jmxvonnahs3hpl` (`town_id`),
  CONSTRAINT `FK4cx5jughttw4h3qfxrcitbtxl` FOREIGN KEY (`state_id`) REFERENCES `state` (`id`),
  CONSTRAINT `FKe54x81nmccsk5569hsjg1a6ka` FOREIGN KEY (`country_id`) REFERENCES `country` (`cid`),
  CONSTRAINT `FKf8t39xik4v0jmxvonnahs3hpl` FOREIGN KEY (`town_id`) REFERENCES `town` (`id`),
  CONSTRAINT `FKlfbgmvnqd77ic0ojmwvk07tlm` FOREIGN KEY (`district_id`) REFERENCES `distric` (`did`),
  CONSTRAINT `FKpdur73q6b7s31x8wvys2v2gju` FOREIGN KEY (`taluka_id`) REFERENCES `taluka` (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (124,'47KM',512005,1,1,1,1,1),(125,'48KM',410001,1,1,1,2,2),(126,'47KM',512005,1,1,1,1,1);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-06-15 13:06:10
