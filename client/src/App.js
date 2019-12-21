import React from 'react';
import logo from './logo.svg';
import  { Link, Switch, Route, BrowserRouter as Router } from 'react-router-dom'
import './App.css';

import Home from './components/Hotel.js';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
          
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <Router>
          <div>
            <h2>Welcome to React Router Tutorial</h2>
            <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <ul className="navbar-nav mr-auto">
              <li><Link to={'/home'} className="nav-link"> Home </Link></li>
            </ul>
            </nav>
            <hr />
            <Switch>
              <Router>
                <Route exact path='/home' component={Home} />
              </Router>
            </Switch>
          </div>
        </Router>
        
      </header>
    </div>
    
  );
}

export default App;
