import React from "react";
import { Link } from "react-router-dom";

function App() {
    return (
        <div className="container mt-5">
            <h1>Book Manager App</h1>
            <Link to="/books" className="btn btn-primary">
                View Books
            </Link>
        </div>
    );
}

export default App;