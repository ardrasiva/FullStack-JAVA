import './App.css';
import myImage from "./images/myImage.jpg"

function App() {
  let userName = "Ardra";
  
  console.log("React app started!");
  return (
    <div className="container d-flex justify-content-center align-items-center min-vh-100 my-3 mb-3"> 
    <div className="card p-4 text-center shadow" style={{ width: "500px" }}> 
      <h1 style={{ color: "darkblue", fontWeight: "bold" }}>Welcome to React Learning, {userName}</h1>   
     
    
    
    <img className='img-fluid mx-auto my-3' src={myImage} width={"200px"} alt='internal image'/>
    <img src='https://static.vecteezy.com/system/resources/previews/029/354/718/non_2x/demon-slayer-background-cartoon-free-vector.jpg' className='img-fluid mx-auto my-3' width={"200px"}/>
    <p align="center" className=''> This is your first card with images and styles! </p>
    </div>
    <br />
    
    </div>
  );
}

export default App;
