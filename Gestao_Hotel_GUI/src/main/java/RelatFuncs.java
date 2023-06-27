//Lucas Gabriel Costa

import javax.swing.table.DefaultTableModel;

//Lucas Gabriel Costa

public class RelatFuncs extends javax.swing.JFrame {

    public static RelatFuncs relatFuncs;
    public Banco bd = Banco.getInstance();
    
    public static RelatFuncs getRelatFuncs() {
        if(relatFuncs == null) {
            relatFuncs = new RelatFuncs();
        }
        relatFuncs.setLocationRelativeTo(null);
        relatFuncs.setVisible(true);
        relatFuncs.altTabel();
        return relatFuncs;
    }
    public void altTabel() {
        DefaultTableModel model = (DefaultTableModel) tableFuncs.getModel();
        int row = 0;
        model.setRowCount(0);
        for(Funcionario f : bd.getBdFunc()) {
            String cpf = f.getCpf();
            String nome = f.getNome();
            Double salario = f.getSalario();
            model.addRow(new Object[] {cpf, nome, salario});
            row++;
        }
    }
    private RelatFuncs() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelFuncs = new javax.swing.JScrollPane();
        tableFuncs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableFuncs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Salário"
            }
        ));
        tableFuncs.setEnabled(false);
        tabelFuncs.setViewportView(tableFuncs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabelFuncs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabelFuncs, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane tabelFuncs;
    private javax.swing.JTable tableFuncs;
    // End of variables declaration//GEN-END:variables
}
