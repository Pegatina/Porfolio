-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-01-2023 a las 01:42:43
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
-- Base de datos: `restaurante`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `cod` int(11) NOT NULL,
  `usuario` varchar(10) NOT NULL,
  `fecha` date NOT NULL,
  `platos` varchar(30) NOT NULL,
  `precio_total` float(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`cod`, `usuario`, `fecha`, `platos`, `precio_total`) VALUES
(1, 'Lau123', '2022-12-15', '1_Lau123.txt', 34.00),
(2, 'Lau123', '2022-12-15', '2_Lau123.txt', 32.00),
(3, 'Erik456', '2022-12-15', '1_Erik456.txt', 84.00),
(4, 'Erik456', '2022-12-15', '2_Erik456.txt', 19.00),
(5, 'Lau123', '2022-12-15', '3_Lau123.txt', 74.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `platos`
--

CREATE TABLE `platos` (
  `Código` int(11) NOT NULL,
  `Categoría` varchar(50) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Descripción` varchar(50) NOT NULL,
  `Precio` decimal(4,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `platos`
--

INSERT INTO `platos` (`Código`, `Categoría`, `Nombre`, `Descripción`, `Precio`) VALUES
(1, 'Carnes', 'Filetes de lomo', 'Para la gente a dieta, a la plancha', '2.50'),
(2, 'Ensaladas', 'Burrata', 'Para los amantes del queso', '6.50'),
(3, 'Pastas', 'Tallarines a la carbonara', 'Plato contundente, ahora con bacon', '8.50'),
(4, 'Pescado', 'Pez espada', 'Gran filete', '10.00'),
(5, 'Pastas', 'Macarrones con tomatito', 'Los de toda la vida', '7.00'),
(6, 'Carnes', 'Albóndigas en su salsa', 'Salsa casera', '7.00'),
(7, 'Pollo', 'Pechuga de pollo villaroy', 'Con sabrosa bechamel', '9.50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `nombre` varchar(10) NOT NULL,
  `password` varchar(16) NOT NULL,
  `correo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`nombre`, `password`, `correo`) VALUES
('Erik456', '$Money12', 'asdfg@hola.com'),
('Lau123', '$Aa1bc$$', 'hola@hola.com'),
('Raul1234', '$$Bb1c%o', 'adios@adios.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`cod`);

--
-- Indices de la tabla `platos`
--
ALTER TABLE `platos`
  ADD PRIMARY KEY (`Código`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`nombre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `platos`
--
ALTER TABLE `platos`
  MODIFY `Código` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
