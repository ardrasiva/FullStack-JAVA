import './App.css';
import myImage from './images/newImage.png'
function App() {
  let personName = "Ardra";
  let description = "CSE Graduate from Marian Engineering College.";
  return (
    <div className="container d-flex justify-content-center align-items-center min-vh-100">
      <div style={{ border: "2px solid black", padding: "20px", backgroundColor: "beige", width: "500px", textAlign: "center", boxShadow:'5px 5px 10px gray' }} >
      <h1>{personName}</h1>
      <br />
      <h2 align="center">{description}</h2>
      <br />
      <img src='https://i.etsystatic.com/55125962/r/il/e02e38/6689613258/il_fullxfull.6689613258_4gi1.jpg' className='img-fluid mx-auto m-2' width={"200px"} alt='external image'/>
      <img src={myImage} className='img-fluid m-2' width={"140px"} alt='internal image'/>
        </div>
    </div>
  );
}

export default App;
