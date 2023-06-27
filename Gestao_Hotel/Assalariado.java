//Lucas Gabriel Costa

public class Assalariado extends Funcionario {
    
    private String funcao;
    
    public Assalariado() {
        funcao = "";
    }
    //polimorfismo sobrecarga
    public Assalariado(Assalariado assalariado) {
        super(assalariado);
        funcao = assalariado.getFuncao();
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    //polimorfismo sobrescrita
    public void calcSalario(Double salario) {
        super.setSalario(super.getSalario());
    }
}
