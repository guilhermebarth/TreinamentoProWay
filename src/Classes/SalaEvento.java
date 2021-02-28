package Classes;

import Interfaces.Locacao;
import java.util.ArrayList;

public class SalaEvento implements Locacao {

    private String nome = "";
    private int locacao = 0;
    private int vagasOcupadas = 0;
    private ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    public SalaEvento() {
    }

    public SalaEvento(String nome, String locacao) {
        setNome(nome);
        vagasOcupadas = Integer.parseInt(locacao);
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
