CREATE DATABASE `s02t01n01ptd` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `s02t01n01ptd`;
DROP TABLE IF EXISTS `proveedores`;
CREATE TABLE `proveedores` (
  `id_proveedores` int(11) NOT NULL,
  `nombre` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `FAX` varchar(12) DEFAULT NULL,
  `NIF` varchar(12) DEFAULT NULL,
  `direccion` TEXT CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id_proveedores`),
  UNIQUE KEY `idproveedores_UNIQUE` (`id_proveedores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `s02t01n01ptd`.`proveedores`
(`id_proveedores`,
`nombre`,
`telefono`,
`FAX`,
`NIF`,
`direccion`)
VALUES
("1",
"ACME",
"+34123456789",
"+34123568974",
"20221123F",
"avda company, 35 250014 valencia");
DROP TABLE IF EXISTS `gafas`;
CREATE TABLE `gafas` (
  `idgafas` int(11) NOT NULL,
  `marca` varchar(45) DEFAULT NULL,
  `graduacion_izq` float DEFAULT NULL,
  `graduacion_der` float DEFAULT NULL,
  `tipo montura` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `id_proveedor` int(11) DEFAULT NULL,
  PRIMARY KEY (`idgafas`),
  UNIQUE KEY `idgafas_UNIQUE` (`idgafas`),
  KEY `id proveedor_idx` (`id_proveedor`),
  FOREIGN KEY (`id_proveedor`) REFERENCES proveedores(`id_proveedores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `s02t01n01ptd`.`gafas`
(`idgafas`,
`marca`,
`graduacion_izq`,
`graduacion_der`,
`tipo montura`,
`color`,
`precio`,
`id_proveedor`)
VALUES
("1",
"ACMEsun",
"3.25",
"2.27",
"pasta",
"rojo",
250,
"1");
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `idclientes` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `idgafas` int(11) DEFAULT NULL,
  `comentarios` longtext,
  PRIMARY KEY (`idclientes`),
  UNIQUE KEY `idclientes_UNIQUE` (`idclientes`),
  KEY `id gafas_idx` (`idgafas`),
  FOREIGN KEY (`idgafas`) REFERENCES gafas(`idgafas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `s02t01n01ptd`.`clientes`
(`idclientes`,
`nombre`,
`direccion`,
`telefono`,
`email`,
`fecha`,
`idgafas`,
`comentarios`)
VALUES
("1",
"Pedro",
"avda company, 35 250014 valencia",
"+34123456789",
"piter@gmail.com",
"2022-11-23",
"1",
"viene de cliente 5")