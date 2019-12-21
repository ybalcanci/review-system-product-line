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
  renderButtons(){
    if(this.props['hasTrailer'] && this.props['hasCastInfo'])
    {
      return(
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
    else if(this.props['hasTrailer'] && !this.props['hasCastInfo'])
    {
      return(
        <div>
        <Button size="small" color="primary">
          Watch Trailer
        </Button>
        </div>

      );
    }
    else if(!this.props['hasTrailer'] && this.props['hasCastInfo'])
    {
      return(
        <div>
        <Button size="small" color="primary">
          Show Cast Info
        </Button>
        </div>
      );
    }
    else
    {
      return;
    }
  }
    render() {
        const { classes } = this.props;
        return (
            <Card className={classes.card}>
                <CardContent>
                    <Typography className={classes.title} gutterBottom variant="h5" component="h2">
                        WORST MOVIE OFF ALL TIMES
                </Typography>
                    <Typography gutterBottom variant="body2" component="p">
                        <Link href="#" variant="body2">
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
        );
        }
}

export default withStyles(styles)(Review);