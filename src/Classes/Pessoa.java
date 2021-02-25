package Classes;

import Interfaces.CadastroPadrao;

public class Pessoa implements CadastroPadrao{
    private String nome = "";
    private String sobrenome = "";

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
}
