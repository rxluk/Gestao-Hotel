//Lucas Gabriel Costa

import javax.swing.JOptionPane;


public class CadFuncAssalariado extends javax.swing.JFrame {
    
    Assalariado assalariado;
    Banco bd = Banco.getInstance();
    public static CadFuncAssalariado cadFuncAssalariado;
    public static CadFuncAssalariado getCadFuncAssalariado() {
        if(cadFuncAssalariado == null) {
            cadFuncAssalariado = new CadFuncAssalariado();
        }
        cadFuncAssalariado.setVisible(true);
        cadFuncAssalariado.setLocationRelativeTo(null);
        cadFuncAssalariado.limpDados();
        return cadFuncAssalariado;
    }
    private CadFuncAssalariado() {
        initComponents();
    }
    public void limpDados() {
        cxCpf.setText("");
        cxCel.setText("");
        cxNome.setText("");
        cxSalario.setText("");
        cbDia.setSelectedIndex(0);
        cbMes.setSelectedIndex(0);
        cbAno.setSelectedIndex(0);
        cbAlterar.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoEsq = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblRH = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblDtaNasc = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        cxCel = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        cxSalario = new javax.swing.JTextField();
        lblFuncao = new javax.swing.JLabel();
        cbFuncao = new javax.swing.JComboBox<>();
        btEnviar = new javax.swing.JButton();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        cbAno = new javax.swing.JComboBox<>();
        btVoltar = new javax.swing.JButton();
        valorCpf = new javax.swing.JLabel();
        valorNome = new javax.swing.JLabel();
        valorDtaNasc = new javax.swing.JLabel();
        valorCel = new javax.swing.JLabel();
        valorSalario = new javax.swing.JLabel();
        valorFuncao = new javax.swing.JLabel();
        cbAlterar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        fundoEsq.setBackground(new java.awt.Color(153, 153, 153));

        lblMenu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMenu.setText("Menu");

        lblRH.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblRH.setText("RH");

        javax.swing.GroupLayout fundoEsqLayout = new javax.swing.GroupLayout(fundoEsq);
        fundoEsq.setLayout(fundoEsqLayout);
        fundoEsqLayout.setHorizontalGroup(
            fundoEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoEsqLayout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addGroup(fundoEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoEsqLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblRH, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        fundoEsqLayout.setVerticalGroup(
            fundoEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoEsqLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCpf.setText("CPF:");

        lblNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNome.setText("Nome:");

        lblDtaNasc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDtaNasc.setText("Data de Nascimento:");

        lblTel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTel.setText("Telefone:");

        cxCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfActionPerformed(evt);
            }
        });

        lblSalario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSalario.setText("Salario:");

        lblFuncao.setText("Função:");

        cbFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "....", "Atendente", "Rh", "Outro" }));
        cbFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuncaoActionPerformed(evt);
            }
        });

        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiaActionPerformed(evt);
            }
        });

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        cbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMesActionPerformed(evt);
            }
        });

        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", " " }));

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        valorCpf.setText("jLabel2");

        valorNome.setText("jLabel2");

        valorDtaNasc.setText("jLabel2");

        valorCel.setText("jLabel2");

        valorSalario.setText("jLabel2");

        valorFuncao.setText("jLabel2");

        cbAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alterar..", "Nome", "Telefone", "Salario", "Funcao" }));
        cbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundoEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDtaNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorDtaNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFuncao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCpf)
                                    .addComponent(lblNome))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(valorCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(valorNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorCel, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btEnviar))
                    .addComponent(cbFuncao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cxSalario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxCel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxCpf)
                    .addComponent(cxNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoEsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorNome))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtaNasc)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorDtaNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorCel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cxCel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalario)
                    .addComponent(valorSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFuncao)
                        .addComponent(valorFuncao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnviar)
                    .addComponent(btVoltar)
                    .addComponent(cbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfActionPerformed

    private void cbFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFuncaoActionPerformed

    private void cbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDiaActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        assalariado = new Assalariado();
        
        try {
            assalariado.setCpf(cxCpf.getText());
        }
        catch(MyException mye) {
            return;

        }
        if(bd.consFunc(assalariado) != null) {
            JOptionPane.showMessageDialog(null,"CPF já cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            assalariado.setNome(cxNome.getText());
        }
        catch(MyException mye) {
            return;
        }
         try {
            String dia = (String) cbDia.getSelectedItem();
            String mes;
            if((cbMes.getSelectedIndex() +1) < 10) {
               mes = "0" + Integer.toString(cbMes.getSelectedIndex()+1); 
            }
            else {
                mes = Integer.toString(cbMes.getSelectedIndex()+1);
            }
            String ano = (String) cbAno.getSelectedItem();
            String data = dia+mes+ano;
            assalariado.setDtaNasc(data);
        }
        catch(MyException mye) {
            return;
        }
        try {
            assalariado.setCel(cxCel.getText());
        }
        catch(MyException mye) {
            return;
        }
         try{
            assalariado.setSalario(Double.valueOf(cxSalario.getText()));
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null,"Erro no cadastro!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        assalariado.setFuncao((String) cbFuncao.getSelectedItem());
        switch (assalariado.getFuncao()) {
            case "..." -> {
                JOptionPane.showMessageDialog(null,"Erro no cadastro, função vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
                assalariado = null;
                return;
            }
            case "Rh", "Atendente" -> {
                Register userAcess = new Register();
                do {
                    userAcess.setLogin(JOptionPane.showInputDialog(null, "Login p/ sistema: ", "Cadstro Funcionário", JOptionPane.PLAIN_MESSAGE));
                    if(bd.checkExistingCredentials(userAcess)) {
                        JOptionPane.showMessageDialog(null,"Login já existente!", "Erro Cadastro", JOptionPane.ERROR_MESSAGE);
                    }
                    else {
                        userAcess.setSenha(JOptionPane.showInputDialog(null, "Senha p/ sistema: ", "Cadstro Funcionário", JOptionPane.PLAIN_MESSAGE));
                    }
                } while(bd.checkExistingCredentials(userAcess) || userAcess.getLogin().length() == 0 || userAcess.getSenha().length() == 0 || userAcess.getLogin().equals("admin"));
                if(assalariado.getFuncao().equals("Rh")) {
                    userAcess.setNivelAcesso(3);
                }
                else {
                    userAcess.setNivelAcesso(1);
                }   assalariado.setPlataforma(userAcess);
            }
            case "Outro" -> {
                assalariado.setFuncao(JOptionPane.showInputDialog(null, "Informe a funcão", "Cadstro Funcionário", JOptionPane.PLAIN_MESSAGE));
                assalariado.setPlataforma(null);
            }
            default -> {
                assalariado = null;
                return;
            }
        }
        bd.cadFunc(assalariado);
        dispose();
        MenuRh.getMenuRh();
    }//GEN-LAST:event_btEnviarActionPerformed
    public void showAtributes(boolean status) {
        valorCel.setVisible(status);
        valorCpf.setVisible(status);
        valorDtaNasc.setVisible(status);
        valorFuncao.setVisible(status);
        valorNome.setVisible(status);
        valorSalario.setVisible(status);
        btEnviar.setVisible(!status);
        cbAno.setVisible(!status);
        cbMes.setVisible(!status);
        cbDia.setVisible(!status);
        cxCel.setVisible(!status);
        cxCpf.setVisible(!status);
        cbFuncao.setVisible(!status);
        cxNome.setVisible(!status);
        cxSalario.setVisible(!status);
        cbAlterar.setVisible(false);
    }
    public void consFunc(Assalariado assalariado) {
        if(assalariado != null) {
        showAtributes(true);
            valorCel.setText(assalariado.getCel());
            valorCpf.setText(assalariado.getCpf());
            valorDtaNasc.setText(assalariado.getDtaNasc());
            valorFuncao.setText(assalariado.getFuncao());
            valorNome.setText(assalariado.getNome());
            valorSalario.setText(Double.toString(assalariado.getSalario()));
        }
    }
    public void altFunc(Assalariado assalariado) {
        consFunc(assalariado);
        cbAlterar.setVisible(true);
    }
    public Funcionario getFunc() {
        Funcionario func = (Funcionario) new Assalariado();
        try {
            func.setCpf(valorCpf.getText());
        }
        catch(MyException mye) {
        }
        return bd.consFunc(func);
    }
    private void cbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMesActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
        MenuRh.getMenuRh();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void cbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlterarActionPerformed
        if(cbAlterar.getSelectedIndex() != 0) {
            Assalariado assalariado = (Assalariado) getFunc();
            switch(cbAlterar.getSelectedIndex()) {
                case 1:
                    try {
                        assalariado.setNome(JOptionPane.showInputDialog(null, "Informe novo Nome", "Alterar Func", JOptionPane.PLAIN_MESSAGE));
                    } catch (MyException ex) {
                        return;
                    }
                    break;
                case 2:
                    try {
                        assalariado.setCel(JOptionPane.showInputDialog(null, "Informe novo Telefone", "Alterar Func", JOptionPane.PLAIN_MESSAGE));
                    } catch (MyException ex) {
                        return;
                    }
                    break;
                case 3:
                    assalariado.setSalario(Double.valueOf(JOptionPane.showInputDialog(null, "Informe novo Salário", "Alterar Func", JOptionPane.PLAIN_MESSAGE)));
                    break;
                case 4:
                    assalariado.setFuncao(JOptionPane.showInputDialog(null, "Informe nova funcao", "Alterar Func", JOptionPane.PLAIN_MESSAGE));
                    Register userAcess = new Register();
                    if(assalariado.getFuncao().equalsIgnoreCase("rh")){
                            userAcess.setLogin(JOptionPane.showInputDialog(null, "Informe novo Login", "Alterar Func", JOptionPane.PLAIN_MESSAGE));
                            userAcess.setSenha(JOptionPane.showInputDialog(null, "Informe nova senha", "Alterar Func", JOptionPane.PLAIN_MESSAGE));
                            userAcess.setNivelAcesso(3);
                            assalariado.setPlataforma(userAcess);
                    }
                    else if(assalariado.getFuncao().equalsIgnoreCase("atendente")) {
                        userAcess.setLogin(JOptionPane.showInputDialog(null, "Informe novo Login", "Alterar Func", JOptionPane.PLAIN_MESSAGE));
                        userAcess.setSenha(JOptionPane.showInputDialog(null, "Informe nova senha", "Alterar Func", JOptionPane.PLAIN_MESSAGE));
                        userAcess.setNivelAcesso(1);
                        assalariado.setPlataforma(userAcess);
                    }
                    else{
                        assalariado.setPlataforma(null);
                    }
                    break;
                default:
                    return;
            }
            bd.altFunc(assalariado);
            dispose();
            MenuRh.getMenuRh();
        }
    }//GEN-LAST:event_cbAlterarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuRh.getMenuRh();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbAlterar;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbFuncao;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JTextField cxCel;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxSalario;
    private javax.swing.JPanel fundoEsq;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDtaNasc;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRH;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel valorCel;
    private javax.swing.JLabel valorCpf;
    private javax.swing.JLabel valorDtaNasc;
    private javax.swing.JLabel valorFuncao;
    private javax.swing.JLabel valorNome;
    private javax.swing.JLabel valorSalario;
    // End of variables declaration//GEN-END:variables
}
