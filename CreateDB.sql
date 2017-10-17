Use test;

DROP TABLE IF EXISTS book;

CREATE TABLE `test`.`book`
(
  `id` INT(8) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL DEFAULT '0',
  `description` VARCHAR(255) NOT NULL DEFAULT '0',
  `author` VARCHAR(100) NOT NULL DEFAULT '0',
  `ISBN` VARCHAR(20) NOT NULL DEFAULT '0',
  `printYear` INT NOT NULL DEFAULT '0',
  `readAlready` BIT(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`)

)
  COLLATE='utf8_general_ci';

INSERT INTO `books` (`title`,`description`,`author`,`printYear`)
VALUES 	("Book 1","Some description","author 1",2017),
  ("Book 2","Some description","author 2",2017),
  ("Book 3","Some description","author 3",2017),
  ("Book 4","Some description","author 4",2017),
  ("Book 5","Some description","author 5",2017),
  ("Book 6","Some description","author 6",2017),
  ("Book 7","Some description","author 7",2017),
  ("Book 8","Some description","author 8",2017),
  ("Book 9","Some description","author 9",2017),
  ("Book 10","Some description","author 10",2017),
  ("Book 11","Some description","author 11",2017),
  ("Book 12","Some description","author 12",2017),
  ("Book 13","Some description","author 13",2017),
  ("Book 14","Some description","author 14",2017),
  ("Book 15","Some description","author 15",2017),
  ("Book 16","Some description","author 16",2017),
  ("Book 17","Some description","author 17",2017),
  ("Book 18","Some description","author 18",2017),
  ("Book 19","Some description","author 19",2017),
  ("Book 20","Some description","author 20",2017),
  ("Book 21","Some description","author 21",2017),
  ("Book 22","Some description","author 22",2017),
  ("Book 23","Some description","author 23",2017),
  ("Book 24","Some description","author 24",2017),
  ("Book 25","Some description","author 25",2017),
  ("Book 26","Some description","author 26",2017),
  ("Book 27","Some description","author 27",2017),
  ("Book 28","Some description","author 28",2017),
  ("Book 29","Some description","author 29",2017),
  ("Book 30","Some description","author 30",2017),
  ("Book 31","Some description","author 31",2017),
  ("Book 32","Some description","author 32",2017),
  ("Book 33","Some description","author 33",2017);
