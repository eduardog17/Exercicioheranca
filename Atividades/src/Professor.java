/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class Professor extends Funcionario {
    private String Disiplina;

    public Professor(String Disiplina, String nome, int idade, Double salario) {
        super(nome, idade, salario);
        this.Disiplina = Disiplina;
    }

    
    
    
   

    @Override
    public double calcularBonusSalario() {
        return super.getSalario()*0.1;
    }
   
}
