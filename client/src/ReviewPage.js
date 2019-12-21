import React, { Component } from 'react';
import Card from '@material-ui/core/Card';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import Link from '@material-ui/core/Link';
import Entity from './components/Entity.js'
import RatingSystem from './components/RatingSystem.js'
import Review from './components/Review.js'
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
            hasRateDirector: false,
            isReviewSectionVisible: false
        }
    }
    setValue = (event, newValue) => {
        this.setState({ newValue: newValue })
    };

    showOrHideReviewSection = () => {
        this.setState(oldState => ({ isReviewSectionVisible: !oldState.isReviewSectionVisible }))
    };

    componentDidMount() {
        fetchMovieSystemConfig.fetchMovieSystemConfig()
            .then(response => {
                console.log(response)
                this.setState({ hasCast: response.hasCast, hasTrailer: response.hasTrailer, type: response.type, hasRateActor: response.hasRateActor, hasRateDirector: response.hasRateDirector })
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
            <div style={styles.mainContainer}>
                <div style={styles.infoContainer}>

                    <Entity entityName='Lord of the Rings' director='Peter Jackson' year='2001' hasTrailer={this.state.hasTrailer} hasCastInfo={this.state.hasCast} type='movie' />

                </div>
                <div style={styles.reviewsContainer}>
                    <Typography gutterBottom variant="h5" component="h1">
                        Reviews:
                    </Typography>
                    <Review />
                    <br />
                    {
                        !this.state.isReviewSectionVisible &&
                        (
                            <Button size="small" onClick={this.showOrHideReviewSection}>Send a Review</Button>
                        )
                    }
                    {
                        this.state.isReviewSectionVisible &&
                        (
                            <div>
                                <Button size="small" onClick={this.showOrHideReviewSection}>Hide Review Section</Button>
                                <RatingSystem hasRateActor={this.state.hasRateActor} hasRateDirector={this.state.hasRateDirector} type='movie' />
                            </div>
                        )
                    }
                </div>
            </div>
        );
    }
}

const styles = {
    mainContainer: {
        display: 'block',
        marginLeft: 40,
        marginBottom: 20,
        marginTop: 40
    },
    infoContainer: {
        position: 'absolute'
    },
    reviewsContainer: {
        float: 'right',
        display: 'inline'
    }
};

export default ReviewPage;