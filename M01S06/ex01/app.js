
const inputAdicionar = document.querySelector("#inputAdicionar");
const botaoAdicionar = document.querySelector("#adicionar");
const listaTarefa = [];

var lista = document.querySelector("#lista")
var listaAtualizada = listaTarefa

inputAdicionar.value = "";
inputAdicionar.focus();


function mostrarLista() {
  lista.innerHTML = "";

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
      removerDaLista(e)
      lista.removeChild(elemento)
    })

  })
}



const adicionaLista = botaoAdicionar.addEventListener("click", () => {

  if (inputAdicionar.value) {
    const novaTarefa = {
      nome: inputAdicionar.value,
      feito: false,
    }

    listaAtualizada.push(novaTarefa);
    mostrarLista();

    inputAdicionar.value = "";
    inputAdicionar.focus();
  } else {
    alert("Digite uma Tarefa!")
  }

})

function removerDaLista(e) {
  listaAtualizada = listaAtualizada.filter((elFilter) => {
    return e !== elFilter
  })

};

