const nome = document.querySelector("#nome")
const dataInicio = document.querySelector("#dataInicio")
const dataTermino = document.querySelector("#dataTermino")

const gerarCarta = document.querySelector("#gerarCarta")
gerarCarta.addEventListener("click", ()=>{
       
    const resposta = document.querySelector("#resp")
    resposta.removeAttribute("hidden")

    document.querySelector("#gerarCarta").setAttribute("hidden","");

    document.querySelector("#nomeFuncionario")
    .innerHTML = `Nome do Funcionário: ${nome.value}`

    document.querySelector("#respDataInicio")
    .innerHTML = `Data início: ${dataInicio.value}`


    document.querySelector("#respDataTermino")
    .innerHTML = `Data Termino: ${dataTermino.value}`

    document.querySelector("#agradecimento")
    .innerHTML = `Atenciosamente ${nome.value}`
    
    document.querySelector("#dataAtual").innerHTML= `Gerado em ${new Date().getDate()}/${new Date().getMonth()}/${new Date().getFullYear()}`
    
})

document.querySelector("#outraRes").addEventListener("click", ()=>{

    document.querySelector("#resp").setAttribute("hidden","")
    document.querySelector("#gerarCarta").removeAttribute("hidden")
    
    salario.value = ""
})