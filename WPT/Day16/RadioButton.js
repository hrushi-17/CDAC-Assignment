import React from "react"
import { useState } from "react"

export default function RadioButton()
{


    let [uservalue, setValue]=useState("")
    let [uppercasevalue, setUppercase]=useState("")
    let [lowercasevalue, setLowercase]=useState("")
    let [titlvalue, setTitlecase]=useState("")


    function update(e)
    {
        setValue(uservalue=e.target.value)
        
    }

    function uppercase(e)
    {
        var upper=uservalue
        setUppercase(uppercasevalue=upper.toUpperCase());
        console.log(uppercasevalue)
    }

     function lowercase(e)
    {
        var lower=uservalue
        setLowercase(lowercasevalue=lower.toLowerCase());
        console.log(lowercasevalue)
    }

     function title(e)
    {
        
        setTitlecase(titlvalue=uservalue);
        console.log(titlvalue)

    }



    return(<>
        <div className="App">
            <input type="text" placeholder="Enter your text" onChange={update}/>
            <div className="radio-button">
                <input type="radio" name="textCase" value="UpperCase" onClick={uppercase}/> Upper Case
                <input type="radio" name="textCase" value="LowerCase" onClick={lowercase}/> Lower Case
                <input type="radio" name="textCase" value="TitleCase" onClick={title}/> Title Case<br/>
            </div>
            Value is {uservalue}<br/>
            UpperCase is {<h2>{uppercasevalue}</h2>}<br/>
            LowerCase is {<h2>{lowercasevalue}</h2>}
            LowerCase is {<h2>{titlvalue}</h2>}<br/>
        </div>
    </>)
}