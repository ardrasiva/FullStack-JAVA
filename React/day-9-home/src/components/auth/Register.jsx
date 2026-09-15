import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

function Register() {

    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");

    const navigate = useNavigate();

    function registerUser() {

        const user = {
            user_name: name,
            email: email,
            password: password
        };

        axios.post("https://worksheet-product.mashupstack.com/register",user)
        .then(response => {
            alert("Registration Successful");
            navigate("/login");

        })
        .catch(error => {
            console.log(error.response.data)
            console.log(error.response);
            alert("Registration Failed");

        });
    }

    return (
        <div className="container mt-5">
            <h1>Register</h1>
            <div className="mb-3">
                <label>Name</label>
                <input
                    type="text"
                    className="form-control"
                    value={name}
                    onChange={(e) => setName(e.target.value)}
                />
            </div>

            <div className="mb-3">
                <label>Email</label>
                <input
                    type="email"
                    className="form-control"
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                />
            </div>

            <div className="mb-3">
                <label>Password</label>
                <input
                    type="password"
                    className="form-control"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                />
            </div>

            <button className="btn btn-primary" onClick={registerUser}>
                Register
            </button>

        </div>
    );
}

export default Register;