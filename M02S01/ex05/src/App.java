/* Faça um programa que peça ao usuário o raio de um círculo e calcule sua área (Area = π * raio^2) 
e perímetro (Perímetro = 2 * π * raio).

Crie uma variável para armazenar o valor de PI que é 3.14.

Para calcular o quadrado do raio, basta multiplicar o valor da variável raio por ela mesmo, 
ou seja, raio * raio.

Esse exercício foca na aplicação de operações aritméticas em Java. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        double pi = 3.14;
        System.out.println("Digite o Raio: ");
        double raio = leitor.nextDouble();
        double area = pi * (raio*raio);
        double perimetro = 2* pi*raio;

        System.out.println("Area = "+area);
        System.out.println("Perimetro = "+perimetro);



    }
}
