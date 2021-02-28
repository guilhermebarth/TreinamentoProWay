package Classes;

import Interfaces.Locacao;
import java.util.ArrayList;

public class EspacoCafe implements Locacao {

    private String nome = "";
    private int locacao = 0;
    private int vagasOcupadas = 0;
    private ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    public EspacoCafe(String nome, String locacao) {
        this.setNome(nome);
        this.vagasOcupadas = Integer.parseInt(locacao);
    }

    public EspacoCafe(){
        
    }
    
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
    
    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public void addListaPessoas(Pessoa pessoa) {
        this.listaPessoas.add(pessoa);
    }

    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    public void setVagasOcupadas() {
        if (this.getVagasOcupadas() < this.getLocacao()) {
            this.vagasOcupadas++;
        }
    }
}
