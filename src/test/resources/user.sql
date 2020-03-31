CREATE TABLE `user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `surname` VARCHAR (200) NOT NULL,
  `forename` VARCHAR (200) NOT NULL,
  `gender` VARCHAR (10) NOT NULL,
  `birthday` DATE,
  `country` VARCHAR (200),
  PRIMARY KEY (`id`)
);