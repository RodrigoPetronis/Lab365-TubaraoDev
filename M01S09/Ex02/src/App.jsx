
import { useState, useRef, useEffect } from "react";
import "./App.css";

function App() {
  const [inputNumber, setInputNumber] = useState(0);
  const referencia = useRef(inputNumber);

  useEffect(() => {
    referencia.current = inputNumber;
  }, [inputNumber]);

  return (
    <>
    <h2>Exercício 02 com Uso de UseRef()</h2>
      <input
        type="text"
        value={inputNumber}
        onChange={(e) => setInputNumber(e.target.value)}
      />

      <button
        onClick={() => alert(referencia.current)}
      >
        Mostrar Alerta
      </button>
    </>
  );
}

export default App;