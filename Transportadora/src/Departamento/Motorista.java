/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Departamento;

import util.Funcionario;

/**
 *
 * @author Aluno
 */
public class Motorista extends Funcionario implements util.Usuario{
    private String cnh;
    private String categoria;

    public Motorista(String cnh, String categoria, String matricula, int data_contratacao, String nome, String cpf, String data_nascimento) {
        super(matricula, data_contratacao, nome, cpf, data_nascimento);
        this.cnh = cnh;
        this.categoria = categoria;
    }

    
    
    

    @Override
    public boolean login(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean logoff(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
