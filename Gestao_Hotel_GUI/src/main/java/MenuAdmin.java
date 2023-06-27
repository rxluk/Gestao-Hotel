//Lucas Gabriel Costa
import javax.swing.JOptionPane;


public class MenuAdmin extends javax.swing.JFrame {

    Produto produto;
    public static MenuAdmin menuAdmin;
    Banco bd = Banco.getInstance();
    private MenuAdmin() {
        initComponents();
    }
    public static MenuAdmin getMenuAdmin() {
        if(menuAdmin == null) {
            menuAdmin = new MenuAdmin();
        }
        menuAdmin.setVisible(true);
        menuAdmin.showAtributos(false);
        menuAdmin.setLocationRelativeTo(null);
        return menuAdmin;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelEsq = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        valorId = new javax.swing.JLabel();
        valorNome = new javax.swing.JLabel();
        valorValor = new javax.swing.JLabel();
        lblALterar = new javax.swing.JLabel();
        cbEscolhaAlt = new javax.swing.JComboBox<>();
        menu = new javax.swing.JMenuBar();
        menuTools = new javax.swing.JMenu();
        menuProdutos = new javax.swing.JMenu();
        menuAddProd = new javax.swing.JMenuItem();
        menuAltProd = new javax.swing.JMenuItem();
        menuDelProd = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        userCredentials = new javax.swing.JMenuItem();
        produtos = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        painelEsq.setBackground(new java.awt.Color(153, 153, 153));

        lblMenu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMenu.setText("Administrativo");

        javax.swing.GroupLayout painelEsqLayout = new javax.swing.GroupLayout(painelEsq);
        painelEsq.setLayout(painelEsqLayout);
        painelEsqLayout.setHorizontalGroup(
            painelEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        painelEsqLayout.setVerticalGroup(
            painelEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblProduto.setText("Produto");

        lblNome.setText("Nome:");

        lblValor.setText("Valor:");

        lblId.setText("ID: ");

        valorId.setText("JLABEL");

        valorNome.setText("jLabel5");

        valorValor.setText("jLabel5");

        lblALterar.setText("Alterar:");

        cbEscolhaAlt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Nome", "Valor" }));
        cbEscolhaAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEscolhaAltActionPerformed(evt);
            }
        });

        menuTools.setText("Tools");

        menuProdutos.setText("produtos..");

