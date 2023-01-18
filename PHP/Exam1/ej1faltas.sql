-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2022 a las 01:56:11
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
-- Estructura de tabla para la tabla `ej1faltas`
--

CREATE TABLE `ej1faltas` (
  `cod_falta` int(11) NOT NULL,
  `cod_alumno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ej1faltas`
--

INSERT INTO `ej1faltas` (`cod_falta`, `cod_alumno`) VALUES
(1, 2),
(2, 6),
(3, 4),
(4, 11),
(5, 8),
(6, 7),
(7, 11),
(8, 10),
(9, 11),
(10, 10),
(11, 10),
(12, 5),
(13, 10),
(14, 8),
(15, 6),
(16, 4),
(17, 7),
(18, 11),
(19, 12),
(20, 4),
(21, 12),
(22, 10),
(23, 7),
(24, 4),
(25, 10),
(26, 1),
(27, 10),
(28, 9),
(29, 11),
(30, 6),
(31, 11),
(32, 9),
(33, 12),
(34, 11),
(35, 6),
(36, 7),
(37, 7),
(38, 10),
(39, 9),
(40, 3),
(41, 2),
(42, 11),
(43, 9),
(44, 2),
(45, 3),
(46, 6),
(47, 6),
(48, 3),
(49, 10),
(50, 2),
(51, 12),
(52, 9),
(53, 4),
(54, 3),
(55, 7),
(56, 1),
(57, 8),
(58, 2),
(59, 7),
(60, 1),
(61, 1),
(62, 3),
(63, 7),
(64, 12),
(65, 5),
(66, 10),
(67, 10),
(68, 6),
(69, 9),
(70, 4),
(71, 9),
(72, 6),
(73, 5),
(74, 11),
(75, 4),
(76, 7),
(77, 3),
(78, 12),
(79, 8),
(80, 2),
(81, 5),
(82, 5),
(83, 12),
(84, 2),
(85, 8),
(86, 8),
(87, 3),
(88, 6),
(89, 12),
(90, 3),
(91, 8),
(92, 10),
(93, 7),
(94, 6),
(95, 11),
(96, 7),
(97, 6),
(98, 7),
(99, 2),
(100, 5),
(101, 12),
(102, 11),
(103, 7),
(104, 4),
(105, 3),
(106, 5),
(107, 11),
(108, 5),
(109, 9),
(110, 11),
(111, 8),
(112, 8),
(113, 7),
(114, 12),
(115, 1),
(116, 11),
(117, 12),
(118, 12),
(119, 2),
(120, 2),
(121, 7),
(122, 3),
(123, 4),
(124, 7),
(125, 9),
(126, 9),
(127, 10),
(128, 3),
(129, 11),
(130, 4),
(131, 1),
(132, 1),
(133, 11),
(134, 1),
(135, 8),
(136, 8),
(137, 5),
(138, 4),
(139, 3),
(140, 3),
(141, 11),
(142, 1),
(143, 1),
(144, 3),
(145, 11),
(146, 12),
(147, 12),
(148, 11),
(149, 10),
(150, 9);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ej1faltas`
--
ALTER TABLE `ej1faltas`
  ADD PRIMARY KEY (`cod_falta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ej1faltas`
--
ALTER TABLE `ej1faltas`
  MODIFY `cod_falta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=151;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
