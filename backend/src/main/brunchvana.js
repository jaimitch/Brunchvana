const express = require('express');
const bodyParser = require('body-parser');
const session = require('express-session');
const cookieParser = require('cookie-parser');

const application = express();


application.use(session({
    secret: 'membersonly',
    resave: false,
    saveUninitialized: true;
}));

application.use(express.static('public'));
application.use(bodyParser.urlencoded());
application.use(cookieParser());

var user;
var users = [
    {username: "jaimitch", password: "WheresTheWhiskey"}
];

application.use(function(request, response, next) {
    if (request.session.isAuthenticated === undefined) {
        request.session.isAuthenticated = false;
    }
    next();
});

application.get('/', (request, response) => {
    if(request.session.isAuthenticated === false) {
    response.redirect('/login');
    }

    else {
        response.render('dashboard');
    }
});

application.post('/login', (request, response) => {
    var username = request.body.username;
    var password = request.body.password;
    var existingUser = users.find(function(q) {
        return q.username === username && q.password === password;
    });

    if(existingUser) {
        request.session.isAuthenticated = true;
        request.session.username = existingUser.username;
        response.redirect('/');
    }
    else {
        response.render('login');
    }
});