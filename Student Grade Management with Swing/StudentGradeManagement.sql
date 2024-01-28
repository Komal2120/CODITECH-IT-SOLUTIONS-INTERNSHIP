-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: studentmanagement
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student_details`
--

DROP TABLE IF EXISTS student_details;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE student_details (
  roll_no int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  maths int DEFAULT NULL,
  english int DEFAULT NULL,
  socialsci int DEFAULT NULL,
  science int DEFAULT NULL,
  total int DEFAULT NULL,
  grade varchar(1) DEFAULT NULL,
  PRIMARY KEY (roll_no)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_details`
--

INSERT INTO student_details (roll_no, name, maths, english, socialsci, science, total, grade) VALUES (1,'Ritika Vaidya',95,46,78,95,314,'C');
INSERT INTO student_details (roll_no, name, maths, english, socialsci, science, total, grade) VALUES (2,'Paras Jain',78,96,68,75,317,'C');
INSERT INTO student_details (roll_no, name, maths, english, socialsci, science, total, grade) VALUES (3,'Kumar Dandvekar',54,82,78,67,281,'C');
INSERT INTO student_details (roll_no, name, maths, english, socialsci, science, total, grade) VALUES (4,'Vibha Chandak',64,68,75,79,286,'C');
INSERT INTO student_details (roll_no, name, maths, english, socialsci, science, total, grade) VALUES (5,'Komal Vishwakarma',87,83,98,91,359,'B');
INSERT INTO student_details (roll_no, name, maths, english, socialsci, science, total, grade) VALUES (6,'Sayali Wankhede',84,97,91,91,363,'A');
INSERT INTO student_details (roll_no, name, maths, english, socialsci, science, total, grade) VALUES (7,'Divyanshu Singh',84,78,87,91,340,'B');
INSERT INTO student_details (roll_no, name, maths, english, socialsci, science, total, grade) VALUES (8,'Aayush Gupta',59,54,76,51,240,'D');
INSERT INTO student_details (roll_no, name, maths, english, socialsci, science, total, grade) VALUES (9,'Barun Sobti',84,86,87,94,351,'B');
INSERT INTO student_details (roll_no, name, maths, english, socialsci, science, total, grade) VALUES (10,'Sanaya Irani',90,91,97,94,372,'A');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed
