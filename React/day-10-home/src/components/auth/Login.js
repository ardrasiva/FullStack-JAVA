import { useState } from "react";
import axios from "axios";

import { useDispatch } from "react-redux";
import { setUser } from "../../store/authSlice";

import { useNavigate } from "react-router-dom";

function Login() {

    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");

    const dispatch = useDispatch();
    const navigate = useNavigate();

    function login() {

        axios.post(
            "https://worksheet-student.mashupstack.com/login",
            {
                email: email,
                password: password
            }
        )
        .then((response) => {

            console.log(response.data);

            const loggedUser = {
                email: email,
                token: response.data.token
            };

            dispatch(setUser(loggedUser));

            alert("Successfully Logged In");

            navigate("/");

        })
        .catch((error) => {

            console.log(error);

            alert("Login Failed");

        });
    }

    return (

        <div className="container mt-5">

            <h2>Login</h2>

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
                onClick={login}
            >
                Login
            </button>

        </div>

    );
}

export default Login;