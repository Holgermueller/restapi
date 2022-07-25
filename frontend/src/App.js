import { useState } from "react";
import "./App.css";

function App() {
  const [singleQuote, setSingleQuote] = useState();

  const getQuotes = () => {
    fetch("/api/quotes")
      .then((response) => response.text())
      .then((quote) => {
        setSingleQuote(quote);
        console.log(quote.split());
      })
      .catch((err) => console.log(err));
  };

  return (
    <div className="App">
      <header className="App-title">Inspirational Thought Machine</header>
      <h3 className="quote-display">{singleQuote}</h3>

      <h5>-{singleQuote}</h5>

      <button onClick={() => getQuotes()}>Click</button>
    </div>
  );
}

export default App;
