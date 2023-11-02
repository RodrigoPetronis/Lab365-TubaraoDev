/*Em um arquivo HTML (index.html) inclua um arquivo JavaScript (app.js) e desenvolva a aplicação a 
seguir.

Vamos calcular a média de notas de 3 avaliações.

Utilizando window.prompt() e window.alert():

Pergunte com prompt a nota da primeira avaliação
Converta a string informada em number
Pergunte com prompt a nota da segunda avaliação
Converta a string informada em number
Pergunte com prompt a nota da terceira avaliação
Converta a string informada em number
Calcule a média das 3 notas considerando mesmo peso para todas
Exemplo: media = (nota1 + nota2 + nota3) / 3;
Exiba com alert a média final após o cálculo.
Extra: Experimente substituir prompt e alert por elementos HTML (ex. <input>, <button> e <p>), pegar os valores pelos inputs e exibir no site com um parágrafo. Similar à imagem em anexo.


const n1 = Number(prompt("Qual a primeira nota?"))
const n2 = Number(prompt("Qual a segunda nota?"))
const n3 = Number(prompt("Qual a terceira nota?"))
const media = (n1 + n2 + n3) / 3;

alert(`A média do aluno foi ${media}`)
*/
var n1 = document.querySelector("#n1")
var n2 = document.querySelector("#n2")
var n3 = document.querySelector("#n3")

const calcular = document.querySelector("button");

calcular.addEventListener("click", () => {

    const container = document.querySelector(".container")
    let media = (Number(n1.value) + Number(n2.value) + Number(n3.value)) / 3

    const resposta = document.querySelector("#resposta")
    resposta.removeAttribute("hidden")
    
    document.querySelector("#calcular").setAttribute("hidden", "")
    
    document.querySelector("#res").innerHTML = `A média do aluno é ${media}`

    return
})

document.querySelector("#resposta").addEventListener("click", () => {
    document.querySelector("#resposta").setAttribute("hidden", "")
    document.querySelector("#calcular").removeAttribute("hidden")
    n1.value = ""; n2.value = ""; n3.value = ""
})