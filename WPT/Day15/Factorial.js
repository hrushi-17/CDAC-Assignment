import React from 'react';

function Factorial({ number }) {
  const getFactorial = (n) => {
    if (n < 0) return 'Invalid';
    return n === 0 ? 1 : n * getFactorial(n - 1);
  };

  return (
    <div>
      <h2>Factorial</h2>
      <h4>Factorial of {number} is: {getFactorial(number)}</h4>
    </div>
  );
}

export default Factorial;
