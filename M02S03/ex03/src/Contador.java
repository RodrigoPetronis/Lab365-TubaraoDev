public class Contador {
    private String frase;

    public Contador(String frase) {
        this.frase = frase;
    }

    public int contarPalavras(String frase){
        String[] palavras = frase.split(" ");
        
        return palavras.length;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    
}

/* 
a) Crie uma classe 'Contador'.
b) Crie um atributo privado 'frase' (String) nesta classe.
c) Implemente um construtor que receba uma frase como parâmetro, e inicialize o atributo criado com esta frase.
d) Implemente um método 'contarPalavras' que retorna a quantidade de palavras da frase indicada no atributo da 
classe.
e) Crie um método main em outra classe para testar a implementação.

Dicas:

Usar método split() da String ou classe StringTokenizer. */