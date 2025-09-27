const express = require('express');
const exp = express();
const port = 8080;
const p = require('path');
const file = require('./data.json');
// const f = require('fs');

exp.use(express.json());
// exp.use(express.static('public'));

exp.use(express.urlencoded({extented: false}));  //used to add specific post types 

exp.get('/' , (req , res )=>{

    res.send("This is HrushiMunde Server !!");

});


exp.get('/data', (req , res) =>{

    res.json(file);
});

exp.get('/data/:id', (req , res) =>{

    const pnum = Number(req.params.id);
    const fnum = file.find((obj)=> obj.id === pnum);
        if(fnum)
        {
            res.json(fnum);
        }
        else {

            res.status(404).json({error: 'User not Found'})

        }
});

// exp.post('/data/', (req ,res) => {
    
//     const newData = req.body;
//     file.push(newData);
//     res.json(
//          {message: "User added successfully",
//         addedData :newData});
    

// });

exp.get('/aboutus', (req, res) => {
    // res.sendFile('./aboutus.html');
    const t = p.join(__dirname ,'./aboutus.html');
    console.log(t);
    res.sendFile(t);
});


exp.post('/data/', (req, res) =>{
    const newData = req.body;
    file.push( {id:file.length +1, ...newData});
    res.json({message: "User added successfully",
                addedData :newData});
    
});
exp.delete('/data/:id' , (req,res)=>{

    const idtodelete = Number(req.params.id);
    const index = file.findIndex(obj => obj.id === idtodelete);

    const deleteid = file.splice(index , 1);
    res.json({message:"User Deleted Sucessfully" , User: deleteid[0]});

});

exp.put('/data/:id/' , (req, res) =>{
   
    const idtoupdate = Number(req.params.id);
    const newData = req.body;
    const index = file.findIndex(obj => obj.id === idtoupdate)

    file[index] = { ...file[index] , ...newData};
    res.json({ Valueupdated: "User Updated Sucessfully!" , User:file[index] });

});
exp.listen(port , console.log("Server is Running http://localhost:8080"));
