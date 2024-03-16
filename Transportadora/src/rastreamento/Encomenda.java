/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rastreamento;

/**
 *
 * @author Aluno
 */
public class Encomenda {
    private double tamanho;// volume m
    private double peso;//peso //kg
    private boolean is_fragil;
    private Cliente cliente;

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isIs_fragil() {
        return is_fragil;
    }

    public void setIs_fragil(boolean is_fragil) {
        this.is_fragil = is_fragil;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Encomenda(double tamanho, double peso, boolean is_fragil, Cliente cliente) {
        this.tamanho = tamanho;
        this.peso = peso;
        this.is_fragil = is_fragil;
        this.cliente = cliente;
    }

}