//Lucas Gabriel Costa
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class TabelProduto extends javax.swing.JFrame {

    Banco bd = Banco.getInstance();
    public static TabelProduto instance;
    
    public static TabelProduto getTabelProdutos() {
        if(instance == null) {
            instance = new TabelProduto();
        }
        instance.setLocationRelativeTo(null);
        instance.setVisible(true);
        instance.altTabel();
        return instance;
        
    }
    private TabelProduto() {
        initComponents();
    }
    public void altTabel() {
        DefaultTableModel model = (DefaultTableModel) tableProdutos.getModel();
        int row = 0;
        model.setRowCount(0);
        for(Produto p : bd.getBdProduto()) {
            int id = p.getId();
            String nome = p.getNome();
            Double valor = p.getValor();
            model.addRow(new Object[] {id, nome, valor});
            row++;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelProdutos = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        tableProdutos.setEnabled(false);
        tabelProdutos.setViewportView(tableProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabelProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane tabelProdutos;
    private javax.swing.JTable tableProdutos;
    // End of variables declaration//GEN-END:variables
}
