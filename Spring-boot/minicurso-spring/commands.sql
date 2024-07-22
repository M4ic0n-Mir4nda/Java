CREATE DATABASE restapi;
USE restapi;

CREATE TABLE user (
  id INT(6) AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  password varchar(255) NOT NULL
);