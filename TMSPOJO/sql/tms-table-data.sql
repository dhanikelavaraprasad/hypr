-- MySQL dump 10.13  Distrib 5.6.24, for Win32 (x86)
--
-- Host: localhost    Database: taskmanagement
-- ------------------------------------------------------
-- Server version	5.5.25a

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
-- Dumping data for table `tms_code_review`
--

LOCK TABLES `tms_code_review` WRITE;
/*!40000 ALTER TABLE `tms_code_review` DISABLE KEYS */;
/*!40000 ALTER TABLE `tms_code_review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tms_efforts`
--

LOCK TABLES `tms_efforts` WRITE;
/*!40000 ALTER TABLE `tms_efforts` DISABLE KEYS */;
/*!40000 ALTER TABLE `tms_efforts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tms_leave_mst`
--

LOCK TABLES `tms_leave_mst` WRITE;
/*!40000 ALTER TABLE `tms_leave_mst` DISABLE KEYS */;
/*!40000 ALTER TABLE `tms_leave_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tms_module`
--

LOCK TABLES `tms_module` WRITE;
/*!40000 ALTER TABLE `tms_module` DISABLE KEYS */;
INSERT INTO `tms_module` VALUES (1,'Dataprocessing','WETL',1),(2,'Deals Manage pages and pub groups','MATRIX',1),(3,'Deals Card builder and Beast Mode editor','GAMBIT',1),(4,'Goonies','GOONIES',1);
/*!40000 ALTER TABLE `tms_module` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tms_org_leaves`
--

LOCK TABLES `tms_org_leaves` WRITE;
/*!40000 ALTER TABLE `tms_org_leaves` DISABLE KEYS */;
INSERT INTO `tms_org_leaves` VALUES (1,'2016-05-17 05:30:00','Holiday'),(2,'2016-08-15 00:00:00','Independence Day'),(3,'2016-12-25 00:00:00',NULL);
/*!40000 ALTER TABLE `tms_org_leaves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tms_project`
--

LOCK TABLES `tms_project` WRITE;
/*!40000 ALTER TABLE `tms_project` DISABLE KEYS */;
INSERT INTO `tms_project` VALUES (1,'DOMO','2014-05-01',NULL,'DOMO Project');
/*!40000 ALTER TABLE `tms_project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tms_sprint_mst`
--

LOCK TABLES `tms_sprint_mst` WRITE;
/*!40000 ALTER TABLE `tms_sprint_mst` DISABLE KEYS */;
INSERT INTO `tms_sprint_mst` VALUES (1,'2016-06-07',490,'UI-Framwork-2016-06-07','2016-05-25','OPEN',490,1);
/*!40000 ALTER TABLE `tms_sprint_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tms_status_mst`
--

LOCK TABLES `tms_status_mst` WRITE;
/*!40000 ALTER TABLE `tms_status_mst` DISABLE KEYS */;
INSERT INTO `tms_status_mst` VALUES (1,'BACKLOG'),(2,'TODO'),(3,'DEVELOPMENT'),(4,'PULLREQUEST'),(5,'INTERNAL_REIVEW'),(6,'QUALITY'),(7,'REOPEN'),(8,'CODE_MERGED'),(9,'CLOSED'),(10,'NEXT_SPRINT');
/*!40000 ALTER TABLE `tms_status_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tms_story_mst`
--

LOCK TABLES `tms_story_mst` WRITE;
/*!40000 ALTER TABLE `tms_story_mst` DISABLE KEYS */;
INSERT INTO `tms_story_mst` VALUES (1,'DOMO-1234',0,2);
/*!40000 ALTER TABLE `tms_story_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tms_subtask`
--

LOCK TABLES `tms_subtask` WRITE;
/*!40000 ALTER TABLE `tms_subtask` DISABLE KEYS */;
/*!40000 ALTER TABLE `tms_subtask` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tms_users`
--

LOCK TABLES `tms_users` WRITE;
/*!40000 ALTER TABLE `tms_users` DISABLE KEYS */;
INSERT INTO `tms_users` VALUES (1,'admin@cybage.com','ACTIVE','$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi','admin','DEVELOPER',1),(2,'vikasj@cybage.com','ACTIVE','$2a$10$.XOA3l/4/wjcAyplTlaac.813Q7MZdm6BpypTOEwaAoGI8aiqp6H6','vikasj','LEAD',1),(3,'jwalavaraprasadd@cybage.com','ACTIVE','$2a$10$dTvzxip6JmDPi4XEqdxEeugcaeueyHB70bUmKF1rBPHUZ855GEXSq','jwalavaraprasadd','DEVELOPER',1);
/*!40000 ALTER TABLE `tms_users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_story_staus`
--

LOCK TABLES `user_story_staus` WRITE;
/*!40000 ALTER TABLE `user_story_staus` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_story_staus` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-03  8:02:50
