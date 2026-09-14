import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import Navbar from "../../Navbar";

function Register() {
    var [name, setName] = useState("");
    var [email, setEmail] = useState("");
    var [password, setPassword] = useState("");
    var [confirmPassword, setConfirmPassword] = useState("");
    var [errorMessage, setErrorMessage] = useState("");

    var navigate = useNavigate();

    function registerUser() {

        if (password !== confirmPassword) {
            setErrorMessage("Password and Confirm Password do not match");
            return;
        }

        var user = {
            user_name: name,
            email: email,
            password: password
        };

        axios.post(
            "https://worksheet-auth.mashupstack.com/register",
            user
        )
        .then(response => {
            setErrorMessage("");
            alert("Registration Successful");
            navigate("/login");
        })
        .catch(error => {

            if (error.response && error.response.data.errors) {
                setErrorMessage(
                    Object.values(error.response.data.errors).join(" ")
                );
            }
            else if (error.response && error.response.data.message) {
                setErrorMessage(error.response.data.message);
            }
            else {
                setErrorMessage("Failed to connect to api");
            }

        });
    }

    return (
        <div>
            <Navbar />

            <div className="container mt-5">
                <div className="card p-4">

                    <h1>Register</h1>

                    <input
                        type="text"
                        className="form-control mb-3"
                        placeholder="Name"
                        value={name}
                        onChange={(e) => setName(e.target.value)}
                    />

                    <input
                        type="email"
                        className="form-control mb-3"
                        placeholder="Email"
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                    />

                    <input
                        type="password"
                        className="form-control mb-3"
                        placeholder="Password"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                    />

                    <input
                        type="password"
                        className="form-control mb-3"
                        placeholder="Confirm Password"
                        value={confirmPassword}
                        onChange={(e) => setConfirmPassword(e.target.value)}
                    />

                    <p className="text-danger">{errorMessage}</p>

                    <button
                        className="btn btn-primary"
                        onClick={registerUser}
                    >
                        Register
                    </button>

                </div>
            </div>
        </div>
    );
}

export default Register;