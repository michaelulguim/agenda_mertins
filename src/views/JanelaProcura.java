package views;

import bean.ContatoBEAN;
import dao.ContatoDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class JanelaProcura extends javax.swing.JInternalFrame {

    private DefaultTableModel dtg;

    public JanelaProcura() throws SQLException, ParseException {
        initComponents();

        ContatoDAO ct = new ContatoDAO();
        listaContatos(ct.localizar());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoProcurar = new javax.swing.JButton();
        campoProcurar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGeral = new javax.swing.JTable();

        botaoProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        botaoProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarActionPerformed(evt);
            }
        });

        tabelaGeral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOME", "EMAIL", "FOTO"
            }
        ));
        jScrollPane1.setViewportView(tabelaGeral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoProcurar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarActionPerformed
        ContatoDAO ct = new ContatoDAO();
        try {
            this.listaContatos(ct.localizar(this.campoProcurar.getText()));
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(JanelaProcura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoProcurarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JTextField campoProcurar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaGeral;
    // End of variables declaration//GEN-END:variables

    private void listaContatos(List<ContatoBEAN> lista) throws SQLException, ParseException {
       
        this.dtg = (DefaultTableModel) this.tabelaGeral.getModel();
        dtg.setRowCount(0);
        this.limpaTabela();

        for (ContatoBEAN cb : lista) {
            dtg.addRow(new Object[]{cb.getNome(), cb.getCidade(), cb.getPathImg()});
        }
    }

    private void limpaTabela() {
        this.dtg.setNumRows(0);
    }
}
