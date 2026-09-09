import React from 'react';
import { useEffect } from 'react';
import { useState } from 'react';
import './App.css';

function App() {
  const [user, setUser] = useState("Guest")
  useEffect(()=>{
    if(user !== "Guest"){
      console.log("User changed to " + user);
    }
    
  },[user]);
  function loginUser()
  {
    setUser("Alice");
  }
  return (
    <div className="App">
      <h1>Welcome, {user}!</h1>
      <button className='btn btn-primary' onClick={loginUser}>
        Login as Alice
      </button>
      
    </div>
  );
}

export default App;
