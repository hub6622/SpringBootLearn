/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.17-log : Database - p_bookdata
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`p_bookdata` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `p_bookdata`;

/*Table structure for table `p_book` */

DROP TABLE IF EXISTS `p_book`;

CREATE TABLE `p_book` (
  `bookId` int(20) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(20) DEFAULT NULL,
  `bookCode` int(50) DEFAULT NULL,
  `bookAuthor` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `p_book` */

insert  into `p_book`(`bookId`,`bookName`,`bookCode`,`bookAuthor`) values (1,'ppg666',465456,'dcc'),(2,'我的奋斗',6544,'ppg');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
