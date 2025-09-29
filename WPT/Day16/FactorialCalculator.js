import React, { useState } from 'react';

function FactorialCalculator() {
  const [number, setNumber] = useState(null);
  const [factorial, setFactorial] = useState(1);

  const calculateFactorial = (num) => {
    if (num < 0) return 0;
    let result = 1;
    for (let i = 2; i <= num; i++) {
      result *= i;
    }
    return result;
  };

  const handleChange = (e) => {
    const value = parseInt(e.target.value, 10);
    setNumber(value);
    console.log(setNumber(value));
    setFactorial(calculateFactorial(value));
  };

  return (
    <div class="App">
      <h2>Factorial Calculator</h2>
      <input type="number" value={number} onChange={handleChange}
      />
      <p>Factorial of {number} is: {factorial}</p>
    </div>
  );
}

export default FactorialCalculator;
