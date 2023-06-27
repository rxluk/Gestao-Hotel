//Lucas Gabriel Costa

public class Produto {

    private int id;
    private String nome;
    private Double valor;

    public Produto() {
        nome = "";
        valor = 0.00;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public Double getValor() {
        return valor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void setId(int id) {
        this.id = id;
    } 
}
