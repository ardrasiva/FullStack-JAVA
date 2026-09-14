import { NavLink } from "react-router-dom";

function Navbar() {
    return (
        <nav className="navbar navbar-dark bg-dark">
            <div className="container">
                <h4 className="navbar-brand">User System</h4>

                <ul className="navbar-nav d-flex flex-row">
                    <li className="nav-item me-3">
                        <NavLink to="/register" className="nav-link">
                            Register
                        </NavLink>
                    </li>

                    <li className="nav-item">
                        <NavLink to="/login" className="nav-link">
                            Login
                        </NavLink>
                    </li>
                </ul>
            </div>
        </nav>
    );
}

export default Navbar;