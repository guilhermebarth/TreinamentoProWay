package Classes;

import Interfaces.Locacao;

public class SalaEvento implements Locacao{
    private String nome = "";
    private int locacao = 0;
    private String idListaDePessoas = new String();
    
    public SalaEvento(){}
    
    public SalaEvento(String nome, String locacao){
        setNome(nome);
        setLocacao(Integer.parseInt(locacao));
    }
    
    public int getLocacao() {
        return locacao;
    }

    public void setLocacao(int locacao) {
        this.locacao = locacao;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public String getIdListaDePessoas() {
        return idListaDePessoas;
    }

    public void setIdListaDePessoas(String idListaDePessoas) {
        this.idListaDePessoas = idListaDePessoas;
    }
    
}
