public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros;

    public ContaPoupanca(int numeroDaConta, int agencia, String nomeDoTitular, double saldo, double taxaDeJuros) {
        super(numeroDaConta, agencia, nomeDoTitular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void adicionarJuros(){
        double jurosAdicionar = (this.taxaDeJuros/100)*saldo;
        saldo += jurosAdicionar;
        System.out.println("O saldo com o aumento da taxa de juros é: "+super.saldo);
    }  
    

}

/* Estenda a classe ContaBancaria criada no Exercício 1 para criar uma classe ContaPoupanca.

Adicione um atributo privado taxaDeJuros (double) e um construtor para inicializá-lo,
 além dos atributos herdados. Implemente um método adicionarJuros() que aumenta o saldo com base 
 na taxa de juros.
 */