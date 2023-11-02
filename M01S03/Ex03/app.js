let salario = document.querySelector("#salario");
const calcular = document.querySelector("#calcular");

calcular.addEventListener("click", ()=>{
    let fgtsMensal = salario.value * 0.08;
    let fgtsAnual = salario.value * 0.12;
   
    const resposta = document.querySelector("#resp")
    resposta.removeAttribute("hidden")

    document.querySelector("#calcular").setAttribute("hidden","");

    let resMensal = document.querySelector("#resMensal")
    resMensal.innerHTML = `FGTS mensal - R$ ${fgtsMensal}`
    let resAnual = document.querySelector("#resAnual") 
    resAnual.innerHTML = `FGTS anual - R$ ${fgtsAnual}`
    
})

document.querySelector("#calcRes").addEventListener("click", ()=>{

    document.querySelector("#resp").setAttribute("hidden","")
    document.querySelector("#calcular").removeAttribute("hidden")
    
    salario.value = ""
})