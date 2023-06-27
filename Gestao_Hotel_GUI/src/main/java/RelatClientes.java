//Lucas Gabriel Costa

import javax.swing.table.DefaultTableModel;

public class RelatClientes extends javax.swing.JFrame {

    public static RelatClientes relatClientes;
    public Banco bd = Banco.getInstance();
    
    public static RelatClientes getRelatClientes() {
        if(relatClientes == null) {
            relatClientes = new RelatClientes();
        }
        relatClientes.setLocationRelativeTo(null);
        relatClientes.setVisible(true);
        relatClientes.altTabel();
        return relatClientes;
    }
    private RelatClientes() {
        initComponents();
    }
    public void altTabel() {
        DefaultTableModel model = (DefaultTableModel) tableClientes.getModel();
        int row = 0;
        model.setRowCount(0);
        for(Cliente c : bd.getBdCli()) {
            String cpf = c.getCpf();
            String nome = c.getNome();
            int quartoHosp = c.getQuartoAloc()+1;
            model.addRow(new Object[] {cpf, nome, quartoHosp});
            row++;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelClientes = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Quarto Hospedado"
            }
        ));
        tableClientes.setEnabled(false);
        tabelClientes.setViewportView(tableClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabelClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane tabelClientes;
    private javax.swing.JTable tableClientes;
    // End of variables declaration//GEN-END:variables
}
