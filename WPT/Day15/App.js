import './App.css';
import Factorial from './Factorial';
import Calculator from './Calculator';
import Calculator1 from './Calculator1';

function App() {
  return (
    <div className="App">
      <div class="Fact"><Factorial number={5} /></div>
      <Calculator num1={5} num2={10} />
      <h2>Calculator</h2>
      <Calculator1 num1={40} num2={10} operation="add"/>
      <Calculator1 num1={40} num2={10} operation="substract"/>
      <Calculator1 num1={40} num2={10} operation="multiply"/>
      <Calculator1 num1={40} num2={10} operation="divide"/>
    </div>
  );
}

export default App;
