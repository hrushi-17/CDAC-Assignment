import React from 'react';

function Calculator({ num1, num2 }) {
    const getAddtion = (a, b) => {
        return a + b;
    };

    const getSubstration =(a, b)=>{
        return a-b;
    };
    const getMultiplication =(a, b)=>{
        return a*b;
    };
    const getDivision =(a, b)=>{
        return a/b;
    };

    return (
        <div>
            <h2>Calculator</h2>
            <h4>Addition of {num1} and {num2} is: {getAddtion(num1, num2)}</h4>
            <h4>Substration of {num1} and {num2} is: {getSubstration(num1, num2)}</h4>
            <h4>Multiplication of {num1} and {num2} is: {getMultiplication(num1, num2)}</h4>
            <h4>Division of {num1} and {num2} is: {getDivision(num1, num2)}</h4>
        </div>
    );
}

export default Calculator;
