import './App.css';

function App() {
  const name = "Alex";
  const age = 20;
  const isStudent = true;
  const hobbies = ["Reading", "Hiking", "Coding"];
  const headingColor = "lightblue"
  function showMessage(){
    document.getElementById("message").innerHTML = "Hello from React! I love my hobbies!";
    document.getElementById("heading").style.backgroundColor = headingColor;
  }

  let fvrtHobby = [];
  for(let i=0;i<hobbies.length;i++)
  {
    fvrtHobby.push(<li key = {i}>{hobbies[i]}</li>);
  }
  return (
    <div className="container d-flex flex-column justify-content-center align-items-center min-vh-100 my-3 mb-3"> 
      <h1 id = "heading" align = "center">My Personal Profile</h1>
    <div className="card p-4 text-center shadow align-items-center mt-3 mb-5" style={{ width: "500px" }}> 
        <h2 align="center">{name}</h2>
        <p>Age : {age}</p>
        <p>Student : {isStudent.toString()}</p>
    </div>
    <h3 align = "center">My hobbies - Printed in For loop</h3>
    <ul>{fvrtHobby}</ul>
    <h3 align = "center">My hobbies - printed using Map function</h3>
    <ul>
      {fvrtHobby.map((item) => {return <li type="disc">{item}</li>})}
    </ul>

    <br />
    <button className='btn btn-primary mt-3' onClick={showMessage}>Show Enthusiasm!</button>
    <p id="message" className="mt-3"> Click the button to see my enthusiasm! </p>
    </div>
  );
}

export default App;
