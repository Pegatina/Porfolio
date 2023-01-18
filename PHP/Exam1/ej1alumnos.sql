-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2022 a las 01:56:16
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

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
-- Estructura de tabla para la tabla `ej1alumnos`
--

CREATE TABLE `ej1alumnos` (
  `cod_alumno` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `grupo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ej1alumnos`
--

INSERT INTO `ej1alumnos` (`cod_alumno`, `nombre`, `grupo`) VALUES
(1, 'Carmen', '2DAW'),
(2, 'Antonio', '1DAW'),
(3, 'Manuel', '2ASIR'),
(4, 'Amanda', '1ASIR'),
(5, 'Miguel', '1DAW'),
(6, 'Sonia', '2ASIR'),
(7, 'Julián', '1SMR'),
(8, 'Dolores', '2SMR'),
(9, 'Luisa', '2DAW'),
(10, 'Fernando', '2SMR'),
(11, 'Ana', '1SMR'),
(12, 'Julio', '1ASIR');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ej1alumnos`
--
ALTER TABLE `ej1alumnos`
  ADD PRIMARY KEY (`cod_alumno`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ej1alumnos`
--
ALTER TABLE `ej1alumnos`
  MODIFY `cod_alumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
