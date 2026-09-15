import { useEffect, useState } from "react";
import axios from "axios";

import { useSelector } from "react-redux";
import { useNavigate } from "react-router-dom";

import checkAuth from "../auth/checkAuth";

import Navbar from "../Navbar";

function StudentList() {

    const [students, setStudents] = useState([]);

    const user = useSelector(
        store => store.auth.user
    );

    const navigate = useNavigate();

    useEffect(() => {

        if (!user) {

            navigate("/login");

            return;
        }

        axios.get(
            "https://worksheet-student.mashupstack.com/students",
            {
                headers: {
                    Authorization: "Bearer " + user.token
                }
            }
        )
        .then(response => {

            console.log(response.data);

            setStudents(response.data);

        })
        .catch(error => {

            console.log(error.response);

        });

    }, [user, navigate]);

    return (
        <div>

            <Navbar />

            <div className="container mt-5">

                <h1>Student List</h1>

                <table className="table table-bordered">

                    <thead>

                        <tr>
                            <th>Name</th>
                            <th>Age</th>
                        </tr>

                    </thead>

                    <tbody>

                        {students.map(student => (

                            <tr key={student.id}>

                                <td>{student.name}</td>

                                <td>{student.age}</td>

                            </tr>

                        ))}

                    </tbody>

                </table>

            </div>

        </div>
    );
}

export default checkAuth(StudentList);