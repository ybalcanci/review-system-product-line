import React, { Component, useState, useEffect } from 'react';
import AppBar from '@material-ui/core/AppBar';
import { Dropdown, DropdownButton } from 'react-bootstrap';
import InputLabel from '@material-ui/core/InputLabel';
import TextField from '@material-ui/core/TextField';
import Select from '@material-ui/core/Select';
import Button from '@material-ui/core/Button';
import FormControl from '@material-ui/core/FormControl';
import Card from '@material-ui/core/Card';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardHeader from '@material-ui/core/CardHeader';
import CssBaseline from '@material-ui/core/CssBaseline';
import Grid from '@material-ui/core/Grid';
import StarIcon from '@material-ui/icons/StarBorder';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import Link from '@material-ui/core/Link';
import { makeStyles } from '@material-ui/core/styles';
import Container from '@material-ui/core/Container';
import Box from '@material-ui/core/Box';
import fetchSystemConfig from '../services/fetchConfigFile'
import { withStyles } from '@material-ui/styles';




class ListingMovie extends Component {
  constructor(props) {
      super(props);
      this.state = {
          newValue: 0,
          hasAgeLimit: false,
          hasRecommendationSystem: false,
          hasRateActor: false,
          redirect: false,
          hasRateDirector: false,
          hasUploadImage: false,
          hasFAQ: false,
          hasCast: false,
          hasTrailer: false,
          hasRoomPrice: false,
          hasContact: false,
          hasSearchByLocation: false,
          hasSearchByCast: false,
          hasSearchByFood: false,
          hasRateParkingService: false,
          hasRateAndSeeHygiene: false,
          hasRateAndSeeDeliveryTime: false,
          hasRateWaiters: false,
          hasRateCastAndCrew: false,
          hasRestaurantRecommendation: false,
          hasTouristicRecommendation: false,
          hasThemeRecommendation: false,
          type: "",
          classes : makeStyles(theme => ({
            '@global': {
              ul: {
                margin: 0,
                padding: 0,
              },
              li: {
                listStyle: 'none',
              },
            },
            appBar: {
              borderBottom: `1px solid ${theme.palette.divider}`,
            },
            toolbar: {
              flexWrap: 'wrap',
            },
            toolbarTitle: {
              flexGrow: 1,
            },
            link: {
              margin: theme.spacing(1, 1.5),
            },
            heroContent: {
              padding: theme.spacing(8, 0, 6),
            },
            cardHeader: {
              backgroundColor:
                theme.palette.type === 'dark' ? theme.palette.grey[700] : theme.palette.grey[200],
            },
            card: {
              maxWidth: 345,
            },
            cardPricing: {
              display: 'flex',
              justifyContent: 'center',
              alignItems: 'baseline',
              marginBottom: theme.spacing(2),
            },
            footer: {
              borderTop: `1px solid ${theme.palette.divider}`,
              marginTop: theme.spacing(8),
              paddingTop: theme.spacing(3),
              paddingBottom: theme.spacing(3),
              [theme.breakpoints.up('sm')]: {
                paddingTop: theme.spacing(6),
                paddingBottom: theme.spacing(6),
              },
            },
        })),
        tiers : [
          {
              title: 'Movie 1',
              path: 'https://vignette.wikia.nocookie.net/lotr/images/d/df/Fellowship1.jpg/revision/latest?cb=20190711180551',
              buttonVariant: 'contained',
              explanation: 'LOTR',
          },
          {
              title: 'Movie 2',
              path: 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTQ1-zewVfU1h9NaDk6GMepOBsEuXD-qVytYWpX-U1HX00QjOHN',
              buttonVariant: 'contained',
              explanation: 'Harry Potter',
          },
          {
              title: 'Movie 3',
              path: 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQU_v0I7wBnYhDIYbr6mNepsqqM8hPUgdpGBG0l_GCqMIe0zuSi',
              buttonVariant: 'contained',
              explanation: 'Hunger Games',
          },
          ],   
      }
  }
    /*const booleans = then(response => {
      console.log(response)
      
      
      //type: response.type, hasRateActor: response.hasRateActor, hasRateDirector: response.hasRateDirector}
     // console.log(this.hasCastInfo)
     // console.log(this.hasTrailer)
    });*/
    handleClick = () => {
      this.setState({
        redirect: true
      })
    }
    componentDidMount() {
      fetchSystemConfig.fetchSystemConfig("movie")
          .then(response => {
              this.setState({
                  hasAgeLimit: response.hasAgeLimit,
                  hasRecommendationSystem: response.hasRecommendationSystem,
                  hasRateActor: response.hasRateActor,
                  hasRateDirector: response.hasRateDirector,
                  hasUploadImage: response.hasUploadImage,
                  hasFAQ: response.hasFAQ,
                  hasCast: response.hasCast,
                  hasTrailer: response.hasTrailer,
                  hasRoomPrice: response.hasRoomPrice,
                  hasContact: response.hasContact,
                  hasSearchByLocation: response.hasSearchByLocation,
                  hasSearchByCast: response.hasSearchByCast,
                  hasSearchByFood: response.hasSearchByFood,
                  hasRateParkingService: response.hasRateParkingService,
                  hasRateAndSeeHygiene: response.hasRateAndSeeHygiene,
                  hasRateAndSeeDeliveryTime: response.hasRateAndSeeDeliveryTime,
                  hasRateWaiters: response.hasRateWaiters,
                  hasRateCastAndCrew: response.hasRateCastAndCrew,
                  hasRestaurantRecommendation: response.hasRestaurantRecommendation,
                  hasTouristicRecommendation: response.hasTouristicRecommendation,
                  hasThemeRecommendation: response.hasThemeRecommendation,
                  type: response.type,
              })
              console.log(this.state.hasSearchByCast)
              console.log(this.hasTrailer)
          })
          .catch(err => {
              console.log(err);
          })
  }

