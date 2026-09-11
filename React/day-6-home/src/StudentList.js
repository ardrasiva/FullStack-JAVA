import React, { useState } from "react";

function StudentList() {

    var [items, setItems] = useState([]);

    const [studentName, setStudentName] = useState("");
    const [rollNumber, setRollNumber] = useState("");
    const [studentClass, setStudentClass] = useState("");

    const [editingItemId, setEditingItemId] = useState(null);
    const [editedStudentName, setEditedStudentName] = useState("");
    const [editedRollNumber, setEditedRollNumber] = useState("");
    const [editedStudentClass, setEditedStudentClass] = useState("");

    const [searchTerm, setSearchTerm] = useState("");

    const handleStudentNameChange = (event) => {
        setStudentName(event.target.value);
    };

    const handleRollNumberChange = (event) => {
        setRollNumber(event.target.value);
    };

    const handleStudentClassChange = (event) => {
        setStudentClass(event.target.value);
    };

    const handleSubmit = (event) => {
        event.preventDefault();

        if (
            studentName.trim() === "" ||
            rollNumber.trim() === "" ||
            studentClass.trim() === ""
        ) {
            return;
        }

        const rollExists = items.some(
            (item) => item.rollNumber === rollNumber
        );

        if (rollExists) {
            return;
        }

        var x = items.length + 1;

        var newItem = {
            id: x,
            name: studentName,
            rollNumber: rollNumber,
            studentClass: studentClass
        };

        setItems([...items, newItem]);

        setStudentName("");
        setRollNumber("");
        setStudentClass("");
    };

    const handleDelete = (id) => {
        const filteredItems = items.filter(
            (item) => item.id !== id
        );

        setItems(filteredItems);
    };

    const handleEditItem = (item) => {
        setEditingItemId(item.id);
        setEditedStudentName(item.name);
        setEditedRollNumber(item.rollNumber);
        setEditedStudentClass(item.studentClass);
    };

    const handleSaveItem = () => {

        if (
            editedStudentName.trim() === "" ||
            editedRollNumber.trim() === "" ||
            editedStudentClass.trim() === ""
        ) {
            return;
        }

        const rollExists = items.some(
            (item) =>
                item.rollNumber === editedRollNumber &&
                item.id !== editingItemId
        );

        if (rollExists) {
            return;
        }

        const updatedItems = items.map((item) => {

            if (item.id === editingItemId) {
                return {
                    ...item,
                    name: editedStudentName,
                    rollNumber: editedRollNumber,
                    studentClass: editedStudentClass
                };
            }

            return item;
        });

        setItems(updatedItems);
        setEditingItemId(null);
    };

    const handleCancelEdit = () => {
        setEditingItemId(null);
        setEditedStudentName("");
        setEditedRollNumber("");
        setEditedStudentClass("");
    };

    const filteredItems = items.filter((item) =>
        item.name.toLowerCase().includes(searchTerm.toLowerCase())
    );

    return (
        <div>

            <div className="container">
                <div className="row">
                    <div className="col-md-8">

                        <h2>Student List Management</h2>

                        <form onSubmit={handleSubmit}>

                            <label>Student Name</label>
                            <input
                                type="text"
                                value={studentName}
                                onChange={handleStudentNameChange}
                            />

                            <br />

                            <label>Roll Number</label>
                            <input
                                type="text"
                                value={rollNumber}
                                onChange={handleRollNumberChange}
                            />

                            <br />

                            <label>Class</label>
                            <input
                                type="text"
                                value={studentClass}
                                onChange={handleStudentClassChange}
                            />

                            <br />

                            <button
                                className="btn btn-small btn-success"
                                type="submit"
                            >
                                Add Student
                            </button>

                        </form>

                    </div>
                </div>
            </div>

            <br />

            <div className="container">

                <label>Search Name: </label>

                <input
                    type="text"
                    value={searchTerm}
                    onChange={(e) => setSearchTerm(e.target.value)}
                    placeholder="Search student name"
                />

            </div>

            <br />

            <div className="container">

                {filteredItems.length === 0 ? (

                    <p>No students found</p>

                ) : (

                    <table className="table table-bordered table-dark">

                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Student Name</th>
                                <th>Roll Number</th>
                                <th>Class</th>
                                <th>Action</th>
                            </tr>
                        </thead>

                        <tbody>

                            {filteredItems.map((item) => (

                                <tr key={item.id}>

                                    <td>{item.id}</td>

                                    <td>
                                        {editingItemId === item.id ? (
                                            <input
                                                type="text"
                                                value={editedStudentName}
                                                onChange={(e) =>
                                                    setEditedStudentName(e.target.value)
                                                }
                                            />
                                        ) : (
                                            item.name
                                        )}
                                    </td>

                                    <td>
                                        {editingItemId === item.id ? (
                                            <input
                                                type="text"
                                                value={editedRollNumber}
                                                onChange={(e) =>
                                                    setEditedRollNumber(e.target.value)
                                                }
                                            />
                                        ) : (
                                            item.rollNumber
                                        )}
                                    </td>

                                    <td>
                                        {editingItemId === item.id ? (
                                            <input
                                                type="text"
                                                value={editedStudentClass}
                                                onChange={(e) =>
                                                    setEditedStudentClass(e.target.value)
                                                }
                                            />
                                        ) : (
                                            item.studentClass
                                        )}
                                    </td>

                                    <td>

                                        {editingItemId === item.id ? (

                                            <>
                                                <button
                                                    className="btn btn-primary"
                                                    onClick={handleSaveItem}
                                                >
                                                    Save
                                                </button>

                                                <button
                                                    className="btn btn-secondary"
                                                    onClick={handleCancelEdit}
                                                >
                                                    Cancel
                                                </button>
                                            </>

                                        ) : (

                                            <>
                                                <button
                                                    className="btn btn-primary"
                                                    onClick={() => handleEditItem(item)}
                                                >
                                                    Edit
                                                </button>

                                                <button
                                                    className="btn btn-danger"
                                                    onClick={() => handleDelete(item.id)}
                                                >
                                                    Delete
                                                </button>
                                            </>

                                        )}

                                    </td>

                                </tr>

                            ))}

                        </tbody>

                    </table>

                )}

            </div>

        </div>
    );
}

export default StudentList;