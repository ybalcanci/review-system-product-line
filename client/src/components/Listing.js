import React, { Component, useState, useEffect } from 'react';
import AppBar from '@material-ui/core/AppBar';
import Button from '@material-ui/core/Button';
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
import fetchMovieSystemConfig from '../services/fetchConfigFile'

const useStyles = makeStyles(theme => ({
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
}));
const Filter = fetchMovieSystemConfig.fetchMovieSystemConfig;
const tiers = [
{
    title: 'Hotel 1',
    path: 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS78aY9cQ2xD09zNdGL4ekYGHjLELKukyFaNRaH0wnHzCHF1U33',
    buttonVariant: 'contained',
    explanation: 'Anan anan anan',
},
{
    title: 'Hotel 2',
    path: 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTWMTKBph4g3sCBqyDlWa68iLUGdKjylvGp41d0PBnB4YGerToj',
    buttonVariant: 'contained',
    explanation: 'ana',
},
{
    title: 'Hotel 3',
    path: 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRVSIKBxT9BJdF8qdi9lzIPIljK-OZidwm6rpBXPk6JR_jH6upZ',
    buttonVariant: 'contained',
    explanation: 'baba',
},
];
export default function Pricing() {
    const classes = useStyles();
    const [userName, setUserName] = useState('');
    useEffect(() => {
      Filter()
           .then(res => setUserName(res.hasCast));
    }, []);
    /*const booleans = then(response => {
      console.log(response)
      
      
      //type: response.type, hasRateActor: response.hasRateActor, hasRateDirector: response.hasRateDirector}
     // console.log(this.hasCastInfo)
     // console.log(this.hasTrailer)
    });*/
    
    console.log(setUserName)
    return (
      <React.Fragment>
        <CssBaseline />
        {/* Hero unit */}
        <Container maxWidth="sm" component="main" className={classes.heroContent}>
          <Typography component="h1" variant="h2" align="center" gutterBottom>
            
          </Typography>
        </Container>
        {/* End hero unit */}
        <Container maxWidth="md" component="main">
          <Grid container spacing={10} alignItems="flex-end">
            {tiers.map(tier => (
              // Enterprise card is full width at sm breakpoint
              <Grid item key={tier.title} xs={12} sm={tier.title === 'Restaurant Review' ? 12 : 6} md={10}>
                <Card>
                  <CardHeader
                    title={tier.title}
                    titleTypographyProps={{ align: 'left' }}
                    subheaderTypographyProps={{ align: 'left' }}
                    action={tier.title === 'Pro' ? <StarIcon /> : null}
                    className={classes.cardHeader}
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
                    <Button href="/reviewPage" fullWidth variant={tier.buttonVariant} color="primary">
                      Learn More
                    </Button>
                  </CardActions>
                </Card>
              </Grid>
            ))}
          </Grid>
        </Container>
      </React.Fragment>
    );
}