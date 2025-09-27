const exp = require('express');
const user = require('./MOCK_DATA.json');
const f = exp();
const port = 8000;

f.use(exp.json());


f.get('/', (req, res) => {

    res.send("This is Express API")

});
f.get('/user', (req, res) => {

    res.json(user);

});

f.get('/user/:id/', (req, res) => {

    const num = Number(req.params.id);

    const u = user.find((obj) => {

        if (obj.id === num) {
            res.json(obj)
        }


    });


    // res.json(u)
})

f.get('/user/name/:first_name/', (req, res) => {

    const name = req.params.first_name;

    user.find((name1) => {

        if (name1.first_name === name) {
            res.json(name1);
        }
    });
})

f.post('/user', (req, res) => {
    const newUser = req.body;

    // You can add validation here
    if (!newUser || !newUser.id || !newUser.first_name) {
        return res.status(400).send("Invalid user data");
    }

    // In real apps, you'd push to a database
    user.push(newUser);

    res.status(201).json({
        message: "User added successfully",
        user: newUser
    });
});

f.delete('/user/:id', (req, res) => {
    const idToDelete = Number(req.params.id);

    const index = user.findIndex(obj => obj.id === idToDelete);

    if (index === -1) {
        return res.status(404).send("User not found");
    }

    const deletedUser = user.splice(index, 1);

    res.status(200).json({
        message: "User deleted successfully",
        user: deletedUser[0]
    });
});


f.listen((port), console.log("Server is runnning at http://localhost:8000"));

