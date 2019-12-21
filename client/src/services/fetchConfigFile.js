import axios from 'axios';

const CONFIG_API_URL = "http://139.179.103.39:8080/";

const fetchMovieSystemConfig = (type) =>
{

    let requestURL = `${CONFIG_API_URL}/${type}`;
    
    return axios({
        method: 'get',
        url: requestURL,
    })
        .then(response => {
            return response.data;
        })
        .catch(err => console.log(err));
}

const fetchHotelSystemConfig = () =>
{

    let requestURL = `${CONFIG_API_URL}/hotel`;
    
    return axios({
        method: 'get',
        url: requestURL,
    })
        .then(response => {
            return response.data;
        })
        .catch(err => console.log(err));
}

const fetchRestaurantSystemConfig = () =>
{

    let requestURL = `${CONFIG_API_URL}/restaurant`;
    
    return axios({
        method: 'get',
        url: requestURL,
    })
        .then(response => {
            return response.data;
        })
        .catch(err => console.log(err));
}
export default {
    fetchMovieSystemConfig: fetchMovieSystemConfig,
    fetchHotelSystemConfig: fetchHotelSystemConfig,
    fetchRestaurantSystemConfig: fetchRestaurantSystemConfig
}