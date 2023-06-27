//Lucas Gabriel Costa

public class CadFunc extends javax.swing.JFrame {

    public static CadFunc cadFunc;
    
    public static CadFunc getCadFunc() {
        if(cadFunc == null) {
            cadFunc = new CadFunc();
        }
        cadFunc.setVisible(true);
        cadFunc.setLocationRelativeTo(null);
        return cadFunc;
    }
    private CadFunc() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        fundoEsq = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblRH = new javax.swing.JLabel();
        btFuncAssalariado = new javax.swing.JButton();
        btFuncComissionado = new javax.swing.JButton();
        btFuncHorista = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuTools = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenu();

        jLabel6.setText("jLabel6");

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

        btFuncAssalariado.setText("Funcionário Assalariado");
        btFuncAssalariado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncAssalariadoActionPerformed(evt);
            }
        });

        btFuncComissionado.setText("Funcionário Comissionado");
        btFuncComissionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncComissionadoActionPerformed(evt);
            }
        });

        btFuncHorista.setText("Funcionário Horista");
        btFuncHorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncHoristaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundoEsqLayout = new javax.swing.GroupLayout(fundoEsq);
        fundoEsq.setLayout(fundoEsqLayout);
        fundoEsqLayout.setHorizontalGroup(
            fundoEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoEsqLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(fundoEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoEsqLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblRH, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(fundoEsqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btFuncComissionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btFuncAssalariado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btFuncHorista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fundoEsqLayout.setVerticalGroup(
            fundoEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoEsqLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRH)
                .addGap(18, 18, 18)
                .addComponent(btFuncAssalariado)
                .addGap(27, 27, 27)
                .addComponent(btFuncComissionado)
                .addGap(18, 18, 18)
                .addComponent(btFuncHorista)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        menuTools.setText("Tools");
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
                .addComponent(fundoEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoEsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFuncAssalariadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncAssalariadoActionPerformed
       dispose();
       CadFuncAssalariado.getCadFuncAssalariado().showAtributes(false);
    }//GEN-LAST:event_btFuncAssalariadoActionPerformed

    private void btFuncComissionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncComissionadoActionPerformed
        dispose();
        CadFuncComissionado.getCadFuncComissionado().showAtributes(false);
    }//GEN-LAST:event_btFuncComissionadoActionPerformed

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        this.dispose();
        MenuRh.getMenuRh();
    }//GEN-LAST:event_menuExitMouseClicked

    private void btFuncHoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncHoristaActionPerformed
        this.dispose();
        CadFuncHorista.getCadFuncHorista().showAtributes(false);
    }//GEN-LAST:event_btFuncHoristaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuRh.getMenuRh();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFuncAssalariado;
    private javax.swing.JButton btFuncComissionado;
    private javax.swing.JButton btFuncHorista;
    private javax.swing.JPanel fundoEsq;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblRH;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenu menuTools;
    // End of variables declaration//GEN-END:variables
}
