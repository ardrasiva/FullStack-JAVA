import logo from './logo.svg';
import './App.css';
import Navbar from './Navbar';

function App() {
  return (
    <div>
      <Navbar />
       <div className="container mt-5 text-center">

            <h1 className='display-3'>
                Electronics Store Dashboard
            </h1>

            <p>
                Please login to access the product list.
            </p>

        </div>
    </div>
  );
}

export default App;
