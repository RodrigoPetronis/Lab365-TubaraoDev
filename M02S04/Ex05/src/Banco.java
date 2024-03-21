import java.util.ArrayList;

public class Banco implements Imprimivel {

    ArrayList<ContaBancaria> contas = new ArrayList<>();

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void removerConta(int numeroDaConta) {
        for (ContaBancaria conta : contas) {
            if (conta.numeroDaConta == numeroDaConta) {
                contas.remove(conta);
                break;
            }
        }

    }

    @Override
    public void mostrarContas() {
        for (ContaBancaria conta : contas) {
            System.out.println("Nome do Titular: " + conta.nomeDoTitular);
            System.out.println("Agência: " + conta.agencia);
            System.out.println("Número da Conta: " + conta.numeroDaConta);
            System.out.println("Saldo: " + conta.saldo);
            System.out.println(); 
        }
    }

}

/*
 * Crie uma classe Banco que contém um ArrayList de ContaBancaria.
 * Adicione métodos para adicionarConta(ContaBancaria conta), removerConta(int
 * numeroDaConta),
 * e mostrarContas() que usa a interface Imprimivel para mostrar os dados de
 * todas as contas no banco.
 */