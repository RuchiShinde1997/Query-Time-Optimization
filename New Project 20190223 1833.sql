-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema comet
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ comet;
USE comet;

--
-- Table structure for table `comet`.`user_info`
--

DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `cino` varchar(10) NOT NULL default '',
  `title` varchar(45) NOT NULL default '',
  `fname` varchar(45) NOT NULL default '',
  `lname` varchar(45) NOT NULL default '',
  `ffname` varchar(45) NOT NULL default '',
  `flname` varchar(45) NOT NULL default '',
  `mfname` varchar(45) NOT NULL default '',
  `mlname` varchar(45) NOT NULL default '',
  `dob` varchar(25) NOT NULL default '',
  `bplace` varchar(45) NOT NULL default '',
  `ecolor` varchar(45) NOT NULL default '',
  `caddr` varchar(150) NOT NULL default '',
  `ccity` varchar(45) NOT NULL default '',
  `cstate` varchar(45) NOT NULL default '',
  `paddr` varchar(150) NOT NULL default '',
  `pcity` varchar(45) NOT NULL default '',
  `pstate` varchar(45) NOT NULL default '',
  `bgrp` varchar(10) NOT NULL default '',
  `mb_no` varchar(15) NOT NULL default '',
  `email` varchar(45) NOT NULL default '',
  `summary` varchar(150) NOT NULL default '',
  `credith` varchar(15) NOT NULL default '',
  PRIMARY KEY  (`cino`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comet`.`user_info`
--

/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
