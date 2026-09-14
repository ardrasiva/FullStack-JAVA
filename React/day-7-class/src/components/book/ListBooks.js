import BookListItem from "./BookListItem";
import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import axios from "axios";
function ListBooks(){
    var [books, setBooks] = useState([]);
    function fetchBooks(){
        axios.get('https://worksheet-library.mashupstack.com/books')
        .then(response => {setBooks(response.data);
        });
    }

    useEffect(() => {
        fetchBooks();
    }, []);

    return(
        <div className="container">
            <h1 className="text-center">Books</h1>
            <Link to='/books/create' className="btn btn-info">Create Book</Link>
            {books.map(book =><BookListItem key={book.id} book={book} refresh={fetchBooks}/>)}
        </div>
    )
}
export default ListBooks;