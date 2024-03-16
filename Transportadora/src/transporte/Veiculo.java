/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

import Departamento.Entregador;
import Departamento.Motorista;

/**
 *
 * @author Aluno
 */
public class Veiculo {

    private String placas;
    private String modelos;
    private String fabricante;
    private double capacidade;
    private Motorista motorista;
    private Entregador entregador;

    public Veiculo(String placas, String modelos, String fabricante, double capacidade, Motorista motorista, Entregador entregador) {
        this.placas = placas;
        this.modelos = modelos;
        this.fabricante = fabricante;
        this.capacidade = capacidade;
        this.motorista = motorista;
        this.entregador = entregador;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }
    
}
    