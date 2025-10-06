import { useCallback, useEffect, useState } from "react";

function PasswordGenerator1(){
    
    const [Password, setPassword] = useState('');
    const [length, setLength] = useState(10);
    const [includeNumbers, setIncludeNumbers] = useState(false);
    const [includeSymbols, setIncludeSymbols] = useState(false);

    const generatePassword = () =>{

        let characters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ';
        if(includeNumbers) characters+= '0123456789';
        if(includeSymbols) characters+= '!@#$%^&*()_+';


        let newPassword = '';

        for(let i=0;i<length;i++){
            newPassword+= characters.charAt(
                Math.floor(Math.random() * characters.length));
        }
        setPassword (newPassword);

    };

    useEffect(() => { generatePassword()}
                    ,[length , includeNumbers , includeSymbols])

    useCallback(() => { generatePassword()}
                    , [length , includeNumbers , includeSymbols])


    const copyToClipboard = () => {
        navigator.clipboard.writeText(Password);
        alert("Copied to Clipboard")
    }

    
    return(
        <>
            <h1>Automatic Password Generator</h1>
            <div>
                <label >Pasword Length: </label>
                <input type="Number"
                        value={length}
                        onChange={(e) => setLength(parseInt(e.target.value))} 
                        min="4"
                        max="32"/>

            </div>
            <div>
                <label>
                <input type="checkbox"
                        value={includeNumbers}
                        onChange={() => setIncludeNumbers(!includeNumbers)} />
                        IncludeNumbers
                </label>
            </div>
            <div>
                <label>

                    <input type="checkbox"
                            value={includeSymbols}
                            onChange={()=>setIncludeSymbols(!includeSymbols)}/>
                            IncludeSymbols
                </label>
            </div>
            <div>
                <button onClick={generatePassword}>Generate</button>
            </div>
            <div>
                <input type="text" 
                        value={Password} readOnly/>
                <button onClick={copyToClipboard}> Copy</button>
            </div>
        </>
    )
}
export default PasswordGenerator1;