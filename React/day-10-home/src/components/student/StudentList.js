import { useEffect, useState } from "react";

import axios from "axios";

import { useSelector } from "react-redux";

import checkAuth from "../auth/checkAuth";


function StudentList() {

    const [students, setStudents] = useState([]);

    const user = useSelector(
        store => store.auth.user
    );


    useEffect(() => {

        if (user) {

            axios.get(
                "https://worksheet-student.mashupstack.com/students",
                {
                    headers: {
                        Authorization: "Bearer " + user.token
                    }
                }
            )
            .then((response) => {

                console.log(response.data);

                setStudents(response.data);

            })
            .catch((error) => {

                console.log(error);

            });

        }

    }, [user]);


    return (

        <div className="container mt-5">

            <h2>Students List</h2>


            <table className="table table-bordered mt-3">

                <thead>

                    <tr>

                        <th>Name</th>

                        <th>Age</th>

                    </tr>

                </thead>


                <tbody>

                    {students.map((student) => (

                        <tr key={student.id}>

                            <td>{student.name}</td>

                            <td>{student.age}</td>

                        </tr>

                    ))}

                </tbody>

            </table>

        </div>

    );
}


export default checkAuth(StudentList);