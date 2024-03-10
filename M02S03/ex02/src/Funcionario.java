public class Funcionario {
    private String nome;
    private Float salario;

   
    public Funcionario(String nome) {
        this.nome = nome;
    }
    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentar(Float valor){
        Float aumento = valor/100;
        salario += salario*(1*aumento);
        System.out.println("O salario com aumento ficou: "+salario);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Float getSalario() {
        return salario;
    }
    public void setSalario(Float salario) {
        this.salario = salario;
    }
    
}

/* a) Crie uma classe 'Funcionario' com os atributos 'nome' (String) e 'salário' (Float).
b) Implemente um construtor que receba um argumento de nome e inicialize o atributo de 'nome' com este valor.
c) Implemente outro construtor que receba como argumentos nome e salário e inicialize os respectivos atributos.
d) Implemente um método público 'aumentar' que recebe como parâmetro um valor (Float). 
Na implementação, some este valor ao 'salário'. */