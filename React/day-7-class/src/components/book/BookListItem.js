import React from "react";
import { Link } from "react-router-dom";
import axios from "axios";
function BookListItem(props){
    function deleteBook(){
        axios.delete('https://worksheet-library.mashupstack.com/books/'+props.book.id)
        .then(response => {
            alert("Book Deleted");
            props.refresh();
        });
    }

    return(
       <div className="card mb-2">
            <div className="card-body">
                <h4>{props.book.title}</h4>

                <p>Author: {props.book.author}</p>
                <p>Published Year: {props.book.published_year}</p>
                <p>Genre: {props.book.genre}</p>

                <Link to={"/books/" + props.book.id + "/edit"} className="btn btn-primary me-2">
                    Edit
                </Link>

                <button className="btn btn-danger" onClick={deleteBook}>
                    Delete
                </button>
            </div>
        </div>
    )
}
export default BookListItem;