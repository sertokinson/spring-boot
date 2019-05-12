import React, {Component} from 'react';

export default class SignUp extends Component{
    render(){
        return(
            <div className='div signUp form'>
            <h2>Регистрация</h2>
                <p>Имя: <input className='input'/></p>
                <p>День рождения: <input className='input'/></p>
                <p>Пароль: <input className='input'/></p>
                <button>Зарегистрироваться</button>
            </div>
        )
    }
}