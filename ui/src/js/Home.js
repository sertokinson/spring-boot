class Home extends React.Component {
    render() {
        return (
            <form>
                <button>sign Up</button>
                <button>sign In</button>
            </form>
        )
    }
}
ReactDOM.render(<Home/>,document.getElementById('content'));