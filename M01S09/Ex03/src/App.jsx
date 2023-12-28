
import { useState } from "react";
import "./App.css";
import { useEffect } from "react";

function App() {
const [contador, setContador]=useState(0);
const desmontar = ()=>{setContador(0)
alert("Componente Desmontado")
}

useEffect(()=>{
  if(contador === 1){
    console.log("Componente Montado")
  }
},[contador])

  return (
    <>
    <h2>Contador com uso do useEffect</h2>
    <p>Contador = {contador}</p>
    <button
    onClick={()=> setContador((contador)=> contador +1)}
    >
      Adicionar
    </button>
    <button
    onClick={desmontar}
    >Limpeza</button>
    
    </>
  );
}

export default App;
