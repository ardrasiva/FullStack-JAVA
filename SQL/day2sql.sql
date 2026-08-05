
INSERT INTO students (id,name,age,department,grade) 
VALUES
(1,'Ardra',22,'Computer Science',76),(2,'Evaniya',22,'Physics',90),(3,'Sruthy',22,'Mechanical',98),(4,'Annfino',22,'Civil',99);

SELECT * FROM `students` WHERE age > 20;

SELECT * FROM `students` WHERE department = 'Computer Science' OR department = 'Physics';

SELECT * FROM `students` WHERE grade = 90;

SELECT * FROM `students` WHERE grade > 70 and grade < 90;

