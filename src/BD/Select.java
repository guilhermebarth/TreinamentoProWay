package BD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Select {

    private String tabela = "";
    private int idEspecifico = 0;

    public String BuscaTodosOsCampos(String nomeTabela) {
        //ResultSet
        return "";
    }
    
    public void RetornaConexao(){
        try {
            String serverName = "127.0.0.1:3307";
            String myDataBase = "ensalamento";
            String url = "jdbc:mysql://" + serverName + "/" + myDataBase;
            String username = "root";
            String password = "";

            
            Connection connection = DriverManager.getConnection(url, username, password);

            if (connection != null){
                System.out.println("Deu certo!");
            } else {
                System.out.println("Deu errado");
            }
            
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getTabela() {
        return tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public int getIdEspecifico() {
        return idEspecifico;
    }

    public void setIdEspecifico(int IdEspecifico) {
        this.idEspecifico = IdEspecifico;
    }

}
