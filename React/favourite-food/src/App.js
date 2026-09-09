import './App.css';

function App() {
  const favouriteFoods = ["Pizza", "Biriyani", "Burger", "Pasta"]; 
  function showFoodDesc(foodName){
    document.getElementById("message").innerHTML = "I love "+foodName+"!";
  }
  return (
    <div className="container mt-5 d-flex flex-column">
      <h1 align="center">My favourite foods</h1>
      <ul>
        {favouriteFoods.map((items) => {return <li className="d-flex justify-content-between align-items-center mb-2" style={{ listStyle: "disc" }}>{items}<button className='btn btn-primary' onClick={()=>showFoodDesc(items)}>Click Me!</button></li>})}
      </ul>
      <h4 id='message' align="center">"Select a food that you love!".</h4>
    </div>
  );
}

export default App;
