-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-01-2023 a las 18:44:13
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
-- Base de datos: `centro`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`codigo`, `nombre`) VALUES
(3, 'Juan'),
(4, 'María'),
(2, 'Pepe');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dam`
--

CREATE TABLE `dam` (
  `cod_alumno` int(11) NOT NULL,
  `nom_alumno` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `daw`
--

CREATE TABLE `daw` (
  `cod_alumno` int(11) NOT NULL,
  `nom_alumno` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `daw`
--

INSERT INTO `daw` (`cod_alumno`, `nom_alumno`) VALUES
(1, 'Lau');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `smr`
--

CREATE TABLE `smr` (
  `cod_alumno` int(11) NOT NULL,
  `nom_alumno` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `dam`
--
ALTER TABLE `dam`
  ADD PRIMARY KEY (`nom_alumno`);

--
-- Indices de la tabla `daw`
--
ALTER TABLE `daw`
  ADD PRIMARY KEY (`nom_alumno`);

--
-- Indices de la tabla `smr`
--
ALTER TABLE `smr`
  ADD PRIMARY KEY (`nom_alumno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
