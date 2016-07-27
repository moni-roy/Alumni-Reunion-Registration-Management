-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2016 at 11:05 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `juaam`
--

-- --------------------------------------------------------

--
-- Table structure for table `juaam_record`
--

CREATE TABLE IF NOT EXISTS `juaam_record` (
  `Serial` int(10) NOT NULL AUTO_INCREMENT,
  `Registration No` varchar(4) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `Batch` int(10) NOT NULL,
  `Contact No.` varchar(255) NOT NULL,
  `Registration Mode` varchar(255) NOT NULL,
  `Receipt No.` varchar(255) NOT NULL,
  `Amount` int(10) NOT NULL,
  `No of participants` int(10) NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`Serial`),
  UNIQUE KEY `Registration No` (`Registration No`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=45 ;

--
-- Dumping data for table `juaam_record`
--

INSERT INTO `juaam_record` (`Serial`, `Registration No`, `Name`, `Batch`, `Contact No.`, `Registration Mode`, `Receipt No.`, `Amount`, `No of participants`, `Date`) VALUES
(1, '0004', '4', 4, '4', 'Bank', '4', 4, 4, '2015-12-18'),
(2, '3', 'pagol', 45, '0177691', 'Direct', 'Touhid khan', 4000, 3, '2015-01-03'),
(3, '9999', 'ytty', 65, '078', 'Bank', 'y', 65, 5, '2015-12-10'),
(4, '1111', 'monikrishna roy', 42, '01776934196', 'Direct', 'touhid', 25000, 2, '2015-12-31'),
(5, '0001', '2', 2, '2', 'Bank', '2', 2, 2, '2015-12-04'),
(6, '0002', '22', 22, '22', 'Bank', '22', 22, 22, '2015-12-03'),
(7, '0022', '222', 22, '22', 'Bank', '2222', 22, 2, '2015-12-11'),
(8, '0222', '2', 2, '222', 'Bank', '22', 2, 22, '2015-12-08'),
(9, '0223', 'q', 323, '232', 'Bank', '32', 23, 32312, '2015-12-08'),
(10, '0232', '232', 232, '232', 'Bank', '232', 233, 232, '2015-12-23'),
(11, '2324', '4343', 43324, '343', 'Bank', '3432', 434, 3434, '2015-12-18'),
(12, '0005', '44', 44, '44', 'Bank', '44', 44, 44, '2015-12-03'),
(13, '0055', '66', 4545, '4554', 'Bank', '454', 454, 454, '1993-12-10'),
(14, '0565', '565', 565, '565', 'Bank', '6565', 565, 565, '2015-12-10'),
(15, '0234', '454', 4545, '44554', 'Bank', '4545', 454, 5454, '2015-12-01'),
(16, '0065', '54', 334, '343', 'Bank', '3434', 343, 4344, '2015-12-03'),
(17, '0076', '565', 656, '565', 'Bank', '565', 565, 556, '2015-12-04'),
(18, '0675', '65', 565, '656', 'Bank', '565', 6565, 565, '2015-12-04'),
(19, '0676', '7667', 676, '766', 'Bank', '767', 6767, 6767, '2015-12-24'),
(20, '0877', '6767', 7676, '7676', 'Bank', '767', 776, 6776, '2015-12-03'),
(21, '4546', '6445', 565, '564', 'Bank', '4565', 54654, 5645, '2015-12-16'),
(22, '0345', '4543', 43543, '543', 'Bank', '43543', 4543, 4545, '2015-12-30'),
(23, '0454', '4343', 5445, '4534', 'Bank', '4545', 544, 534, '2015-12-31'),
(24, '0435', '5445', 444, '4554', 'Bank', '455', 5445, 4545, '2015-12-01'),
(25, '6565', '656', 656, '7765', 'Bank', '65567', 577656, 7657, '2015-12-02'),
(26, '1234', 'Tifege', 8699, '98987', '889789', '8898', 98989, 99879, '2016-01-20'),
(27, '0121', '56657', 75765, '75677', 'Bank', '57765', 6565, 6576576, '2015-12-04'),
(28, '0898', '334', 778, '9898', 'Bank', '8989', 898, 98988, '2015-12-30'),
(29, '3345', '6476', 6758, '876867', '787876', '78768', 867876, 787, '2016-01-20'),
(30, '7674', '8989', 76878, '8768', '8989', '8987', 898, 98979, '2016-01-20'),
(31, '7777', '888', 999, '555', 'Bank', '99', 66, 66, '2016-01-14'),
(34, '0008', 'safff', 12, '01723292329', 'Direct', 'Tauhed', 1000, 2, '2016-01-01'),
(38, '1232', 'abc', 23, '01723292329', 'Direct', 'abc', 7000, 22, '2016-01-03'),
(39, '3456', 'Ap;1=1 drop Serial=38;', 23, '3423423423423', 'Bank', 'dddd', 1232, 34234, '2016-01-12'),
(40, '0099', 'moni', 33, '33', 'Bank', '33', 33, 33, '2016-01-01'),
(41, '6666', '8888', 888, '88', 'Bank', '88', 1000, -1, '2016-01-02'),
(42, '4343', '4344', 34, '545', 'Bank', '434', 3455, 10, '2016-01-06'),
(43, '4545', '44', 44, '44', 'Bank', '44', 4444, 13, '2016-01-01'),
(44, '2222', '8', 8, '88', 'Bank', '8', 8888, 28, '2016-01-01');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
