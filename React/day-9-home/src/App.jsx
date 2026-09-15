import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'
import Navbar from './Navbar'

function App() {
  const [count, setCount] = useState(0)

  return (
     <div>

            <Navbar />

            <div className="container mt-5 text-center">

                <h1>Seller Dashboard</h1>

                <p>
                    Welcome to the Seller Dashboard
                </p>

            </div>

        </div>
  )
}

export default App
