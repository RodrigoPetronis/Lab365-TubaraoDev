public class App {
    public static void main(String[] args) throws Exception {
       Empregado empregado = new Empregado(52948165445L, "Joao da padaria", 10_000);
       empregado.promover(50);
       
    }
}

/* Crie uma classe 'Empregado' para representar um empregado de uma empresa, contendo os atributos cpf,
 nome completo e salário.

Implemente também um método 'promover' que recebe como parametro um percentual (float), 
devendo o salário ser aumentado pelo percentual indicado no argumento do método.

Crie e utilize um objeto desta classe para testar a implementação. */