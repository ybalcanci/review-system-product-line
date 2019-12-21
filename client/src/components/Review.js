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

const styles = theme => ({
        card: {
            maxWidth: 420,
            margin: 20
          },
          media: {
            height: 140,
          } 
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
      if(this.props.type === 'movie')
      {
        return (
          <Card className={classes.card}>
            <CardActionArea>
              <CardMedia
                className={classes.media}
                image='https://vignette.wikia.nocookie.net/lotr/images/d/df/Fellowship1.jpg/revision/latest?cb=20190711180551'
                title="Contemplative Reptile"
              />
              <CardContent>
              <Typography gutterBottom variant="h5" component="h2">
                  {this.props['entityName']}
              </Typography>
              <Typography variant="body2" color="textSecondary" component="p">
                  Lord of the Rings: Fellowship of the Rings
              </Typography>
              <Typography variant="body2" color="textSecondary" component="p">
                  Director: {this.props['director']}
              </Typography>
              <Typography variant="body2" color="textSecondary" component="p">
                  Year: {this.props['year']}
              </Typography>
              </CardContent>
            </CardActionArea>
            <CardActions>
              {this.renderButtons()}
            </CardActions>
          </Card>
        );
      }
      else if (this.props.type === 'hotel')
      {
        return (
          <Card className={classes.card}>
            <CardActionArea>
              <CardMedia
                className={classes.media}
                image='http://www.sheratoncesme.com/upload/slider/slider_2019-05-20_17-38-48.jpg'
                title="Contemplative Reptile"
              />
              <CardContent>
              <Typography gutterBottom variant="h5" component="h2">
                  Şerıtın Hotel
              </Typography>
              <Typography variant="body2" color="textSecondary" component="p">
                  Hotel name: Şerıtın
              </Typography>
              <Typography variant="body2" color="textSecondary" component="p">
                  Address: Isengard mahallesi / MIDDLE EARTH
              </Typography>
              <Typography variant="body2" color="textSecondary" component="p">
                  Star: 5 star hotel
              </Typography>
              </CardContent>
            </CardActionArea>
            <CardActions>
              {this.renderButtons()}
            </CardActions>
          </Card>
        );

      }
      else
      {
        console.log("")
        return;
      
      }
    }
}

export default withStyles(styles)(Review);