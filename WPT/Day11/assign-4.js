(()=>{
    console.log("foo-bar: ");
    console.log(process.argv);
    let a = parseInt(process.argv[2]);
    for (let i = 1; i <= a; i++) {
    if (i % 3 === 0 && i % 5 === 0) {
        console.log(`${i} is divisible by both 3 and 5 so foobar`);
    } else if (i % 3 === 0) {
        console.log(`${i} is divisible by 3 so foo`);
    } else if (i % 5 === 0) {
        console.log(`${i} is divisible by 5 so bar`);
    } else {
        console.log(i);
    }
    }
})
();


