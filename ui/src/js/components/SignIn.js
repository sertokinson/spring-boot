import React, {Component} from 'react';
import {constants} from "../constants";
import {get} from "../actions/actions";

export default class SignIn extends Component {
    constructor(props) {
        super(props);
        this.state = {
            login: '',
            password: ''
        }
    }

    componentWillMount() {
        get('/signIn').then(data => this.setState({authenticated: data.authenticated}));
    }

    render() {
        const {login, password} = this.state;
        return (
            <div className='div form login'>
                <h2>Вход</h2>
                <p>Логин:
                    <input
                        value={login}
                        onChange={event => this.setState({login: event.target.value})}
                        className='input'/>
                </p>
                <p>Пароль:
                    <input
                        value={password}
                        onChange={event => this.setState({password: event.target.value})}
                        className='input'/>
                </p>
                <input type='checkbox'/>Запомнить меня
                <button onClick={() => {
                    let form = new FormData();
                    form.set('username', login);
                    form.set('password', password);
                    fetch(new Request(constants.url + '/signIn', {
                        method: 'POST',
                        body:form,
                        headers:{
                            token:{
                                "X-AUTH-TOKEN" : "token"
                            }
                        }
                       /* body: JSON.stringify({name:login,password:password}),
                        headers:{
                            "Content-Type": "application/json"
                        }*/
                    })).then(
                        (response) => response.json().then(data => this.setState({authenticated: data.authenticated}))
                    )
                }}>Войти</button>
            </div>
        )
    }
};