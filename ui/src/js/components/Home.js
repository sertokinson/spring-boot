import React, {Component} from 'react';
import {Link} from "react-router-dom";

export default class Home extends Component {
    render() {
        return <div className='div form home'>
            <Link to='/signUp'>
                <button>Зарегистрироваться</button>
            </Link>
            <Link to='/signIn'>
                <button>Войти</button>
            </Link>
        </div>
    }
}

