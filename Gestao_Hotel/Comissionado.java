//Lucas Gabriel Costa

public class Comissionado extends Funcionario implements Interface {
    
    private double taxaComissao;
    private double valorVendaBruta;
    

    public Comissionado() {

        taxaComissao = 0.00;
        valorVendaBruta = 0.00;
    }
    //polimorfismo sobrecarga
    public Comissionado(Comissionado comissionado) {
        super(comissionado);
        taxaComissao = comissionado.getTaxaComissao();
        valorVendaBruta = comissionado.getValorVendaBruta();
    }
    public Comissionado(Funcionario func) {
        super(func);
        taxaComissao = 0.00;
        valorVendaBruta = 0.00;
    }
    public double getTaxaComissao() {
        return taxaComissao;
    }
    public double getValorVendaBruta() {
        return valorVendaBruta;
    }
    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    public void setValorVendaBruta(double valorVendaBruta) {
        this.valorVendaBruta += valorVendaBruta;
    }
    //polimorfismo sobrescrita
    public void calcSalario(Double salarioBruto){
        super.setSalario(super.getSalario() + (salarioBruto * getTaxaComissao())); 
        setValorVendaBruta(getValorVendaBruta() + salarioBruto);
    }
}
