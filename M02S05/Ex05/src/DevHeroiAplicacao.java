public class DevHeroiAplicacao {
    public void executar() {
        HeroiCLI heroiCLI = new HeroiCLI();
        int escolha;

        do {
            escolha = heroiCLI.escolherOpção();
        } while (escolha != 0);

    }
}
