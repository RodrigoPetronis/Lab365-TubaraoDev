import java.util.Scanner;

public class InvertendoValores {
    Scanner scanner = new Scanner(System.in);
    int tamanho = 0;
    int[] valores   ;
   
    

    public void preencherValores() {
        System.out.println("Digite uma quantidade de números para o Array: ");
        tamanho = scanner.nextInt();
        valores = new int[tamanho];
       

        int valor = 0;

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um número para a posição " + i);
            valor = scanner.nextInt();
            valores[i] = valor;
        }
        scanner.close();

        for (int i : valores) {
            System.out.println(i);
        }
    }

    public void InverterOrdem() {
        System.out.println("Os valores invertidos do Array são: ");
        for (int i = tamanho -1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }

}

/*
 * Elabore um programa em Java que peça ao usuário para preencher um array de
 * inteiros de tamanho N,
 * onde N também é fornecido pelo usuário.
 * 
 * Depois, crie uma função sem parâmetros que inverta a ordem dos elementos
 * desse array.
 * Use um loop for para percorrer o array e invertê-lo. Imprima o array
 * invertido no console.
 */