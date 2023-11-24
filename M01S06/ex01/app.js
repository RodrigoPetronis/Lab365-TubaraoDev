
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
        <button id = "botaoElemento" class = "tarefaNaoConcluida">🗑️</button>`;
    lista.appendChild(elemento);

    //Tachar item feito
    let caixa = elemento.querySelector("input");
    caixa.addEventListener("click", () => {
      var checado = caixa.checked ? "checked" : ""
      checado === "checked" ? elemento.className = "tarefaConcluida": elemento.className = "tarefaNaoConcluida"
    })

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

