DROP DATABASE IF EXISTS books;

CREATE DATABASE books;

USE books;

CREATE TABLE `test` 
(
	`id` INT(8) NOT NULL AUTO_INCREMENT,
	`title` VARCHAR(100) NOT NULL DEFAULT '0',
	`deskription` VARCHAR(255) NOT NULL DEFAULT '0',
	`author` VARCHAR(100) NOT NULL DEFAULT '0',
	`ISBN` VARCHAR(20) NOT NULL DEFAULT '0',
	`printYear` INT NOT NULL DEFAULT '0',
	`readAlready` BIT(1) NOT NULL DEFAULT b'0',
	PRIMARY KEY (`id`)
    UNIQUE KEY `isbn` (`isbn`)
)
COLLATE='utf8_general_ci';

INSERT INTO `test` (`title`,`deskription`,`author`,`printYear`) 
VALUES 	("Book 1","Some deskription","author 1",2017),
		("Book 2","Some deskription","author 2",2017),
        ("Book 3","Some deskription","author 3",2017),
        ("Book 4","Some deskription","author 4",2017),
        ("Book 5","Some deskription","author 5",2017),
        ("Book 6","Some deskription","author 6",2017),
        ("Book 7","Some deskription","author 7",2017),
        ("Book 8","Some deskription","author 8",2017),
        ("Book 9","Some deskription","author 9",2017),
        ("Book 10","Some deskription","author 10",2017),
        ("Book 11","Some deskription","author 11",2017),
        ("Book 12","Some deskription","author 12",2017),
        ("Book 13","Some deskription","author 13",2017),
        ("Book 14","Some deskription","author 14",2017),
        ("Book 15","Some deskription","author 15",2017),
        ("Book 16","Some deskription","author 16",2017),
        ("Book 17","Some deskription","author 17",2017),
        ("Book 18","Some deskription","author 18",2017),
        ("Book 19","Some deskription","author 19",2017),
        ("Book 20","Some deskription","author 20",2017),
        ("Book 21","Some deskription","author 21",2017),
        ("Book 22","Some deskription","author 22",2017),
        ("Book 23","Some deskription","author 23",2017),
        ("Book 24","Some deskription","author 24",2017),
        ("Book 25","Some deskription","author 25",2017),
        ("Book 26","Some deskription","author 26",2017),
        ("Book 27","Some deskription","author 27",2017),
        ("Book 28","Some deskription","author 28",2017),
        ("Book 29","Some deskription","author 29",2017),
        ("Book 30","Some deskription","author 30",2017),
        ("Book 31","Some deskription","author 31",2017),
        ("Book 32","Some deskription","author 32",2017),
        ("Book 33","Some deskription","author 33",2017);
