DROP DATABASE IF EXISTS `s02t01n01ejercicio2`;
CREATE DATABASE `s02t01n01ejercicio2`/*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `s02t01n01ejercicio2`;
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellidos` varchar(45) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `codigo_postal` int(11) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `Provincia` varchar(45) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE KEY `id_cliente_UNIQUE` (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO clientes
( `id_cliente`,
  `Nombre`,
  `Apellidos`,
  `direccion`,
  `codigo_postal`,
  `localidad`,
  `Provincia`,
  `telefono`)
VALUES
(1,
"piter",
"Parker",
"calle fragua, 256 primero segunda",
"08005",
"Barcelona",
"Barcelona",
658741235), (2,
"Julian",
"Baker",
"avenida europa, 56 cuarto derecha",
14005,
"Alcoy",
"Alicante", 548759648),
(3,
"juan",
"calvo",
"calle licitadores, 26  segunda",
"88005",
"Guadaliz",
"Madrid", 913568745);
DROP TABLE IF EXISTS `tiendas`;
CREATE TABLE `tiendas` (
  `id_tienda` int(11) NOT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `codig_postal` int(11) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `provincia` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_tienda`),
  UNIQUE KEY `id_tienda_UNIQUE` (`id_tienda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `tiendas`
( `id_tienda`,
  `direccion`,
  `codig_postal`,
  `localidad`,
  `Provincia`)
VALUES
(1,
"calle bartolome, s/n",
"08005",
"Barcelona",
"Barcelona"),
(2,
"avenida principal, 34",
"14004",
"Alcoy",
"Alicante"), 
(3,
"avenida torers, 104",
"46005",
"Bilbao",
"Vizcaya");
DROP TABLE IF EXISTS `tipo_empleado`;
CREATE TABLE `tipo_empleado` (
  `idtipo_empleado` int(11) NOT NULL,
  `tipus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtipo_empleado`),
  UNIQUE KEY `idtipo_empleado_UNIQUE` (`idtipo_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `tipo_empleado`
( `idtipo_empleado`,
  `tipus`)
VALUES
(1, "cocinero/a"), (2, "repartidor/a");
DROP TABLE IF EXISTS `empleados`;
CREATE TABLE `empleados` (
  `id_empleado` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `NIF` varchar(9) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `tipo_empleado` int(11) DEFAULT NULL,
  `tienda` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_empleado`),
  UNIQUE KEY `id_empleado_UNIQUE` (`id_empleado`),
  KEY `tienda_idx` (`tienda`),
  KEY `tipo_empleado_idx` (`tipo_empleado`),
  CONSTRAINT `tienda` FOREIGN KEY (`tienda`) REFERENCES `tiendas` (`id_tienda`),
  CONSTRAINT `tipo_empleado` FOREIGN KEY (`tipo_empleado`) REFERENCES `tipo_empleado` (`idtipo_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `empleados`
( `id_empleado`,
  `nombre`,
  `apellidos`,
  `NIF`,
  `telefono`,
  `tipo_empleado`,
  `tienda`)
  VALUES
  (1, "Juan", "Perez", "12345678G", 12356897, 2, 1), 
  (2, "alfonso", "guillen", "1254867U", 65326897, 2, 2), (3, "pablo", "diez", "45687458L", 67456897, 1, 3);
DROP TABLE IF EXISTS `tipo_comanda`;
CREATE TABLE `tipo_comanda` (
  `id_tipo_comanda` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_comanda`),
  UNIQUE KEY `id_tipo_comanda_UNIQUE` (`id_tipo_comanda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `tipo_comanda`
( `id_tipo_comanda`,
  `nombre`)
VALUES
(1, "local"), (2, "repartir");
DROP TABLE IF EXISTS `categoria pizzas`;
CREATE TABLE `categoria pizzas` (
  `id_categoria` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `categoria pizzas`
( `id_categoria`,
  `nombre`)
VALUES
(1, "sin tomate"), (2, "con tomate");
DROP TABLE IF EXISTS `pizzas`;
CREATE TABLE `pizzas` (
  `id_pizza` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` longtext,
  `precio` float DEFAULT NULL,
  `imagen` longblob,
  `id_categoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pizza`),
  UNIQUE KEY `id_pizza_UNIQUE` (`id_pizza`),
  CONSTRAINT `categoria` FOREIGN KEY (`id_pizza`) REFERENCES `categoria pizzas` (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `pizzas`
( `id_pizza`,
  `nombre`,
  `descripcion`,
  `precio`,
  `imagen`,
  `id_categoria`)
VALUES
(1, "marinara", "masa, tomate, ajo", 14.5,null ,2), (2, "carbonara", "masa, queso, ajo, panceta", 18.5,null ,1);
DROP TABLE IF EXISTS `burgers`;
CREATE TABLE `burgers` (
  `id_burgers` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `precio` float DEFAULT NULL,
  `imagen` longblob,
  PRIMARY KEY (`id_burgers`),
  UNIQUE KEY `id_burgers_UNIQUE` (`id_burgers`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `burgers`
( `id_burgers`,
  `nombre`,
  `descripcion`,
  `precio`,
  `imagen`)
VALUES
(1, "bull", "lechuga, tomate, ajo", 14.5,null), (2, "chicken", "pollo, queso, ajo, panceta", 18.5,null);
DROP TABLE IF EXISTS 	`bebidas`;
CREATE TABLE `bebidas` (
  `id_bebidas` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `precio` float DEFAULT NULL,
  `imagen` longblob,
  PRIMARY KEY (`id_bebidas`),
  UNIQUE KEY `id_bebidas_UNIQUE` (`id_bebidas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `bebidas`
( `id_bebidas`,
  `nombre`,
  `descripcion`,
  `precio`,
  `imagen`)
VALUES
(1, "fanta", "con hielo", 3.5,null), (2, "coca-cola", "con o sin limon", 4.5,null);
DROP TABLE IF EXISTS `lista_pedido`;
CREATE TABLE `lista_pedido` (
  `id_lista_pedido` int(11) NOT NULL,
  `burger` int(11) DEFAULT NULL,
  `numero_burger` int(11) DEFAULT NULL,
  `bebida` int(11) DEFAULT NULL,
  `numero_bebidas` int(11) DEFAULT NULL,
  `pizza` int(11) DEFAULT NULL,
  `numero_pizzas` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_lista_pedido`),
  KEY `pizza_idx` (`pizza`),
  KEY `burger_idx` (`burger`),
  KEY `bebida_idx` (`bebida`),
  CONSTRAINT `bebida` FOREIGN KEY (`bebida`) REFERENCES `bebidas` (`id_bebidas`),
  CONSTRAINT `burger` FOREIGN KEY (`burger`) REFERENCES `burgers` (`id_burgers`),
  CONSTRAINT `pizza` FOREIGN KEY (`pizza`) REFERENCES `pizzas` (`id_pizza`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `lista_pedido`
  (`id_lista_pedido`,
  `burger`,
  `numero_burger`,
  `bebida`,
  `numero_bebidas`,
  `pizza`,
  `numero_pizzas`)
  VALUES
  (1,null, 0, 1, 3, 2, 1), (2, 2, 4, 2, 4, null, 0), (3, 1, 3, null, 0, 1, 1);
  DROP TABLE IF EXISTS 	`entregas`;
CREATE TABLE `entregas` (
  `id_entrega` int(11) NOT NULL,
  `hora entrega` date DEFAULT NULL,
  `repartidor` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_entrega`),
  UNIQUE KEY `id_entrega_UNIQUE` (`id_entrega`),
  KEY `repartidor_idx` (`repartidor`),
  CONSTRAINT `repartidor` FOREIGN KEY (`repartidor`) REFERENCES `empleados` (`id_empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `entregas`
(`id_entrega`,
  `hora entrega`,
  `repartidor`)
  VALUES
  (1, null, 1), (2, null, 2), (3, null, 1);
  DROP TABLE IF EXISTS `comandas`;
CREATE TABLE `comandas` (
  `id_comandas` int(11) NOT NULL,
  `hora_comanda` time DEFAULT NULL,
  `tipo_comanda` int(11) DEFAULT NULL,
  `hora_entrega` int(11) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `item_pedido` int(11) DEFAULT NULL,
  `id_tienda` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_comandas`),
  UNIQUE KEY `id_comandas_UNIQUE` (`id_comandas`),
  KEY `tipo_recogida_idx` (`tipo_comanda`),
  KEY `hora_entrega_idx` (`hora_entrega`),
  KEY `id_cliente_idx` (`id_cliente`),
  KEY `items_pedidos_idx` (`item_pedido`),
  KEY `id_tienda_idx` (`id_tienda`),
  CONSTRAINT `hora_entrega` FOREIGN KEY (`hora_entrega`) REFERENCES `entregas` (`id_entrega`),
  CONSTRAINT `id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`),
  CONSTRAINT `id_tienda` FOREIGN KEY (`id_tienda`) REFERENCES `tiendas` (`id_tienda`),
  CONSTRAINT `items_pedidos` FOREIGN KEY (`item_pedido`) REFERENCES `lista_pedido` (`id_lista_pedido`),
  CONSTRAINT `tipo_recogida` FOREIGN KEY (`tipo_comanda`) REFERENCES `tipo_comanda` (`id_tipo_comanda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `comandas`
(`id_comandas`,
  `hora_comanda`,
  `tipo_comanda`,
  `hora_entrega`,
  `id_cliente`,
  `item_pedido`,
  `id_tienda` )
  VALUES
  (1, null, 1, null, 1, 1, 1), (2, null, 2, null, 2, 2, 2), (3, null, 2, null, 3, 3, 3)





