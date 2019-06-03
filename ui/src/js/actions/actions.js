import {constants} from "../constants";

export function get(url) {
    return new Promise((resolve, reject) => {
        fetch(new Request(constants.url + url, {
            method: 'GET',
            mode:'cors'
        })).then((response) => {
            if (response.status !== 200) {
                reject('Looks like there was a problem. Status Code: ' + response.status);
                return;
            }
            resolve(response.json());
        }).catch((err) => reject('Fetch Error :-S', err))
    })
}

export function post(url) {
    return new Promise((resolve) => {
        resolve(fetch(new Request(constants.url + url, {
            method: 'GET'
        })).then((response) => response.json()))
    })
}