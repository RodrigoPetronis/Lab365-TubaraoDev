/* Escreva um programa que declare duas variáveis: uma do tipo int e outra do tipo double.

Atribua valores a ambas. Em seguida, converta o valor da variável int para double e some os dois valores, 
imprimindo o resultado.

Este exercício enfatiza a conversão de tipos e operações básicas com variáveis

*/

public class App {
    public static void main(String[] args) throws Exception {
        int inteiro = 5;
        double numDouble = 9.5;

        int soma = inteiro + (int)numDouble;

        System.out.println("Resultado "+soma);

    }
}
