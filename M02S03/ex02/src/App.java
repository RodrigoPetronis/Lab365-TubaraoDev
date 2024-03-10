public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario1 = new Funcionario("Rodrigo");

        Funcionario funcionario2 = new Funcionario("Tiago", 5_000F);

        funcionario1.setSalario(3000F);

        funcionario1.aumentar(50F);
        funcionario2.aumentar(30F);

    }
}

/* a) Crie uma classe 'Funcionario' com os atributos 'nome' (String) e 'salário' (Float).
b) Implemente um construtor que receba um argumento de nome e inicialize o atributo de 'nome' com este valor.
c) Implemente outro construtor que receba como argumentos nome e salário e inicialize os respectivos atributos.
d) Implemente um método público 'aumentar' que recebe como parâmetro um valor (Float). 
Na implementação, some este valor ao 'salário'. */