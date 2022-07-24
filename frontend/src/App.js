import { useState, useEffect } from "react";
import "./App.css";

function App() {
  const [quotes, setQuotes] = useState();
  const [singleQuote, setSingleQuote] = useState();

  useEffect(() => {
    fetch("/api/quotes")
      .then((response) => response.text())
      .then((message) => {
        setQuotes(message);
      })
      .catch((err) => console.log(err));
  });

  return (
    <div className="App">
      <header className="App-title">Inspirational Thought Machine</header>
      <h3 className="quote-display">{singleQuote}</h3>

      <button onClick={() => setSingleQuote(quotes)}>Click</button>
    </div>
  );
}

export default App;
