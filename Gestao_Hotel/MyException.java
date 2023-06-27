//Lucas Gabriel Costa
public class MyException extends Exception {

    public MyException(String message) {
        Leitura.entDados(message);
    }
    
    public Object errorCpf(Object pessoa) {
        if(pessoa instanceof Cliente) {
            Cliente cli = (Cliente) pessoa;
            try {
                cli.setCpf(Leitura.entDados("CPF: "));
            }
            catch(MyException mye) {
                cli = (Cliente) mye.errorCpf(cli);
            }
            return cli;
        }
        else if(pessoa instanceof Assalariado) {
            Assalariado assalariado = (Assalariado) pessoa;
            try{
                assalariado.setCpf(Leitura.entDados("CPF: "));
            }
            catch(MyException mye) {
                assalariado = (Assalariado) mye.errorCpf(assalariado);
            }
            return assalariado;
        }
        else if(pessoa instanceof Comissionado) {
            Comissionado comissionado = (Comissionado) pessoa;
            try{
                comissionado.setCpf(Leitura.entDados("CPF: "));
            }
            catch(MyException mye) {
                comissionado = (Comissionado) mye.errorCpf(comissionado);
            }
            return comissionado;
        }
        return null;
    }
    public Object errorNome(Object pessoa) {
        if(pessoa instanceof Cliente) {
            Cliente cli = (Cliente) pessoa;
            try {
                cli.setNome(Leitura.entDados("Nome: "));
            }
            catch(MyException mye) {
                cli = (Cliente) mye.errorNome(cli);
            }
            return cli;
        }
        else if(pessoa instanceof Assalariado) {
            Assalariado assalariado = (Assalariado) pessoa;
            try {
                assalariado.setNome(Leitura.entDados("Nome: "));
            }
            catch(MyException mye) {
                assalariado = (Assalariado) mye.errorNome(assalariado);
            }
            return assalariado;
        }
        else if(pessoa instanceof Comissionado) {
            Comissionado comissionado = (Comissionado) pessoa;
            try {
                comissionado.setNome(Leitura.entDados("Nome: "));
            }
            catch(MyException mye) {
                comissionado = (Comissionado) mye.errorNome(comissionado);
            }
            return comissionado;
        }
        return null;
    }
    public Object errorDtaNasc(Object pessoa) {
        if(pessoa instanceof Cliente) {
            Cliente cli = (Cliente) pessoa;
            try {
                cli.setDtaNasc(Leitura.entDados("Data de Nascimento: "));
            }
            catch(MyException mye) {
                cli = (Cliente) mye.errorDtaNasc(cli);
            }
            return cli;
        }
        else if(pessoa instanceof Assalariado) {
            Assalariado assalariado = (Assalariado) pessoa;
            try {
                assalariado.setDtaNasc(Leitura.entDados("Data de Nascimento: "));
            }
            catch(MyException mye) {
                assalariado = (Assalariado) mye.errorDtaNasc(assalariado);
            }
            return assalariado;
        }
        else if(pessoa instanceof Comissionado) {
            Comissionado comissionado = (Comissionado) pessoa;
            try {
                comissionado.setDtaNasc(Leitura.entDados("Data de Nascimento: "));
            }
            catch(MyException mye) {
                comissionado = (Comissionado) mye.errorDtaNasc(comissionado);
            }
            return comissionado;
        }
        return null;
    }
    public Object errorCel(Object pessoa) {
        if(pessoa instanceof Cliente) {
            Cliente cli = (Cliente) pessoa;
            try {
                cli.setCel(Leitura.entDados("Telefone: "));
            }
            catch(MyException mye) {
                cli = (Cliente) mye.errorCel(cli);
            }
            return cli;
        }
        else if(pessoa instanceof Assalariado) {
            Assalariado assalariado = (Assalariado) pessoa;
            try {
                assalariado.setCel(Leitura.entDados("Telefone: "));
            }
            catch(MyException mye) {
                assalariado = (Assalariado) mye.errorCel(assalariado);
            }
            return assalariado;
        }
        else if(pessoa instanceof Comissionado) {
            Comissionado comissionado = (Comissionado) pessoa;
            try {
                comissionado.setCel(Leitura.entDados("Telefone: "));
            }
            catch(MyException mye) {
                comissionado = (Comissionado) mye.errorCel(comissionado);
            }
            return comissionado;
        }
        return null;
    }
}