import axios from 'axios'
import { getUserJwt } from './AuthenticationService'

const API_URL = 'http://localhost:8080/api/v1/character'


export const getAllCharacters = () => {
  const token = getUserJwt();
  return axios.get(`${API_URL}/all`, {
    headers: {
      'Authorization': token,
}})
    
}

export const getCharacterByName = (characterName) => {
  return axios.get(`${API_URL}/name/${characterName}`)
    .then(resp => resp.data)
}

export const getCharacterByForm = (characterForm) => {
  return axios.get(`${API_URL}/form/${characterForm}`)
    .then(resp => resp.data)
}

export const getCharacterByRace = (characterRace) => {
  return axios.get(`${API_URL}/race/${characterRace}`)
    .then(resp => resp.data)
}

export const getCharacterByTag = (characterTag) => {
  return axios.get(`${API_URL}/tag/${characterTag}`)
    .then(resp => resp.data)
}

export const getCharacterByType = (characterType) => {
  return axios.get(`${API_URL}/type/${characterType}`)
    .then(resp => resp.data)
}

export const getCharacterByNameAndForm = (characterName, characterForm) => {
  return axios.get(`${API_URL}/name/${characterName}/form/${characterForm}`)
    .then(resp => resp.data)
}