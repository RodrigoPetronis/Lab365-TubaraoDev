import java.util.Scanner;

public class Calculo {
    Double[] notas = new Double[10];
    Scanner scanner = new Scanner(System.in);
    Double soma = 0D;
    Double media = 0D;

    public void calcularMedia(){
        for(int i = 1;i<=notas.length;i++){
            System.out.println("Digitea nota" + i);
            soma += scanner.nextDouble();
        }
        media=soma/notas.length;
    
        System.out.println("A média das notas é "+media);
    }
    
}


/*
 * Desenvolva um programa Java que inicialize um array com um conjunto fixo de
 * notas (por exemplo, 10 notas)
 * e calcule a média dessas notas.
 * 
 * Crie uma função com o array de notas como parâmetro para realizar esse
 * cálculo.
 * Use um loop for para iterar sobre o array de notas.
 * 
 * O programa deve imprimir a média das notas.
 */