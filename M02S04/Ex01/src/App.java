public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria contaBancaria1 = new ContaBancaria(1, 1, "Rodrigo", 100);

        System.out.println("Saldo: "+contaBancaria1.saldo);
        contaBancaria1.sacar(50.0);
        contaBancaria1.sacar(51.0);
        contaBancaria1.depositar(2);
        contaBancaria1.sacar(50);
    }
}