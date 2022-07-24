import React, { Component } from "react";
import "./App.css";

class App extends Component {
  state = {};

  quotes = () => {
    fetch("/api/quotes")
      .then((response) => response.text())
      .then((message) => {
        this.setState({ message: message });
      });
  };

  getRandomQuote = () => {
    this.quotes();
  };

  render() {
    const handleSubmit = () => {
      this.getRandomQuote();
    };

    return (
      <div className="App">
        <header className="App-title">Inspirational Thought Machine</header>
        <h3 className="quote-display">{this.state.message}</h3>

        <button onClick={handleSubmit}>Click</button>
      </div>
    );
  }
}

export default App;
