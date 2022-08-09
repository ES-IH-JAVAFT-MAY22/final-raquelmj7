DROP SCHEMA proyectofinalusers;
CREATE SCHEMA IF NOT EXISTS proyectofinalusers;
USE proyectofinalusers;

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`(
id BIGINT NOT NULL AUTO_INCREMENT,
username VARCHAR(255),
`password` VARCHAR(255),
PRIMARY KEY (id)
);
