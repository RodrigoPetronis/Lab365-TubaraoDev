
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
    let feito = e.feito ? "checked" : ""
    
      const elemento = document.createElement("li");
    elemento.innerHTML =
      `<input type="checkbox" ${feito}>
         <span id="spanElemento">${e.nome}</span>
        <button id = "botaoElemento">🗑️</button>`;
    lista.appendChild(elemento);

    //Altera classe para adicionar estilo tachar
    feito === "checked" ? elemento.className = "tarefaConcluida" : elemento.className = "tarefaNaoConcluida"

    //Altera checkbox na lista
    var caixa = elemento.querySelector("input");
    caixa.addEventListener("click", () => {
      feito = caixa.checked ? "checked" : ""
      if (feito === "checked") {
        e.feito = true
      } else {
        e.feito = false;
      }
      mostrarLista()
    })

    elemento.querySelector("button").addEventListener("click", () => {
      let confirma = confirm("Deseja excluir este item?");

      if (confirma) {
        removerDaLista(e)
        lista.removeChild(elemento)
      }
    })
  })

  //contador
  const contador = document.querySelector("#contador");
  const qntTarefas = (listaAtualizada.length)
  contador.innerHTML = qntTarefas

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



