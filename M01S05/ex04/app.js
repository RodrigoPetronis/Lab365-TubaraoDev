const inputAdicionar = document.querySelector("#inputAdicionar");
const botaoAdicionar = document.querySelector("#adicionar");
const listaTarefas = ["primeiroItem"];
const lista = document.querySelector("#lista")


botaoAdicionar.addEventListener("click", () => {

  const novaTarefa = inputAdicionar.value;
  listaTarefas.push(novaTarefa);
  console.log(listaTarefas)
  lista.innerHTML = "";

  listaTarefas.forEach((e) => {

    const elemento = document.createElement("li");
    elemento.innerHTML =
      `<input type="checkbox">
         <span id="spanElemento">${e}</span>
        <button>X</button>`;
    lista.appendChild(elemento);
    elemento.className = "elemento"
  });
  inputAdicionar.value = "";
  inputAdicionar.focus();

})

