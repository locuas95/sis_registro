-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 16-08-2016 a las 22:51:16
-- Versión del servidor: 5.0.51
-- Versión de PHP: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `bd_registrop`
-- 

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `persona`
-- 

CREATE TABLE `persona` (
  `idpersona` int(15) unsigned NOT NULL auto_increment,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `dni` varchar(8) NOT NULL,
  PRIMARY KEY  (`idpersona`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

-- 
-- Volcar la base de datos para la tabla `persona`
-- 

INSERT INTO `persona` VALUES (1, 'kevin', 'mogollon', 'alameda', '95836453', '72836423');
INSERT INTO `persona` VALUES (2, 'daniel', 'pacheco', 'lima', '93645658', '7844773');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `usuario`
-- 

CREATE TABLE `usuario` (
  `idusuario` int(30) unsigned NOT NULL auto_increment,
  `usuario` varchar(30) NOT NULL,
  `password` varchar(11) NOT NULL,
  PRIMARY KEY  (`idusuario`),
  FULLTEXT KEY `usuario` (`usuario`,`password`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

-- 
-- Volcar la base de datos para la tabla `usuario`
-- 

INSERT INTO `usuario` VALUES (1, 'grupo', '12345');
