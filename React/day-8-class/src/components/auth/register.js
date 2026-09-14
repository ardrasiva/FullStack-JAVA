import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

function Register() {

    var [userName, setUserName] = useState("");
    var [email, setEmail] = useState("");
    var [password, setPassword] = useState("");
    var [errorMessage, setErrorMessage] = useState("");

    var navigate = useNavigate();

    function registerUser() {
        var user = {
            user_name: userName,
            email: email,
            password: password
        };
        axios.post("https://worksheet-auth.mashupstack.com/register", user)
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
        <div className="container mt-5">
            <div className="row">
                <div className="col-8 offset-2">
                    <h1 align="center">Register</h1>
                    {errorMessage ?<div className="alert alert-danger">{errorMessage}</div>: ""}
                    <div className="form-group mb-3">
                    <label>Name : </label>
                        <input
                            type="text"
                            className="form-control"
                            value={userName}
                            onInput={(event) =>
                                setUserName(event.target.value)
                            }/>
                    </div>
                    <div className="form-group mb-3">
                    <label>Email : </label>
                        <input
                            type="text"
                            className="form-control"
                            value={email}
                            onInput={(event) =>
                                setEmail(event.target.value)
                            }/>
                    </div>

                    <div className="form-group mb-3">
                    <label>Password : </label>

                        <input
                            type="password"
                            className="form-control"
                            value={password}
                            onInput={(event) =>
                                setPassword(event.target.value)
                            }/>
                    </div>

                    <div className="form-group">

                        <button className="btn btn-primary" onClick={registerUser}>
                            Register
                        </button>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Register;