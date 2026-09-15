import axios from "axios";
import { useState } from "react";
import { useDispatch } from "react-redux";
import { setUser } from "../../store/authSlice";
import { useNavigate } from "react-router-dom";
import checkGuest from "./checkGuest";

function Login() {

    var [email, setEmail] = useState("");
    var [password, setPassword] = useState("");
    var [errorMessage, setErrorMessage] = useState("");

    var dispatch = useDispatch();
    var navigate = useNavigate();

    function attemptLogin() {

        axios.post(
            "https://worksheet-product.mashupstack.com/login",
            {
                email: email,
                password: password
            }
        )
        .then(response => {

            setErrorMessage("");

            var user = {
                email: email,
                token: response.data.token
            };

            dispatch(setUser(user));

            alert("Successfully Logged In");

            navigate("/products");

        })
        .catch(error => {

            if (error.response && error.response.data.errors) {

                setErrorMessage(
                    Object.values(error.response.data.errors).join(" ")
                );

            }
            else if (error.response && error.response.data.message) {

                setErrorMessage(
                    error.response.data.message
                );

            }
            else {

                setErrorMessage(
                    "Failed to login user. Please contact admin"
                );

            }

        });
    }

    return (
        <div className="container mt-5">

            <div className="row">

                <div className="col-8 offset-2">

                    <h1>Login</h1>

                    {errorMessage ? (
                        <div className="alert alert-danger">
                            {errorMessage}
                        </div>
                    ) : ""}

                    <div className="form-group mb-3">

                        <label>Email:</label>

                        <input
                            type="email"
                            className="form-control"
                            value={email}
                            onChange={(event) =>
                                setEmail(event.target.value)
                            }
                        />

                    </div>

                    <div className="form-group mb-3">

                        <label>Password:</label>

                        <input
                            type="password"
                            className="form-control"
                            value={password}
                            onChange={(event) =>
                                setPassword(event.target.value)
                            }
                        />

                    </div>

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

export default checkGuest(Login);