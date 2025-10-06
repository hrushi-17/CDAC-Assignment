// import { useState } from "react";

import { useState } from "react";

// function Counter(){
//      let [count , setCount] = useState(0);
//     function Increment(){
//         if(count <=10){
//             setCount (count += 1)
//         }
//         else {
//             console.log("Stop")
//         }
//     }
//     function Decrement(){
//         if(count > 0){
//             setCount (count -= 1)
//         }
//         else{
//             console.log("Bss krde")
//         }
//     }

//     return(
//         <>
//         <h2>Count = {count}</h2>
//         <button onClick={Increment}>Increase++</button>
//         <button onClick={Decrement}>Decrease++</button>

//         </>
//     )
// }

// export default Counter;

// function Counter(){

//     let [count, setCount] = useState(0);
//     let [message, setMessage] = useState();

//     function Increament(){
//         if(count<=10){
//             setCount(count+=1);
//         }
//         else{
//             // console.log("jast pudhe pudh karyach savay aahe ka");
//             setMessage("jast pudhe pudh karyach savay aahe ka");
//         }
//     }

//     function Decreament(){
//         if(count>0){
//             setCount(count-=1);
//         }
//         else{
//             // console.log("bass itka mage padu nakos");
//             setMessage("bass itka mage padu nakos");
//         }
//     }
//     return(
//         <>
//             <h1>counter= {count}</h1>
//             <button onClick={Increament}>Increament</button>
//             <button onClick={Decreament}>Decreament</button>
//             <p id="result">{message}</p>
//         </>
//     )
// }
// export default Counter;

function Counter(){

    let [count, setCount] = useState(0);
    const [message, setMessage] = useState('');
    
    function Increment(){
        
        if(count < 10){
            
            count +=1;
            setCount (count);
        }
        else{
            console.log("Stop");
            setMessage("Stop!!");
            
        }
        
    }
    function Decrement(){
        
        if(count > 0){

            count -= 1;
            setCount(count);

        }
        else{
            console.log("less value");
            setMessage("less value");
        }

    }
    
    return (
        <>
        
        <h2>Counter Value = {count}</h2>
        <button onClick={Increment}>Increment++</button>
        <button onClick={Decrement}>Decrement++</button>
        <p>{message}</p>
        </>
    )

}
export default Counter;

