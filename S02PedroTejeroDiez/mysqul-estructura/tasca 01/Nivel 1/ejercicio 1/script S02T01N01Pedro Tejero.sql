DROP DATABASE IF EXISTS `s02t01n01ptd`;
CREATE DATABASE `s02t01n01ptd` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `s02t01n01ptd`;
DROP USER IF EXISTS "dependiente 1", "dependiente 2";
CREATE USER "dependiente 1" IDENTIFIED BY "user1";
CREATE USER "dependiente 2" IDENTIFIED BY "user2";
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `id_user` int(11) NOT NULL UNIQUE,
  `usuario`VARCHAR(15) NOT NULL,
   PRIMARY KEY (`id_user`),
  UNIQUE KEY `iduser_UNIQUE` (`id_user`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
  INSERT INTO usuarios
  (`id_user`, `usuario`)
  VALUES
  (1, "dependiente 1"), (2, "dependiente 2");
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
"avda company, 35 250014 valencia"), ("2",
"Nike",
"+34123456789",
"+34123568974",
"20224578L",
"carrer Lepanto, 35 08004 Barcelona"),
(3,"raiban","+359874569","+359468712","123456789J","calle laguna, 45 tenerife 56089");
DROP TABLE IF EXISTS `monturas`;
CREATE TABLE `monturas` (
  `id_montura` int(11) NOT NULL UNIQUE,
  `tipo_montura`VARCHAR(12) NOT NULL)
  ENGINE=InnoDB DEFAULT CHARSET=utf8;
  INSERT INTO monturas
  (`id_montura`, `tipo_montura`)
  VALUES
  (1, "pasta"), (2, "metal"), (3, "flotante");
DROP TABLE IF EXISTS `gafas`;
CREATE TABLE `gafas` (
  `idgafas` int(11) NOT NULL,
  `marca` varchar(45) DEFAULT NULL,
  `graduacion_izq` float DEFAULT NULL,
  `graduacion_der` float DEFAULT NULL,
  `tipo_montura` int(11) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `id_proveedor` int(11) DEFAULT NULL,
  `id_user` int(11) NOT NULL,
  PRIMARY KEY (`idgafas`),
  UNIQUE KEY `idgafas` (`idgafas`),
  KEY `id proveedor_idx` (`id_proveedor`),
  KEY `tipo_montura` (`tipo_montura`),
  KEY `id_user_idx` (`id_user`),
  CONSTRAINT `gafas_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedores` (`id_proveedores`),
  CONSTRAINT `tipo_montura` FOREIGN KEY (`tipo_montura`) REFERENCES `monturas` (`id_montura`),
   CONSTRAINT `usuario` FOREIGN KEY (`id_user`) REFERENCES `usuarios` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `s02t01n01ptd`.`gafas`
(`idgafas`,
`marca`,
`graduacion_izq`,
`graduacion_der`,
`tipo_montura`,
`color`,
`precio`,
`id_proveedor`,
`id_user`)
VALUES
(1,
"ACMEsun",
"3.25",
"2.27",
1,
"rojo",
250,
1,1),
(2,
"RAIBAN",
"3.00",
"3.27",
1,
"verde",
450,
3,1),
(3,
"NIKE",
"2.01",
"2.05",
2,
"negro",
350,
2,2);
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `idclientes` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `ref cliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`idclientes`),
  UNIQUE KEY `idclientes_UNIQUE` (`idclientes`),
  CONSTRAINT `cliente referente` FOREIGN KEY (`idclientes`) REFERENCES `clientes` (`idclientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `s02t01n01ptd`.`clientes`
(`idclientes`,
`nombre`,
`direccion`,
`telefono`,
`email`,
`fecha`,
`ref cliente`)
VALUES
("1",
"Pedro",
"avda company, 35 250014 valencia",
"+34123456789",
"piter@gmail.com",
"2022-11-23",
null),
("2",
"Maria",
"calle rayuela, 45 54008 Bilbao",
"+34123456789",
"mar@gmail.com",
"2020-11-04",
1),
("3",
"Juan",
"avda de las palmeras, 1 25047 Alicante",
"+34123456789",
"juan@gmail.com",
"2021-08-23",
2);

GRANT INSERT, SELECT, UPDATE ON s02t01n01ptd.gafas TO "dependiente 1","dependiente 2";
GRANT INSERT, SELECT, UPDATE ON s02t01n01ptd.clientes TO "dependiente 1","dependiente 2";