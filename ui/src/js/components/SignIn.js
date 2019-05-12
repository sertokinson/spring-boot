import React, {Component} from 'react';
import {constants} from "../constants";

export default class SignIn extends Component {
    render() {
        return (
            <div className='div form login'>
                <h2>Вход</h2>
                <p>Логин: <input className='input'/></p>
                <p>Пароль: <input className='input'/></p>
                <input type='checkbox'/>Запомнить меня
                <button onClick={() => {
                    fetch(new Request(constants.url + '/signIn', {method: 'GET', mode: 'no-cors'})).then(
                        (response) => console.log('singIn!!!', response)
                    )
                }}>Войти</button>
            </div>
        )
    }
};