//Lucas Gabriel Costa

import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class MenuComissionado extends javax.swing.JFrame {

    public static MenuComissionado menuComissionado;
    public Banco bd = Banco.getInstance();
    Comissionado comissionado = new Comissionado();
    
    public static MenuComissionado getMenuComissionado() {
        if(menuComissionado == null) {
            menuComissionado = new MenuComissionado();
        }
        menuComissionado.setConfig();
        return menuComissionado;
    }
    public void setConfig() {
        valorCpf.setVisible(false);
        cbID.removeAllItems();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = 0;
        model.setRowCount(0);
        for(Produto p : bd.getBdProduto()) {
            cbID.addItem(Integer.toString(p.getId()));
            model.addRow(new Object[] {p.getId(), p.getNome(), p.getValor()});
            row++;
        }
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public void setVendedor(Comissionado comissionado) {
        this.comissionado = comissionado;
    }
    private MenuComissionado() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoEsq1 = new javax.swing.JPanel();
        lblMenu1 = new javax.swing.JLabel();
        lblRH1 = new javax.swing.JLabel();
        tableAll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblProdutoQTD = new javax.swing.JLabel();
        lblProdutoID = new javax.swing.JLabel();
        cbID = new javax.swing.JComboBox<>();
        cbQTD = new javax.swing.JComboBox<>();
        btVender = new javax.swing.JButton();
        valorCpf = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        fundoEsq1.setBackground(new java.awt.Color(153, 153, 153));

        lblMenu1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMenu1.setText("Menu");

        lblRH1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblRH1.setText("Comissionado");

        javax.swing.GroupLayout fundoEsq1Layout = new javax.swing.GroupLayout(fundoEsq1);
        fundoEsq1.setLayout(fundoEsq1Layout);
        fundoEsq1Layout.setHorizontalGroup(
            fundoEsq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoEsq1Layout.createSequentialGroup()
                .addGroup(fundoEsq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoEsq1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRH1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundoEsq1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        fundoEsq1Layout.setVerticalGroup(
            fundoEsq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoEsq1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMenu1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRH1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Valor"
            }
        ));
        tableAll.setViewportView(table);

        lblProdutoQTD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProdutoQTD.setText("Produto QTD:");

        lblProdutoID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProdutoID.setText("Produto ID:");

        cbID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbQTD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        btVender.setText("Vender");
        btVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderActionPerformed(evt);
            }
        });

        valorCpf.setText("cpf");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        menuExit.setText("Exit");
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundoEsq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tableAll, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbID, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblProdutoQTD)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(valorCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVender)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(lblProdutoID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoEsq1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tableAll, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProdutoQTD)
                    .addComponent(cbQTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVender)
                    .addComponent(valorCpf))
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(145, Short.MAX_VALUE)
                    .addComponent(lblProdutoID)
                    .addGap(96, 96, 96)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderActionPerformed
        try{
            Produto produto = new Produto();
            int id = Integer.parseInt((String) cbID.getSelectedItem());
            int qtd = Integer.parseInt((String) cbQTD.getSelectedItem());
            produto.setId(id);
            produto = bd.consProduto(produto);
            if(produto != null) {
                comissionado.calcSalario(produto.getValor()* qtd);
                bd.altFunc(comissionado);
            }
        }
        catch(NumberFormatException nfe) {
        }
        dispose();
        MenuComissionado.getMenuComissionado();
    }//GEN-LAST:event_btVenderActionPerformed

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        this.dispose();
        Principal.getPrincipal();
    }//GEN-LAST:event_menuExitMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Principal.getPrincipal();
    }//GEN-LAST:event_formWindowClosing

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVender;
    private javax.swing.JComboBox<String> cbID;
    private javax.swing.JComboBox<String> cbQTD;
    private javax.swing.JPanel fundoEsq1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblMenu1;
    private javax.swing.JLabel lblProdutoID;
    private javax.swing.JLabel lblProdutoQTD;
    private javax.swing.JLabel lblRH1;
    private javax.swing.JMenu menuExit;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableAll;
    private javax.swing.JLabel valorCpf;
    // End of variables declaration//GEN-END:variables
}
