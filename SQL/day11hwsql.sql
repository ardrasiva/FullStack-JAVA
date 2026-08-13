CREATE TABLE categories(
    category_id INT(10) PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(10));


CREATE TABLE books_2(
    book_id INT(10) PRIMARY KEY AUTO_INCREMENT,
    book_title VARCHAR(10),
	category_id INT(10),
	FOREIGN KEY (category_id) REFERENCES categories(category_id));


CREATE INDEX names_for_book ON books_2(book_title);

SHOW INDEX IN books_2;