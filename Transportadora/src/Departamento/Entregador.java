/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Departamento;

import util.Funcionario;
import util.Usuario;


public class Entregador extends Funcionario implements Usuario{
    private String turno;

    public Entregador(String turno, String matricula, int data_contratacao, String nome, String cpf, String data_nascimento) {
        super(matricula, data_contratacao, nome, cpf, data_nascimento);
        this.turno = turno;
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
