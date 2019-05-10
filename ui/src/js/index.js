import React from 'react';
import ReactDOM from 'react-dom';
import {BrowserRouter, Route, Switch} from "react-router-dom";
import App from "./components/App";
import Home from "./components/Home";
import SignIn from "./components/SignIn";
import SignUp from "./components/SignUp";

ReactDOM.render((
    <BrowserRouter>
        <App>
            <Switch>
                <Route exact path="/" component={Home}/>
                <Route exact path="/signIn" component={SignIn}/>
                <Route exact path="/signUp" component={SignUp}/>
            </Switch>
        </App>
    </BrowserRouter>
), document.getElementById('content'));