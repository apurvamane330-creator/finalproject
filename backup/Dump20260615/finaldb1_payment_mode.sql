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
-- Table structure for table `payment_mode`
--

DROP TABLE IF EXISTS `payment_mode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment_mode` (
  `pmid` int NOT NULL,
  `dateofpayment` datetime(6) DEFAULT NULL,
  `status` bit(1) NOT NULL,
  `card_cid` int DEFAULT NULL,
  `cod_cid` int DEFAULT NULL,
  `upi_uid` int DEFAULT NULL,
  PRIMARY KEY (`pmid`),
  UNIQUE KEY `UKd8y8wsxi8odxqhe8qb2qqd1br` (`card_cid`),
  UNIQUE KEY `UKhcm55fs06phah9jxi7bxd6a2r` (`cod_cid`),
  UNIQUE KEY `UK4wd06o9ryag2e6968s31h6pt5` (`upi_uid`),
  CONSTRAINT `FK1hwmp4n0wk5n19c45s5sq3e5m` FOREIGN KEY (`upi_uid`) REFERENCES `upi` (`uid`),
  CONSTRAINT `FK6tifabxyi2ilyg8mv8xqxfl4g` FOREIGN KEY (`card_cid`) REFERENCES `card` (`cid`),
  CONSTRAINT `FKhmw8schvgd3pej5sch5f5jixe` FOREIGN KEY (`cod_cid`) REFERENCES `cash_on_delivery` (`cid`),
  CONSTRAINT `FKp6xkrmsc70rkomu6g5sbqhots` FOREIGN KEY (`cod_cid`) REFERENCES `cod` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_mode`
--

LOCK TABLES `payment_mode` WRITE;
/*!40000 ALTER TABLE `payment_mode` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment_mode` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-06-15 13:06:09
