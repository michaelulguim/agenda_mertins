package views;

import java.awt.Toolkit;
import javax.swing.JComponent;

public class TelaPrincipal extends javax.swing.JFrame {

    private JanelaContato Contato;
    private JanelaSobre Sobre;


    public TelaPrincipal() {
        initComponents();
        Toolkit toolkit = Toolkit.getDefaultToolkit();  
        this.setSize(toolkit.getScreenSize());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        botaoAdicionarContato = new javax.swing.JButton();
        botaoExit = new javax.swing.JButton();
        botaoduvida = new javax.swing.JButton();
        botaoProcurar = new javax.swing.JButton();
        botaoGrupos = new javax.swing.JButton();
        botaoFavoritos = new javax.swing.JButton();
        areaDeTrabalho = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        botaoAdicionarContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/user_add.png"))); // NOI18N
        botaoAdicionarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarContatoActionPerformed(evt);
            }
        });

        botaoExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        botaoExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExitActionPerformed(evt);
            }
        });

        botaoduvida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/duvida.png"))); // NOI18N

        botaoProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        botaoProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarActionPerformed(evt);
            }
        });

        botaoGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/users.png"))); // NOI18N

        botaoFavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/favorite.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(areaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoAdicionarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(botaoFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 508, Short.MAX_VALUE)
                        .addComponent(botaoProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoduvida, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoAdicionarContato)
                        .addComponent(botaoExit))
                    .addComponent(botaoduvida)
                    .addComponent(botaoProcurar)
                    .addComponent(botaoGrupos)
                    .addComponent(botaoFavoritos))
                .addGap(18, 18, 18)
                .addComponent(areaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarContatoActionPerformed
        JanelaContato contato = new JanelaContato();
        montaJanela(contato);
       
    }//GEN-LAST:event_botaoAdicionarContatoActionPerformed

    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarActionPerformed

        JanelaProcura Telas = new JanelaProcura();
        this.areaDeTrabalho.add(Telas);
        Telas.setVisible(true);
    }//GEN-LAST:event_botaoProcurarActionPerformed

    private void botaoExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExitActionPerformed
        super.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExitActionPerformed
    
    private void montaJanela(JComponent obj) {
            if (!obj.isVisible()) {
                if (!obj.isValid()) {
                   this.areaDeTrabalho.add(obj);
                }
                obj.setVisible(true);
            }
        }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaDeTrabalho;
    private javax.swing.JButton botaoAdicionarContato;
    private javax.swing.JButton botaoExit;
    private javax.swing.JButton botaoFavoritos;
    private javax.swing.JButton botaoGrupos;
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JButton botaoduvida;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables

    
}
