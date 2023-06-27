//Lucas Gabriel Costa

import javax.swing.table.DefaultTableModel;


public class TabelUserCredentials extends javax.swing.JFrame {

    Banco bd = Banco.getInstance();
    
    public static TabelUserCredentials tabelUserCredentials;
    
    private TabelUserCredentials() {
        initComponents();
    }
    
    public static TabelUserCredentials getTabelUserCredentials() {
        if(tabelUserCredentials == null) {
            tabelUserCredentials = new TabelUserCredentials();
        }
        tabelUserCredentials.altTabel();
        tabelUserCredentials.setVisible(true);
        tabelUserCredentials.setLocationRelativeTo(null);
        return tabelUserCredentials;
    }
    public void altTabel() {
        DefaultTableModel model = (DefaultTableModel) tableCredentials.getModel();
        int row = 0;
        model.setRowCount(0);
        for(Funcionario usersCredentials : bd.getBdFunc()) {
            String user = usersCredentials.getPlataforma().getLogin();
            String senha = usersCredentials.getPlataforma().getSenha();
            int nivelAcesso = usersCredentials.getPlataforma().getNivelAcesso();
            model.addRow(new Object[] {user, senha, nivelAcesso});
            row++;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelCredentials = new javax.swing.JScrollPane();
        tableCredentials = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableCredentials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Login", "Senha", "Nivel de Acesso"
            }
        ));
        tableCredentials.setEnabled(false);
        tabelCredentials.setViewportView(tableCredentials);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabelCredentials, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabelCredentials, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane tabelCredentials;
    private javax.swing.JTable tableCredentials;
    // End of variables declaration//GEN-END:variables
}
