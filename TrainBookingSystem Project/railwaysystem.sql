-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 05, 2024 at 07:40 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `railwaysystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Name` varchar(50) NOT NULL,
  `Contact` int(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `City` varchar(50) NOT NULL,
  `State` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Name`, `Contact`, `Address`, `Email`, `City`, `State`, `Username`, `Password`) VALUES
('Nsondo Mirelle', 682066116, 'molyko', 'mi@gmail.com', 'buea', 'Andhra Pradesh', 'Mirelle', 'reingo1'),
('bERTIE', 67225555, 'molyko', 'berti@gmail.com', 'Buea', 'Andhra Pradesh', 'bert', 'rrrr'),
('brandon', 670087905, 'buea', 'bran@gmail.com', '', 'Buea', 'n brandon', '12s3456'),
('Ngouh Kambi', 678855744, 'Bonduma', 'ngouhkambi@gmail.com', 'Buea', 'Bamenda', 'Marc', 'Marc247');

-- --------------------------------------------------------

--
-- Table structure for table `passrecord`
--

CREATE TABLE `passrecord` (
  `pName` varchar(50) NOT NULL,
  `pGender` varchar(50) NOT NULL,
  `pAge` varchar(50) NOT NULL,
  `pAction` varchar(50) NOT NULL,
  `StationFrom` varchar(50) NOT NULL,
  `StationTo` varchar(50) NOT NULL,
  `TrainNo` varchar(50) NOT NULL,
  `Distance` varchar(50) NOT NULL,
  `TrainType` varchar(50) NOT NULL,
  `SeetFare` varchar(50) NOT NULL,
  `trainName` varchar(50) NOT NULL,
  `ArrTime` varchar(50) NOT NULL,
  `DepTime` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `passrecord`
--

INSERT INTO `passrecord` (`pName`, `pGender`, `pAge`, `pAction`, `StationFrom`, `StationTo`, `TrainNo`, `Distance`, `TrainType`, `SeetFare`, `trainName`, `ArrTime`, `DepTime`) VALUES
('mimi', 'Male', '19', 'SL', 'Buea', 'Douala', '1', '10km', 'VIP', '1500', 'Train1', '9am', '6am');

-- --------------------------------------------------------

--
-- Table structure for table `traindetails`
--

CREATE TABLE `traindetails` (
  `TrainType` varchar(50) NOT NULL,
  `TrainNo` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `StationFrom` varchar(50) NOT NULL,
  `StationTo` varchar(50) NOT NULL,
  `ArrTime` varchar(50) NOT NULL,
  `DepTime` varchar(50) NOT NULL,
  `SLFare` varchar(50) NOT NULL,
  `AC3Fare` varchar(50) NOT NULL,
  `AC2Fare` varchar(50) NOT NULL,
  `AC1Fare` varchar(50) NOT NULL,
  `Distance` varchar(50) NOT NULL,
  `Days` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `traindetails`
--

INSERT INTO `traindetails` (`TrainType`, `TrainNo`, `Name`, `StationFrom`, `StationTo`, `ArrTime`, `DepTime`, `SLFare`, `AC3Fare`, `AC2Fare`, `AC1Fare`, `Distance`, `Days`, `date`) VALUES
('VIP', '1', 'Train1', 'Buea', 'Douala', '9am', '6am', '1500', '0', '0', '0', '10km', 'monday-thursday', '10/11/2024'),
('Local', '2', 'Train2', 'Yaounde', 'Bamenda', '8am', '11pm', '8000', '10000', '11000', '12500', '18km', 'Saturday-Wednesday', '5/6/2024'),
('Local', '4', 'train3', 'Bafoussam', 'Bertoua', '6pm', '9am', '8000', '15000', '12000', '10000', '13km', 'fridays', '4/6/2024'),
('VIP', '8', 'train4', 'ebolowa', 'maroua', '6am', '4pm', '15000', '25000', '23500', '20000', '20km', 'thursdays', '5/6/2024');

-- --------------------------------------------------------

--
-- Table structure for table `ulogin`
--

CREATE TABLE `ulogin` (
  `Name` varchar(50) NOT NULL,
  `Contact` int(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `City` varchar(50) NOT NULL,
  `State` varchar(50) NOT NULL,
  `UserName` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ulogin`
--

INSERT INTO `ulogin` (`Name`, `Contact`, `Address`, `Email`, `City`, `State`, `UserName`, `Password`) VALUES
('floral', 123456, 'malingo', 'des@yahoo.com', 'buea', 'Goa', 'mimi', '123456'),
('reingo1', 123456789, 'bonaberi', 'bi@yahoo.com', 'douala', 'Douala', 'reingo', 'reingo1'),
('Nguimenang', 696775477, 'molyko', 'zeufackkkereine@gmail.com', 'Buea', 'Buea', 'Kereine', 'abcde'),
('Shalom', 652789744, 'Buea', 'shalombrenda77@gmail.com', 'Buea', 'Buea', 'Brenda', '0987'),
('nkegoa karel', 676795779, 'sandpit', 'nkegoakarel@gmail.com', 'Buea', 'Bamenda', 'karel', 'karel123'),
('Ngwa Nathan', 680952307, 'MOLYKO', 'nathanngwa3@gmail.com', 'Buea', 'Buea', 'nathan', '12345678'),
('NJUZE RAVINE', 672869440, 'MOLYKO', 'njuzeravine@gmail.com', 'BUEA', 'Bamenda', 'RAV237', 'Ravine2004');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
