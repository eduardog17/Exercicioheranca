
package atividade2;

public class Carro extends Veiculo {
    private int NumeroDePortas;

    public Carro(int NumeroDePortas, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.NumeroDePortas = NumeroDePortas;
    }

    public double calcularVelocidadeMaxima() {
        return 200.0;
    }

    public String exibirDetalhes() {
        return "Carro{" + super.exibirDetalhes()+ " numeroPortas=" + NumeroDePortas + '}';
    }
}
