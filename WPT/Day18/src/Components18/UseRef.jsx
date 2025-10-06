import { useEffect, useRef, useState } from "react";


 export default function UseRef(){

let x = useRef();
let y = useRef();
let z = 100;

let [s1 , setS1] = useState("");
useEffect(()=>{
    x.current = 100;
} , []);


return(
    <div>

    <input type="text"
        onChange={(e)=>{
            x.current++
            z++
            setS1(e.target.value)
        }
        } 
        />
        <p>
        x = {x.current}
        z = {z}
        </p>

        <input type="text" ref= {y}  onChange={()=>{console.log("Here: ", y.current.value)}}/>
        <p>The value of input tag: {y.current?.value}</p>
        

    </div>
)
}