/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class Administrativo extends Funcionario{

    public Administrativo(String setor, String nome, int idade, Double salario) {
        super(nome, idade, salario);
        this.setor = setor;
    }

   

     private String setor;

   
    @Override
    public double calcularBonusSalario() {
         return super.getSalario()*0.05;
    }
    
}
