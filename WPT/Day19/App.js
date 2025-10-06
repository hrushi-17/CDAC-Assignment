
import './App.css';
import Counter from './DemoERROR/Counter';
import ErrorBoundary from './DemoERROR/ErrorBoundry';
import PasswordGenerator from './PasswordGenerator/password';
import PasswordGenerator1 from './PasswordGenerator/password1';


function App() {
  return (
    <div className="App">
    {/* <ErrorBoundary>
    <Counter/>
    </ErrorBoundary> */}
   
    {/* <PasswordGenerator/> */}
    {/* <PasswordGenerator1/> */}
    {/* <Counter/> */}
    <ErrorBoundary>
      <Counter></Counter>
    </ErrorBoundary>


    </div>
  );
}

export default App;
