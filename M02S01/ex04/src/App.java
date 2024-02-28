/* Desenvolva um programa Java que receba dois números do usuário e 
imprima a soma, subtração, multiplicação, divisão e resto da divisão 
desses dois números.

Este exercício ajudará você a praticar operações aritméticas básicas
e a entrada de dados pelo usuário. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o num 1: ");
        double num1 = leitor.nextDouble();
        System.out.print("Digite o num 2: ");
        double num2 = leitor.nextDouble();

        double soma = num1+num2;
        double subtracao = num1-num2;
        double multiplicacao = num1*num2;
        double divisao = num1/num2;
        double restoDivisao = num1%num2;

        System.out.println("Dado os numeros "+num1+" e "+num2+", Soma = "+soma+" Subtracao = "+subtracao+
        " multiplicacao = "+multiplicacao+" Divisao = "+divisao+" Resto da divisao = "+restoDivisao);

    }
}
