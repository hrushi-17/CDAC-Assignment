import { useState } from "react";

function TableCounter(){

    let [count , setCount] = useState(0);
    // const [message , setMessage] = useState('');

    function Increment(){
        if(count < 10){
            count += 1
            setCount(count);
        }
        else{
            console.log("Its to HIGH!!");
            
        }
        
    }

    function Decrement(){
        if(count > 0){
            count -= 1
            setCount(count);
        }
        else{
            console.log("Its almost 0");
        }
    
    }
   

    return(
        <>

            <button onClick={Increment}>Increment ++ </button>
            <button onClick={Decrement}>Decrement --</button>
            <h1>Count Table - {count}</h1>
                <table>
                    <thead>
                        <tr>
                            <th>Table Counter</th>
                        </tr>
                    </thead>
                    <tbody>
                    {Array.from({ length: count }, (_, index) => (
                        <tr key={index}>
                            <td>Row {index + 1}</td>
                        </tr>
                    ))}
                </tbody>
                </table>                
        </>
    )
}
export default TableCounter;