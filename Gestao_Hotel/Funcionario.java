public abstract class Funcionario extends Pessoa {
    
    private Double salario;
    private Register plataforma;

    public Funcionario() {
        salario = 0.00;
        plataforma = new Register();
    }
    public Funcionario(Funcionario func) {
        super(func);
        this.salario = func.getSalario();
        plataforma = func.getPlataforma();
    }
    public Double getSalario() {
        return salario;
    }
    public Register getPlataforma() {
        return plataforma;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    //polimorfismo sobrecarga
    public void setPlataforma(Register plataforma) {
        this.plataforma = plataforma;
    }
    public abstract void calcSalario(Double salario);
}
