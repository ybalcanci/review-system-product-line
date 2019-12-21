import React, { Component } from 'react';
import Card from '@material-ui/core/Card';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import Link from '@material-ui/core/Link';
import Review  from './components/Review.js'
import RatingSystem  from './components/RatingSystem.js'
import fetchMovieSystemConfig from './services/fetchConfigFile'

class ReviewPage extends Component {
    constructor(props) {
        super(props);
        this.state = {
            newValue: 0,
            hasCast: false,
            hasTrailer: false,
            type: "",
            hasRateActor: false,
            hasRateDirector: false
        }
    }
    setValue = (event, newValue) => {
        this.setState({newValue: newValue})
    };
    componentDidMount(){
        fetchMovieSystemConfig.fetchMovieSystemConfig()
                .then(response => {
                        console.log(response)
                        this.setState({hasCast: response.hasCast, hasTrailer: response.hasTrailer, type: response.type, hasRateActor: response.hasRateActor, hasRateDirector: response.hasRateDirector})
                       // console.log(this.hasCastInfo)
                       // console.log(this.hasTrailer)
                })
                .catch(err => {
                    console.log(err);
                })
    }
    render() {
      console.log(this.state.type + "ss")
      return (
          <div>
              
            <Review entityName='Lord of the Rings' director='Peter Jackson' year='2001' hasTrailer={this.state.hasTrailer} hasCastInfo={this.state.hasCast} type='movie'/>
            <Typography gutterBottom variant="h5" component="h1">
                Reviews:
            </Typography>
            <Card>
                <CardContent>
                    <Typography gutterBottom variant="h5" component="h2">
                    WORST MOVIE OFF ALL TIMES
                    </Typography>
                    <Typography gutterBottom variant="body2" component="p">
                        <Link href="#"  variant="body2">
                        Mr.Siksuyu
                        </Link>
                        {" "} 22nd May
                    </Typography>
                    <Typography variant="body2" component="p">
                        Peter Jackson managed to ruin the best books of all time. The cast is terrible. Story telling is terrible. What a waste of 2+ hours
                    <br />
                    a benevolent smile
                    </Typography>
                </CardContent>
                <CardActions>
                    <Button size="small">Read More</Button>
                </CardActions>
            </Card>

            <Card>
                <CardContent>
                    <Typography gutterBottom variant="h5" component="h2">
                    An absolutely incredible film!
                    </Typography>
                    <Typography gutterBottom variant="body2" component="p">
                        <Link href="#"  variant="body2">
                        Mr.Siksuyu
                        </Link>
                        {" "} 22nd May
                    </Typography>
                    <Typography variant="body2" component="p">
                        Simply incredible. Never before have I seen a 3 hour movie that didn't seem like 3 hours. I read the Lord of the Rings very recently and I was surprised at how similar Peter Jackson's vision was to my own.
                    <br />
                    a benevolent smile
                    </Typography>
                </CardContent>
                <CardActions>
                    <Button size="small">Read More</Button>
                </CardActions>
            </Card>

            <Card>
                <CardContent>
                    <Typography gutterBottom variant="h5" component="h2">
                    The Fellowship of the Ring: Not just a Movie, but the Door to another Dimension
                    </Typography>
                    <Typography gutterBottom variant="body2" component="p">
                        <Link href="#"  variant="body2">
                        Mr.Siksuyu
                        </Link>
                        {" "} 22nd May
                    </Typography>
                    <Typography variant="body2" component="p">
                    The first part of the Lord of the Rings trilogy, the Fellowship of the Rings opened the door to a whole new world for me. I'd never read any of Tolkien's books when I saw the film for the first time at the theatre and, now that I've read them, in retrospect I think being a neophyte to the mythology made my LOTR movie experience all the more miraculous.
                    <br />
                    a benevolent smile
                    </Typography>
                </CardContent>
                <CardActions>
                    <Button size="small">Read More</Button>
                </CardActions>
            </Card>
            <br/>
            <RatingSystem hasRateActor={this.state.hasRateActor} hasRateDirector={this.state.hasRateDirector} type='movie'/>
          </div>
      );
    }
  }
  
  
  export default ReviewPage;