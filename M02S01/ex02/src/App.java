/* Crie um programa Java que declare variáveis para armazenar a primeira letra do seu nome, idade e altura.

Em seguida, imprima essas variáveis na tela.

Este exercício visa introduzir a declaração de variáveis e a atribuição de valores, além de revisar os 
tipos de dados básicos em Java (como char, int, double).
 */

public class App {
    public static void main(String[] args) throws Exception {
        char letraNome = 'R';
        int Idade = 37;
        double Altura = 1.84;

        System.out.println("A primeira letra do meu nome é "+letraNome);
        System.out.println("Minha idade é "+Idade);
        System.out.println("Minha altura é "+Altura);
    }
}
