DROP TABLE IF EXISTS book;
create table book
(
   id INT AUTO_INCREMENT PRIMARY KEY,
   title varchar(255) not null,
   author varchar(255) not null,
   category varchar(255) not null,
   rack_number varchar(255) not null,
   availability varchar(255) not null
  );