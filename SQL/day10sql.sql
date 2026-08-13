CREATE TABLE students_1(
	student_id INT(10) PRIMARY KEY,
    name VARCHAR(30),
    email VARCHAR(30) UNIQUE);

CREATE TABLE courses(
    course_id INT(10) PRIMARY KEY,
    course_name VARCHAR(20));

CREATE TABLE enrollments(
    student_id INT(10),
    course_id INT(10),
    FOREIGN KEY (student_id) REFERENCES students_1(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id));