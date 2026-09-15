import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

import Navbar from "../Navbar";

function Register() {

    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");

    const navigate = useNavigate();

    function registerUser() {

        const user = {
            name: name,
            email: email,
            password: password
        };

        axios.post(
            "https://worksheet-student.mashupstack.com/api/register",
            user
        )
        .then(response => {

            console.log(response.data);

            alert("Registration Successful");

            navigate("/login");

        })
        .catch(error => {

            console.log(error.response);

            if (error.response && error.response.data) {
                console.log(error.response.data);
            }

            alert("Registration Failed");

        });
    }

    return (
        <div>

            <Navbar />

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

                <button
                    className="btn btn-primary"
                    onClick={registerUser}
                >
                    Register
                </button>

            </div>

        </div>
    );
}

export default Register;