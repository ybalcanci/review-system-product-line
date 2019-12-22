import React from 'react';
import { BrowserRouter as Router, Route } from 'react-router-dom';

import Home from './components/Home'

import Review from './components/Entity'
import Listing from './components/ListingHotel'

import ReviewPage from './ReviewPage'
import ListingHotel from './components/ListingHotel';
import ListingRestaurant from './components/ListingRestaurant';
import ListingMovie from './components/ListingMovie';

/***
 *  Application interface
 */

const App = () => {
  return (
      <Router>
        {/* Public Routes */}
        <Route exact path="/" component={Home}/>
        <Route exact path="/listingHotel" component={ListingHotel}/>
        <Route exact path="/listingRestaurant" component={ListingRestaurant}/>
        <Route exact path="/listingMovie" component={ListingMovie}/>
        <Route exact path="/review" component ={Review}/>
        <Route exact path="/reviewPage" component ={ReviewPage}/>
      </Router>
  );
};

// Exporting the App
export default App;
