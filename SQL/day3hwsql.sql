INSERT INTO books_1 (id, title, author, price, stock_status, genre)
VALUES
(1, 'The Great Gatsby', 'F. Scott Fitzgerald', 450, 'In Stock', 'Fiction'),
(2, 'A Brief History of Time', 'Stephen Hawking', 750, 'In Stock', 'Science'),
(3, 'The Alchemist', 'Paulo Coelho', 350, 'Out of Stock', 'Fiction'),
(4, 'Sapiens', 'Yuval Noah Harari', 800, 'In Stock', 'History'),
(5, 'Atomic Habits', 'James Clear', 650, 'In Stock', 'Self Help'),
(6, 'The Hobbit', 'J.R.R. Tolkien', 300, 'In Stock', 'Fantasy');


SELECT DISTINCT genre FROM `books_1`;

SELECT * FROM `books_1` WHERE stock_status = 'In Stock' AND price < 400;

SELECT * FROM `books_1` WHERE stock_status = 'Out of Stock' OR price > 700;

SELECT title,price,price*1.10 AS gst_added_price FROM `books_1`;

SELECT title,price,stock_status FROM `books_1` ORDER BY price DESC;