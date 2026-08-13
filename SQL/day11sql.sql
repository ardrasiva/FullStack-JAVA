CREATE TABLE authors_1(
    author_id INT(10) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20));

CREATE TABLE books_5(
    book_id INT(10) PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(20),
	author_id INT(10),
	FOREIGN KEY (author_id) REFERENCES authors_1(author_id));

CREATE INDEX search_perf ON books_5(author_id);