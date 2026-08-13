CREATE TABLE authors(
    author_id INT(10) PRIMARY KEY,
    author_name VARCHAR(20),
    email VARCHAR(10) UNIQUE);

CREATE TABLE books_4(
    book_id INT(10) PRIMARY KEY,
    book_title VARCHAR(20),
    author_id INT(10),
    FOREIGN KEY (author_id) REFERENCES authors(author_id));