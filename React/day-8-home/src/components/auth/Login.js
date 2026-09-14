import axios from "axios";
import { useState } from "react";
import Navbar from "../../Navbar";

function Login() {
    var [email, setEmail] = useState("");
    var [password, setPassword] = useState("");
    var [errorMessage, setErrorMessage] = useState("");

    function attemptLogin() {

        axios.post(
            "https://worksheet-auth.mashupstack.com/login",
            {
                email: email,
                password: password
            }
        )
        .then(response => {
            setErrorMessage("");

            console.log(response.data.token);

            alert("Successfully Logged In");
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
                setErrorMessage(
                    "Failed to login user. Please contact admin"
                );
            }

        });
    }

    return (
        <div>
            <Navbar />

            <div className="container mt-5">
                <div className="card p-4">

                    <h1>Login</h1>

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

                    <p className="text-danger">{errorMessage}</p>

                    <button
                        className="btn btn-primary"
                        onClick={attemptLogin}
                    >
                        Login
                    </button>

                </div>
            </div>
        </div>
    );
}

export default Login;