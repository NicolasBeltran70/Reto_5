DROP SCHEMA IF EXISTS `Redflix` ;
CREATE SCHEMA IF NOT EXISTS `Redflix` DEFAULT CHARACTER SET utf8 ;
USE `Redflix` ;

CREATE TABLE IF NOT EXISTS `Redflix`.`contenido` (
  `titulo_contenido` VARCHAR(45) NOT NULL,
  `tipo_contenido` VARCHAR(45) NULL,
  PRIMARY KEY (`titulo_contenido`));
  
CREATE TABLE IF NOT EXISTS `Redflix`.`series` (
  `id_serie` INT NOT NULL,
  `titulo_contenido` VARCHAR(45) NOT NULL,
  `ser_episodios` INT NULL,
  `ser_temporadas` INT NULL,
  PRIMARY KEY (`id_serie`, `titulo_contenido`),
	FOREIGN KEY (`titulo_contenido`) REFERENCES `Redflix`.`contenido` (`titulo_contenido`));
    

CREATE TABLE IF NOT EXISTS `Redflix`.`directores` (
  `id_director` INT NOT NULL,
  `nombre_director` VARCHAR(20) NULL,
  `apellido_director` VARCHAR(20) NULL,
  `nacionalidad_director` VARCHAR(40) NULL,
  PRIMARY KEY (`id_director`));
  
CREATE TABLE IF NOT EXISTS `Redflix`.`peliculas` (
  `id_pelicula` INT NOT NULL,
  `titulo_contenido` VARCHAR(45) NOT NULL,
  `pel_resumen` VARCHAR(300) NULL,
  `pel_fecha` INT NULL,
  `id_director` INT NOT NULL,
  `pel_nom_director` VARCHAR(45) NULL,
  PRIMARY KEY (`id_pelicula`, `titulo_contenido`, `id_director`),
    FOREIGN KEY (`id_director`) REFERENCES `Redflix`.`directores` (`id_director`),
    FOREIGN KEY (`titulo_contenido`) REFERENCES `Redflix`.`contenido` (`titulo_contenido`));

CREATE TABLE IF NOT EXISTS `Redflix`.`usuarios` (
  `alias` VARCHAR(45) NOT NULL,
  `nombre_usuario` VARCHAR(45) NULL,
  `apellido_usuario` VARCHAR(45) NULL,
  `email_usuario` VARCHAR(45) NULL,
  `celular_usuario` double NULL,
  `pass_usuario` VARCHAR(45) NULL,
  `nacimiento_usuario` INT NULL,
  PRIMARY KEY (`alias`));
  
CREATE TABLE IF NOT EXISTS `Redflix`.`transmisiones` (
  `id_transmisiones` INT NOT NULL,
  `usuarios_alias` VARCHAR(45) NOT NULL,
  `titulo_contenido` VARCHAR(45) NOT NULL,
  `fecha_transmisiones` DATETIME NULL,
  PRIMARY KEY (`id_transmisiones`, `usuarios_alias`, `titulo_contenido`),
  FOREIGN KEY (`titulo_contenido`) REFERENCES `Redflix`.`contenido` (`titulo_contenido`),
 FOREIGN KEY (`usuarios_alias`) REFERENCES `Redflix`.`usuarios` (`alias`));

insert into `Redflix`.`contenido`(titulo_contenido,tipo_contenido)
values
('Los Vengadores','pelicula'),
('Interestelar','pelicula'),
('El viaje de Chihiro','pelicula'),
('Parasitos','pelicula'),
('Mas alla de los sueños','pelicula'),

('The walking dead','serie'),
('Viaje a las estrellas: la serie original','serie'),
('Glow','serie'),
('La casa de papel','serie'),
('Friends','serie'),
('Arrow','serie'),
('The big bang theory','serie'),
('Vikingos','serie');


