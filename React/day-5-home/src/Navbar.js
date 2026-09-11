import { NavLink } from "react-router-dom";
function Navbar() {
  return (
    <nav className="navbar navbar-dark bg-dark">
      <div className="container">
        <h4 className="navbar-brand">Personal Website</h4>

        <ul className="navbar-nav d-flex flex-row">
          <li className="nav-item me-3">
            <NavLink to="/home" className={({ isActive }) => "nav-link " + (isActive ? "active-link" : "")}>
              Home
            </NavLink>
          </li>

          <li className="nav-item me-3">
            <NavLink to="/about" className={({ isActive }) => "nav-link " + (isActive ? "active-link" : "")}>
              About
            </NavLink>
          </li>

          <li className="nav-item">
            <NavLink to="/contact" className={({ isActive }) => "nav-link " + (isActive ? "active-link" : "")}>
              Contact
            </NavLink>
          </li>
        </ul>
      </div>
    </nav>
  );
}

export default Navbar;