import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import MultipleFunction from './MultipleFunction';
import TextTransformer from './TextTransformer';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <>
     <App />
     <MultipleFunction />
     <TextTransformer/>
  </>
);

reportWebVitals();
