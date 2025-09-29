import React, { useState } from 'react';

function Calculator() {
  const [num1, setNum1] = useState(null);
  const [num2, setNum2] = useState(null);
  const [operation, setOperation] = useState(''); 

  const sum = num1 + num2;
  const sub = num1 - num2;
  const mul = num1 * num2;
  const div = num1 / num2;

  return (
    <div class="App">
      <h2>Calculator</h2>

      <input
        type="number"
        value={num1}
        onChange={(e) => setNum1(Number(e.target.value))}
        placeholder="Enter first number"
      />

      <input
        type="number"
        value={num2}
        onChange={(e) => setNum2(Number(e.target.value))}
        placeholder="Enter second number"
      />
      <br></br>
      <button onClick={() => setOperation('add')}>Add</button>
      <button onClick={() => setOperation('sub')}>Sub</button>
      <button onClick={() => setOperation('mul')}>Multi</button>
      <button onClick={() => setOperation('div')}>Div</button>

      {operation === 'add' && <p>Addition of {num1} and {num2} is: {sum}</p>}
      {operation === 'sub' && <p>Subtraction of {num1} and {num2} is: {sub}</p>}
      {operation === 'mul' && <p>Multiplication of {num1} and {num2} is: {mul}</p>}
      {operation === 'div' && <p>Division of {num1} and {num2} is: {div}</p>}
    </div>
  );
}

export default Calculator;
