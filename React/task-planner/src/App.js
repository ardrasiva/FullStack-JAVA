import React, { useState } from "react";
import TaskList from "./TaskList";

function App() {

  const [task, setTask] = useState("");
  const [tasks, setTasks] = useState([]);
  const [message, setMessage] = useState("Add a task to get started!");

  function addTask() {
    let newTasks = [];

    for (let i = 0; i < tasks.length; i++) {
      newTasks.push(tasks[i]);
    }

    newTasks.push(task);

    setTasks(newTasks);
    setMessage("Task added: " + task + "!");
    setTask("");
  }

  return (
    <div className="container mt-5">

      <div className="card p-4">

        <h1 style={{ backgroundColor: tasks.length > 0 ? "lightblue" : "transparent" }} align="center">
          Task Planner
        </h1>

        <input
          type="text"
          className="form-control mb-2"
          value={task}
          onChange={(e) => setTask(e.target.value)}
          placeholder="Enter task name"
        />

        <button className="btn btn-primary mb-4" onClick={addTask}>
          Add Task
        </button>

        <TaskList tasks = {tasks} message = {message}/>

      </div>

    </div>
  );
}

export default App;