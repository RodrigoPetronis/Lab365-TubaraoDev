
import { useState } from "react";
import "./App.css";

function App() {
  const [inputValue, setInputValue]=useState("")

  return (
    <>
    <h2>Componente criado para mostrar estado do input</h2>
    <input 
    type="text"
    placeholder="Digite..."
    onChange={(e)=>setInputValue(e.target.value)} />
     <p>{inputValue}</p>
    </>
  );
}

export default App;
