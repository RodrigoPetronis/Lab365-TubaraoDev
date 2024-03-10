import java.util.Scanner;

public class Tabuada {
    Scanner scanner = new Scanner(System.in);
    int numero;

    public void calcular() {
        System.out.println("Qual tabuada deseja ver? ");
        numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + (numero * i));
        }
    }
}
