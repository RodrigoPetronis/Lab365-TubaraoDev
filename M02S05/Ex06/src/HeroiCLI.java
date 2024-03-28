
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
        if (escolha == 0) {
            System.out.println("O sistema foi encerrado! ");
        }
        if (escolha == 1) {
            adicionarHeroi();
        }
        if(escolha == 2){
            listarHerois();
        }
        return escolha;
    }

    ArrayList<Heroi> herois = new ArrayList<>();

    private void adicionarHeroi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do Heroi: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o superpoder: ");
        String superpoder = scanner.nextLine();
        System.out.println("Informe a idade: ");
        Integer idade = scanner.nextInt();

        Heroi heroiAdicionado = new Heroi(nome, superpoder, idade);

        boolean heroiExiste = false;
        for (Heroi heroi : herois) {
            if (heroi.getNome().equals(heroiAdicionado.getNome())) {
                heroiExiste = true;
                break;
            }
        }

        if (heroiExiste) {
            System.out.println("Este herói já foi criado!");
        } else {
            herois.add(heroiAdicionado);
            System.out.println("Herói adicionado com sucesso!");
        }
        
    }

    private void listarHerois() {
        if(herois.size()>0)
        for(Heroi heroi:herois){
            System.out.println(heroi);
        }
        else
        System.out.println("Lista Vazia!");
    }

}