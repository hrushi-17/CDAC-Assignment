import React from 'react';

function Welcome() {
  return <h2>Welcome to React!</h2>;
}

function Info() {
  return <p>This is a React Function Component.</p>;
}

function Footer() {
  return <footer>© 2025 React</footer>;
}

function MultipleFunction() {
  return (
    <div class="App">
      <Welcome />
      <Info />
      <Footer />
    </div>
  );
}

export default MultipleFunction;
