
    import java.util.ArrayList;
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
            if(escolha == 1){
                adicionarHeroi();
            }
            return escolha;
        }

        ArrayList <Heroi> herois = new ArrayList<>();

        private void adicionarHeroi() {   
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Informe o nome do Heroi: ");
            String nome = scanner.nextLine();
            System.out.println("Informe o superpoder: ");
            String superpoder = scanner.nextLine();
            System.out.println("Informe a idade: ");
            Integer idade = scanner.nextInt();

            Heroi heroiAdicionado = new Heroi(nome, superpoder, idade);
            
            if(herois.contains(nome)){
                System.out.println("Este herói já foi criado!");
            }else{
                herois.add(heroiAdicionado);
            }

            System.out.println(herois);
            
        }
    }
