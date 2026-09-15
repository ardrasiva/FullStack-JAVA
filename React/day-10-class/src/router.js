import { createBrowserRouter } from "react-router-dom";

import Register from "./components/auth/Register";
import Login from "./components/auth/Login";

import StudentList from "./components/student/StudentList";

const router = createBrowserRouter([

    {
        path: "/",
        element: <StudentList />
    },

    {
        path: "/register",
        element: <Register />
    },

    {
        path: "/login",
        element: <Login />
    }

]);

export default router;