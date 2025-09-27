import React, { Component } from 'react';

class TextTransformer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      inputText: ''
    };
  }

  handleChange = (event) => {
    this.setState({ inputText: event.target.value });
  };

  handleUpperCase = () => {
    console.log(this.state.inputText.toUpperCase());
  };

  handleLowerCase = () => {
    console.log(this.state.inputText.toLowerCase());
  };

  render() {
    return (
      <div class="App">
        <h2>Text Transformer</h2>
        <input
          type="text"
          value={this.state.inputText}
          onChange={this.handleChange}
          placeholder="Enter text here"
        />
        <br /><br />
        <button onClick={this.handleUpperCase}>Upper Case</button>
        <button onClick={this.handleLowerCase}>Lower Case</button>
      </div>
    );
  }
}

export default TextTransformer;
