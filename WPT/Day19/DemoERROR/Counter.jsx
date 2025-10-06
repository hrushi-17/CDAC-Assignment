import { useState } from "react";
import Counter1 from "./Counter1";
import Counter2 from "./Counter2";
import ErrorBoundary from "./ErrorBoundry";


function Counter(){

    let[count1, setCouter1] =useState(1);
    let[count2, setCouter2] = useState(10);

    const increament1 = () =>{
        setCouter1(count1+=1);
        console.log(count1);
    }
    const increament2 = () =>{
        setCouter2(count2+=1);
        console.log(count2);
    }

    return(

        <>
            <h1>Counter</h1>
            <div>
                 {/* <h1>Counter 1</h1>
                <input type="number"
                    value={count1}
                    onChange={(e)=>setCouter1(parseInt(e.target.value))}/>
                <button onClick={increament1}>click</button> */}
                <ErrorBoundary>
                <Counter1 value={count1}
                onClick={increament1}
                ></Counter1>
            </ErrorBoundary>
            </div>
             <div>
                 {/* <h1>Counter 2</h1>
                <input type="number"
                    value={count2}
                    onChange={(e)=>setCouter2(parseInt(e.target.value))}/>
                <button onClick={increament2}>click</button> */}
                <Counter2 value={count2}
                onClick={increament2}></Counter2>
             </div>
            
        </>
    )
}

export default Counter;