import React from 'react';

function Calculator({ num1, num2, operation }) {
  const getAddition = (a, b) => a + b;
  const getSubtraction = (a, b) => a - b;
  const getMultiplication = (a, b) => a * b;
  const getDivision = (a, b) => a / b;

  let result;
  let label;

  switch (operation) {
    case 'add':
      result = getAddition(num1, num2);
      label = 'Addition';
      break;
    case 'substract':
      result = getSubtraction(num1, num2);
      label = 'Subtraction';
      break;
    case 'multiply':
      result = getMultiplication(num1, num2);
      label = 'Multiplication';
      break;
    case 'divide':
      result = getDivision(num1, num2);
      label = 'Division';
      break;
    default:
      result = 'Invalid operation';
      label = 'Error';
  }

  return (
    <div>
      <h4>{label} of {num1} and {num2} is: {result}</h4>
    </div>
  );
}

export default Calculator;
