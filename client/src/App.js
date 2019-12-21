import React from 'react';
import logo from './logo.svg';
import  { Link, Switch, Route, BrowserRouter as Router } from 'react-router-dom'
import './App.css';


import Home from './components/Home.js';
import Listing from './components/Listing.js';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        
        <div>
        <Router>
          {/* Public Routes */}
          <Route exact path="/" component={Home}/>
          <Route exact path="/listing" component={Listing}/>
        </Router>
          
        </div>
        
      </header>
    </div>
    
  );
}

export default App;
