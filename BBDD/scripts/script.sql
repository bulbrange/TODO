DROP TABLE IF EXISTS Tarea;
DROP TABLE IF EXISTS Persona;

CREATE TABLE Persona (
    ID INT AUTO_INCREMENT,
    Nombre VARCHAR(60) NOT NULL,
    Email VARCHAR(255) NOT NULL,
    Pass VARCHAR(255) NOT NULL,
    PRIMARY KEY(ID),
    CONSTRAINT Persona_em UNIQUE(Email)
) ENGINE=INNODB;

/* Check TABLE Persona */
DESCRIBE Persona;
SHOW TABLE STATUS WHERE Name = 'Persona';   

CREATE TABLE Tarea (
    ID INT AUTO_INCREMENT,
    ID_persona INT NOT NULL,
    Titulo VARCHAR(255) NOT NULL,
    Descripcion LONGTEXT,
    Fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Fecha_ini TIMESTAMP,
    Fecha_fin TIMESTAMP,
    Tiempo_computado FLOAT,
    Estado ENUM("Pendiente","Finalizada") DEFAULT "Pendiente",
    PRIMARY KEY(ID),
    CONSTRAINT Tarea_fk FOREIGN KEY(ID_persona) REFERENCES Persona(ID)
) ENGINE=INNODB;

/* Check TABLE Tarea */
DESCRIBE Tarea;
SHOW TABLE STATUS WHERE Name = 'Tarea';   

/* Testing relationship */
INSERT INTO Persona (Nombre,Email,Pass) VALUES ("Test", "test@test.com", "tetspass");
INSERT INTO Tarea (ID_persona,Titulo,Descripcion) VALUES (1,"TestTitulo", "TestDesc");

