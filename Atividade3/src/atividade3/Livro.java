
package atividade3;



public class Livro extends Produto {
    
    private String autor;

    public Livro(String autor, String titulo, double preco) {
        super(titulo, preco);
        this.autor = autor;
    }

  
    public String exibirDetalhes() {
        return "Livro{" + super.exibirDetalhes()+ " autor=" + autor + '}';
    }

    public double calcularDesconto() {
        return super.getPreco()*0.9;
    }
    
    
}
