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

    function loginUser() {

        const user = {
            email: email,
            password: password
        };

        axios.post(
            "https://worksheet-product.mashupstack.com/login",
            user
        )
        .then(response => {

            const loggedUser = {
                email: email,
                token: response.data.token
            };

            dispatch(setUser(loggedUser));

            alert("Successfully Logged In");

            navigate("/products");

        })
        .catch(error => {

            console.log(error.response);

            alert("Login Failed");

        });
    }

    return (
        <div className="container mt-5">

            <h1>Login</h1>

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
                onClick={loginUser}
            >
                Login
            </button>

        </div>
    );
}

export default Login;