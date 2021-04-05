create database employee_register;
use employee_register;

create table employee
(first_name varchar(15),
last_name varchar(15),
username varchar(30),
password varchar(15),
contact int);

drop table employee;

select * from employee;
