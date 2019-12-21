import axios from 'axios';

const CONFIG_API_URL = "http://139.179.103.39:8080/";

const fetchMovieSystemConfig = () =>
{

    let requestURL = `${CONFIG_API_URL}/movie`;
    
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
    fetchMovieSystemConfig: fetchMovieSystemConfig
}