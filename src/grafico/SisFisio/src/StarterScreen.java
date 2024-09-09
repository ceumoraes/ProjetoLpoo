/**
 * @author Usuário
 */
public class StarterScreen extends javax.swing.JFrame {

    /**
     * Cria novo formulário de login
     */
    public StarterScreen() {
        initComponents();
    }

    /**
     * Este método é chamado a partir do construtor para inicializar o formulário.
     * AVISO: NÃO modifique este código. O conteúdo deste método é sempre
     * regenerado pelo Editor de Formulários.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Código Gerado">//GEN-BEGIN:initComponents
    private void initComponents() {
        
        // Criação de paineis
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        // Criação de labels
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        // Criação de botoões
        paciente_bttn = new javax.swing.JButton();
        especialista_bttn = new javax.swing.JButton();
        administracao_bttn = new javax.swing.JButton();
        
        // Define o comportamento ao fechar a janela (encerra o programa)
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Define cores de fundo e configurações de fonte
        setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBackground(new java.awt.Color(226, 234, 252));
        jPanel1.setBackground(new java.awt.Color(250, 235, 246));

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("BEM-VINDO!");

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Quem é você?");

        paciente_bttn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        paciente_bttn.setForeground(new java.awt.Color(51, 51, 51));
        paciente_bttn.setText("Paciente");

        paciente_bttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paciente_bttnMouseClicked(evt);
            }
        });
        paciente_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paciente_bttnActionPerformed(evt);
            }
        });

        especialista_bttn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        especialista_bttn.setForeground(new java.awt.Color(51, 51, 51));
        especialista_bttn.setText("Especialista");
        especialista_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialista_bttnActionPerformed(evt);
            }
        });

        administracao_bttn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        administracao_bttn.setForeground(new java.awt.Color(51, 51, 51));
        administracao_bttn.setText("Administração");
        administracao_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administracao_bttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(administracao_bttn)
                    .addComponent(paciente_bttn)
                    .addComponent(especialista_bttn)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(paciente_bttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(especialista_bttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(administracao_bttn)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SisFisio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void administracao_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administracao_bttnActionPerformed
        ADMIN_login log = new ADMIN_login();
        this.dispose();
        log.setVisible(true);
    }//GEN-LAST:event_administracao_bttnActionPerformed

    private void especialista_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialista_bttnActionPerformed
        // TODO add your handling code here:
        MEDIC_login log = new MEDIC_login();
        this.dispose();
        log.setVisible(true);
        
    }//GEN-LAST:event_especialista_bttnActionPerformed

    private void paciente_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paciente_bttnActionPerformed
        // TODO add your handling code here:
        login log = new login();
        this.dispose();
        log.setVisible(true);
        
    }//GEN-LAST:event_paciente_bttnActionPerformed

    private void paciente_bttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paciente_bttnMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_paciente_bttnMouseClicked

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
    private javax.swing.JButton administracao_bttn;
    private javax.swing.JButton especialista_bttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton paciente_bttn;
    // End of variables declaration//GEN-END:variables
}
