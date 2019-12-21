import React from 'react';
import { BrowserRouter as Router, Route } from 'react-router-dom';

import Home from './components/Home'
<<<<<<< Updated upstream

import Review from './components/Entity'
import Listing from './components/Listing'

=======
import Listing from './components/Listing'
import Review from './components/Review'
>>>>>>> Stashed changes
import ReviewPage from './ReviewPage'

/***
 *  Application interface
 */

const App = () => {
  return (
      <Router>
        {/* Public Routes */}
        <Route exact path="/" component={Home}/>
        <Route exact path="/listing" component={Listing}/>
        <Route exact path="/review" component ={Review}/>
        <Route exact path="/reviewPage" component ={ReviewPage}/>
      </Router>
  );
};

// Exporting the App
export default App;
