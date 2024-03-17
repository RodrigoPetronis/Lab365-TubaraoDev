public class ContaCorrente extends ContaBancaria{
    double taxaDeOperação;


    public ContaCorrente(int numeroDaConta, int agencia, String nomeDoTitular, double saldo, double taxaDeOperação) {
        super(numeroDaConta, agencia, nomeDoTitular, saldo);
        this.taxaDeOperação = taxaDeOperação;
    }


    @Override
    public void sacar(double valor){
        saldo = saldo - taxaDeOperação - valor;
        System.out.println("Saldo da Conta Corrente atualizado é: "+super.saldo);
    }

}

/* Estenda a classe ContaBancaria para criar uma classe ContaCorrente.

Adicione um atributo privado taxaDeOperacao (double) que será deduzido do saldo a cada saque.

Sobrescreva o método sacar(double valor) para incluir a dedução da taxaDeOperacao. */