function file()
{
    let f=require('fs');
    //f.open('data.txt');

    setTimeout(()=>{
        
    f.writeFile('data.txt',"hello this data After the asyn function call", (err,value)=>{
            if(err)
            {
                console.log(err);
            }else{
                console.log(value)
            }
    });

     f.readFile("data.txt",'utf8', (err,value)=>{
        if(err)
        {
            console.log(err);
        }else{
            console.log(value)
        }
    })


},2000)
    
    f.readFile("data.txt",'utf8', (err,value)=>{
        if(err)
        {
            console.log(err);
        }else{
            console.log(value)
        }
    })
}

file()