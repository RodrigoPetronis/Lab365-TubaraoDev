
    import java.util.Scanner;

    public class HeroiCLI {

        public void exibirMenu() {
            System.out.println("---------- MENU ---------");
            System.out.println();
            System.out.println("1- Adicionar");
            System.out.println("2- Listar ");
            System.out.println("0- SAIR ");
            System.out.println();
        }

        public int escolherOpção() {
            exibirMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma opção para continuar: ");
            int escolha = scanner.nextInt();
            if (escolha > 2 || escolha < 0) {
                System.out.println("Escolha uma opção válida");
                System.out.println();
                return escolherOpção();
            }
            if(escolha == 0){
                System.out.println("O sistema foi encerrado! ");
            }
            return escolha;
        }
    }
