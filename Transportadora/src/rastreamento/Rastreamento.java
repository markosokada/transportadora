/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rastreamento;

import transporte.Veiculo;

/**
 *
 * @author Aluno
 */
public class Rastreamento {
    private Encomenda encomenda;
    private Destino destino;
    private Veiculo veiculo;
    private String origem;
    private String [] status = {"Preparndoo",
                                 "Enviado",
                                 "Em rota",
                                 "Entrega"};

    public Rastreamento(Encomenda encomenda, Destino destino, Veiculo veiculo, String origem) {
        this.encomenda = encomenda;
        this.destino = destino;
        this.veiculo = veiculo;
        this.origem = origem;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String[] getStatus() {
        return status;
    }

    public void setStatus(String[] status) {
        this.status = status;
    }
    
    
}
