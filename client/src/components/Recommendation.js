import React, { Component } from 'react';
import Typography from '@material-ui/core/Typography';



class Recommendation extends Component {

    constructor(props) {
        super(props);
        this.state = {
            dummy: ""
        }
    }

    render() {
        if (this.props.type === 'movie') {
            return (
                <div>
                    {this.props['hasThemeRecommendation'] &&
                        <Typography>
                            Horror, Action, Sci-fi
         </Typography>

                    } </div>);
        }
        else if (this.props.type === 'hotel') {
            return (
                <div>
                    {this.props['hasTouristicRecommendation'] &&
                        <Typography>
                            Mugla Milas, Antik tiyatro
         </Typography>

                    } </div>);
            
        }
        else if (this.props.type === 'restaurant') {
            return (
                <div>
                    {this.props['hasRestaurantRecommendation'] &&
                        <Typography>
                            Bodrum, Antalya, Miami
         </Typography>

                    } 
                    {this.props['hasThemeRecommendation'] &&
                        <Typography>
                            China, Tai, Japan
         </Typography>

                    }
                    </div>);
            
        }

        
        else {
            return; 
        }
    }
}

export default Recommendation;