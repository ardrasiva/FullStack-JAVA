INSERT INTO students_1(id,name,course,score,email,phone,city,bonus_points)
VALUES
(1, 'Asha', 'Python', 85, 'asha@mail.com', '9876543210', 'Chennai', 5),
(2, 'Ravi', 'Python', 90, 'ravi@mail.com', '9876543211', 'Chennai', NULL),
(3, 'Sneha', 'Java', 78, 'sneha@mail.com', '9876543212', 'Mumbai', NULL),
(4, 'Karan', 'Java', 88, 'karan@mail.com', '9876543213', 'Delhi', 2),
(5, 'Divya', 'Python', 95, 'divya@mail.com', '9876543214', 'Mumbai', 4),
(6, 'Manoj', 'JavaScript', 72, 'manoj@mail.com', '9876543215', 'Delhi', NULL);

SELECT course, COUNT(course) AS 'Total no.of students' FROM students_1 GROUP BY course;

SELECT course, AVG(score) AS 'Average Score'
FROM students_1
GROUP BY course
HAVING AVG(score) > 80;

SELECT name, score FROM students_1 WHERE city IN('Chennai','Mumbai');

SELECT * FROM students_1 WHERE bonus_points IS NULL;

SELECT name FROM students_1
WHERE city = 'Chennai'
UNION
SELECT name FROM students_1
WHERE city = 'Mumbai';