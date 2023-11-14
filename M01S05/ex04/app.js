const inputAdicionar = document.querySelector("#inputAdicionar");
const botaoAdicionar = document.querySelector("#adicionar");
const listaTarefas = ["primeiroItem"];


//botaoAdicionar.addEventListener("click", ()=>{
  // listaTarefas.push(inputAdicionar.value);
    listaTarefas.forEach((e) => {        
        const elemento = document.createElement("li");
        elemento.innerHTML =
        `<input type="checkbox">
         <span>${e}</span>
        <button>X</button>`;
        listaTarefas.append(elemento);
    });
    
//})
