import React, {Component} from 'react';
import { Link} from "react-router-dom";

export default class Home extends Component {
    render() {
        return <div>
            <Link to="/signUp">
                <button>sign Up</button>
            </Link>
            <Link to="/signIn">
                <button>sign In</button>
            </Link>
        </div>
    }
}

