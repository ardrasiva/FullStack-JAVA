INSERT INTO books (id,title,author,price,genre) 
VALUES 
(1, 'The Great Gatsby', 'F. Scott Fitzgerald', 450, 'Fiction'), (2, 'A Brief History of Time', 'Stephen Hawking', 550, 'Science'), (3, 'The Alchemist', 'Paulo Coelho', 350, 'Fiction'), (4, 'Sapiens', 'Yuval Noah Harari', 600, 'History'), (5, 'Inferno', 'Dan Brown', 500, 'Thriller');

SELECT * FROM `books` WHERE price > 400;

SELECT * FROM `books` WHERE genre = "History" OR genre = "Science" OR genre = "Fiction";

SELECT * FROM `books` WHERE title = 'The Great Gatsby';

SELECT * FROM `books` WHERE author != 'Dan Brown';