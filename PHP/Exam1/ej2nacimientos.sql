-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2022 a las 21:37:48
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ex1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ej2nacimientos`
--

CREATE TABLE `ej2nacimientos` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `padre` varchar(30) NOT NULL,
  `madre` varchar(30) NOT NULL,
  `dia` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ej2nacimientos`
--

INSERT INTO `ej2nacimientos` (`codigo`, `nombre`, `padre`, `madre`, `dia`) VALUES
(1, 'Álvaro', 'Iván', 'Esther', '2022-11-18'),
(12, 'Luisa', 'José', 'María', '2022-11-18'),
(17, 'Luisa', 'José', 'María', '2022-11-18'),
(18, 'Juan', 'Sergio', 'Sara', '2022-11-10'),
(19, 'Luisa', 'José', 'María', '2022-11-18');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ej2nacimientos`
--
ALTER TABLE `ej2nacimientos`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ej2nacimientos`
--
ALTER TABLE `ej2nacimientos`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
