import './App.css'

import { React, useEffect, useState } from 'react';
import { Route, Routes } from 'react-router-dom';
import Login from './components/Login';
import Register from './components/Register.jsx';
import Home from './components/Home.jsx';
import { isUserLoggedIn } from './apis/AuthenticationService';




function App() {
  const [loggedIn, setLoggedIn] = useState(isUserLoggedIn())

  useEffect(() => {},[loggedIn])

  return (
    <Routes>
      <Route path='/' element={loggedIn ? <Home /> : <Login />} />
      <Route path='/home' element={<Home />} />
      <Route path='/login' element={<Login />} />
      <Route path='/register' element={<Register />} />
    </Routes>
  )
}

export default App
