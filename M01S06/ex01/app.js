
const inputAdicionar = document.querySelector("#inputAdicionar");
const botaoAdicionar = document.querySelector("#adicionar");
const listaTarefa = [];

const lista = document.querySelector("#lista")
let listaAtualizada = listaTarefa;

function limparLista() {
  listaAtualizada = [];
}


function mostrarLista() {

  listaAtualizada.forEach((e) => {
    const feito = e.feito ? "checked" : ""

    const elemento = document.createElement("li");
    elemento.innerHTML =
      `<input type="checkbox" ${feito}>
         <span id="spanElemento">${e.nome}</span>
        <button id = "botaoElemento">X</button>`;
    lista.appendChild(elemento);
    feito ? elemento.className = "tarefaConcluida" : "elemento"


    elemento.querySelector("button").addEventListener("click", () => {
      elemento.remove();
      listaAtualizada = listaTarefa.filter(tarefa => tarefa !== e);
    });


  })
}



const adicionaLista = botaoAdicionar.addEventListener("click", () => {

  if (inputAdicionar.value) {
    const novaTarefa = {
      nome: inputAdicionar.value,
      feito: false,
    }

    listaTarefa.push(novaTarefa);
    lista.innerHTML = "";

    inputAdicionar.value = "";
    inputAdicionar.focus();
    mostrarLista();
  } else {
    alert("Digite uma Tarefa!")
  }

})