insert into `Redflix`.`series`(id_serie,titulo_contenido,ser_episodios,ser_temporadas)
values
(2001,'The walking dead',153,11),
(2002,'Viaje a las estrellas: la serie original',80,3),
(2003,'Glow',30,3),
(2004,'La casa de papel',31,4),
(2005,'Friends',236,10),
(2006,'Arrow',170,8),
(2007,'The big bang theory',279,12),
(2008,'Vikingos',79,6);


insert into `Redflix`.`directores`(id_director,nombre_director,apellido_director,nacionalidad_director)
values
(3003,'Hayo','Miyazaki','japones'),
(3001,'Joss','Whedon','estadounidense'),
(3002,'Christopher','Nolan','estadounidense'),
(3004,'Bong','Joon-ho','coreano'),
(3005,'Vincent','Ward','neozelandes');

insert into `Redflix`.`peliculas`(id_pelicula,titulo_contenido,pel_resumen,pel_fecha,id_director,pel_nom_director)
values(
1001,
'Los Vengadores',
'Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra.',
1990,
3001,
'Joss Whedon'
),
(
1002,
'Interestelar',
'Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar.',
2014,
3002,
'Christopher Nolan'
),
(
1003,
'El viaje de Chihiro',
'Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.',
2001,
3003,
'Hayo Miyazaki'
),
(
1004,
'Parasitos',
'Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano',
2019,
3004,
'Bong Joon-ho'
),
(
1005,
'Mas alla de los sueños',
'Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.',
1998,
3005,
'Vincent Ward'
);


insert into `Redflix`.`usuarios`(alias, nombre_usuario,apellido_usuario,email_usuario, celular_usuario, pass_usuario, nacimiento_usuario)
values
('lucky','Pedro','Perez','PedroPerez@gmail.com','3102784038','PedroPerez2','1998'),
('malopez','Maria','Lopez','MariaLopez@gmail.com','3102784039','MariaLopez2','1995'),
('diva','Ana','Diaz','AnaDiaz@gmail.com','3102784045','AnaDiaz2','1991'),
('dreamer','Luis','Rojas','LuisRojas@gmail.com','3102784876','LuisRojas2','1988'),
('ninja','Andres','Cruz','AndresCruz@gmail.com','3102784976','AndresCruz2','1990'),
('neon','Nelson','Ruiz','NelsonRuiz@gmail.com','3102774538','NelsonRuiz','1977'),
('rose','Claudia','Mendez','ClaudiaMendez@gmail.com','3109684038','ClaudiaMendez2','1969'),
('green','Jorge','Rodriguez','JorgeRodriguez@gmail.com','3105555438','JorgeRodriguez2','1987')
;


insert into `Redflix`.`transmisiones`(id_transmisiones,usuarios_alias,titulo_contenido,fecha_transmisiones)
values
(4001,'lucky','Los Vengadores','2017-10-25 20:00:00'),
(4002,'lucky','Parasitos','2019-03-15 18:30:00'),
(4003,'lucky','La casa de papel','2019-05-20 20:30:00'),

(4004,'malopez','Los Vengadores','2018-05-20 20:30:00'),
(4005,'malopez','La casa de papel','2020-01-20 20:30:00'),

(4006,'diva','Interestelar','2019-05-20 20:30:00'),
(4007,'diva','El viaje de Chihiro','2018-06-22 21:30:00'),
(4008,'diva','The walking dead','2020-03-17 15:30:20'),

(4009,'dreamer','El viaje de Chihiro','2020-03-17 15:30:20'),
(4010,'dreamer','Viaje a las estrellas: la serie original','2020-04-10 18:30:20'),

(4011,'ninja','Glow','2020-02-17 20:30:20'),
(4012,'ninja','La casa de papel','2020-02-20 16:30:20'),
(4013,'ninja','Arrow','2020-03-27 18:30:20'),

(4014,'rose','Friends','2020-03-20 21:30:20'),

(4015,'green','Interestelar','2020-01-10 17:30:20'),
(4016,'green','Parasitos','2020-02-15 20:30:20'),
(4017,'green','Mas alla de los sueños','2020-03-17 18:30:20')
;


    