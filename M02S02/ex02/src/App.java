import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero1;
        Scanner scanner = new Scanner(System.in);
        NumeroPrimo numeroPrimo = new NumeroPrimo();

        System.out.println("Escreva um número inteiro: ");
        numero1 = scanner.nextInt();
        numeroPrimo.numeroPrimo(numero1);

        scanner.close();
    }

}

/*
 * Crie um programa em Java que peça ao usuário para inserir um número inteiro e
 * use uma função,
 * que você deve definir, para verificar se o número é primo ou não.
 * 
 * Essa função não deve ter parâmetros, mas deve solicitar a entrada do usuário
 * dentro dela.
 * Use um loop for ou while para verificar se o número é divisível apenas por 1
 * e por si mesmo.
 * Imprima o resultado.
 */