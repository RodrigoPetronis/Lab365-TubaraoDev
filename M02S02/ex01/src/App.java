import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Escreva um número do início: ");
        int numero1= scanner.nextInt();
        
        System.out.println("Escreva um  número para o fim: ");
        int numero2= scanner.nextInt();

        for (int i = numero1; i <= numero2; i++) {
            soma+=i;
            System.out.println(soma);
        }
        System.out.println("A soma dos números no intervalo de "+numero1+" e "+numero2+" é "+soma);
    }
}
