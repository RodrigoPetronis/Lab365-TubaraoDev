public class Empregado {
    Long cpf;
    String nomeCompleto;
    double salario;

    

    public Empregado(Long cpf, String nomeCompleto, double salario) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;
    }

    public void promover(float percentual){
        double aumento = salario * (percentual/100);
        salario += aumento;
        System.out.println("O salário novo com aumento de "+percentual+ "% é :"+salario);
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}

/* Crie uma classe 'Empregado' para representar um empregado de uma empresa, contendo os atributos cpf,
 nome completo e salário.

Implemente também um método 'promover' que recebe como parametro um percentual (float), 
devendo o salário ser aumentado pelo percentual indicado no argumento do método.

Crie e utilize um objeto desta classe para testar a implementação. */