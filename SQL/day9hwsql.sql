INSERT INTO employees(id,name)
VALUES
(1,'Anjali'),
(2,'Rohan'),
(3,'Meena');

INSERT INTO departments(emp_id,department_name)
VALUES
(1,'HR'),
(2,'IT'),
(4,'Finance');

SELECT employees.name,departments.department_name FROM `employees`
LEFT JOIN `departments`
ON employees.id = departments.emp_id;

SELECT employees.id,employees.name,departments.department_name FROM `employees`
INNER JOIN `departments`
ON employees.id = departments.emp_id;

SELECT departments.emp_id,employees.name,departments.department_name FROM `employees`
RIGHT JOIN `departments`
ON employees.id = departments.emp_id;