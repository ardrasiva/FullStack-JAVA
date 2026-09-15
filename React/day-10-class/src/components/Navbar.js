import { Link } from "react-router-dom";

function Navbar() {

    return (
        <nav className="navbar navbar-dark bg-dark">

            <div className="container">

                <Link
                    to="/"
                    className="navbar-brand"
                >
                    Student Management System
                </Link>

                <div>

                    <Link
                        to="/register"
                        className="btn btn-light me-2"
                    >
                        Register
                    </Link>

                    <Link
                        to="/login"
                        className="btn btn-light"
                    >
                        Login
                    </Link>

                </div>

            </div>

        </nav>
    );
}

export default Navbar;