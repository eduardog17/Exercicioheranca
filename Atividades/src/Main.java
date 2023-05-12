
public class Main {
  

    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario1 = new Professor("Ciência da Computação", "Eduardo", 42, 3000.0);
        Funcionario funcionario2 = new Administrativo("Ciência da Computação", "Luan", 12, 3000.0);
        
        System.out.println(funcionario1.exibirDetalhes());
        System.out.println(funcionario2.exibirDetalhes());
    }
}

