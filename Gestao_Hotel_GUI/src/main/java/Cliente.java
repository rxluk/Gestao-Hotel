//Lucas Gabriel Costa

public class Cliente extends Pessoa {
    
    private int quartoAloc;

    public Cliente() {
        quartoAloc = 123456;
    }
    //polimorfismo sobrecarga
    public Cliente(Cliente cli) {
        super(cli);
        quartoAloc = cli.getQuartoAloc();
    }
    public int getQuartoAloc() {
        return quartoAloc;
    }
    public void setQuartoAloc(int quartoAloc) {
        this.quartoAloc = quartoAloc;
    }
}