        menuAddProd.setText("Adicionar produto");
        menuAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddProdActionPerformed(evt);
            }
        });
        menuProdutos.add(menuAddProd);

        menuAltProd.setText("Alterar Produto");
        menuAltProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltProdActionPerformed(evt);
            }
        });
        menuProdutos.add(menuAltProd);

        menuDelProd.setText("Remover Produto");
        menuDelProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDelProdActionPerformed(evt);
            }
        });
        menuProdutos.add(menuDelProd);

        menuTools.add(menuProdutos);

        menuRelatorio.setText("relatório..");

        userCredentials.setText("relatório Logins/Senhas");
        userCredentials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCredentialsActionPerformed(evt);
            }
        });
        menuRelatorio.add(userCredentials);

        produtos.setText("relatório Produtos");
        produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosActionPerformed(evt);
            }
        });
        menuRelatorio.add(produtos);

        menuTools.add(menuRelatorio);

        menu.add(menuTools);

        menuExit.setText("Exit");
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menu.add(menuExit);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorValor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblALterar)
                        .addGap(32, 32, 32)
                        .addComponent(cbEscolhaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorId))
                    .addComponent(lblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelEsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblALterar)
                    .addComponent(cbEscolhaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddProdActionPerformed
        showAtributos(false);
        produto = new Produto();
        try {
            produto.setNome(JOptionPane.showInputDialog(null, "Nome do produto:", "Cadastro Produto", JOptionPane.PLAIN_MESSAGE));
        }
        catch(NullPointerException npe) {
            return;
        }
        if(produto.getNome() == null) {
            JOptionPane.showMessageDialog(null, "Produto com nome vazio!", "Cadastro Produto", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            produto.setValor(Double.valueOf(JOptionPane.showInputDialog(null, "Valor do produto:", "Cadastro Produto", JOptionPane.PLAIN_MESSAGE)));
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro do valor do produto!", "Cadastro Produto", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(bd.consProduto(produto) != null) {
             JOptionPane.showMessageDialog(null, "Produto já cadastrado!", "Cadastro Produto", JOptionPane.ERROR_MESSAGE);
            return;
        }
        bd.cadProduto(produto);
    }//GEN-LAST:event_menuAddProdActionPerformed

    private void menuAltProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltProdActionPerformed
        produto = new Produto();
        try {
            produto.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "ID do produto:", "Alterar Produto", JOptionPane.PLAIN_MESSAGE)));
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Digite apenas o número!", "Consulta Produto", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        if(bd.consProduto(produto) != null) {
            produto = bd.consProduto(produto);
            setAtributos(produto);
            showAtributos(true);
        }
        else {
             JOptionPane.showMessageDialog(null, "ID não encontrado!", "Alteração Produto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuAltProdActionPerformed
    private void setAtributos(Produto produto) {
        valorId.setText(Integer.toString(produto.getId()));
        valorValor.setText(Double.toString(produto.getValor()));
        valorNome.setText(produto.getNome());
        cbEscolhaAlt.setSelectedItem("...");
    }
    private void showAtributos(boolean status) {
        setVisible(true);
        cbEscolhaAlt.setVisible(status);
        lblALterar.setVisible(status);
        lblId.setVisible(status);
        lblNome.setVisible(status);
        lblProduto.setVisible(status);
        lblValor.setVisible(status);
        valorId.setVisible(status);
        valorNome.setVisible(status);
        valorValor.setVisible(status);
    }
    private void cbEscolhaAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEscolhaAltActionPerformed
        if(cbEscolhaAlt.getSelectedItem().equals("Nome")) {
            produto.setNome(JOptionPane.showInputDialog(null, "Novo nome doproduto:", "Alterar Produto", JOptionPane.PLAIN_MESSAGE));
            if(produto.getNome() != null){
                bd.altProduto(produto);
                JOptionPane.showMessageDialog(null, "Troca realizada com sucesso!", "Alteração Produto", JOptionPane.PLAIN_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Erro, campo vazio!", "Alteração Produto", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(cbEscolhaAlt.getSelectedItem().equals("Valor")) {
            produto.setValor(Double.valueOf(JOptionPane.showInputDialog(null, "Novo valor do produto:", "Alterar Produto", JOptionPane.PLAIN_MESSAGE)));
            if(produto.getValor() != null) {
                bd.altProduto(produto);
                JOptionPane.showMessageDialog(null, "Troca realizada com sucesso!", "Alteração Produto", JOptionPane.PLAIN_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Erro, campo vazio!", "Alteração Produto", JOptionPane.ERROR_MESSAGE);
            }
        }
        showAtributos(false);
    }//GEN-LAST:event_cbEscolhaAltActionPerformed

    private void menuDelProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDelProdActionPerformed
        showAtributos(false);
        produto = new Produto();
        try {
            produto.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "ID do produto:", "Alterar Produto", JOptionPane.PLAIN_MESSAGE)));
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Digite apenas o número!", "Consulta Produto", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        if(bd.consProduto(produto) != null) {
            produto = bd.consProduto(produto);
            bd.delProduto(produto);
            JOptionPane.showMessageDialog(null, "Produto removido com sucesso!", "Remover Produto", JOptionPane.PLAIN_MESSAGE);
        }
        else {
             JOptionPane.showMessageDialog(null, "ID não encontrado!", "Alteração Produto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuDelProdActionPerformed

    private void userCredentialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCredentialsActionPerformed
        showAtributos(false);
        Assalariado assalariado = new Assalariado();
        if(bd.getBdFunc().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existe cadastro!", "ERRO", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Um primeiro usuário foi criado!", "Criação user", JOptionPane.PLAIN_MESSAGE);
            }
            catch(MyException mye) {
                 JOptionPane.showMessageDialog(null, "Erro no cadastro DEFAULT!", "ERRO", JOptionPane.ERROR_MESSAGE);
                 return;
            }
            catch(NumberFormatException nfe) {
                 JOptionPane.showMessageDialog(null, "ERRO de entrada no cadastro DEFAULT!", "ERRO", JOptionPane.ERROR_MESSAGE);    
                 return;
            }
        }
        TabelUserCredentials.getTabelUserCredentials();
    }//GEN-LAST:event_userCredentialsActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        this.dispose();
        Principal.getPrincipal();
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        this.dispose();
        Principal.getPrincipal();
    }//GEN-LAST:event_menuExitMouseClicked

    private void produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosActionPerformed
        TabelProduto.getTabelProdutos();
    }//GEN-LAST:event_produtosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       Principal.getPrincipal();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEscolhaAlt;
    private javax.swing.JLabel lblALterar;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblValor;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuAddProd;
    private javax.swing.JMenuItem menuAltProd;
    private javax.swing.JMenuItem menuDelProd;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuTools;
    private javax.swing.JPanel painelEsq;
    private javax.swing.JMenuItem produtos;
    private javax.swing.JMenuItem userCredentials;
    private javax.swing.JLabel valorId;
    private javax.swing.JLabel valorNome;
    private javax.swing.JLabel valorValor;
    // End of variables declaration//GEN-END:variables
}
