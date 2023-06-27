//Lucas Gabriel Costa

public class Horista extends Funcionario implements Interface {

    private double precoHora;
    private double horasTrab;

    public Horista() {

        precoHora = 0.00;
        horasTrab = 0.00;
    }
    //polimorfismo sobrecarga
    public Horista(Funcionario horista) {
        super(horista);
        precoHora = 0.00;
        horasTrab = 0.00;
    }
    public double getPrecoHora() {
        return precoHora;
    }
    public double getHorasTrab() {
        return horasTrab;
    }
    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }
    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }
    //polimorfismo sobrescrita
    public void calcSalario(Double horas) {
        setHorasTrab(getHorasTrab() + horas);
        super.setSalario(super.getSalario() + (horas * precoHora));
    }
}
