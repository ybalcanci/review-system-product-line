import React, { Component } from 'react';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import TextField from '@material-ui/core/TextField';
import Rating from '@material-ui/lab/Rating';
import Box from '@material-ui/core/Box';

class RatingSystem extends Component {

    constructor(props) {
        super(props);
        this.state = {
            newValue: 0,     
        }
    }
    setValue = (event, newValue) => {
        this.setState({newValue: newValue})
    };
    renderRatings()
    {
        if(this.props['type'] === 'movie')
        {
            if(this.props['hasRateActor'] && this.props['hasRateDirector'] )
            {
            return(
                <div>
                    <Box component="fieldset" mb={3} borderColor="transparent">
                        <Typography component="legend">Rate Cast and Crew:</Typography>
                        <Rating
                            name="simple-controlled"
                            value={this.state.newValue}
                            onChange={this.setValue}
                    />
                    </Box>
                    <Box component="fieldset" mb={3} borderColor="transparent">
                        <Typography component="legend">Rate Director:</Typography>
                        <Rating
                            name="simple-controlled"
                            value={this.state.newValue}
                            onChange={this.setValue}
                    />
                    </Box>
                </div>

            );
            }
            else if(!this.props['hasRateActor'] && this.props['hasRateDirector'] )
            {
            return(
                <div>
                
                    <Box component="fieldset" mb={3} borderColor="transparent">
                        <Typography component="legend">Rate Director:</Typography>
                        <Rating
                            name="simple-controlled"
                            value={this.state.newValue}
                            onChange={this.setValue}
                    />
                    </Box>
                </div>

            );
            }
            else if(this.props['hasRateActor'] && !this.props['hasRateDirector'] )
            {
            return(
                <div>
                
                    <Box component="fieldset" mb={3} borderColor="transparent">
                        <Typography component="legend">Rate Cast and Crew:</Typography>
                        <Rating
                            name="simple-controlled"
                            value={this.state.newValue}
                            onChange={this.setValue}
                    />
                    </Box>
                </div>

            );
            }
            else
            {
                return;
            }
        }
        
        else if(this.props['type'] === 'hotel')
        {
            return;
        }
        else
        {
            return;
        }
    }
    render() {
     
        return (
            <div>
            <TextField
            id="outlined-multiline-static"
            label="Review"
            multiline
            rows="6"
            placeholder="Write your review here..."
            variant="outlined"
            />
            <br />
            <Box component="fieldset" mb={3} borderColor="transparent">
                <Typography component="legend">Rate Overall:</Typography>
                <Rating
                    name="simple-controlled"
                    value={this.state.newValue}
                    onChange={this.setValue}
            />
            </Box>
            
            {this.renderRatings()}
            <Button variant="contained" color="primary">
                Submit
            </Button>
            </div>
        );
     
    }
}

export default RatingSystem;