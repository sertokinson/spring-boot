import React, {Component} from 'react';

export default class SignIn extends Component{
    render(){
        return(
            <form method="post">
                <h2>Вход</h2>
                <p><input/></p>
                <p><input/></p>
                <label >
                    <input />Запомнить меня</label>
                <button>Войти</button>
            </form>
        )
    }
}