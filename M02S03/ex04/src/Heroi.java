public class Heroi {
    private String nome;
    private String superpoder;
    private String nomeDaVidaReal;
    private String universo;

   
    public Heroi(String nome, String superpoder, String nomeDaVidaReal, String universo) {
        this.nome = nome;
        this.superpoder = superpoder;
        this.nomeDaVidaReal = nomeDaVidaReal;
        this.universo = universo;
    }

    
    @Override
    public String toString() {
        return "Heroi [nome=" + nome + ", superpoder=" + superpoder + ", nomeDaVidaReal=" + nomeDaVidaReal
                + ", universo=" + universo + "]";
    }

    public void atacar(){
        System.out.println(nome+ " está atacando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public String getNomeDaVidaReal() {
        return nomeDaVidaReal;
    }

    public void setNomeDaVidaReal(String nomeDaVidaReal) {
        this.nomeDaVidaReal = nomeDaVidaReal;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }
    

}
/* 
Crie uma classe 'Heroi' para representar um super herói, contendo os atributos nome, superpoder, 
nomeDaVidaReal e universo (Marvel ou DC).

Implemente também um método ‘atacar' que não recebe parâmetros e escreve no console '<nome do herói> 
está atacando!’.

Crie e utilize um objeto desta classe para testar a implementação numa outra classa com método main.

 */