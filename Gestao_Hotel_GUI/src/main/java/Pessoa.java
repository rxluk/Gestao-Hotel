//Lucas Gabriel Costa

public abstract class Pessoa {
    
    private String nome;
    private String cpf;
    private String dtaNasc;
    private String cel;

    public Pessoa() {

        nome = "";
        cpf = "";
        dtaNasc = "";
        cel = "";
    }
    //polimorfismo sobrecarga
    public Pessoa(Pessoa pes) {
        this.nome = pes.getNome();
        this.cpf = pes.getCpf();
        this.dtaNasc = pes.getDtaNasc();
        this.cel = pes.getCel();
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getDtaNasc() {
        return dtaNasc;
    }
    public String getCel() {
        return cel;
    }
    public void setNome(String nome) throws MyException {
        if(nome.length() < 3) {
            throw new MyException("Nome minimo 3 caracteres.");
        }
        for (int i = 0; i < nome.length(); i++) {
            if(Character.isDigit(nome.charAt(i))) {
                throw new MyException("Digite apenas letras.");
            }
        }
        this.nome = nome;
    }
    public void setCpf(String cpf) throws MyException{
        if(cpf.length() != 11) {
            throw new MyException("Cpf tamanho incorreto.");
        }
        for (int i = 0; i < cpf.length(); i++) {
            if(Character.isDigit(cpf.charAt(i)) == false) {
                throw new MyException("Digite apenas numero.");
            }
        }
        this.cpf = cpf;
    }
    public void setDtaNasc(String dtaNasc) throws MyException {
        if(dtaNasc.length() != 8 ) {
            throw new MyException("Formato incorreto, formato: DDMMAAAA");
        }
        for (int i = 0; i < dtaNasc.length(); i++) {
            if(Character.isLetter(dtaNasc.charAt(i))) {
                throw new MyException("Digite apenas numeros.");
            }
        }
        this.dtaNasc = dtaNasc.charAt(0) + "" + dtaNasc.charAt(1) + "/" + dtaNasc.charAt(2) + dtaNasc.charAt(3);
        this.dtaNasc += "/" + dtaNasc.charAt(4) + dtaNasc.charAt(5) + dtaNasc.charAt(6) + dtaNasc.charAt(7);
    }
    public void setCel(String cel) throws MyException {
        try {
            Double.parseDouble(cel);
        }
        catch(NumberFormatException nfe) {
            throw new MyException("Digite apenas numeros.");
        }
        if(cel.length() != 11) {
            throw new MyException("Numero de telefone invalido (ddd + 9 + numero), apenas numeros.");
        }
        else {
            this.cel = "(" + cel.charAt(0) + cel.charAt(1) + ") " + cel.charAt(2);
            this.cel += " " + cel.charAt(3) + cel.charAt(4) + cel.charAt(5) + cel.charAt(6);
            this.cel += "-" + cel.charAt(7) + cel.charAt(8) + cel.charAt(9) + cel.charAt(10);
        }
    }
}
