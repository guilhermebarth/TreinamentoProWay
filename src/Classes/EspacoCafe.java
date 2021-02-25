package Classes;

import Interfaces.Locacao;

public class EspacoCafe implements Locacao{
    private String nome = "";
    private int locacao = 0;
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getLocacao() {
        return this.locacao;
    }

    @Override
    public void setLocacao(int locacao) {
        this.locacao = locacao;
    }
    
}