    render() {
      if (this.state.redirect) {
        this.props.history.push('/reviewPage', {
          type: this.state.type
        })
      }
      console.log(this.state.hasSearchByCast);
      return(
      <React.Fragment>
        <CssBaseline />
        {/* Hero unit */}
        <Container maxWidth="sm" component="main" className={this.state.classes.heroContent}>
          <Typography component="h1" variant="h2" align="center" gutterBottom>
            Movie Review System
          </Typography>
        </Container>
        <Container maxWidth="md" component="main">
        <FormControl>
          <Select
            native
            inputProps={{
              name: 'age',
              id: 'age-native-simple',
            }}
            align="baseline"
          >
            <option value="" />
            <option value={10}>Search By Name</option>
            {this.state.hasSearchByLocation && <option value={30}>Search By Location</option>}
            {this.state.hasSearchByFood && <option value={30}>Search By Food</option>}
            {this.state.hasSearchByCast && <option value={30}>Search By Cast</option>}
          </Select>
          
          </FormControl>
          <FormControl>
           <TextField id="standard-basic" label="Standard" align="baseline" />
          </FormControl>
          
        </Container>
        {/* End hero unit */}
        <Container maxWidth="md" component="main">
          <Grid container spacing={10} alignItems="flex-end">
          
            {this.state.tiers.map(tier => (
              // Enterprise card is full width at sm breakpoint
              <Grid item key={tier.title} xs={12} sm={tier.title === 'Restaurant Review' ? 12 : 6} md={10}>
                <Card>
                  <CardHeader
                    title={tier.title}
                    titleTypographyProps={{ align: 'left' }}
                    subheaderTypographyProps={{ align: 'left' }}
                    action={tier.title === 'Pro' ? <StarIcon /> : null}
                    className={this.state.classes.cardHeader}
                  />
                  <CardContent>
                    <ul>
                        <div>
                          <img src={tier.path} width="193" height="130"></img>
                         
                          <Typography variant="h5" align="center" color="textSecondary" component="p">
                              {tier.explanation}
                          </Typography>
                          
                        </div>
                    </ul>
                  </CardContent>
                  <CardActions>
                    <Button onClick={this.handleClick} fullWidth variant={tier.buttonVariant} color="primary">
                      Learn More
                    </Button>
                  </CardActions>
                </Card>
              </Grid>
            ))}
            {this.state.hasFAQ && <div>
              <Typography component="h3" variant="h5" align="center" gutterBottom>
                FAQ
              </Typography>
              <ul>
                <li>Do not add content that obviously fits other sections of IMDb. We do not want to replicate information that can easily fit in one of our pre-existing categories. "Hard" data like cast/crew information is stored elsewhere.</li>
                <li>Please do not include profanities, obscenities or extreme views in your FAQ.</li>
                <li>Where possible we want to keep as much valid information as possible to inform. If the data is factually incorrect then please report the item to our data editors. Do not report an item if you simply don't agree it should be included but is factually correct.</li>
                <li>If you notice bad data on the site, help us by correcting the data. But please remember, different people have different views.  We understand not everyone will agree on what should be added to an FAQ.  What constitutes a valid piece of information is at the discretion of our editors.</li>
                <li>If you wish to present another opinion on an FAQ please edit the answer to include your opinion by adding a second section below the previous answer - do not delete the original answer simple because you come from another standpoint.</li>
                <li>Read previous postings before entering a new one: You might find that your question has already been answered.</li>
                <li>Always write in English, regardless of the language of the original film.</li>
                <li>Always write in a sentence case (i.e. don't capitalize every word.)</li>
                <li>Always do a spell check.</li>
                <li>Always use the Spoiler checkbox if submitting an FAQ that includes spoilers.</li>
                <li>Do not use block capitals.</li>
                <li>Do not use short-hand 'text speak'.</li>
                <li>Do not include external URLs – linking to a title or name page on IMDb is acceptable.</li>
                <li>Do not use mark up (e.g. [b] etc.) as this is no longer supported on the site.</li>
              </ul>
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              </div>}
          </Grid>
        </Container>
      </React.Fragment>);
    };
}
export default (ListingMovie);