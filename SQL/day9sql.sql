INSERT INTO books_1(book_id,title)
VALUES
(1,'The Alchemist'),
(2,'The Power of Now'),
(3,'Think and Grow Rich'),
(4,'Clean Code');

INSERT INTO borrowers(borrower_id,name,book_id)
VALUES
(101,'Alice',1),
(102,'Bob',2),
(103,'Charlie',NULL);

SELECT books_1.title,borrowers.name FROM `books_1`
LEFT JOIN
borrowers
ON books_1.book_id = borrowers.book_id;

SELECT borrowers.borrower_id,borrowers.name,books_1.title FROM `borrowers` 
LEFT JOIN
`books_1`
ON borrowers.book_id = books_1.book_id
WHERE borrowers.book_id IS NOT NULL;

SELECT books_1.book_id,books_1.title FROM `books_1`
LEFT JOIN
borrowers
ON books_1.book_id = borrowers.book_id
WHERE borrowers.book_id IS NULL;

SELECT borrowers.borrower_id,borrowers.name,borrowers.book_id FROM `borrowers` 
LEFT JOIN
`books_1`
ON borrowers.book_id = books_1.book_id;
