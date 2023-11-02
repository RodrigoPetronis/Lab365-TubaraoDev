//const peso = parseInt(prompt("Qual o peso da mercadoria?"));
//const distancia = parseInt(prompt("Qual a distancia em Km?"));
//const precoDoFrete = 6*peso*distancia;
//alert("O preço do frete fica em "+precoDoFrete);



const calcular = document.querySelector("button")

calcular.addEventListener("click", () => {
    let peso = document.querySelector("#peso")
    let distancia = document.querySelector("#km")
    let resposta = document.querySelector("#res")

    let res = 6 * peso.value * distancia.value
    resposta.innerHTML = `O valor total do frete é de R$${res}`

    peso.value = ""
    distancia.value = ""
})