//Lucas Gabriel Costa

//Login -> admin
//Senha -> admin
//Tools (menu superior) -> relatório -> relatório logins/senha
//será gerado 
//user: rh-ti / senha: admin

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    Funcionario func;
    Register userCredentials;
    static Banco bd = Banco.getInstance();
    public static Principal principal;
    
    public static Principal getPrincipal() {
        if(principal == null) {
            principal = new Principal();
        }
        principal.setVisible(true);
        return principal;
    }
    
    private Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelEsq = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        cxLogin = new javax.swing.JTextField();
        cxSenha = new javax.swing.JTextField();
        btEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationByPlatform(true);

        painelEsq.setBackground(new java.awt.Color(153, 153, 153));

        lblLogin.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblLogin.setText("Login:");

        lblSenha.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblSenha.setText("Senha:");

        javax.swing.GroupLayout painelEsqLayout = new javax.swing.GroupLayout(painelEsq);
        painelEsq.setLayout(painelEsqLayout);
        painelEsqLayout.setHorizontalGroup(
            painelEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsqLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(painelEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        painelEsqLayout.setVerticalGroup(
            painelEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEsqLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenha)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        cxLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxLoginActionPerformed(evt);
            }
        });

        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cxSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(cxLogin)
                    .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelEsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEnviar)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxLoginActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        userCredentials = new Register();
        userCredentials.setLogin(cxLogin.getText());
        userCredentials.setSenha(cxSenha.getText());
        func = bd.checkLogin(userCredentials);
        
        cxLogin.setText("");
        cxSenha.setText("");
        if(func == null) {
            JOptionPane.showMessageDialog(null,"Login/Senha inválido.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            setVisible(false);
            switch(func.getPlataforma().getNivelAcesso()) {
                case 1 -> MenuAtendente.getMenuAtendente();
                case 2 -> MenuComissionado.getMenuComissionado().setVendedor((Comissionado) func);
                case 3 -> MenuRh.getMenuRh();
                case 4 -> MenuAdmin.getMenuAdmin();
            }
        } 
    }//GEN-LAST:event_btEnviarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal.getPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JTextField cxLogin;
    private javax.swing.JTextField cxSenha;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel painelEsq;
    // End of variables declaration//GEN-END:variables
}
