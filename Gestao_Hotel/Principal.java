public class Principal {
    
    static Banco bd = Banco.getInstance();
    static Cliente cli;
    static Produto produto;
    static Comissionado comissionado;
    static Assalariado assalariado;
    static Horista horista;

    public static void main(String arg[]) {
        
        Funcionario func;
        Register userCredentials;
        boolean process = true;
        boolean menu;

        while(process) {
            menu = true;

            do {
                userCredentials = new Register();
                userCredentials.setLogin(Leitura.entDados("\nLogin: "));
                userCredentials.setSenha(Leitura.entDados("Senha: "));
                func = bd.checkLogin(userCredentials);
                if(func == null) {
                    Leitura.entDados("Login/Senha inválido!");
                }
            } while(func == null);
            
            while(menu) {
                switch(func.getPlataforma().getNivelAcesso()) {

                    case 1: 
                        menu = menuAtendente();
                        break;
                    case 2:
                        menu = menuComissionado((Comissionado) func);
                        break;
                    case 3:
                        menu = menuRh();
                        break;
                    case 4:
                        menu = menuAdmin();
                        break;
                }
            }
        }
    }
    //Metodos Atendente
    public static void cadCli() {

        cli = new Cliente();
        
        try {
            cli.setCpf(Leitura.entDados("CPF: "));
        }
        catch(MyException mye) {
            cli = (Cliente) mye.errorCpf(cli); 
        }

        if(bd.consCli(cli) != null) {
            Leitura.entDados("CPF já cadastrado!");
            return;
        }
        try {
            cli.setNome(Leitura.entDados("Nome: "));
        }
        catch(MyException mye) {
            cli = (Cliente) mye.errorNome(cli);
        }
        try {
            cli.setDtaNasc(Leitura.entDados("Data de Nascimento: "));
        }
        catch(MyException mye) {
            cli = (Cliente) mye.errorDtaNasc(cli);
        }
        try {
            cli.setCel(Leitura.entDados("Telefone: "));
        }
        catch(MyException mye) {
            cli = (Cliente) mye.errorCel(cli);
        }

        do {
            String quartosDisp = bd.quartosDisponiveis();
            System.out.println("Quartos disponíveis: " + quartosDisp);
            try{ 
                cli.setQuartoAloc(Integer.parseInt(Leitura.entDados("\nQuarto escolhido: "))-1);
            }
            catch(NumberFormatException nfe) {
                Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro.");
            }
        } while(bd.cadCli(cli) == null);
        bd.cadCli(cli);
    }
    public static void delCli() {

        cli = new Cliente();
        try {
            cli.setCpf(Leitura.entDados("\nCPF Cliente p/ check-out: "));
        }
        catch(MyException mye) {
            cli = (Cliente) mye.errorCpf(cli);  
        }
        cli = consCli();
        if(cli != null) {
            bd.delCli(cli);
            Leitura.entDados("Check-out realizado com sucesso!");
        }
        Leitura.entDados("Cliente não encontrado!");
    }
    public static Cliente consCli() {

        cli = new Cliente();

        try {
            cli.setCpf(Leitura.entDados("CPF: "));
        }
        catch(MyException mye) {
            cli = (Cliente) mye.errorCpf(cli);  
        }

        cli = bd.consCli(cli);

        if(cli != null) {
            System.out.println("Nome: " + cli.getNome());
            System.out.println("CPF: " + cli.getCpf());
            System.out.println("Data de Nascimento: " + cli.getDtaNasc());
            System.out.println("Telefone: " + cli.getCel());
            System.out.println("Quarto hospedado: " + (cli.getQuartoAloc()+1));
            Leitura.entDados("press <ENTER> to continue..");
            return cli;
        }
        Leitura.entDados("CPF não cadastrado!");
        return null;
    }
    //Metodos Comissionado
    public static boolean menuComissionado(Comissionado comissionado) {

        int opc = 0;

        System.out.println("\nDeseja:");
        System.out.println("1- Consultar produtos/valores.");
        System.out.println("2- Venda.");
        try {
            opc = Integer.parseInt(Leitura.entDados("3- Sair.\n"));
        }
        catch(NumberFormatException nfe) {
            Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue..");  
            return true;               
        }
        switch(opc) {
            case 1:
                for(Produto p : bd.getProduto()) {
                    System.out.println("--------------------");
                    System.out.println("ID   : " +p.getId());
                    System.out.println("Nome : " +p.getNome());
                    System.out.println("Valor: " +p.getValor());
                    System.out.println("--------------------");
                }
                if(bd.getProduto().size() == 0) {
                    Leitura.entDados("Nenhum produto cadastrado");
                }
                Leitura.entDados("Press <ENTER> to continue..");
                return true;
            case 2:
                produto = new Produto();
                produto.setId(Integer.parseInt(Leitura.entDados("ID produto vendido: ")));
                produto = bd.consProduto(produto);
                if(produto != null) {
                    comissionado.calcSalario(produto.getValor());
                    bd.altFunc(comissionado);
                    Leitura.entDados("Venda realizada, produto: " +produto.getNome());
                    return true;
                }
                Leitura.entDados("Produto não cadastrado!");
                return true;
            case 3:
                return false;
            default:
                Leitura.entDados("Opcao invalida. press <ENTER> to continue..");
                return true;
        }
    }
    //Metodos RH
    public static void cadFunc() {

        int tipoFunc = 0;
        Register userCredentials;
        assalariado = new Assalariado();
        comissionado = new Comissionado();
        horista = new Horista();
        
        
        System.out.println("\n1- Funcionário Assalariado.");
        System.out.println("2- Funcionário Comissionado.");
        System.out.println("3- Funcionário Horista.");
        try {
            tipoFunc = Integer.parseInt(Leitura.entDados("4- Sair.\n"));
        }
        catch(NumberFormatException nfe) {
            Leitura.entDados("\nEntrada invalida. A opcao deve ser um numero inteiro. press <ENTER> to continue..");
            return;
        }
        if(tipoFunc > 0 && tipoFunc < 4) {
            try {
                assalariado.setCpf(Leitura.entDados("CPF: "));
            }
            catch(MyException mye) {
                assalariado = (Assalariado) mye.errorCpf(assalariado); 
                    
            }
            if(bd.consFunc(assalariado) != null) {
                Leitura.entDados("CPF já cadastrado!");
                return;
            }
            try {
                assalariado.setNome(Leitura.entDados("Nome: "));
            }
            catch(MyException mye) {
                assalariado = (Assalariado) mye.errorNome(assalariado);
            }
            try {
                assalariado.setDtaNasc(Leitura.entDados("Data de Nascimento: "));
            }
            catch(MyException mye) {
                assalariado = (Assalariado) mye.errorDtaNasc(assalariado);
            }
            try {
                assalariado.setCel(Leitura.entDados("Telefone: "));
            }
            catch(MyException mye) {
                assalariado = (Assalariado) mye.errorCel(assalariado);
            }
        }
        switch(tipoFunc) {
            
            case 1:
                while(assalariado.getSalario() == 0.00) {
                    try{
                        assalariado.setSalario(Double.parseDouble(Leitura.entDados("Salario: ")));
                    }
                    catch(NumberFormatException nfe) {
                        Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue..");
                        assalariado.setSalario(0.00);
                    }
                }
                do {
                    int escolhaFuncao = 0;
                    System.out.println("Funcao:");
                    System.out.println("1- Atendente.");
                    System.out.println("2- Rh.");
                    try {
                        escolhaFuncao = Integer.parseInt(Leitura.entDados("3- Outro.\n"));
                    }
                    catch(NumberFormatException nfe) {
                        Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue..");
                        escolhaFuncao = 0;
                    }
                    if(escolhaFuncao == 1 || escolhaFuncao == 2) {
                        do {
                            userCredentials = new Register();
                            userCredentials.setLogin(Leitura.entDados("Cadastro login: "));
                            if(bd.checkExistingCredentials(userCredentials)) {
                                Leitura.entDados("Login já existente.");
                            }
                            else {
                                userCredentials.setSenha(Leitura.entDados("Cadastro senha: "));
                            }
                        } while(bd.checkExistingCredentials(userCredentials) || userCredentials.getLogin().length() == 0 || userCredentials.getSenha().length() == 0 || userCredentials.getLogin().equals("admin"));
                        if(escolhaFuncao == 1) {
                            assalariado.setFuncao("Atendente");
                            userCredentials.setNivelAcesso(1);
                        }
                        else {
                            assalariado.setFuncao(("Rh"));
                            userCredentials.setNivelAcesso(3);
                        }
                        assalariado.setPlataforma(userCredentials);
                    }
                    else if(escolhaFuncao == 3) {
                        assalariado.setFuncao(Leitura.entDados("Funcao: "));
                        assalariado.setPlataforma(null);
                    }
                    else {
                        Leitura.entDados("Opcao invalida. press <ENTER> to continue..");
                        assalariado.setFuncao("");
                    }
                } while(assalariado.getFuncao().isEmpty());
                bd.cadFunc(assalariado);
                return;
            case 2:
                comissionado = new Comissionado(assalariado);
                while(comissionado.getTaxaComissao() == 0.00) {
                    try {
                        comissionado.setTaxaComissao(Double.parseDouble(Leitura.entDados("Taxa de comissao: ")));
                    }
                    catch(NumberFormatException nfe) {
                        Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue.."); 
                        return;
                    }
                }
                do {
                    userCredentials = new Register();
                    userCredentials.setLogin(Leitura.entDados("Cadastro login: "));
                    if(bd.checkExistingCredentials(userCredentials)) {
                        Leitura.entDados("Login já existente.");    
                    }
                    else {
                        userCredentials.setSenha(Leitura.entDados("Cadastro senha: "));
                    }
                } while(bd.checkExistingCredentials(userCredentials) || userCredentials.getLogin().length() == 0 || userCredentials.getSenha().length() == 0);
                userCredentials.setNivelAcesso(2);
                comissionado.setPlataforma(userCredentials);
                bd.cadFunc(comissionado);
                return;
            case 3:
                horista = new Horista(assalariado);
                horista.setHorasTrab(0);
                while(horista.getPrecoHora() == 0.00) {
                    try {
                        horista.setPrecoHora(Double.parseDouble(Leitura.entDados("Preco hora: ")));
                    }
                    catch(NumberFormatException nfe) {
                        Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue..");
                        horista.setPrecoHora(0.00);
                    }
                }
                bd.cadFunc(horista);
                return;
            case 4:
                return;
    
            default:
                Leitura.entDados("opcao invalida. press <ENTER> to continue..");
                return;
        }
    }
    public static Funcionario consFunc() {

        assalariado = new Assalariado();
        comissionado = new Comissionado();
        horista = new Horista();
        Funcionario func = (Funcionario) new Assalariado();

        try {
            func.setCpf(Leitura.entDados("CPF para busca: "));
        }
        catch(MyException mye) {
            func = (Funcionario) mye.errorCpf(func);
        }
        if(bd.consFunc(func) != null) {
            System.out.println("\n1- CPF: " + bd.consFunc(func).getCpf());
            System.out.println("2- Nome: " + bd.consFunc(func).getNome());
            System.out.println("3- Data de Nascimento: " + bd.consFunc(func).getDtaNasc());
            System.out.println("4- Telefone: " + bd.consFunc(func).getCel());

            if(bd.consFunc(func) instanceof Assalariado) {
                assalariado = (Assalariado) bd.consFunc(func); 
                System.out.println("5- Função: " + assalariado.getFuncao());
                System.out.println("6- Salário: " + assalariado.getSalario());
                Leitura.entDados("press <ENTER> to continue..");
                return assalariado;
            }
            else if(bd.consFunc(func) instanceof Comissionado) {
                comissionado = (Comissionado) bd.consFunc(func);
                System.out.println("5- Taxa comissao: " + comissionado.getTaxaComissao());
                System.out.println("6- Salario: "+ comissionado.getSalario());
                Leitura.entDados("press <ENTER> to continue..");
                return comissionado;
            }
            else if(bd.consFunc(func) instanceof Horista) {
                horista = (Horista) bd.consFunc(func);
                System.out.println("5- Horas trabalhadas: "+ horista.getHorasTrab());
                System.out.println("6- Preco da hora trabalhada: " + horista.getPrecoHora());
                System.out.println("7- Salario: " + horista.getSalario());
                Leitura.entDados("press <ENTER> to continue..");
                return horista;
            }
        }
        Leitura.entDados("CPF não cadastrado!");
        return null;
    }
    public static void altFunc() {

        int funcAlt = 0;
        Assalariado assalariadoVerif = new Assalariado(assalariado);
        Comissionado comissionadoVerif = new Comissionado(comissionado);
        Horista horistaVerif = new Horista(horista);
        assalariado = new Assalariado();
        comissionado = new Comissionado();
        horista = new Horista();
        
        Funcionario func = consFunc();
        if(func instanceof Assalariado) {

            assalariado = (Assalariado) bd.consFunc(func);
            try {
                funcAlt = Integer.parseInt(Leitura.entDados("7- Sair.\n"));
            }
            catch(NumberFormatException nfe) {
                Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue.."); 
                return;
            }
            switch(funcAlt) { 
                case 1:
                    assalariadoVerif = new Assalariado(assalariado);

                    try {
                        assalariadoVerif.setCpf(Leitura.entDados("Novo CPF: "));
                    }
                    catch(MyException mye) {
                        assalariadoVerif = (Assalariado) mye.errorCpf(assalariado); 
                        return;
                            
                    }

                    String cpf = assalariadoVerif.getCpf();
                    assalariadoVerif = (Assalariado) bd.consFunc(assalariadoVerif);

                    if(assalariadoVerif == null) {
                        bd.delFunc(assalariado);
                        try {
                            assalariado.setCpf(cpf);
                        }
                        catch(MyException mye) {
                            assalariado = (Assalariado) mye.errorCpf(assalariado);
                        }
                        bd.cadFunc(assalariado);
                    }
                    else {
                        Leitura.entDados("Novo CPF já está cadastrado.");
                    }
                    return;
                case 2:
                    try {
                        assalariado.setNome(Leitura.entDados("Novo nome: "));
                        bd.altFunc(assalariado);
                    }
                    catch(MyException mye) {
                        assalariado = (Assalariado) mye.errorNome(assalariado);
                    }
                    return;
                case 3:
                    try {
                        assalariado.setDtaNasc(Leitura.entDados("Nova data de nascimento: "));
                        bd.altFunc(assalariado);
                    }
                    catch(MyException mye) {
                        assalariado = (Assalariado) mye.errorDtaNasc(assalariado);
                    }
                    return;
                case 4:
                    try {
                        assalariado.setCel(Leitura.entDados("Novo telefone: "));
                        bd.altFunc(assalariado);
                    }
                    catch(MyException mye) {
                        assalariado = (Assalariado) mye.errorDtaNasc(assalariado);
                    }
                    return;
                case 5:
                    assalariado.setFuncao(Leitura.entDados("Nova Funcao: "));
                    bd.altFunc(assalariado);
                    return;
                case 6:
                    try {
                        assalariado.setSalario(Double.parseDouble(Leitura.entDados("Novo Salário: ")));
                    }
                    catch(NumberFormatException nfe) {
                        Leitura.entDados("Entrada inválida. press <ENTER> to continue..");
                    }
                    return;
                case 7:
                    return;
                default:
                    Leitura.entDados("Opcao invalida. press <ENTER> to continue..");
                    return;
            }
        }
        else if(bd.consFunc(func) instanceof Comissionado) {
            comissionado = (Comissionado) bd.consFunc(func);
            try {
                funcAlt = Integer.parseInt(Leitura.entDados("7- Sair.\n"));
            }
            catch(NumberFormatException nfe) {
                Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue.."); 
                return;
            }
            switch(funcAlt) {
                case 1:
                    try {
                        comissionadoVerif.setCpf(Leitura.entDados("CPF: "));
                    }
                    catch(MyException mye) {
                        comissionadoVerif = (Comissionado) mye.errorCpf(comissionadoVerif); 
                        return;
                            
                    }
                    String cpf = comissionadoVerif.getCpf();
                    comissionadoVerif = (Comissionado) bd.consFunc(comissionado);

                    if(comissionadoVerif == null) {
                        bd.delFunc(comissionado);
                        try {
                            comissionado.setCpf(cpf);
                            bd.cadFunc(comissionado);
                            return;
                        }
                        catch(MyException mye) {
                            comissionado = (Comissionado) mye.errorCpf(comissionado);
                        }
                        return;
                    }
                    else {
                        Leitura.entDados("Novo CPF já cadastrado!");
                    }
                    return;
                case 2:
                    try {
                        comissionado.setNome(Leitura.entDados("Nome: "));
                        bd.altFunc(comissionado);
                    }
                    catch(MyException mye) {
                        comissionado = (Comissionado) mye.errorNome(comissionado);
                    }
                    return;
                case 3:
                    try {
                        comissionado.setDtaNasc(Leitura.entDados("Data de Nascimento: "));
                        bd.altFunc(comissionado);
                    }
                    catch(MyException mye) {
                        comissionado = (Comissionado) mye.errorDtaNasc(comissionado);
                    }
                    return;
                case 4:
                    try {
                        comissionado.setCel(Leitura.entDados("Telefone: "));
                        bd.altFunc(comissionado);
                    }
                    catch(MyException mye) {
                        comissionado = (Comissionado) mye.errorCel(comissionado);
                    }
                    return;
                case 5:
                    try {
                        comissionado.setTaxaComissao(Double.parseDouble(Leitura.entDados("Taxa de comissao: ")));
                        bd.altFunc(comissionado);
                    }
                    catch(NumberFormatException nfe) {
                        Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue.."); 
                    }
                    return;
                case 6:
                    try {
                        comissionado.setSalario(Double.parseDouble(Leitura.entDados("Novo Salário: ")));
                    }
                    catch(NumberFormatException nfe) {
                        Leitura.entDados("Entrada inválida. press <ENTER> to continue..");
                    }
                    return;
                case 7:
                    return;
                default:
                    Leitura.entDados("Opcao invalida. press <ENTER> to continue..");
                    return;
            }
        }
        else if(bd.consFunc(horista) instanceof Horista) {
            horista = (Horista) bd.consFunc(func);
            try {
                funcAlt = Integer.parseInt(Leitura.entDados("8- Sair.\\n"));
            }
            catch(NumberFormatException nfe) {
                Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue.."); 
                return;
            }
            switch(funcAlt) {
                case 1:
                    try {
                        horistaVerif.setCpf(Leitura.entDados("CPF: "));
                    }
                    catch(MyException mye) {
                        horistaVerif = (Horista) mye.errorCpf(horistaVerif); 
                            
                    }

                    String cpf = horistaVerif.getCpf();
                    horistaVerif = (Horista) bd.consFunc(horista);

                    if(horistaVerif == null) {
                        bd.delFunc(horista);
                        try {
                            horista.setCpf(cpf);
                        }
                        catch(MyException mye) {
                            horista = (Horista) mye.errorCpf(horista);
                        }
                        bd.cadFunc(horista);
                    }
                    return;
                case 2:
                    try {
                        horista.setNome(Leitura.entDados("Nome: "));
                        bd.altFunc(horista);
                    }
                    catch(MyException mye) {
                        horista = (Horista) mye.errorNome(horista);
                    }
                    return;
                case 3:
                    try {
                        horista.setDtaNasc(Leitura.entDados("Data de Nascimento: "));
                        bd.altFunc(horista);
                    }
                    catch(MyException mye) {
                        horista = (Horista) mye.errorDtaNasc(horista);
                    }
                    return;
                case 4:
                    try {
                        horista.setCel(Leitura.entDados("Telefone: "));
                        bd.altFunc(horista);
                    }
                    catch(MyException mye) {
                        horista = (Horista) mye.errorCel(horista);
                    }
                    return;
                case 5:
                    try {
                        horista.calcSalario(Double.parseDouble(Leitura.entDados("Horas trabalhadas: ")));
                        bd.altFunc(horista);
                    }
                    catch(NumberFormatException nfe) {
                        Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue..");
                    }
                    return;
                case 6:
                    try {
                        horista.setPrecoHora(Double.parseDouble(Leitura.entDados("Preco hora: ")));
                        bd.altFunc(horista);
                    }
                    catch(NumberFormatException nfe) {
                        Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue..");
                    }
                    return;
                case 7:
                    try {
                        horista.setSalario(Double.parseDouble(Leitura.entDados("Novo Salário: ")));
                    }
                    catch(NumberFormatException nfe) {
                        Leitura.entDados("Entrada inválida. press <ENTER> to continue..");
                    }
                    return;
                case 8:
                    return;
                default:
                    Leitura.entDados("Opcao invalida. press <ENTER> to continue..");
                    return;
            }
        } 
    }
    public static boolean menuAtendente() {
        int opc = 0;

        System.out.println("\nDeseja:");
        System.out.println("1- Check-in cliente.");
        System.out.println("2- Check-out cliente.");
        System.out.println("3- Dados do cliente.");
        try {
        opc = Integer.parseInt(Leitura.entDados("4- Sair.\n"));
        }
        catch(NumberFormatException nfe) {
            Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue..");                 
            opc = 0;
        }
        switch(opc) {
            case 1:
                cadCli();
                break;
            case 2:
                delCli();
                break;
            case 3:
                consCli();
                break;
            case 4:
                return false;
            default:
                Leitura.entDados("Opcao invalida. press <ENTER> to continue..");
                break;
        }
        return true;
    }
    public static boolean menuRh() {

        assalariado = new Assalariado();
        comissionado = new Comissionado();
        horista = new Horista();
        int opc = 0;
            
        System.out.println("\nDeseja:");
        System.out.println("1- cadastrar novo funcionario.");
        System.out.println("2- Consultar dados de um funcionario.");
        System.out.println("3- Atualizar dados de um funcionario.");
        try {
            opc = Integer.parseInt(Leitura.entDados("4- Sair.\n"));
        }
        catch(NumberFormatException nfe) {
            Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro. press <ENTER> to continue.."); 
            return true;          
        }
        switch(opc) {
            
            case 1:
                cadFunc();
                break;
        
            case 2:
                consFunc();
                break;
        
            case 3:
                altFunc();
                break;
        
            case 4:
                return false;
            default:
                Leitura.entDados("Opcao invalida. press <ENTER> to continue..");
                return true;
        }
        return true;
    }
    public static boolean menuAdmin() {
        int opc = 0;
        int escolha = 0;

        System.out.println("\nDeseja:");
        try {
            escolha = Integer.parseInt(Leitura.entDados("\n1- Consultar logins/senhas.\n2- Gerenciar produtos.\n3- Sair\n"));
        }
        catch(NumberFormatException nfe) {
            Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro.");
            return true;
        }
        switch(escolha) {
            case 1:
                for(Funcionario usersCredentials : bd.getBdFunc()) {
                    System.out.println("------------------------------------");
                    System.out.println("User        : " +usersCredentials.getPlataforma().getLogin());
                    System.out.println("Senha       : " +usersCredentials.getPlataforma().getSenha());
                    System.out.println("Nivel Acesso: "+usersCredentials.getPlataforma().getNivelAcesso());
                }
                if(bd.getBdFunc().isEmpty()) {
                    System.out.println("Nenhum usuário cadastrado!");
                    Leitura.entDados("Pressione <ENTER> para gerar um usuário inicial.");
                    try {
                        assalariado = new Assalariado();
                        assalariado.setCpf("00000000000");
                        assalariado.setNome("RH_TI");
                        assalariado.setDtaNasc("00000000");
                        assalariado.setCel("00000000000");
                        assalariado.setSalario(0.00);
                        assalariado.setFuncao("RH- TI");
                        assalariado.getPlataforma().setLogin("rh-ti");
                        assalariado.getPlataforma().setSenha("admin");
                        assalariado.getPlataforma().setNivelAcesso(3);
                        bd.cadFunc(assalariado);
                    }
                    catch(MyException mye) {
                        Leitura.entDados("Error");
                            
                    }
                    catch(NumberFormatException nfe) {
                        Leitura.entDados("Error");       
                    }
                    System.out.println("----------- RH ---------------");
                    System.out.println("Login: " + assalariado.getPlataforma().getLogin());
                    Leitura.entDados("Senha: " + assalariado.getPlataforma().getSenha());
                }
                
                return true;
            case 2:
                opc = 0;
                try {
                    opc = Integer.parseInt(Leitura.entDados("\n1- Cadastrar produto\n2- Alterar produto.\n3- Remover produto\n"));
                }
                catch(NumberFormatException nfe) {
                    Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro.");
                    return true;
                }
                switch(opc) {
                    case 1:
                        produto = new Produto();
                        produto.setNome(Leitura.entDados("Nome: "));
                        if(produto.getNome().length() == 0) {
                            Leitura.entDados("Erro, nome vazio!");
                            return true;
                        }
                        try {
                            produto.setValor(Double.parseDouble(Leitura.entDados("Valor: ")));
                        }
                        catch(NumberFormatException nfe) {
                            Leitura.entDados("Campo ID/Valor aceita somente números.");
                            return true;
                        }
                        if(bd.consProduto(produto) != null) {
                            Leitura.entDados("Produto já cadastrado");
                            return true;
                        }
                        bd.cadProduto(produto); 
                        return true;
                    case 2:
                        produto = new Produto();
                        try {
                            produto.setId(Integer.parseInt(Leitura.entDados("ID produto: ")));
                        }
                        catch(NumberFormatException nfe) {
                            Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro.");
                            return true;
                        }
                        int alterar;
                        if(bd.consProduto(produto) != null) {
                            produto = bd.consProduto(produto);
                            System.out.println("ID: " +produto.getId());
                            System.out.println("1- Nome: " +produto.getNome());
                            System.out.println("2- Preco: " +produto.getValor());
                            try {
                                alterar = Integer.parseInt(Leitura.entDados("Qual função deseja alterar: "));
                            }
                            catch(NumberFormatException nfe) {
                                Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro.");
                                return true;
                            }
                            if(alterar == 1) {
                                produto.setNome(Leitura.entDados("Novo nome: "));
                                bd.altProduto(produto);
                            }
                            else if(alterar == 2) {
                                try {
                                    produto.setValor(Double.parseDouble(Leitura.entDados("Novo preco: ")));
                                    bd.altProduto(produto);
                                }
                                catch(NumberFormatException nfe) {
                                    Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro.");
                                    return true;
                                } 
                            }
                            return true;
                        }
                        Leitura.entDados("Produto não encontrado!");
                        return true;
                    case 3:
                        produto = new Produto();
                        try {
                            produto.setId(Integer.parseInt(Leitura.entDados("ID produto: ")));
                        }
                        catch(NumberFormatException nfe) {
                            Leitura.entDados("Entrada inválida. A opção deve ser um número inteiro.");
                            return true;
                        }
                        if(bd.consProduto(produto) != null) {
                            produto = bd.consProduto(produto);
                            bd.delProduto(produto);
                            Leitura.entDados("Produto removido com sucesso!");
                            return true;
                        }
                        Leitura.entDados("Produto não encontrado!");
                }
                return true;
            case 3:
                return false;
        }
        Leitura.entDados("Opção inválida!");
        return true;
    }
}
    