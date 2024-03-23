import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import '../component_styles/Home.css';
import '../App.css'

import Button from '@mui/material/Button';
import DeleteIcon from '@mui/icons-material/Delete';
import SendIcon from '@mui/icons-material/Send';
import Stack from '@mui/material/Stack';

import { logout } from "../apis/AuthenticationService";
import { getAllCharacters } from '../apis/CharacterService';


import buu_bg from '../assets/images/backgrounds/buu_base.jpg';
import buu from '../assets/images/characters/buu_base.png';



const Home = () => {
 
  let navigate = useNavigate();

  const [index, setIndex] = useState(0);
  const [characters, setCharacters] = useState([]);
  const [filteredCharacters, setFilteredCharacters] = useState([]);

  const getCharacters = async () => {
    await getAllCharacters().then(res => {
      setCharacters(res.data)      
    })
  }

  const handleLogOut = (e) => {
    e.preventDefault()
    logout()
    navigate('/login')
  }
  
  useEffect(() => {
    getCharacters()
  },[])


  return characters.length ? 
  (
    <div className='home' >
      <div className='btns'>
        <Button id='mybtns' variant="contained" color="secondary" onClick={() => {if (index - 1 >= 0)  setIndex(index - 1)}} >Prev</Button>
        <Button id='mybtns' variant='contained' color="success"   onClick={getAllCharacters} >Refresh</Button>
        <Button id='mybtns' variant='contained' color="error"     onClick={(e) => {handleLogOut(e)}} >Log Out</Button>
        <Button id='mybtns' variant='contained' color="primary" onClick={() => {if (index + 1 <= 45) setIndex(index + 1)}} >Next</Button>
      </div>
      <div className='filters'>
        <select name="form" id="form-select">
          <option value="android">android</option>
          <option value="base">base</option>
          <option value="beast">beast</option>
          <option value="first">first</option>
          <option value="_final">_final</option>
          <option value="golden">golden</option>
          <option value="kaioken">kaioken</option>
          <option value="legendary">legendary</option>
          <option value="mutated">mutated</option>
          <option value="orange">orange</option>
          <option value="rose">rose</option>
          <option value="ss1">ss1</option>
          <option value="ss2">ss2</option>
          <option value="ss3">ss3</option>
          <option value="ssg">ssg</option>
          <option value="ssgss">ssgss</option>
          <option value="ssgsskaioken">ssgsskaioken</option>
          <option value="ssgssevolved">ssgssevolved</option>
          <option value="ultimate">ultimate</option>
          <option value="ultraego">ultraego</option>
          <option value="ultrainstinct">ultrainstinct</option>
        </select>
        <select name="race" id="race-select">
          <option value="android">android</option>
          <option value="angel">angel</option>
          <option value="core">core</option>
          <option value="earthling">earthling</option>
          <option value="frieza">frieza</option>
          <option value="majin">majin</option>
          <option value="namekian">namekian</option>
          <option value="saiyan">saiyan</option>
        </select>
        <select name="tag"  id="tag-select">
          <option value="hero">hero</option>
          <option value="villians">villians</option>
        </select>
        <select name="type" id="type-select">
          <option value="attack">attack</option>
          <option value="defense">defense</option>
          <option value="support">support</option>
        </select>
      </div>
      <div className='imgs'>
        <img id='background' src={characters[index].backgroundImage} alt="logo" />
        <img id='character' src={characters[index].image} alt="logo" style={
        {backgroundImage: `linear-gradient(45deg, ${characters[index].primaryColor}, ${characters[index].secondaryColor})`}}/>
      </div>
    </div>
  ) 
  :
  (  
    <div className='home' >
      <div className='btns'>
        <Button id='mybtns' variant="contained" color="secondary" onClick={() => {if (index - 1 >= 0)  setIndex(index - 1)}} >Prev</Button>
        <Button id='mybtns' variant='contained' color="success"   onClick={getAllCharacters} >Refresh</Button>
        <Button id='mybtns' variant='contained' color="error"     onClick={(e) => {handleLogOut(e)}} >Log Out</Button>
        <Button id='mybtns' variant='contained' color="primary" onClick={() => {if (index + 1 <= 45) setIndex(index + 1)}} >Next</Button>
      </div>
      <img id='background' src={buu_bg} alt="logo" />
      <img id='character' src={buu} alt="logo" />
    </div>
  )
}

export default Home