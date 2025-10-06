import { useState } from "react";

// const PasswordGenerator = () => {
//   const [length, setLength] = useState(8); // Default length
//   const [password, setPassword] = useState("");

//   const generatePassword = () => {
//     const charset =
//       "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+~`|}{[]:;?><,./-=";
//     let newPassword = "";
//     for (let i = 0; i < length; i++) {
//       const randomIndex = Math.floor(Math.random() * charset.length);
//       newPassword += charset[randomIndex];
    
//     }
//     setPassword(newPassword);
//   };

//   return (
//     <div>
//       <h2>Random Password Generator</h2>
//       <label>
//         Password Length:
//         <input
//           type="number"
//           value={length}
//           onChange={(e) => setLength(Number(e.target.value))}
//           min="4"
//           max="32"
//         />
//       </label>
//       <button onClick={generatePassword}>Generate Password</button>
//       <p><strong>Generated Password:</strong> {password}</p>
//     </div>
//   );
// };

// export default PasswordGenerator;


const PassGen = () => {

const [lent, setLent] = useState(8);
const [pass, setPass] = useState("");

const genpass = () =>{

    const charspass = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*";
    let pass = "";
    for(let i = 0 ; i< lent; i++ ){

        const randompass = Math.floor(Math.random() * charspass.length);
        pass += charspass[randompass];
    }
    setPass(pass);
};


    return(

        
        
        <>
        <h1>Password Generator</h1>

        <input type="number"
        value={lent}
        onChange={(e) =>  setLent(Number(e.target.value))} />

        <button onClick={genpass}>Gene Pass</button>
        <p > The Pass is{pass}</p>

        </>
    )
}
export  default PassGen;