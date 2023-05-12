/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

public class CDs extends Produto{
    
    private String artista;

    public CDs(String artista, String titulo, double preco) {
        super(titulo, preco);
        this.artista = artista;
    }

    public String exibirDetalhes() {
        return "CD{" +  super.exibirDetalhes()+ " artista=" + artista + '}';
    }

    @Override
    public double calcularDesconto() {
        return super.getPreco()*0.95;
    }
}