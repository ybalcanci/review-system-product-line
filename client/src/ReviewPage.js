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
import fetchSystemConfig from './services/fetchConfigFile'
import Recommendation from './components/Recommendation.js';

class ReviewPage extends Component {
    constructor(props) {
        super(props);
        this.state = {
            newValue: 0,
            hasCast: false,
            hasTrailer: false,
            type: this.props.location.state.type,
            hasRateActor: false,
            hasRateDirector: false,
            isReviewSectionVisible: false
        }
        console.log(this.props.location.state)
    }
    setValue = (event, newValue) => {
        this.setState({ newValue: newValue })
    };

    showOrHideReviewSection = () => {
        this.setState(oldState => ({ isReviewSectionVisible: !oldState.isReviewSectionVisible }))
    };

    componentWillMount() {
        //fetchMovieSystemConfig.fetchMovieSystemConfig(this.props.type)
        fetchSystemConfig.fetchSystemConfig(this.state.type)
            .then(response => {
                console.log(response)
                this.setState({
                    hasAgeLimit: response.hasAgeLimit,
                    hasRecommendationSystem: response.hasRecommendationSystem,
                    hasRateActor: response.hasRateActor,
                    hasRateDirector: response.hasRateDirector,
                    hasUploadImageFeature: response.hasUploadImageFeature,
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
                    //type: response.type,
                })
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

                    <Entity
                        hasAgeLimit={this.state.hasAgeLimit}
                        hasRecommendationSystem={this.state.hasRecommendationSystem}
                        hasFAQ={this.state.hasFAQ}
                        hasCast={this.state.hasCast}
                        hasTrailer={this.state.hasTrailer}
                        hasRoomPrice={this.state.hasRoomPrice}
                        hasContact={this.state.hasContact}
                        hasSearchByLocation={this.state.hasSearchByLocation}
                        hasSearchByCast={this.state.hasSearchByCast}
                        hasSearchByFood={this.state.hasSearchByFood}
                        hasRestaurantRecommendation={this.state.hasRestaurantRecommendation}
                        hasTouristicRecommendation={this.state.hasTouristicRecommendation}
                        hasThemeRecommendation={this.state.hasThemeRecommendation}
                        type={this.state.type}
                        entityName='Lord of the Rings'
                        director='Peter Jackson'
                        year='2001'
                    />
                    <Recommendation hasThemeRecommendation={this.state.hasThemeRecommendation} type={this.state.type}/>

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
                                <RatingSystem
                                    hasRateActor={this.state.hasRateActor}
                                    hasRateDirector={this.state.hasRateDirector}
                                    hasRateParkingService={this.state.hasRateParkingService}
                                    hasRateAndSeeHygiene={this.state.hasRateAndSeeHygiene}
                                    hasRateAndSeeDeliveryTime={this.state.hasRateAndSeeDeliveryTime}
                                    hasRateWaiters={this.state.hasRateWaiters}
                                    hasRateCastAndCrew={this.state.hasRateCastAndCrew}
                                    hasUploadImageFeature={this.state.hasUploadImageFeature}
                                    type={this.state.type}
                                />
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
        float: 'left',
        display: 'inline',
        marginLeft: 450
    }
};

export default ReviewPage;