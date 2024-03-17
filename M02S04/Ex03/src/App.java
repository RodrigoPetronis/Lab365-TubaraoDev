public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria contaBancaria1 = new ContaBancaria(1, 1, "Rodrigo", 100);

        System.out.println("Saldo: "+contaBancaria1.saldo);
        contaBancaria1.sacar(50.0);
        contaBancaria1.sacar(51.0);
        contaBancaria1.depositar(2);
        contaBancaria1.sacar(50);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(2, 1, "Poupador", 100, 5);

        System.out.println("O Saldo da Conta Poupança é: "+contaPoupanca1.saldo);
        contaPoupanca1.adicionarJuros();

        ContaCorrente correntista =new ContaCorrente(3, 1, "Correntista", 200, 5);
        System.out.println("Saldo Conta Corrente é: "+correntista.saldo);
        correntista.sacar(50);
    }
}