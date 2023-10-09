CREATE DATABASE if not exists plantel;

USE plantel;

CREATE TABLE if not exists jugadores (
    nombre VARCHAR(40), 
    altura INT, 
    posicion VARCHAR(10),
    sueldo INT,
    velocidad FLOAT,
    fuerza INT);

INSERT INTO jugadores (sueldo, nombre, altura, posicion, velocidad, fuerza)
    VALUES 
           (10000, 'pele', 170, 'delantero', 5, 7),
           (50000, 'marado', 180, 'delantero', 7, 10),
           (12344, 'memesi',120, 'delantero', 10, 6),
           (8999, 'zidane' , 175, 'defensor', 4, 9),
           (123123, 'cunaguero', 150, 'arquero',4,4);

DELETE FROM jugadores WHERE nombre = 'pele';