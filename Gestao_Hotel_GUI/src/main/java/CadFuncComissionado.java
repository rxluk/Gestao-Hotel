//Lucas Gabriel Costa

import javax.swing.JOptionPane;


public class CadFuncComissionado extends javax.swing.JFrame {
    
    Comissionado comissionado;
    Banco bd = Banco.getInstance();
    public static CadFuncComissionado cadFuncComissionado;
    private CadFuncComissionado() {
        initComponents();
    }
    public void limpDados() {
        cbDia.setSelectedIndex(0);
        cbMes.setSelectedIndex(0);
        cbAno.setSelectedIndex(0);
        cbAlterar.setSelectedIndex(0);
        cxLogin.setText("");
        cxNome.setText("");
        cxSenha.setText("");
        cxCel.setText("");
        cxCpf.setText("");
        cxTaxaComissao.setText("");
    }
    public static CadFuncComissionado getCadFuncComissionado() {
        if(cadFuncComissionado == null) {
            cadFuncComissionado = new CadFuncComissionado();
        }
        cadFuncComissionado.setVisible(true);
        cadFuncComissionado.setLocationRelativeTo(null);
        cadFuncComissionado.limpDados();
        return cadFuncComissionado;
    }
    public Funcionario getFunc() {
        Funcionario func = (Funcionario) new Comissionado();
        try {
            func.setCpf(valorCpf.getText());
        }
        catch(MyException mye) {
        }
        return bd.consFunc(func);
    }
    public void consFunc(Comissionado comissionado) {
        if(comissionado != null) {
            showAtributes(true);
            valorTelefone.setText(comissionado.getCel());
            valorCpf.setText(comissionado.getCpf());
            valorDtaNasc.setText(comissionado.getDtaNasc());
            valorNome.setText(comissionado.getNome());
            valorTaxaComissao.setText(Double.toString(comissionado.getTaxaComissao()));
            valorLogin.setText(comissionado.getPlataforma().getLogin());
            valorSenha.setText(comissionado.getPlataforma().getSenha());
        }
    }
    public void altFunc(Comissionado comissionado) {
        consFunc(comissionado);
        cbAlterar.setVisible(true);
    }
    public void showAtributes(boolean status) {
        valorTelefone.setVisible(status);
        valorCpf.setVisible(status);
        valorDtaNasc.setVisible(status);
        valorNome.setVisible(status);
        valorTaxaComissao.setVisible(status);
        valorLogin.setVisible(status);
        valorSenha.setVisible(status);
        btEnviar.setVisible(!status);
        cbAno.setVisible(!status);
        cbMes.setVisible(!status);
        cbDia.setVisible(!status);
        cxCel.setVisible(!status);
        cxCpf.setVisible(!status);
        cxLogin.setVisible(!status);
        cxSenha.setVisible(!status);
        cxTaxaComissao.setVisible(!status);
        cxNome.setVisible(!status);
        cbAlterar.setVisible(false);
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
        cxTaxaComissao = new javax.swing.JTextField();
        lblTaxaComissao = new javax.swing.JLabel();
        btEnviar = new javax.swing.JButton();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        cbAno = new javax.swing.JComboBox<>();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        cxLogin = new javax.swing.JTextField();
        cxSenha = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        valorCpf = new javax.swing.JLabel();
        valorNome = new javax.swing.JLabel();
        valorDtaNasc = new javax.swing.JLabel();
        valorSenha = new javax.swing.JLabel();
        valorLogin = new javax.swing.JLabel();
        valorTelefone = new javax.swing.JLabel();
        valorTaxaComissao = new javax.swing.JLabel();
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
            .addGroup(fundoEsqLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(fundoEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoEsqLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblRH, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
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

        lblTaxaComissao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTaxaComissao.setText("Taxa Comissão:");

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

        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", " " }));

        lblLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblLogin.setText("Login:");

        lblSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSenha.setText("Senha:");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        valorCpf.setText("jLabel1");

        valorNome.setText("jLabel1");

        valorDtaNasc.setText("jLabel1");

        valorSenha.setText("jLabel1");

        valorLogin.setText("jLabel1");

        valorTelefone.setText("jLabel1");

        valorTaxaComissao.setText("jLabel1");

        cbAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alterar..", "Nome", "Telefone", "Taxa" }));
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
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btEnviar))
                            .addComponent(cxLogin)
                            .addComponent(cxSenha)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblTaxaComissao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valorTaxaComissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblTel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valorTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblDtaNasc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valorDtaNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valorNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(valorCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(fundoEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(231, 231, 231)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cxCel)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cbAno, 0, 61, Short.MAX_VALUE))
                        .addComponent(cxNome)
                        .addComponent(cxCpf)
                        .addComponent(cxTaxaComissao, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(valorCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(valorNome))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtaNasc)
                    .addComponent(valorDtaNasc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(valorTelefone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaxaComissao)
                    .addComponent(valorTaxaComissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin)
                    .addComponent(valorLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha)
                    .addComponent(valorSenha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnviar)
                    .addComponent(btVoltar)
                    .addComponent(cbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cxCel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cxTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 149, Short.MAX_VALUE))
                .addComponent(fundoEsq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfActionPerformed

    private void cbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDiaActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        comissionado = new Comissionado();
        try {
            comissionado.setCpf(cxCpf.getText());
        }
        catch(MyException mye) {
            return;

        }
        if(bd.consFunc(comissionado) != null) {
            JOptionPane.showMessageDialog(null,"CPF já cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            comissionado.setNome(cxNome.getText());
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
            comissionado.setDtaNasc(data);
        }
        catch(MyException mye) {
            return;
        }
        
        try {
            comissionado.setCel(cxCel.getText());
        }
        catch(MyException mye) {
            return;
        }
        comissionado.setSalario(0.00);
        comissionado.setTaxaComissao(Double.parseDouble(cxTaxaComissao.getText()));
        Register userAcess = new Register();
        userAcess.setLogin(cxLogin.getText());
        if(bd.checkExistingCredentials(userAcess) || userAcess.getLogin().length() == 0 || userAcess.getLogin().equals("admin")) {
            JOptionPane.showMessageDialog(null,"Login já existente!", "Erro Cadastro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else {
            userAcess.setSenha(cxSenha.getText());
            if(userAcess.getSenha().length()== 0) {
                JOptionPane.showMessageDialog(null,"Digite uma senha válida!", "Erro Cadastro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            userAcess.setNivelAcesso(2);
            comissionado.setPlataforma(userAcess);
            bd.cadFunc(comissionado);
        }
        dispose();
        MenuRh.getMenuRh();
    }//GEN-LAST:event_btEnviarActionPerformed

    private void cbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlterarActionPerformed
        if(cbAlterar.getSelectedIndex() != 0) { 
            Comissionado comissionado = (Comissionado) getFunc();
            switch(cbAlterar.getSelectedIndex()) {
                case 1:
                    try {
                        comissionado.setNome(JOptionPane.showInputDialog(null, "Informe novo Nome", "Alterar Func", JOptionPane.PLAIN_MESSAGE));
                    } catch (MyException ex) {
                        return;
                    }
                    break;
                case 2:
                    try {
                        comissionado.setCel(JOptionPane.showInputDialog(null, "Informe novo Telefone", "Alterar Func", JOptionPane.PLAIN_MESSAGE));
                    } catch (MyException ex) {
                        return;
                    }
                    break;
                case 3:
                    comissionado.setTaxaComissao(Double.valueOf(JOptionPane.showInputDialog(null, "Informe nova Taxa de comissão", "Alterar Func", JOptionPane.PLAIN_MESSAGE)));
                    break;
                default:
                    return;
            }
            bd.altFunc(comissionado);
            dispose();
            MenuRh.getMenuRh();
        }
    }//GEN-LAST:event_cbAlterarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
        MenuRh.getMenuRh();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuRh.getMenuRh();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbAlterar;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JTextField cxCel;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxLogin;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxSenha;
    private javax.swing.JTextField cxTaxaComissao;
    private javax.swing.JPanel fundoEsq;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDtaNasc;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRH;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTaxaComissao;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel valorCpf;
    private javax.swing.JLabel valorDtaNasc;
    private javax.swing.JLabel valorLogin;
    private javax.swing.JLabel valorNome;
    private javax.swing.JLabel valorSenha;
    private javax.swing.JLabel valorTaxaComissao;
    private javax.swing.JLabel valorTelefone;
    // End of variables declaration//GEN-END:variables
}
