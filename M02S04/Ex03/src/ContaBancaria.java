public class ContaBancaria {
    int numeroDaConta;
    int agencia;
 String nomeDoTitular;
    double saldo;

    

    public ContaBancaria(int numeroDaConta, int agencia, String nomeDoTitular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo +=valor;
        System.out.printf("Deposito de "+valor+" realizado com sucesso");
        System.out.println("Saldo atualizado: "+saldo);
    }
    public void sacar(double valor){
        if(saldo > valor){
            saldo -= valor;
            System.out.println("Saque de "+valor+" realizado com sucesso");
            System.out.println("Saldo atualizado: "+saldo);
        }else{System.out.println("Saldo insuficiente para efetuar o saque");
        System.out.println("Saldo atual: "+saldo);}
    }

}

/*
 * Crie uma classe ContaBancaria com os seguintes atributos privados:
 * numeroDaConta (int), agencia (int), nomeDoTitular (String) e saldo (double).
 * 
 * Inclua um construtor para inicializar esses atributos e implemente métodos
 * getters para cada um deles.
 * 
 * Adicione um método depositar(double valor) que aumenta o saldo da conta e um
 * método sacar(double valor)
 * que diminui o saldo da conta, verificando se há fundos suficientes.
 */