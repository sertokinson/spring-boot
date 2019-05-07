const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
    entry: [
        'webpack-dev-server/client/?http://localhost:8080',
        __dirname + '/src/js/Home.js'
    ],
    output: {
        path: __dirname + '/dist/',
        filename: 'app.js'
    },
    devtool: '#sourcemap',
    module: {
        loaders: [
            { test: /\.css$/, loader: 'style-loader!css-loader' },
            {
                test: /\.jsx?$/,
                exclude: /(node_modules)/,
                loaders: ['react-hot-loader/webpack', 'babel-loader?presets[]=react']
            }
        ]
    },
    plugins: [
        new HtmlWebpackPlugin({
            title: 'My App',
            template: __dirname + '/index.html'
        })
    ]
};