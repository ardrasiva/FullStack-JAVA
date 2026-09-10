import { Link, useNavigate } from "react-router-dom";

function Home() {

  const navigate = useNavigate();

  function goTodefault() {
    navigate("/student/Riya");
  }

  return (
    <div>
      <h1>Student List</h1>
      <ul>
        <li>
          <Link to="/student/Evaniya">Evaniya</Link>
        </li>
        <li>
          <Link to="/student/Sruthy">Sruthy</Link>
        </li>
        <li>
          <Link to="/student/Ardra">Ardra</Link>
        </li>
      </ul>
      <button onClick={goTodefault}>
        Go to Riya
      </button>
    </div>
  );
}

export default Home;