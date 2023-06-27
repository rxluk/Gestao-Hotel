//Lucas Gabriel Costa

import java.util.List;
import java.util.ArrayList;

public class Banco {

    private List<Funcionario> bdFuncionario; 
    private List<Cliente> bdCli;
    private List<Produto> bdProduto;
    private Hotel h;
    private static Banco instance;
    
    private Banco() {
    bdFuncionario = new ArrayList<Funcionario>();
    bdCli = new ArrayList<Cliente>();
    bdProduto = new ArrayList<Produto>();
    h = new Hotel();
    }
    public static Banco getInstance() {
        if(instance == null) {
            instance = new Banco();
        }
        return instance;
    }
    public List<Produto> getBdProduto() {
        return bdProduto;
    }
    public List<Funcionario> getBdFunc() {
        return bdFuncionario;
    }
    public List <Cliente> getBdCli() {
        return bdCli;
    }
    public boolean checkExistingCredentials(Register userCredentials) {
        return bdFuncionario.stream().map(funcionario -> funcionario.getPlataforma().getLogin()).anyMatch(login -> login.equals(userCredentials.getLogin()));
    }
    public Funcionario checkLogin(Register userCredentials) {
        if(userCredentials.getLogin().equals("admin")) {
            if(userCredentials.getSenha().equals("admin")) {
                userCredentials.setNivelAcesso(4);
                Assalariado func = new Assalariado();
                func.setPlataforma(userCredentials);
                return func;
            }
        }
        for(int i = 0; i < bdFuncionario.size(); i++) {
            if(bdFuncionario.get(i).getPlataforma().getLogin().equals(userCredentials.getLogin())) {
                if(bdFuncionario.get(i).getPlataforma().getSenha().equals(userCredentials.getSenha())) {
                    return bdFuncionario.get(i);
                }
            }
        }
        return null;
    }
    public Cliente cadCli(Cliente cli) {

        if(consCli(cli) == null) {
            if(h.getQuartoStatus(cli.getQuartoAloc())) {
                h.setQuartoStatus(false, cli.getQuartoAloc());
                bdCli.add(cli);
                return cli;
            }
        }
        return null;
    }
    public Cliente delCli(Cliente cli) {
        if(consCli(cli) != null) {
            h.setQuartoStatus(true, cli.getQuartoAloc());
            bdCli.remove(consCli(cli));
            return null;
        }
        return consCli(cli);
    }
    public Cliente consCli(Cliente cli) {
        for(int i = 0; i < bdCli.size(); i++) {
			if(cli.getCpf().equals(bdCli.get(i).getCpf())){
				return bdCli.get(i);
			}
		}
        return null;
    }
    public Cliente altCli(Cliente cli) {
        if(consCli(cli) != null) {
            Integer index = searchIndex(consCli(cli), bdCli);
            if(index != null) {
                bdCli.set(index, cli);
                return bdCli.get(index);
            }
        }
        return null;
    }
    public Funcionario delFunc(Funcionario func) {
        if(consFunc(func) != null) {
            Funcionario funcRemovido = func;
            bdFuncionario.remove(consFunc(func));
            return funcRemovido;
        }
        return null;
    }
    public Funcionario cadFunc(Funcionario func) {
        if(consFunc(func) == null) {
            bdFuncionario.add(func);
            return func;
        }
        return null;
    }
    public Funcionario consFunc(Funcionario func) {
        for(int i = 0; i < bdFuncionario.size(); i++) {
            if(func.getCpf().equals(bdFuncionario.get(i).getCpf())) {
                return bdFuncionario.get(i);
            }
        }
        return null;
    }
    public Funcionario altFunc(Funcionario func) {
        if(consFunc(func) != null) {
            Integer index = searchIndex(consFunc(func), bdFuncionario);
            if(index != null) {
                bdFuncionario.set(index, func);
                return bdFuncionario.get(index);
            }
        }
        return null;
    }
    public <T> Integer searchIndex(T object, List<T> bdList) {
        for(int i = 0; i < bdList.size(); i++) {
            if(object.equals(bdList.get(i))) {
                return i;
            }
        }
        return null;
    }
    public List<Produto> getProduto() {
        return bdProduto;
    }
    public Produto consProduto(Produto produto) {
        for(int i = 0; i < bdProduto.size(); i++) {
            if(produto.getId() == bdProduto.get(i).getId()) {
                return bdProduto.get(i);
            }
        }
        return null;
    }
    public Produto cadProduto(Produto produto) {
        if(consProduto(produto) == null) {
            produto.setId(bdProduto.size()+1);
            bdProduto.add(produto);
            return produto;
        }
        return null;
    }
    public Produto altProduto(Produto produto) {
        if(consProduto(produto) != null) {
            Integer index = searchIndex(produto, bdProduto);
            if(index != null) {
                bdProduto.set(index, produto);
                return bdProduto.get(index);
            }
        }
        return null;
    }
    public Produto delProduto(Produto produto) {
        if(consProduto(produto) != null) {
            Produto prodRemovido = produto;
            bdProduto.remove(consProduto(produto));
            return prodRemovido;
        }
        return null;
    }
    public boolean[] getQuartoStatus() {
        return h.getQuartoStatus();
    }
    public int[] quartosDisponiveis() {
        int[] quartoDisp = new int[h.getMaxQrt()];
        int index = 0;
        for(int i = 0; i < h.getMaxQrt(); i++) {
            if(h.getQuartoStatus(i)) {
               quartoDisp[index] = (i+1);
               index++;
            }
        }
        return quartoDisp;
    }
}