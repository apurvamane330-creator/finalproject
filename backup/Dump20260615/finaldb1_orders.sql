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
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `o_id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `invoice_id` int DEFAULT NULL,
  `payment_mode_id` int DEFAULT NULL,
  `shipping_id` int DEFAULT NULL,
  `tracking_id` int DEFAULT NULL,
  PRIMARY KEY (`o_id`),
  UNIQUE KEY `UK7uyq477u3xiljjthu50o6ie1s` (`invoice_id`),
  UNIQUE KEY `UKsgjc1elpqbgmb15du9j460epo` (`payment_mode_id`),
  UNIQUE KEY `UK1669f4lvh3kcm8l4l5mmabfsy` (`tracking_id`),
  KEY `FK91rcj411kact5f4cnc7sqjp6g` (`shipping_id`),
  CONSTRAINT `FK1g4duyvpitwpbihw5y928ix1a` FOREIGN KEY (`tracking_id`) REFERENCES `tracking` (`id`),
  CONSTRAINT `FK91rcj411kact5f4cnc7sqjp6g` FOREIGN KEY (`shipping_id`) REFERENCES `shipping_details` (`sid`),
  CONSTRAINT `FKaoewfwbs481oqm642472vmi6w` FOREIGN KEY (`payment_mode_id`) REFERENCES `payment_mode` (`pmid`),
  CONSTRAINT `FKja77citbxeilgqchn5vvbi55j` FOREIGN KEY (`invoice_id`) REFERENCES `invoice` (`iid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-06-15 13:06:02
