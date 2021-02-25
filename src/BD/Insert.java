package BD;

public class Insert {
    
    private String NomeTabela;
    private String Colunas;
    private String Valores;
    
    public void Cadastrar(){
        int ignorar = CadastrarComInt();
    }
    
    public int CadastrarComInt(){
        
        String comando = "insert into " + getNomeTabela() + "("+getColunas()+") values (" + getValores() + ");";
        
        return -1;
    }

    public String getNomeTabela() {
        return NomeTabela;
    }

    public void setNomeTabela(String NomeTabela) {
        this.NomeTabela = NomeTabela;
    }

    public String getColunas() {
        return Colunas;
    }

    public void setColunas(String Colunas) {
        this.Colunas = Colunas;
    }

    public String getValores() {
        return Valores;
    }

    public void setValores(String Valores) {
        this.Valores = Valores;
    }
}
