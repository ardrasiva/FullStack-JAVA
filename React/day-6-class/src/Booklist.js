import React, { useState } from "react";

function BookList() {
  const [books, setBooks] = useState([]);
  const [bookName, setBookName] = useState("");
  const [authorName, setAuthorName] = useState("");
  const [publishDate, setPublishDate] = useState("");

  const [editingBookId, setEditingBookId] = useState(null);
  const [editedBookName, setEditedBookName] = useState("");

  const [searchTerm, setSearchTerm] = useState("");

  function handleSubmit(event) {
    event.preventDefault();

    if (bookName.trim() === "") {
      return;
    }

    var x = books.length + 1;

    var newBook = {
      id: x,
      bookName: bookName,
      authorName: authorName,
      publishDate: publishDate
    };

    setBooks([...books, newBook]);

    setBookName("");
    setAuthorName("");
    setPublishDate("");
  }

  function handleDelete(id) {
    const filteredBooks = books.filter((book) => book.id !== id);
    setBooks(filteredBooks);
  }

  function handleEditBook(book) {
    setEditingBookId(book.id);
    setEditedBookName(book.bookName);
  }

  function handleSaveBook() {
    if (editedBookName.trim() === "") {
      return;
    }

    const updatedBooks = books.map((book) => {
      if (book.id === editingBookId) {
        return {
          ...book,
          bookName: editedBookName
        };
      }

      return book;
    });

    setBooks(updatedBooks);
    setEditingBookId(null);
    setEditedBookName("");
  }

  function handleCancelEdit() {
    setEditingBookId(null);
    setEditedBookName("");
  }

  const filteredBooks = books.filter(
    (book) =>
      book.bookName.toLowerCase().includes(searchTerm.toLowerCase()) ||
      book.authorName.toLowerCase().includes(searchTerm.toLowerCase())
  );

  return (
    <div>
      <div className="container mt-4">
        <h2>Book List Management</h2>

        <form onSubmit={handleSubmit}>
          <div className="mb-3">
            <label>Book Name:</label>
            <input
              type="text"
              className="form-control"
              value={bookName}
              onChange={(event) => setBookName(event.target.value)}
            />
          </div>

          <div className="mb-3">
            <label>Author Name:</label>
            <input
              type="text"
              className="form-control"
              value={authorName}
              onChange={(event) => setAuthorName(event.target.value)}
            />
          </div>

          <div className="mb-3">
            <label>Publish Date:</label>
            <input
              type="date"
              className="form-control"
              value={publishDate}
              onChange={(event) => setPublishDate(event.target.value)}
            />
          </div>

          <button className="btn btn-success" type="submit">
            Add Book
          </button>
        </form>
      </div>

      <br />

      <div className="container">
        <label>Search:</label>

        <input
          type="text"
          className="form-control"
          placeholder="Search by book name or author name"
          value={searchTerm}
          onChange={(event) => setSearchTerm(event.target.value)}
        />
      </div>

      <br />

      <div className="container">
        {filteredBooks.length === 0 ? (
          <p>No books found</p>
        ) : (
          <table className="table table-bordered">
            <thead>
              <tr>
                <th>ID</th>
                <th>Book Name</th>
                <th>Author Name</th>
                <th>Publish Date</th>
                <th>Actions</th>
              </tr>
            </thead>

            <tbody>
              {filteredBooks.map((book) => (
                <tr key={book.id}>
                  <td>{book.id}</td>

                  <td>
                    {editingBookId === book.id ? (
                      <input
                        type="text"
                        className="form-control"
                        value={editedBookName}
                        onChange={(event) =>
                          setEditedBookName(event.target.value)
                        }
                      />
                    ) : (
                      book.bookName
                    )}
                  </td>

                  <td>{book.authorName}</td>
                  <td>{book.publishDate}</td>

                  <td>
                    {editingBookId === book.id ? (
                      <div>
                        <button
                          className="btn btn-success me-2"
                          onClick={handleSaveBook}
                        >
                          Save
                        </button>

                        <button
                          className="btn btn-secondary"
                          onClick={handleCancelEdit}
                        >
                          Cancel
                        </button>
                      </div>
                    ) : (
                      <div>
                        <button
                          className="btn btn-primary me-2"
                          onClick={() => handleEditBook(book)}
                        >
                          Edit
                        </button>

                        <button
                          className="btn btn-danger"
                          onClick={() => handleDelete(book.id)}
                        >
                          Delete
                        </button>
                      </div>
                    )}
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        )}
      </div>
    </div>
  );
}

export default BookList;