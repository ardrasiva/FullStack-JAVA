import React from 'react';
import {Link} from 'react-router-dom';
import './App.css';

function App() {
  return (
    <div className="container mt-5 align-items-center App">
      <h1 align = "center">Register or login</h1>
      <Link to="/register" className='btn btn-primary'>Register</Link><br /><br />
      <Link to="/login" className= 'btn btn-info'>Login</Link>
    </div>
  );
}

export default App;
