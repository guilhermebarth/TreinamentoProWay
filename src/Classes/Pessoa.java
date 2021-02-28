package Classes;

import Interfaces.CadastroPadrao;

public class Pessoa implements CadastroPadrao{
    private String nome = "";
    private String sobrenome = "";
    private SalaEvento salaEventoUm ;
    private SalaEvento salaEventoDois;
    private EspacoCafe salaCafeUm;
    private EspacoCafe salaCafeDois;

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

    public SalaEvento getSalaEventoUm() {
        return salaEventoUm;
    }

    public void setSalaEventoUm(SalaEvento salaEventoUm) {
        this.salaEventoUm = salaEventoUm;
    }

    public SalaEvento getSalaEventoDois() {
        return salaEventoDois;
    }

    public void setSalaEventoDois(SalaEvento salaEventoDois) {
        this.salaEventoDois = salaEventoDois;
    }

    public EspacoCafe getSalaCafeUm() {
        return salaCafeUm;
    }

    public void setSalaCafeUm(EspacoCafe salaCafeUm) {
        this.salaCafeUm = salaCafeUm;
    }

    public EspacoCafe getSalaCafeDois() {
        return salaCafeDois;
    }

    public void setSalaCafeDois(EspacoCafe salaCafeDois) {
        this.salaCafeDois = salaCafeDois;
    }
}
