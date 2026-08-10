INSERT INTO books_3(id,title,author,price,stock) 
VALUES 
(1, 'The Alchemist', 'Paulo Coelho', 350, 50), (2, 'Atomic Habits', 'James Clear', 450, 40), (3, 'The Psychology of Money', 'Morgan Housel', 400, 30), (4, 'Ikigai', 'Francesc Miralles', 300, 60), (5, 'Deep Work', 'Cal Newport', 500, 20);

SELECT * FROM `books_3` WHERE price < 450 AND stock > 30;

UPDATE books_3 SET stock = 45, price = 420 WHERE title = 'Deep Work';

DELETE FROM books_3 WHERE title = 'Ikigai';

SELECT AVG(price) AS 'Average price of books',COUNT(*) AS 'Total number of Books' FROM `books_3`;

SELECT * FROM `books_3` 
ORDER BY price DESC 
LIMIT 3;