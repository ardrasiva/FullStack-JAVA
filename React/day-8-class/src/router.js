import { createBrowserRouter } from "react-router-dom";
import App from "./App";
import Register from "./components/auth/register";
import Login from "./components/auth/login";
const router = createBrowserRouter([
    {
        path : "/",
        element : <App />
    },
    {
        path : "/register",
        element : <Register />
    },
    {
        path: "/login",
        element: <Login />
    }
]);

export default router;