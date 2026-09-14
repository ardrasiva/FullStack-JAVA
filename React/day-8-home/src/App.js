import { Link } from "react-router-dom";

function App() {
    return (
        <div className="container mt-5 text-center">
            <h1>Welcome to User System</h1>

            <Link to="/register" className="btn btn-primary me-2">
                Register
            </Link>

            <Link to="/login" className="btn btn-success">
                Login
            </Link>
        </div>
    );
}

export default App;