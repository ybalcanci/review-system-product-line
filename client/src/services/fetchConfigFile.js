import axios from 'axios';

const CONFIG_API_URL = "http://139.179.103.162:8080/";

const fetchSystemConfig = (type) =>
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
export default {
    fetchSystemConfig: fetchSystemConfig
}