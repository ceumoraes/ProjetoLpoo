/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuário
 */
public class MEDIC_menu extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public MEDIC_menu() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        MEDIC_consultas_bttn = new javax.swing.JButton();
        ajuda_bttn = new javax.swing.JButton();
        sair_bttn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(130, 0), new java.awt.Dimension(130, 0), new java.awt.Dimension(130, 32767));
        MEDIC_medicamento_bttn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        SisFisio_topname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        jPanel3.setBackground(new java.awt.Color(226, 234, 252));

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcome.setForeground(new java.awt.Color(82, 82, 82));
        welcome.setText("Bem-vindo,");

        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(82, 82, 82));
        name.setText("[NAME]!");

        MEDIC_consultas_bttn.setBackground(new java.awt.Color(226, 234, 252));
        MEDIC_consultas_bttn.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        MEDIC_consultas_bttn.setText("Consultas");
        MEDIC_consultas_bttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MEDIC_consultas_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDIC_consultas_bttnActionPerformed(evt);
            }
        });

        ajuda_bttn.setBackground(new java.awt.Color(226, 234, 252));
        ajuda_bttn.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        ajuda_bttn.setText("Ajuda\n");
        ajuda_bttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajuda_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajuda_bttnActionPerformed(evt);
            }
        });

        sair_bttn.setBackground(new java.awt.Color(226, 234, 252));
        sair_bttn.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        sair_bttn.setText("Sair\n");
        sair_bttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sair_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_bttnActionPerformed(evt);
            }
        });

        MEDIC_medicamento_bttn.setBackground(new java.awt.Color(226, 234, 252));
        MEDIC_medicamento_bttn.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        MEDIC_medicamento_bttn.setText("Prescrever medicação");
        MEDIC_medicamento_bttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MEDIC_medicamento_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDIC_medicamento_bttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 246, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ajuda_bttn)
                    .addComponent(sair_bttn)
                    .addComponent(MEDIC_medicamento_bttn)
                    .addComponent(MEDIC_consultas_bttn)
                    .addComponent(name)
                    .addComponent(welcome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name)
                .addGap(18, 18, 18)
                .addComponent(MEDIC_consultas_bttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MEDIC_medicamento_bttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(ajuda_bttn)
                .addGap(18, 18, 18)
                .addComponent(sair_bttn)
                .addGap(27, 27, 27))
        );

        jPanel4.setBackground(new java.awt.Color(255, 232, 228));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SisFisio_topname.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        SisFisio_topname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SisFisio_topname.setText("SisFisio");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(SisFisio_topname, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SisFisio_topname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sair_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_bttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sair_bttnActionPerformed

    private void ajuda_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajuda_bttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajuda_bttnActionPerformed

    private void MEDIC_medicamento_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDIC_medicamento_bttnActionPerformed
        // TODO add your handling code here:
        MEDIC_prescrever prescrever_bttn = new MEDIC_prescrever();
        prescrever_bttn.setVisible(true);

    }//GEN-LAST:event_MEDIC_medicamento_bttnActionPerformed

    private void MEDIC_consultas_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDIC_consultas_bttnActionPerformed
        MEDIC_consultas consultas_bttn = new MEDIC_consultas();
        consultas_bttn.setVisible(true);
    }//GEN-LAST:event_MEDIC_consultas_bttnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StarterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StarterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MEDIC_consultas_bttn;
    private javax.swing.JButton MEDIC_medicamento_bttn;
    private javax.swing.JLabel SisFisio_topname;
    private javax.swing.JButton ajuda_bttn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel name;
    private javax.swing.JButton sair_bttn;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
