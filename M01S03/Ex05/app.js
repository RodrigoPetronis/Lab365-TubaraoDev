/*Pergunte com prompt o nome da pessoa convidada

Pergunte com prompt o nome da primeira pessoa do casal

Pergunte com prompt o nome da segunda pessoa do casal

Pergunte com prompt a data do casamento

Pergunte com prompt a hora do casamento

Exiba na página um convite a partir das informações

Ex.: “Romeu Casarotto“, “Alê“, “Dani“ “01/01/2024“, “19“


const nomeConvidado = prompt("Qual o nome da pessoa convidada?")
const nomeNoivo = prompt("Qual o nome do noivo?")
const nomeNoiva = prompt("Qual o nome da noiva?")
const dataCasamento = prompt("Qual a data do evento?")
const horaCasamento = prompt("Qual a hora do casamento?")

*/

const nomeConvidado = document.querySelector("#convidado").value
const nomeNoivo = document.querySelector("#noivo").value
const nomeNoiva = document.querySelector("#noiva").value
const dataCasamento = document.querySelector("#data").value
const horaCasamento = document.querySelector("#hora").value
const resposta = document.querySelector("#res")

const botao = document.querySelector("button")

botao.addEventListener("click", () => {
    resposta.innerHTML = `‌Caro(a) ${nomeConvidado}!

Você está convidado(a) para o casamento de ${nomeNoivo} e ${nomeNoiva},
a ser realizado no dia ${dataCasamento}, às ${horaCasamento} horas.

Contamos com a sua presença!

Atenciosamente,
os(as) noivos(as) `;

})


