import axios from 'axios'

const API_URL = 'http://localhost:8080/api/v1/auth'

export const USER_NAME_SESSION_ATTRIBUTE = 'authenticatedUser'


export const registerUser = (userData) => {
  return axios.post(`${API_URL}/register`, userData, {
    headers: {
      'Content-Type': 'application/json'
  }}).catch(err => console.error(err))
}

export const executeJwtAuthenticationService = (userData) => {
  return axios.post(`${API_URL}/authenticate`, userData, {
    headers: {
      'Content-Type': 'application/json'
  }}).then(resp => resp.data)
}

export const registerSuccessfulLoginForJwt = (username, token) => {
  let newToken = createJWTToken(token)
  sessionStorage.setItem(USER_NAME_SESSION_ATTRIBUTE, username)
  sessionStorage.setItem('token', newToken)
  setupAxiosInterceptors(newToken)
}

export const createJWTToken = (token) => {
  return `Bearer ${token}`
}

export const logout = () => {
  sessionStorage.removeItem(USER_NAME_SESSION_ATTRIBUTE);
}

export const isUserLoggedIn = () => {
  let user = sessionStorage.getItem(USER_NAME_SESSION_ATTRIBUTE)
  if (user === null) return false
  return true
}

export const getUserJwt = () => {
  let token = sessionStorage.getItem('token')
  if (token === null) return ''
  return token
}

export const setupAxiosInterceptors = (token) => {
  axios.interceptors.request.use(
    (config) => {
      if (isUserLoggedIn()) {
        config.headers.authorization = token
      }
      return config
    }
  )
}


