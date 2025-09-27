const http = require('http');
const url = require('url');

const server = http.createServer((req, res) => {

    const queryObject = url.parse(req.url, true).query;
    const fName = queryObject.fName || 'Chinmay';
    const lName = queryObject.lName || 'Hrushi';

    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.end(`<html><body><h1>Hello ${fName}</h1><h2>${lName}</h2></body></html>`);
});

server.listen(443, () => {
    console.log
        ('Server Running at http://localhost:443')
});

//https: 80, http:443

