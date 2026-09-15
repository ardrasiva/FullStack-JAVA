import { createBrowserRouter } from "react-router-dom";

import Login from "./components/auth/Login";

import StudentList from "./components/student/StudentList";


const router = createBrowserRouter([

    {
        path: "/login",
        element: <Login />
    },

    {
        path: "/",
        element: <StudentList />
    }

]);


export default router;