public class App {
    public static void main(String[] args) throws Exception {
        Contador contador = new Contador("Hoje eu acordei feliz com voce");
        
        System.out.println(contador.contarPalavras(contador.getFrase()));

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