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
  ENGINE = InnoDB 
  DEFAULT CHARACTER SET = utf8;

INSERT INTO `book` (`title`,`description`,`author`,`ISBN`,`printYear`)
VALUES 	("Book 1","Some description","author 1","978-5-17-982771-9",2017),
  ("Book 2","Some description","author 2","978-5-17-982730-6",2017),
  ("Book 3","Some description","author 3","978-5-17-078086-0",2017),
  ("Book 4","Some description","author 4","978-5-17-078053-2",2017),
  ("Book 5","Some description","author 5","978-5-17-982771-9",2017),
  ("Book 6","Some description","author 6","978-5-17-982730-6",2017),
  ("Book 7","Some description","author 7","978-5-17-078086-0",2017),
  ("Book 8","Some description","author 8","978-5-17-078053-2",2017),
  ("Book 9","Some description","author 9","978-5-17-105116-7",2017),
  ("Book 10","Some description","author 10","978-5-17-104540-1",2017),
  ("Book 11","Some description","author 11","978-5-17-104542-5",2017),
  ("Book 12","Some description","author 12","978-5-17-104675-0",2017),
  ("Book 13","Some description","author 13","978-5-17-104674-3",2017),
  ("Book 14","Some description","author 14","978-5-17-104662-0",2017),
  ("Book 15","Some description","author 15","978-5-17-982771-9",2017),
  ("Book 16","Some description","author 16","978-5-17-982730-6",2017),
  ("Book 17","Some description","author 17","978-5-17-078086-0",2017),
  ("Book 18","Some description","author 18","978-5-17-078053-2",2017),
  ("Book 19","Some description","author 19","978-5-17-105116-7",2017),
  ("Book 20","Some description","author 20","978-5-17-104540-1",2017),
  ("Book 21","Some description","author 21","978-5-17-104542-5",2017),
  ("Book 22","Some description","author 22","978-5-17-104675-0",2017),
  ("Book 23","Some description","author 23","978-5-17-104674-3",2017),
  ("Book 24","Some description","author 24","978-5-17-104662-0",2017),
  ("Book 25","Some description","author 25","978-5-17-982771-9",2017),
  ("Book 26","Some description","author 26","978-5-17-982730-6",2017),
  ("Book 27","Some description","author 27","978-5-17-078086-0",2017),
  ("Book 28","Some description","author 28","978-5-17-078053-2",2017),
  ("Book 29","Some description","author 29","978-5-17-105116-7",2017),
  ("Book 30","Some description","author 30","978-5-17-104540-1",2017),
  ("Book 31","Some description","author 31","978-5-17-104542-5",2017),
  ("Book 32","Some description","author 32","978-5-17-104675-0",2017),
  ("Book 33","Some description","author 33","978-5-17-104674-3",2017);
