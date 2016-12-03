-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: csemall
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
-- Table structure for table `subjects`
--

DROP TABLE IF EXISTS `subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subjects` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `year` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  `code` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `seperate` varchar(45) NOT NULL,
  `grade` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subjects`
--

LOCK TABLES `subjects` WRITE;
/*!40000 ALTER TABLE `subjects` DISABLE KEYS */;
INSERT INTO `subjects` VALUES (1,2012,1,'REQ0013','사고와 표현I','교필',2),(2,2012,1,'REQ0112','영어커뮤니케이션 독해/작문A-II	','교필',1),(3,2012,1,'REQ0122','영어커뮤니케이션 청취/회화A-II	','교필',1),(4,2012,1,'CAE0001','일반물리I','핵교A',2),(5,2012,1,'CAE0003','대학수학','핵교A',2),(6,2012,1,'CAE0007','공학윤리','핵교A',2),(7,2012,1,'CBE0003','일반생물','핵교B',2),(8,2012,1,'GEN0200','컴퓨터와 인터넷개론','일교',2),(9,2012,1,'MME0001','확률 및 통계','전기',3),(10,2012,1,'MME0003','컴퓨터언어Ⅰ','전기',3),(11,2012,2,'REQ0014','사고와 표현II','교필',2),(12,2012,2,'REQ0015','대학과 지성','교필',2),(13,2012,2,'REQ0212','영어커뮤니케이션 독해/작문B-II	','교필',1),(14,2012,2,'REQ0222','영어커뮤니케이션 청취/회화B-II	','교필',1),(15,2012,2,'CAE0006','과학기술사','핵교A',2),(16,2012,2,'U122024','지구에서 만나 살아가는 여자와 남자	','일교',3),(17,2012,2,'U122048','중독심리학','일교',3),(18,2012,2,'MME0006','논리회로','전선',3),(19,2015,1,'CAE0002','공학의 이해','핵교A',2),(20,2015,1,'MME0004','이산수학','전선',3),(21,2015,1,'MME0011','컴퓨터구조','전선',3),(22,2015,1,'MME0038','그래픽활용','전선',3),(23,2015,1,'MME0052','멀티미디어개론','전선',3),(24,2015,1,'MME0062','웹 프로그래밍	','전선',3),(25,2015,1,'MME0037','자료구조','전지',3),(26,2015,2,'CBEF005','웰빙과 레져스포츠의 이해	','핵교B',2),(27,2015,2,'CBEN004','세계화와 국제이해	','핵교B',2),(28,2015,2,'MME0007','디지털 영상제작	','전선',3),(29,2015,2,'MME0036','선형대수','전선',3),(30,2015,2,'MME0040','알고리즘','전선',3),(31,2015,2,'MME0017','객체지향언어','전지',3),(32,2015,2,'MME0005','컴퓨터언어Ⅱ','전기',3),(33,2016,1,'GEN0369','토익 영문법 기초	','자율',2),(34,2016,1,'CSE0012','객체지향언어2	','전선',3),(35,2016,1,'CSE0015','데이터통신','전선',3),(36,2016,1,'CSE0021','컴퓨터그래픽스','전선',3),(37,2016,1,'CSE0023','웹서버프로그래밍','전선',3),(38,2016,1,'CSE0017','운영체제','전지',3),(39,2016,1,'CSE0019','데이터베이스','전지',3),(40,2016,2,'CAS0006',' 경제학의 이해	','토대',2),(41,2016,2,'CSE0029',' 경제학의 이해	','전선',3),(42,2016,2,'CSE0027','데이터베이스설계','전선',3),(43,2016,2,'U122012',' 생활속의 응급처치	','자율',3),(44,2016,2,'CSE0031',' 안드로이드프로그래밍1	','전선',3),(45,2016,2,'GEN0295',' 영상과 세계의 커뮤니케이션	','자율',2),(46,2016,2,'CSE0032',' 웹프레임워크1	','전선',3);
/*!40000 ALTER TABLE `subjects` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-04  0:17:39
