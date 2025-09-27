function fetchingData(callback){
    console.log("Data is: ");
    let a = parseInt(process.argv[2]);
    let b = parseInt(process.argv[3]);
    console.log(process.argv);
    
    for(let i=1;i<=b;i++){
        let c = i*a;
        console.log(`${a} * ${i} = `+c);
    }
    
}
fetchingData();