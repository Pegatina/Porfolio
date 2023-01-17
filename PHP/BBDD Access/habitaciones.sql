-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-01-2023 a las 19:01:17
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
-- Base de datos: `ejercicio10`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `num` int(11) NOT NULL,
  `estado` enum('libre','reservada','ocupada') NOT NULL,
  `ocupante` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`num`, `estado`, `ocupante`) VALUES
(1, 'ocupada', 'Manuel'),
(2, 'ocupada', 'Enrique'),
(3, 'ocupada', 'Luis'),
(4, 'ocupada', 'Pepa'),
(5, 'ocupada', 'María'),
(6, 'ocupada', 'Raquel'),
(7, 'ocupada', 'Lucas'),
(8, 'ocupada', 'Raul'),
(9, 'ocupada', 'David'),
(10, 'ocupada', 'Lorena'),
(11, 'ocupada', 'Alejandro'),
(12, 'ocupada', 'Sergio'),
(13, 'ocupada', 'Mateo'),
(14, 'ocupada', 'Iván'),
(15, 'ocupada', 'Juan'),
(16, 'reservada', 'Esmeralda'),
(17, 'reservada', 'Nuria'),
(18, 'reservada', 'Jorge'),
(19, 'reservada', 'Eugenia'),
(20, 'reservada', 'Félix'),
(21, 'reservada', 'Manel'),
(22, 'reservada', 'Alex'),
(23, 'reservada', 'Rosa'),
(24, 'reservada', 'Antonio'),
(25, 'reservada', 'Jose'),
(26, 'libre', ''),
(27, 'libre', ''),
(28, 'libre', ''),
(29, 'libre', ''),
(30, 'libre', ''),
(31, 'libre', ''),
(32, 'libre', ''),
(33, 'libre', ''),
(34, 'libre', ''),
(35, 'libre', ''),
(36, 'libre', ''),
(37, 'libre', ''),
(38, 'libre', ''),
(39, 'libre', ''),
(40, 'libre', ''),
(41, 'libre', ''),
(42, 'libre', ''),
(43, 'libre', ''),
(44, 'libre', ''),
(45, 'libre', ''),
(46, 'libre', ''),
(47, 'libre', ''),
(48, 'libre', ''),
(49, 'libre', ''),
(50, 'libre', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD PRIMARY KEY (`num`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  MODIFY `num` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
