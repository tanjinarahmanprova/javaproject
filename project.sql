CREATE SCHEMA `studentdetail`;

USE `studentdetail`;

create table Department
(
	dept_code varchar(15),
    dept_name varchar(10),
    primary key(dept_code)
);

create table Student
(
    std_name varchar(50),
    std_id int NOT NULL,
    f_name varchar(50),
    address varchar(50),
    contact_info bigint,
    date_of_birth date,
    primary key (std_id)
);

create table Admission_info
(
	std_id int NOT NULL,
    admitted_semester varchar(20),
    year_of_admission int NOT NULL,
    department varchar(50),
    foreign key(std_id) references Student(std_id)
);

create table Course
(
	course_code varchar(15),
    course_title varchar(100),
    level_term varchar(5),
    department varchar(50),
    credit numeric(3,2),
    primary key(course_code)
);

create table Result
(
	std_id int NOT NULL,
	course_code varchar(15),
	gpa numeric(3,2),
	exam_type varchar(15),
	exam_date date,
	foreign key(std_id) references Student(std_id),
    foreign key(course_code) references Course(course_code)
);

create table Session_clearance
(
	std_id int NOT NULL,
    Level_term varchar(5),
    session_fee int NOT NULL,
    payment_amount int NOT NULL,
    clearance_status varchar(20),
    foreign key(std_id) references Student(std_id)
);



select* from Department;
select* from Student;
select* from Admission_info;
select* from Course;
select* from Result;
select* from Session_clearance;

