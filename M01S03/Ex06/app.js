const lanche = document.querySelector("#lanche")
const quantidade = document.querySelector("#quantidade")
const resposta = document.querySelector("#res")
const botao = document.querySelector("#finalizar")
const outroPedido = document.querySelector("#finalizar")
let preco = 0;
let nome = ""



botao.addEventListener("click", () => {

    if (lanche.value == 1123) {
        preco = 12.00
        nome = "Hamburguer"
    }
    else if (lanche.value == 3423) {
            preco = 9.00
            nome = "Saduíche de Pernil"
      
        }else if (lanche.value == 4521) {
            preco = 15.00
            nome = "Bauru"
        }
        else if (lanche.value == 5322) {
            preco = 34.99
            nome = "Sanduíche de Mortadela"
        }
       if (lanche.value == 0 || quantidade.value ==0){
            resposta.innerHTML = "Escolha uma opção e a quantidade"
        } else{
            resposta.innerHTML = `${quantidade.value} ${nome} custam R$ ${quantidade.value * preco}`
        }
    
})
