import { Link } from "react-router-dom";

function Navbar() {

    return (
        <nav className="navbar navbar-dark bg-dark">
            <div className="container">

                <Link
                    to="/"
                    className="navbar-brand"
                >
                    Seller Dashboard
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
                        className="btn btn-light me-2"
                    >
                        Login
                    </Link>

                    <Link
                        to="/products"
                        className="btn btn-light"
                    >
                        Products
                    </Link>

                </div>

            </div>
        </nav>
    );
}

export default Navbar;