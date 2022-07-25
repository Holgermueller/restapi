import { useState } from "react";
import "./App.css";

function App() {
  const [singleQuote, setSingleQuote] = useState([]);

  async function getQuotes() {
    const response = await fetch("/api/quotes");
    const body = await response.json();
    setSingleQuote(body);
  }

  return (
    <div className="App">
      <header className="App-title">Inspirational Thought Machine</header>

      <div className="quote-display">
        <h3 className="quote">{JSON.stringify(singleQuote.theQuote)}</h3>
        <h4 className="speaker">{JSON.stringify(singleQuote.speaker)}</h4>
      </div>

      <button onClick={() => getQuotes()}>Get Quote</button>
    </div>
  );
}

export default App;
