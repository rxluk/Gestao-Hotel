//Lucas Gabriel Costa

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class MenuAtendente extends javax.swing.JFrame {

    public static MenuAtendente menuAtendente;
    public Banco bd = Banco.getInstance();
    public Cliente cli;
    
    public static MenuAtendente getMenuAtendente() {
        if(menuAtendente == null) {
            menuAtendente = new MenuAtendente();
        }
        menuAtendente.setVisible(true);
        menuAtendente.hideAll();
        menuAtendente.setLocationRelativeTo(null);
        return menuAtendente;
    }
    private MenuAtendente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelEsq = new javax.swing.JPanel();
        btcheckin = new javax.swing.JButton();
        btcheckout = new javax.swing.JButton();
        btconsulta = new javax.swing.JButton();
        lblTipoMenu = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblDtaNasc = new javax.swing.JLabel();
        lblQuartoHosp = new javax.swing.JLabel();
        btEnviar = new javax.swing.JButton();
        cxCpf = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        cxTel = new javax.swing.JTextField();
        cxDtaNasc = new javax.swing.JTextField();
        cbQuartoHosp = new javax.swing.JComboBox<>();
        valueCpf = new javax.swing.JLabel();
        valueNome = new javax.swing.JLabel();
        valueTel = new javax.swing.JLabel();
        valueDtaNasc = new javax.swing.JLabel();
        valueQuartoHosp = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuTools = new javax.swing.JMenu();
        menuRelatorios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        painelEsq.setBackground(new java.awt.Color(153, 153, 153));

        btcheckin.setText("Cliente - check-in");
        btcheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcheckinActionPerformed(evt);
            }
        });

        btcheckout.setText("Cliente - check-out");
        btcheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcheckoutActionPerformed(evt);
            }
        });

        btconsulta.setText("Cliente - consulta");
        btconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultaActionPerformed(evt);
            }
        });

        lblTipoMenu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTipoMenu.setText("Atendente");

        lblMenu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMenu.setText("Menu");

        javax.swing.GroupLayout painelEsqLayout = new javax.swing.GroupLayout(painelEsq);
        painelEsq.setLayout(painelEsqLayout);
        painelEsqLayout.setHorizontalGroup(
            painelEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsqLayout.createSequentialGroup()
                .addGroup(painelEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEsqLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btconsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btcheckin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btcheckout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelEsqLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblMenu)))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(painelEsqLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTipoMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelEsqLayout.setVerticalGroup(
            painelEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsqLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTipoMenu)
                .addGap(38, 38, 38)
                .addComponent(btcheckin)
                .addGap(37, 37, 37)
                .addComponent(btcheckout)
                .addGap(39, 39, 39)
                .addComponent(btconsulta)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        lblNome.setText("Nome:");

        lblCpf.setText("CPF:");

        lblTel.setText("Telefone:");

        lblDtaNasc.setText("Data de nascimento:");

        lblQuartoHosp.setText("Quarto hospedado:");

        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        cxCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cxNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cxTel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cxDtaNasc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cbQuartoHosp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "......." }));
        cbQuartoHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQuartoHospActionPerformed(evt);
            }
        });

        valueCpf.setText("jLabel1");

        valueNome.setText("jLabel1");

        valueTel.setText("jLabel1");

        valueDtaNasc.setText("jLabel1");

        valueQuartoHosp.setText("jLabel1");

        menuTools.setText("Tools");

        menuRelatorios.setText("Relatórios..");

        jMenuItem1.setText("relatório Clientes/Quarto Hospedado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuRelatorios.add(jMenuItem1);

        menuTools.add(menuRelatorios);

        menuBar.add(menuTools);

        menuExit.setText("Exit");
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        menuBar.add(menuExit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCpf)
                    .addComponent(lblNome)
                    .addComponent(lblTel)
                    .addComponent(lblDtaNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQuartoHosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(valueDtaNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxDtaNasc))
                    .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valueCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxCpf))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valueNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valueTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxTel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valueQuartoHosp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbQuartoHosp, 0, 125, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelEsq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cxTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valueTel))
                    .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cxDtaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valueDtaNasc))
                    .addComponent(lblDtaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuartoHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbQuartoHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valueQuartoHosp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEnviar)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void hideAll() {
        lblNome.setVisible(false);
        lblCpf.setVisible(false);
        lblTel.setVisible(false);
        lblDtaNasc.setVisible(false);
        lblQuartoHosp.setVisible(false);
        valueNome.setVisible(false);
        valueCpf.setVisible(false);
        valueTel.setVisible(false);
        valueDtaNasc.setVisible(false);
        valueQuartoHosp.setVisible(false);
        cxCpf.setVisible(false);
        cxNome.setVisible(false);
        cxTel.setVisible(false);
        cxDtaNasc.setVisible(false);
        cbQuartoHosp.setVisible(false);
    }
    private void btcheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcheckinActionPerformed
        checkin();
        cbQuartoHosp.removeAllItems();
        boolean[]quartoStatus = bd.getQuartoStatus();
        for(int i = 0; i < quartoStatus.length; i++) {
            if(quartoStatus[i]) {
                cbQuartoHosp.addItem(Integer.toString(i+1));
            }   
        }
    }//GEN-LAST:event_btcheckinActionPerformed

    private void cbQuartoHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQuartoHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbQuartoHospActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed

        cli = new Cliente();
        
        try {
            cli.setCpf(cxCpf.getText());
        }
        catch(MyException mye) {
            return;
        }

        if(bd.consCli(cli) != null) {
            JOptionPane.showMessageDialog(null, "CPF já cadastrado!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        try {
            cli.setNome(cxNome.getText());
        }
        catch(MyException mye) {
           return;
        }
        try {
            cli.setDtaNasc(cxDtaNasc.getText());
        }
        catch(MyException mye) {
            return;
        }
        try {
            cli.setCel(cxTel.getText());
        }
        catch(MyException mye) {
            return;
        }
        try{ 
            int quartoAloc = Integer.parseInt((String) cbQuartoHosp.getSelectedItem());
            cli.setQuartoAloc(quartoAloc-1);
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Selecione um quarto!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cli = bd.cadCli(cli);
        if(cli == null) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro!", "Check-in", JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "check-in", JOptionPane.OK_OPTION);
        }
        hideAll();
    }//GEN-LAST:event_btEnviarActionPerformed

    private void btcheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcheckoutActionPerformed
        hideAll();
        cli = new Cliente();
        try {
           cli.setCpf(JOptionPane.showInputDialog(null, "CPF para busca: ", "Consulta", JOptionPane.PLAIN_MESSAGE)); 
        }
        catch(MyException mye) {
            return;
        }
        catch(NullPointerException npe) {
            return;
        }
        cli = bd.consCli(cli);
        if(cli != null) {
            bd.delCli(cli);
            JOptionPane.showMessageDialog(null, "Check-out realizado com sucesso!", "Check-out", JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "CPF não encontrado!", "Check-out", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btcheckoutActionPerformed
    public Cliente getCli() {
        try {
           cli.setCpf(JOptionPane.showInputDialog(null, "CPF para busca: ", "Consulta", JOptionPane.PLAIN_MESSAGE)); 
        }
        catch(MyException mye) {
        }
        return bd.consCli(cli) == null ? null : cli;
    }
    private void btconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultaActionPerformed
        hideAll();
        consCli(getCli());
    }//GEN-LAST:event_btconsultaActionPerformed

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        this.dispose();
        Principal.getPrincipal();
    }//GEN-LAST:event_menuExitMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        RelatClientes.getRelatClientes();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Principal.getPrincipal();
    }//GEN-LAST:event_formWindowClosing

    public void consCli(Cliente cli) {
        if(cli != null) {
            valueNome.setText(cli.getNome());
            valueCpf.setText(cli.getCpf());
            valueTel.setText(cli.getCel());
            valueDtaNasc.setText(cli.getDtaNasc());
            valueQuartoHosp.setText(Integer.toString(cli.getQuartoAloc()+1));
             lblNome.setVisible(true);
            lblCpf.setVisible(true);
            lblTel.setVisible(true);
            lblDtaNasc.setVisible(true);
            lblQuartoHosp.setVisible(true);
            valueNome.setVisible(true);
            valueCpf.setVisible(true);
            valueTel.setVisible(true);
            valueDtaNasc.setVisible(true);
            valueQuartoHosp.setVisible(true);
            cxCpf.setVisible(false);
            cxNome.setVisible(false);
            cxTel.setVisible(false);
            cxDtaNasc.setVisible(false);
            cbQuartoHosp.setVisible(false);
            valueNome.setText(cli.getNome());
            valueCpf.setText(cli.getCpf());
            valueTel.setText(cli.getCel());
            valueDtaNasc.setText(cli.getDtaNasc());
            valueQuartoHosp.setText(Integer.toString(cli.getQuartoAloc()+1));
             lblNome.setVisible(true);
            lblCpf.setVisible(true);
            lblTel.setVisible(true);
            lblDtaNasc.setVisible(true);
            lblQuartoHosp.setVisible(true);
            valueNome.setVisible(true);
            valueCpf.setVisible(true);
            valueTel.setVisible(true);
            valueDtaNasc.setVisible(true);
            valueQuartoHosp.setVisible(true);
            cxCpf.setVisible(false);
            cxNome.setVisible(false);
            cxTel.setVisible(false);
            cxDtaNasc.setVisible(false);
            cbQuartoHosp.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "CPF não encontrado!", "Consulta cli", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void checkin() {
        lblNome.setVisible(true);
        lblCpf.setVisible(true);
        lblTel.setVisible(true);
        lblDtaNasc.setVisible(true);
        lblQuartoHosp.setVisible(true);
        btEnviar.setVisible(true);
        cxCpf.setVisible(true);
        cxNome.setVisible(true);
        cxTel.setVisible(true);
        cxDtaNasc.setVisible(true);
        cbQuartoHosp.setVisible(true);
        cxCpf.setText("");
        cxNome.setText("");
        cxTel.setText("");
        cxDtaNasc.setText("");
        cbQuartoHosp.removeAllItems();
        valueNome.setVisible(false);
        valueCpf.setVisible(false);
        valueTel.setVisible(false);
        valueDtaNasc.setVisible(false);
        valueQuartoHosp.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btcheckin;
    private javax.swing.JButton btcheckout;
    private javax.swing.JButton btconsulta;
    private javax.swing.JComboBox<String> cbQuartoHosp;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxDtaNasc;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxTel;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDtaNasc;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuartoHosp;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTipoMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuTools;
    private javax.swing.JPanel painelEsq;
    private javax.swing.JLabel valueCpf;
    private javax.swing.JLabel valueDtaNasc;
    private javax.swing.JLabel valueNome;
    private javax.swing.JLabel valueQuartoHosp;
    private javax.swing.JLabel valueTel;
    // End of variables declaration//GEN-END:variables
}
