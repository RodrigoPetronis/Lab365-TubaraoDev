const inputAdicionar = document.querySelector("#inputAdicionar");
const botaoAdicionar = document.querySelector("#adicionar");
const listaTarefa = [{
  nome: "teste",
  feito: true,
}];
const lista = document.querySelector("#lista")

function mostrarLista() {
  listaTarefa.forEach((e) => {
    const feito = e.feito ? "checked" : ""

    const elemento = document.createElement("li");
    elemento.innerHTML =
      `<input type="checkbox" ${feito}>
         <span id="spanElemento">${e.nome}</span>
        <button>X</button>`;
    lista.appendChild(elemento);
    feito ? elemento.className = "tarefaConcluida" : "elemento"

  });
}

mostrarLista();

botaoAdicionar.addEventListener("click", () => {

  if (inputAdicionar.value) {
    const novaTarefa = {
      nome: inputAdicionar.value,
      feito: false,
    }

    listaTarefa.push(novaTarefa);
    console.log(listaTarefa)
    lista.innerHTML = "";

    inputAdicionar.value = "";
    inputAdicionar.focus();
  } else {
    alert("Digite uma Tarefa!")
  }

  mostrarLista();
})

