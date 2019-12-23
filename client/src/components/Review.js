import React, { Component } from 'react';
import { makeStyles } from '@material-ui/core/styles';
import { withStyles } from '@material-ui/styles';
import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import Link from '@material-ui/core/Link';

const styles = theme => ({
  card: {
    minWidth: 275,
  },
  bullet: {
    display: 'inline-block',
    margin: '0 2px',
    transform: 'scale(0.8)',
  },
  title: {
    fontSize: 14,
  },
  pos: {
    marginBottom: 12,
  },
});

class Review extends Component {

  constructor(props) {
    super(props);
    this.state = {
      newValue: 0,
    }
  }
  renderButtons() {
    if (this.props['hasTrailer'] && this.props['hasCastInfo']) {
      return (
        <div>
          <Button size="small" color="primary">
            Watch Trailer
        </Button>
          <Button size="small" color="primary">
            Show Cast Info
        </Button>
        </div>

      );
    }
    else if (this.props['hasTrailer'] && !this.props['hasCastInfo']) {
      return (
        <div>
          <Button size="small" color="primary">
            Watch Trailer
        </Button>
        </div>

      );
    }
    else if (!this.props['hasTrailer'] && this.props['hasCastInfo']) {
      return (
        <div>
          <Button size="small" color="primary">
            Show Cast Info
        </Button>
        </div>
      );
    }
    else {
      return;
    }
  }
  render() {
    const { classes } = this.props;
    return (
      <div>
        {this.props.type === 'movie' &&
          <div>
          <Card className={classes.card}>
            <CardContent>
              <Typography className={classes.title} gutterBottom variant="h5" component="h2">
                WORST MOVIE OFF ALL TIMES
                </Typography>
              <Typography gutterBottom variant="body2" component="p">
                <Link href="#" variant="body2">
                  Ms.Alice
                    </Link>
                {" "} 22nd May
                </Typography>
              <Typography variant="body2" component="p">
                Peter Jackson managed to ruin the best books of all time. The cast is terrible. Story telling is terrible. What a waste of 3 hours
                <br />
                a benevolent smile
                </Typography>
            </CardContent>
            <CardActions>
              <Button size="small">Read More</Button>
            </CardActions>
          </Card>
          <br></br>
          <Card className={classes.card}>
            <CardContent>
              <Typography className={classes.title} gutterBottom variant="h5" component="h2">
              An absolutely incredible film!
            </Typography>
              <Typography gutterBottom variant="body2" component="p">
                <Link href="#" variant="body2">
                  Mr.Beast
                </Link>
                {" "} 22nd May
            </Typography>
              <Typography variant="body2" component="p">
              Simply incredible. Never before have I seen a 3 hour movie that didn't seem like 3 hours. I read the Lord of the Rings very recently and I was surprised at how similar Peter Jackson's vision was to my own.
            <br />
            </Typography>
            </CardContent>
            <CardActions>
              <Button size="small">Read More</Button>
            </CardActions>
          </Card>
          </div>
        }

        {this.props.type === 'restaurant' &&
          <Card className={classes.card}>
            <CardContent>
              <Typography className={classes.title} gutterBottom variant="h5" component="h2">
                GREAT PLACE GREAT FOOD!
                </Typography>
              <Typography gutterBottom variant="body2" component="p">
                <Link href="#" variant="body2">
                  Vedat Milord
                    </Link>
                {" "} 1st of October
                </Typography>
              <Typography variant="body2" component="p">
                Gülçimen Aspava is really the best aspava in Ankara. Great treats including potato chips, cacık, mushrooms, salad and the list goes on. The 'SSK' is a must try!
                <br />
              </Typography>
            </CardContent>
            <CardActions>
              <Button size="small">Read More</Button>
            </CardActions>
          </Card>
        }

        {this.props.type === 'hotel' &&
          <Card className={classes.card}>
            <CardContent>
              <Typography className={classes.title} gutterBottom variant="h5" component="h2">
                Overall a good place to stay but a bit overpriced.
                </Typography>
              <Typography gutterBottom variant="body2" component="p">
                <Link href="#" variant="body2">
                  John Doe
                    </Link>
                {" "} 1st of October
                </Typography>
              <Typography variant="body2" component="p">
              How can a place so awful be a part of such a beautiful city? As soon as we pulled up outside and looked at the dirty, holey curtains hanging like rags behind the stinking glass of the rotting windows we should have turned and run. The room was tiny and stank, as did the rest of the building. It was a combination of cats, mould, rot, damp, the local petting farm and a pair of Zoo Keepers’ wellies.
                <br />
              </Typography>
            </CardContent>
            <CardActions>
              <Button size="small">Read More</Button>
            </CardActions>
          </Card>
        }
      </div>
    );
  }
}

export default withStyles(styles)(Review);