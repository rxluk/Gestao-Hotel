//Lucas Gabriel Costa

import javax.swing.JOptionPane;

public class CadFuncHorista extends javax.swing.JFrame {

    public static CadFuncHorista cadFuncHorista;
    public Banco bd = Banco.getInstance();
    Horista horista;
    
    public static CadFuncHorista getCadFuncHorista() {
        if(cadFuncHorista == null) {
            cadFuncHorista = new CadFuncHorista();
        }
        cadFuncHorista.setLocationRelativeTo(null);
        cadFuncHorista.setVisible(true);
        return cadFuncHorista;
    }
    public void limpDados() {
        cbDia.setSelectedIndex(0);
        cbMes.setSelectedIndex(0);
        cbAno.setSelectedIndex(0);
        cbAlterar.setSelectedIndex(0);
        cxCel.setText("");
        cxCpf.setText("");
        cxNome.setText("");
        cxPrecoHora.setText("");
        
    }
    public Funcionario getFunc() {
        Funcionario func = (Funcionario) new Horista();
        try {
            func.setCpf(valorCpf.getText());
        }
        catch(MyException mye) {
        }
        return bd.consFunc(func);
    }
    public void consFunc(Horista horista) {
        if(horista != null) {
            showAtributes(true);
            valorTelefone.setText(horista.getCel());
            valorCpf.setText(horista.getCpf());
            valorDtaNasc.setText(horista.getDtaNasc());
            valorNome.setText(horista.getNome());
            valorPrecoH.setText(Double.toString(horista.getPrecoHora()));
            valorHoraTrab.setText(Double.toString(horista.getHorasTrab()));
        }
    }
    public void altFunc(Horista horista) {
        consFunc(horista);
        cbAlterar.setVisible(true);
    }
    public void showAtributes(boolean status) {
        valorTelefone.setVisible(status);
        valorCpf.setVisible(status);
        valorDtaNasc.setVisible(status);
        valorNome.setVisible(status);
        valorPrecoH.setVisible(status);
        valorHoraTrab.setVisible(status);
        lblHoraTrab.setVisible(status);
        btEnviar.setVisible(!status);
        cbAno.setVisible(!status);
        cbMes.setVisible(!status);
        cbDia.setVisible(!status);
        cxCel.setVisible(!status);
        cxCpf.setVisible(!status);
        cxNome.setVisible(!status);
        cxPrecoHora.setVisible(!status);
        cbAlterar.setVisible(false);
    }
    private CadFuncHorista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        cbAno = new javax.swing.JComboBox<>();
        lblPrecoHora = new javax.swing.JLabel();
        cxPrecoHora = new javax.swing.JTextField();
        btEnviar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        valorCpf = new javax.swing.JLabel();
        valorNome = new javax.swing.JLabel();
        valorDtaNasc = new javax.swing.JLabel();
        valorTelefone = new javax.swing.JLabel();
        valorPrecoH = new javax.swing.JLabel();
        cbAlterar = new javax.swing.JComboBox<>();
        lblHoraTrab = new javax.swing.JLabel();
        valorHoraTrab = new javax.swing.JLabel();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoEsqLayout.createSequentialGroup()
                .addGap(0, 74, Short.MAX_VALUE)
                .addGroup(fundoEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoEsqLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblRH, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        fundoEsqLayout.setVerticalGroup(
            fundoEsqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoEsqLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRH)
                .addContainerGap(204, Short.MAX_VALUE))
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

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiaActionPerformed(evt);
            }
        });

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", " " }));

        lblPrecoHora.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPrecoHora.setText("Preço/hora");

        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        valorCpf.setText("jLabel1");

        valorNome.setText("jLabel1");

        valorDtaNasc.setText("jLabel1");

        valorTelefone.setText("jLabel1");

        valorPrecoH.setText("jLabel1");

        cbAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alterar..", "Nome", "Telefone", "Preço/hora", "Horas trabalhadas" }));
        cbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlterarActionPerformed(evt);
            }
        });

        lblHoraTrab.setText("Hora trabalhada:");

        valorHoraTrab.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundoEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblDtaNasc)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrecoHora)
                                    .addComponent(lblTel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 28, Short.MAX_VALUE)
                                        .addComponent(valorPrecoH, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valorDtaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblHoraTrab)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valorHoraTrab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEnviar))
                    .addComponent(cxPrecoHora)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbAno, 0, 1, Short.MAX_VALUE))
                    .addComponent(cxCel)
                    .addComponent(cxNome)
                    .addComponent(cxCpf))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoEsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorNome))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtaNasc)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorDtaNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel)
                    .addComponent(valorTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoHora)
                    .addComponent(cxPrecoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorPrecoH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraTrab)
                    .addComponent(valorHoraTrab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnviar)
                    .addComponent(btVoltar)
                    .addComponent(cbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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
        horista = new Horista();
        try {
            horista.setCpf(cxCpf.getText());
        }
        catch(MyException mye) {
            return;

        }
        if(bd.consFunc(horista) != null) {
            JOptionPane.showMessageDialog(null,"CPF já cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            horista.setNome(cxNome.getText());
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
            horista.setDtaNasc(data);
        }
        catch(MyException mye) {
            return;
        }
        
        try {
            horista.setCel(cxCel.getText());
        }
        catch(MyException mye) {
            return;
        }
        horista.setSalario(0.00);
        horista.setPrecoHora(Double.parseDouble(cxPrecoHora.getText()));
        
        bd.cadFunc(horista);
        dispose();
        MenuRh.getMenuRh();
    }//GEN-LAST:event_btEnviarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
        MenuRh.getMenuRh();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuRh.getMenuRh();
    }//GEN-LAST:event_formWindowClosing

    private void cbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlterarActionPerformed
        if(cbAlterar.getSelectedIndex() != 0) {
            Horista horista = (Horista) getFunc(); 
            switch(cbAlterar.getSelectedIndex()) {
                case 1:
                    try {
                        horista.setNome(JOptionPane.showInputDialog(null, "Informe novo Nome", "Alterar Func", JOptionPane.PLAIN_MESSAGE));
                    } catch (MyException ex) {
                        return;
                    }
                    break;
                case 2:
                    try {
                        horista.setCel(JOptionPane.showInputDialog(null, "Informe novo Telefone", "Alterar Func", JOptionPane.PLAIN_MESSAGE));
                    } catch (MyException ex) {
                        return;
                    }
                    break;
                case 3:
                    horista.setPrecoHora(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe novo Preco/hora", "Alterar Func", JOptionPane.PLAIN_MESSAGE)));
                    break;
                case 4:
                    horista.setHorasTrab(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe as horas trabalhadas", "Alterar Func", JOptionPane.PLAIN_MESSAGE)));

                default:
                    this.dispose();
            }
            this.dispose();
            MenuRh.getMenuRh();
        }
    }//GEN-LAST:event_cbAlterarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbAlterar;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JTextField cxCel;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPrecoHora;
    private javax.swing.JPanel fundoEsq;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDtaNasc;
    private javax.swing.JLabel lblHoraTrab;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrecoHora;
    private javax.swing.JLabel lblRH;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel valorCpf;
    private javax.swing.JLabel valorDtaNasc;
    private javax.swing.JLabel valorHoraTrab;
    private javax.swing.JLabel valorNome;
    private javax.swing.JLabel valorPrecoH;
    private javax.swing.JLabel valorTelefone;
    // End of variables declaration//GEN-END:variables
}
