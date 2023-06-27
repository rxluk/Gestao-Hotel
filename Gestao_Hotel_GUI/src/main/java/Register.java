//Lucas Gabriel Costa

public class Register {
    
    private String login;
    private String senha;
    private int nivelAcesso;
  
    public Register() {

        login = "";
        senha = "";
        nivelAcesso = 0;
    }

    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    public int getNivelAcesso() {
        return nivelAcesso;
    }
   
    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}
