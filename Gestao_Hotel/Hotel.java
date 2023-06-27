//Lucas Gabriel Costa

public class Hotel {

    private int maxQrt;
    private boolean quartoStatus[];

    //construtor
    public Hotel() {
        
        maxQrt = 50;
        quartoStatus = new boolean[maxQrt];
        for(int i = 0; i < quartoStatus.length; i++) {
            quartoStatus[i] = true;
        }
    }

    //getters
    public int getMaxQrt() {
        return maxQrt;
    }
    //polimorfismo sobrecarga.
    public boolean[] getQuartoStatus() {
        return quartoStatus;
     }
    public boolean getQuartoStatus(int quarto) {
       return quartoStatus[quarto];
    }
    //setters
    public void setMaxQrt(int maxQrt) {
        this.maxQrt = maxQrt;
    }
    public void setQuartoStatus(boolean status, int quarto) {
        quartoStatus[quarto] = status;
    }
}
